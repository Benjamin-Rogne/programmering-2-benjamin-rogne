package no.hiof.benjamiro.oblig5.repository;


import no.hiof.benjamiro.oblig5.model.Episode;
import no.hiof.benjamiro.oblig5.model.TVSeries;

import java.time.LocalDate;
import java.util.ArrayList;

public class TVSeriesDataRepository implements TVSeriesRepository {
    private ArrayList<TVSeries> allTvSeries;

    public TVSeriesDataRepository() {
        allTvSeries = new ArrayList<>();
        populateTvSeries();
    }

    private void populateTvSeries() {
        // Creating TV series with correct format
        TVSeries breakingBad = new TVSeries("Breaking Bad",
                "A high school chemistry teacher diagnosed with cancer starts making meth to secure his family's future.",
                LocalDate.of(2008, 1, 20));

        breakingBad.addEpisode(new Episode("Pilot", 1, 1,
                "Walter White, a high school chemistry teacher, turns to cooking meth after a cancer diagnosis.",
                58, LocalDate.of(2008, 1, 20)));

        breakingBad.addEpisode(new Episode("Cat’s in the Bag...", 2, 1,
                "Walt and Jesse attempt to deal with the aftermath of their first cook.",
                48, LocalDate.of(2008, 1, 27)));

        // Another TV series
        TVSeries gameOfThrones = new TVSeries("Game of Thrones",
                "Nine noble families wage war against each other while an ancient enemy rises again.",
                LocalDate.of(2011, 4, 17));

        gameOfThrones.addEpisode(new Episode("Winter Is Coming", 1, 1,
                "Ned Stark is asked to serve as Hand of the King while a threat from beyond the Wall rises.",
                62, LocalDate.of(2011, 4, 17)));

        gameOfThrones.addEpisode(new Episode("The Kingsroad", 2, 1,
                "Jon Snow heads north while Arya and Sansa face new challenges.",
                56, LocalDate.of(2011, 4, 24)));

        // Adding series to the list
        allTvSeries.add(breakingBad);
        allTvSeries.add(gameOfThrones);
    }

    @Override
    public ArrayList<TVSeries> getAllTVSeries() {
        return new ArrayList<>(allTvSeries);
    }

    @Override
    public TVSeries getTVSeries(String title) {
        for (TVSeries series : allTvSeries) {
            if (series.getTitle().equalsIgnoreCase(title)) {
                return series;
            }
        }
        return null; // Return null if no series with the given title is found
    }


    @Override
    public void addListOfTVSeries(ArrayList<TVSeries> listOfTVSeries) {

    }
    @Override
    public void addTVSeries(TVSeries tvSeries){
        if (tvSeries != null && getTVSeries(tvSeries.getTitle()) == null) {
            allTvSeries.add(tvSeries);
            System.out.println("TV series added: " + tvSeries.getTitle());
        } else {
            System.out.println("TV series already exists or is null.");
        }
    }
}
