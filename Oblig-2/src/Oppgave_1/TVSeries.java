package Oppgave_1;

import java.time.LocalDate;
import java.util.ArrayList;

public class TVSeries {
    private String title;
    private String description;
    private LocalDate releaseDate;
    private ArrayList<Episode> episodes;

    // konstruktør
    public TVSeries(String title, String description, LocalDate releaseDate) {
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
        this.episodes = new ArrayList<>();
    }

    // legg til episode
    public void addEpisode(Episode episode) {
        episodes.add(episode);
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
    // Vise informasjon om TV-serien
    public void displaySeriesInfo() {
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Number of Episodes: " + episodes.size());
    }
    @Override
    public String toString() {
        return "TV series Title: " + title + "\n" +
                "Description: " + description + "\n" +
                "Release date: " + releaseDate + "\n" +
                "Number of episodes: " + episodes.size();
    }
}
