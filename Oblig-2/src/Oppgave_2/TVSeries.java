package Oppgave_2;

import java.time.LocalDate;
import java.util.ArrayList;

public class TVSeries {
    private String title;
    private String description;
    private LocalDate releaseDate;
    private ArrayList<Episode> episodes;
    private double averageRuntime;
    private int numSeasons;

    // konstruktør
    public TVSeries(String title, String description, LocalDate releaseDate) {
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
        this.episodes = new ArrayList<>();
        this.numSeasons = 0; // Starter med 0 sesonger
    }

    // Oppdaterer averageRuntime basert på alle episoder i serien
    private void updateAverageRuntime() {
        int totalRuntime = 0;

        for (Episode episode : episodes) {
            totalRuntime += episode.getRuntime();
        }

        if (!episodes.isEmpty()) {
            averageRuntime = (double) totalRuntime / episodes.size();
        } else {
            averageRuntime = 0;  // Unngå divisjon med null
        }
    }

    // Metode for å legge til episoder med sesong-sjekk
    public void addEpisode(Episode episode) {
        int episodeSeason = episode.getSeasonNumber();

        // Sjekk om episoden hopper over mer enn én sesong
        if (episodeSeason > numSeasons + 1) {
            System.out.println("ERROR: you can not skip over seasons, current: " + numSeasons);
            return;
        }

        // Hvis episoden er fra en ny sesong, oppdater numSeasons
        if (episodeSeason == numSeasons + 1) {
            numSeasons = episodeSeason;
        }

        // Legg til episoden
        episodes.add(episode);
        System.out.println("Episode: " + episode.getTitle() + " (S" + episodeSeason + "E" + episode.getEpisodeNumber() + ") is successfully added.");
        updateAverageRuntime();  // Recalculate average runtime
    }

    // Getter-metoder
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public ArrayList<Episode> getEpisodes() {
        return new ArrayList<>(episodes); // Returnerer en kopi for sikkerhet
    }

    public int getNumSeasons() {
        return numSeasons;
    }

    public double getAverageRuntime() {
        return averageRuntime;
    }

    // Setter-metoder
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    // utskrift for serier
    @Override
    public String toString() {
        return "TV series Title: " + title + "\n" +
                "Description: " + description + "\n" +
                "Release date: " + releaseDate + "\n" +
                "Number of episodes: " + episodes.size();
    }

    // henter ut episoder fra en valgt sesong
    public ArrayList<Episode> getEpisodesInSeason(int seasonNumber) {
        ArrayList<Episode> seasonEpisodes = new ArrayList<>();

        for (Episode episode : episodes) {
            if (episode.getSeasonNumber() == seasonNumber) {
                seasonEpisodes.add(episode);
            }
        }
        return seasonEpisodes;  // Returns the filtered list
    }
}
