package Oppgave_1;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Oppretter en TV-serie med LocalDate
        TVSeries series = new TVSeries("Game of Code", "A show about programming warriors.", LocalDate.of(2025, 3, 15));

        // Oppretter episoder
        Episode ep1 = new Episode("Pilot", 1, 1, 42);
        Episode ep2 = new Episode("The Bug Awakens", 2, 1); // Runtime blir 0 (ukjent)

        // Legger til episoder i TV-serien
        series.addEpisode(ep1);
        series.addEpisode(ep2);

        // `toString()` is automatically called here:
        System.out.println(series);

        System.out.println("\nEpisodes:");
        for (Episode episode : series.getEpisodes()) {
            System.out.println(episode + "\n"); // `toString()` is automatically called
        }

        // Viser informasjon om TV-serien
        //series.displaySeriesInfo();

        // Viser alle episoder
        //series.displayAllEpisodes();
    }
}