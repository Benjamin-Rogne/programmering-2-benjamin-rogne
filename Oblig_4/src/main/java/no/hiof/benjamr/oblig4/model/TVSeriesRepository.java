package no.hiof.benjamr.oblig4.model;

import java.util.ArrayList;

public interface TVSeriesRepository {

    // Legger til en liste med TVSeries-objekter
    void addListOfTVSeries(ArrayList<TVSeries> listOfTVSeries);

    // Henter alle lagrede TVSeries-objekter
    ArrayList<TVSeries> getAllTVSeries();

    // Henter en TVSeries basert på tittelen
    TVSeries getTVSeriesByTitle(String title);
}
