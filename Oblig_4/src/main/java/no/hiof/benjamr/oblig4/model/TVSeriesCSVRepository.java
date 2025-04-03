package no.hiof.benjamr.oblig4.model;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class TVSeriesCSVRepository implements TVSeriesRepository{//implementerer interface oppgave 2.3
    private File file;

    public TVSeriesCSVRepository(File file) {
        this.file = file;
    }

    // legger til serier til en liste som skrives til fil
    @Override
    public void addListOfTVSeries(ArrayList<TVSeries> seriesList) {
        try (FileWriter writer = new FileWriter(file)) {
            for (TVSeries series : seriesList) {
                String line = String.format("%s;%s;%d;%d;%d\n",
                        series.getTitle(),
                        series.getDescription(),
                        series.getReleaseDate().getYear(),
                        series.getReleaseDate().getMonthValue(),
                        series.getReleaseDate().getDayOfMonth());
                writer.write(line);
            }
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

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 5) {
                    String title = parts[0];
                    String description = parts[1];
                    int year = Integer.parseInt(parts[2]);
                    int month = Integer.parseInt(parts[3]);
                    int day = Integer.parseInt(parts[4]);
                    LocalDate releaseDate = LocalDate.of(year, month, day);
                    seriesList.add(new TVSeries(title, description, releaseDate));
                }
            }
        } catch (IOException e) {
            System.err.println("Feil ved lesing fra fil: " + e.getMessage());
        }

        return seriesList;
    }

    // hendter alle TVSeries med samme tittel som søkeordet brukt
    @Override
    public TVSeries getTVSeriesByTitle(String title) {
        if (!file.exists()) {
            return null;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 5 && parts[0].equalsIgnoreCase(title)) {
                    String description = parts[1];
                    int year = Integer.parseInt(parts[2]);
                    int month = Integer.parseInt(parts[3]);
                    int day = Integer.parseInt(parts[4]);
                    LocalDate releaseDate = LocalDate.of(year, month, day);
                    return new TVSeries(title, description, releaseDate);
                }
            }
        } catch (IOException e) {
            System.err.println("Feil ved lesing fra fil: " + e.getMessage());
        }

        return null;
    }


}
