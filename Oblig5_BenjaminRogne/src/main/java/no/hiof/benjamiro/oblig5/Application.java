package no.hiof.benjamiro.oblig5;

import io.javalin.Javalin;
import io.javalin.vue.VueComponent;
import no.hiof.benjamiro.oblig5.model.TVSeries;
import no.hiof.benjamiro.oblig5.model.TVSeriesController;
import no.hiof.benjamiro.oblig5.repository.TVSeriesDataRepository;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        // oppretter objekter av TVSeriesDataRepository og TVSeriesController
        TVSeriesDataRepository repository = new TVSeriesDataRepository();
        TVSeriesController controller = new TVSeriesController(repository);

        // lager Javalin objekt og legger til path og vue fil
        Javalin app = Javalin.create(config -> {
            config.staticFiles.enableWebjars();
            config.vue.vueInstanceNameInJs = "app";
        }).start();
        app.get("/", new VueComponent("home-page"));

        /*
        // API-endepunkt for å hente alle TV-serier fra TVSeriesDataRepository
        app.get("/api/tvseries", ctx -> {
            List<TVSeries> tvSeriesList = repository.getAllTVSeries();
            ctx.json(tvSeriesList);
        });

        app.get("/api/tvseries/{tvseries-name}", ctx -> {
            // Hent path-parameteren og dekod den (for å håndtere %20, æøå osv.)
            String encodedName = ctx.pathParam("tvseries-name");
            String decodedName = URLDecoder.decode(encodedName, StandardCharsets.UTF_8);

            TVSeries tvSeries = repository.getTVSeries(decodedName);

            if (tvSeries != null) {
                ctx.json(tvSeries);
            } else {
                ctx.status(404).result("TV-serie ikke funnet: " + decodedName);
            }
        });

        app.post("/api/add-tvseries", ctx -> {
            // Hent ut form-parametere
            String title = ctx.formParam("title");
            String description = ctx.formParam("description");
            String yearString = ctx.formParam("release-date-year");
            String monthString = ctx.formParam("release-date-month");
            String dayString = ctx.formParam("release-date-day");

            // Konverter dato-verdiene fra String til int
            int year = Integer.parseInt(yearString);
            int month = Integer.parseInt(monthString);
            int day = Integer.parseInt(dayString);

            // Lag LocalDate og opprett ny TVSeries
            LocalDate releaseDate = LocalDate.of(year, month, day);
            TVSeries newSeries = new TVSeries(title, description, releaseDate);

            // Legg til i repository
            repository.addTVSeries(newSeries);

            // Redirect til detaljsiden for den nye serien
            ctx.redirect("/tvseries/" + title);
        });
    */

        // Kobler vue filer til riktig sted
        app.get("/tvseries", new VueComponent("tvseries-overview"));
        app.get("/tvseries/{tvseries-name}", new VueComponent("tvseries-detail"));
        app.get("/add-tvseries", new VueComponent("add-tvseries"));

        // API, legger til metoder fra TVSeriesController klassen
        app.get("/api/tvseries", controller::getAllTVSeries);
        app.get("/api/tvseries/{tvseries-name}", controller::getTVSeries);
        app.post("/api/add-tvseries", controller::addTVSeries);




    }

}


