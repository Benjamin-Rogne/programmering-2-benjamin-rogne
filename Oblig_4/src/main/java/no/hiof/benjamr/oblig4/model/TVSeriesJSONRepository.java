package no.hiof.benjamr.oblig4.model;

import java.io.*;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class TVSeriesJSONRepository implements TVSeriesRepository{
    private File file;

    public TVSeriesJSONRepository(File file) {
        this.file = file;
    }

    // legger til serier til en liste som skrives til fil
    @Override
    public void addListOfTVSeries(ArrayList<TVSeries> seriesList) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        try (FileWriter writer = new FileWriter(file)) {
            objectMapper.writeValue(writer, seriesList);
            System.out.println("Data lagret til " + file.getPath());
        } catch (IOException e) {
            System.err.println("Feil ved skriving til fil: " + e.getMessage());
        }
    }

    // leser og henter ut alle serier fra fil
    @Override
    public ArrayList<TVSeries> getAllTVSeries() {
        ArrayList<TVSeries> seriesList = new ArrayList<>();
        if (!file.exists()) {
            return seriesList;
        }
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            seriesList = objectMapper.readValue(reader, objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, TVSeries.class));
        } catch (IOException e) {
            System.err.println("Feil ved lesing fra fil: " + e.getMessage());
        }
        return seriesList;
    }

    // hendter alle TVSeries med samme tittel som søkeordet brukt
    @Override
    public TVSeries getTVSeriesByTitle(String title) {
        ArrayList<TVSeries> seriesList = getAllTVSeries();
        for (TVSeries series : seriesList) {
            if (series.getTitle().equalsIgnoreCase(title)) {
                return series;
            }
        }
        return null;
    }
}
