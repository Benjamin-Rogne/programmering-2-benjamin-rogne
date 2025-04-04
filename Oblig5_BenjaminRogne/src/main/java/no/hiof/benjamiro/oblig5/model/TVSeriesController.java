package no.hiof.benjamiro.oblig5.model;

import io.javalin.http.Context;
import no.hiof.benjamiro.oblig5.model.TVSeries;
import no.hiof.benjamiro.oblig5.repository.TVSeriesRepository;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.List;

public class TVSeriesController {
    private TVSeriesRepository repository;

    // Konstruktør
    public TVSeriesController(TVSeriesRepository repository) {
        this.repository = repository;
    }

    // Henter alle TV-serier
    public void getAllTVSeries(Context ctx) {
        List<TVSeries> tvSeriesList = repository.getAllTVSeries();
        ctx.json(tvSeriesList);
    }

    // Henter en TV-serie basert på navn
    // henter url med spesial tegn og gjør om til utf_8 så det matcher med navnet i backend
    public void getTVSeries(Context ctx) {
        String encodedName = ctx.pathParam("tvseries-name");
        String decodedName = URLDecoder.decode(encodedName, StandardCharsets.UTF_8);
        TVSeries tvSeries = repository.getTVSeries(decodedName);

        if (tvSeries != null) {
            ctx.json(tvSeries);
        } else {
            ctx.status(404).result("TV-serie ikke funnet: " + decodedName);
        }
    }

    // tar imot data fra frontend og Legger til ny TV-serie dersom input var gyldig
    public void addTVSeries(Context ctx) {
        try {
            String title = ctx.formParam("title");
            String description = ctx.formParam("description");
            int year = Integer.parseInt(ctx.formParam("release-date-year"));
            int month = Integer.parseInt(ctx.formParam("release-date-month"));
            int day = Integer.parseInt(ctx.formParam("release-date-day"));
            LocalDate releaseDate = LocalDate.of(year, month, day);

            TVSeries newSeries = new TVSeries(title, description, releaseDate);
            repository.addTVSeries(newSeries);

            ctx.redirect("/tvseries/" + title);
        } catch (Exception e) {
            ctx.status(400).result("Ugyldige eller manglende verdier.");
        }
    }
}
