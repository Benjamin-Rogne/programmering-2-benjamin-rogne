package Oppgave_1;

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
}