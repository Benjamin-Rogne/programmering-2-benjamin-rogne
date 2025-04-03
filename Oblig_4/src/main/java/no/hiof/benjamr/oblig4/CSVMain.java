package no.hiof.benjamr.oblig4;


import no.hiof.benjamr.oblig4.model.TVSeries;
import no.hiof.benjamr.oblig4.model.TVSeriesCSVRepository;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;

public class CSVMain{
    public static void main(String[] args){//opprett objekt av tv reposotory opg.2.A3a

        // oppretter fil og TVSeries objekter
        File file = new File("tv_series.csv");
        TVSeriesCSVRepository repository = new TVSeriesCSVRepository(file);
        ArrayList<TVSeries> tvSeriesList = new ArrayList<>();

        tvSeriesList.add(new TVSeries("Breaking Bad", "A high school chemistry teacher turned meth producer", LocalDate.of(2008, 1, 20)));
        tvSeriesList.add(new TVSeries("Game of Thrones", "A fantasy drama based on George R.R. Martin's novels", LocalDate.of(2011, 4, 17)));
        tvSeriesList.add(new TVSeries("Stranger Things", "A sci-fi horror series set in the 1980s", LocalDate.of(2016, 7, 15)));

        repository.addListOfTVSeries(tvSeriesList);

        //leser fil og skriver ut info om alle TVSeries objektene i arraylist
        System.out.println("Leser TV-serier fra fil:");
        ArrayList<TVSeries> loadedSeries = repository.getAllTVSeries();
        for (TVSeries series : loadedSeries) {
            System.out.println(series);
        }

        //leter etter TVSeries objekt med spesefikt søkeord
        System.out.println("\nSøker etter TV-serie:");
        TVSeries foundSeries = repository.getTVSeriesByTitle("Breaking Bad");
        if (foundSeries != null) {
            System.out.println("Fant TV-serie: " + foundSeries);
        } else {
            System.out.println("TV-serie ikke funnet.");
        }
    }
}




