package Oppgave_2;
import java.util.Random;

public class Episode {
    private String title;
    private int episodeNumber;
    private int seasonNumber;
    private int runtime;

    public Episode(String title, int episodeNumber,int seasonNumber, int runtime){
        this.title = title;
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
        this.runtime = runtime;
    }

    // Statisk metode for å generere en tilfeldig runtime mellom 20 og 30 minutter
    public static int getRandomRuntime() {
        Random random = new Random();
        return random.nextInt(11) + 20;  // Tilfeldig tall mellom 20 og 30
    }

    public Episode(String title, int episodeNumber, int seasonNumber) {
        this(title, episodeNumber, seasonNumber, 0); // kaller andre konstrukter med standar verdi
    }
    // Getter-metoder (henter verdier)
    public String getTitle() {
        return title;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public int getRuntime() {
        return runtime;
    }

    // Setter-metoder (oppdaterer verdier)
    public void setTitle(String title) {
        this.title = title;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }
    @Override
    public String toString() {
        return "Episode title: " + title + "\n" +
                "Episode number: " + episodeNumber + "\n" +
                "Season number: " + seasonNumber + "\n" +
                "Runtime in minutes: " + runtime;
    }
}