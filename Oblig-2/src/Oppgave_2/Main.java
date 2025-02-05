package Oppgave_2;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Oppretter en TV-serie med LocalDate
        TVSeries dexter = new TVSeries("Dexter", "A series about a killer who kills other killers at night.", LocalDate.of(2006, 10, 1));

        // Sesong 1
        Episode ep1S1 = new Episode("Dexter", 1, 1, Episode.getRandomRuntime());
        Episode ep2S1 = new Episode("Crocodile", 2, 1, Episode.getRandomRuntime());
        Episode ep3S1 = new Episode("Popping Cherry", 3, 1, Episode.getRandomRuntime());
        Episode ep4S1 = new Episode("Let's Give the Boy a Hand", 4, 1, Episode.getRandomRuntime());
        Episode ep5S1 = new Episode("Love American Style", 5, 1, Episode.getRandomRuntime());
        Episode ep6S1 = new Episode("Return to Sender", 6, 1, Episode.getRandomRuntime());
        Episode ep7S1 = new Episode("Circle of Friends", 7, 1, Episode.getRandomRuntime());
        Episode ep8S1 = new Episode("Shrink Wrap", 8, 1, Episode.getRandomRuntime());
        Episode ep9S1 = new Episode("Father Knows Best", 9, 1, Episode.getRandomRuntime());
        Episode ep10S1 = new Episode("Seeing Red", 10, 1, Episode.getRandomRuntime());

        // Sesong 2
        Episode ep1S2 = new Episode("It's Alive!", 1, 2, Episode.getRandomRuntime());
        Episode ep2S2 = new Episode("Waiting to Exhale", 2, 2, Episode.getRandomRuntime());
        Episode ep3S2 = new Episode("An Inconvenient Lie", 3, 2, Episode.getRandomRuntime());
        Episode ep4S2 = new Episode("See-Through", 4, 2, Episode.getRandomRuntime());
        Episode ep5S2 = new Episode("The Dark Defender", 5, 2, Episode.getRandomRuntime());
        Episode ep6S2 = new Episode("Dex, Lies, and Videotape", 6, 2, Episode.getRandomRuntime());
        Episode ep7S2 = new Episode("That Night, A Forest Grew", 7, 2, Episode.getRandomRuntime());
        Episode ep8S2 = new Episode("Morning Comes", 8, 2, Episode.getRandomRuntime());
        Episode ep9S2 = new Episode("Resistance Is Futile", 9, 2, Episode.getRandomRuntime());
        Episode ep10S2 = new Episode("There's Something About Harry", 10, 2, Episode.getRandomRuntime());

        // Sesong 3
        Episode ep1S3 = new Episode("Our Father", 1, 3, Episode.getRandomRuntime());
        Episode ep2S3 = new Episode("Finding Freebo", 2, 3, Episode.getRandomRuntime());
        Episode ep3S3 = new Episode("The Lion Sleeps Tonight", 3, 3, Episode.getRandomRuntime());
        Episode ep4S3 = new Episode("All in the Family", 4, 3, Episode.getRandomRuntime());
        Episode ep5S3 = new Episode("Turning Biminese", 5, 3, Episode.getRandomRuntime());
        Episode ep6S3 = new Episode("Si Se Puede", 6, 3, Episode.getRandomRuntime());
        Episode ep7S3 = new Episode("Easy as Pie", 7, 3, Episode.getRandomRuntime());
        Episode ep8S3 = new Episode("The Damage a Man Can Do", 8, 3, Episode.getRandomRuntime());
        Episode ep9S3 = new Episode("About Last Night", 9, 3, Episode.getRandomRuntime());
        Episode ep10S3 = new Episode("Go Your Own Way", 10, 3, Episode.getRandomRuntime());

        // Sesong 4
        Episode ep1S4 = new Episode("Living the Dream", 1, 4, Episode.getRandomRuntime());
        Episode ep2S4 = new Episode("Remains to Be Seen", 2, 4, Episode.getRandomRuntime());
        Episode ep3S4 = new Episode("Blinded by the Light", 3, 4, Episode.getRandomRuntime());
        Episode ep4S4 = new Episode("Dex Takes a Holiday", 4, 4, Episode.getRandomRuntime());
        Episode ep5S4 = new Episode("Dirty Harry", 5, 4, Episode.getRandomRuntime());
        Episode ep6S4 = new Episode("If I Had a Hammer", 6, 4, Episode.getRandomRuntime());
        Episode ep7S4 = new Episode("Slack Tide", 7, 4, Episode.getRandomRuntime());
        Episode ep8S4 = new Episode("Road Kill", 8, 4, Episode.getRandomRuntime());
        Episode ep9S4 = new Episode("Hungry Man", 9, 4, Episode.getRandomRuntime());
        Episode ep10S4 = new Episode("Lost Boys", 10, 4, Episode.getRandomRuntime());

        // Sesong 5
        Episode ep1S5 = new Episode("My Bad", 1, 5, Episode.getRandomRuntime());
        Episode ep2S5 = new Episode("Hello, Bandit", 2, 5, Episode.getRandomRuntime());
        Episode ep3S5 = new Episode("Practically Perfect", 3, 5, Episode.getRandomRuntime());
        Episode ep4S5 = new Episode("Beauty and the Beast", 4, 5, Episode.getRandomRuntime());
        Episode ep5S5 = new Episode("First Blood", 5, 5, Episode.getRandomRuntime());
        Episode ep6S5 = new Episode("Everything Is Illumenated", 6, 5, Episode.getRandomRuntime());
        Episode ep7S5 = new Episode("Circle Us", 7, 5, Episode.getRandomRuntime());
        Episode ep8S5 = new Episode("Take It!", 8, 5, Episode.getRandomRuntime());
        Episode ep9S5 = new Episode("Teenage Wasteland", 9, 5, Episode.getRandomRuntime());
        Episode ep10S5 = new Episode("In the Beginning", 10, 5, Episode.getRandomRuntime());

        // Test episoder
        Episode ep11S3 = new Episode("I Had a Dream", 11, 3, Episode.getRandomRuntime());
        Episode ep12S3 = new Episode("Do You Take Dexter Morgan?", 12, 3, Episode.getRandomRuntime());

        Episode ep11S5 = new Episode("Hop a Freighter", 11, 5, Episode.getRandomRuntime());
        Episode ep12S5 = new Episode("The Big One", 12, 5, Episode.getRandomRuntime());

        Episode ep11S6 = new Episode("Talk to the Hand", 11, 6, Episode.getRandomRuntime());

        Episode ep11S7 = new Episode("Do You See What I See?", 11, 7, Episode.getRandomRuntime());
        Episode ep12S7 = new Episode("Surprise, Motherf***er!", 12, 7, Episode.getRandomRuntime());


        // legger episoder til valgt tv serie
        dexter.addEpisode(ep1S1);
        dexter.addEpisode(ep2S1);
        dexter.addEpisode(ep3S1);
        dexter.addEpisode(ep4S1);
        dexter.addEpisode(ep5S1);
        dexter.addEpisode(ep6S1);
        dexter.addEpisode(ep7S1);
        dexter.addEpisode(ep8S1);
        dexter.addEpisode(ep9S1);
        dexter.addEpisode(ep10S1);
        System.out.println("Number of seasons: " + dexter.getNumSeasons());

        dexter.addEpisode(ep1S2);
        dexter.addEpisode(ep2S2);
        dexter.addEpisode(ep3S2);
        dexter.addEpisode(ep4S2);
        dexter.addEpisode(ep5S2);
        dexter.addEpisode(ep6S2);
        dexter.addEpisode(ep7S2);
        dexter.addEpisode(ep8S2);
        dexter.addEpisode(ep9S2);
        dexter.addEpisode(ep10S2);
        System.out.println("Number of seasons: " + dexter.getNumSeasons());

        dexter.addEpisode(ep1S3);
        dexter.addEpisode(ep2S3);
        dexter.addEpisode(ep3S3);
        dexter.addEpisode(ep4S3);
        dexter.addEpisode(ep5S3);
        dexter.addEpisode(ep6S3);
        dexter.addEpisode(ep7S3);
        dexter.addEpisode(ep8S3);
        dexter.addEpisode(ep9S3);
        dexter.addEpisode(ep10S3);
        System.out.println("Number of seasons: " + dexter.getNumSeasons());

        dexter.addEpisode(ep1S4);
        dexter.addEpisode(ep2S4);
        dexter.addEpisode(ep3S4);
        dexter.addEpisode(ep4S4);
        dexter.addEpisode(ep5S4);
        dexter.addEpisode(ep6S4);
        dexter.addEpisode(ep7S4);
        dexter.addEpisode(ep8S4);
        dexter.addEpisode(ep9S4);
        dexter.addEpisode(ep10S4);
        System.out.println("Number of seasons: " + dexter.getNumSeasons());

        dexter.addEpisode(ep1S5);
        dexter.addEpisode(ep2S5);
        dexter.addEpisode(ep3S5);
        dexter.addEpisode(ep4S5);
        dexter.addEpisode(ep5S5);
        dexter.addEpisode(ep6S5);
        dexter.addEpisode(ep7S5);
        dexter.addEpisode(ep8S5);
        dexter.addEpisode(ep9S5);
        dexter.addEpisode(ep10S5);
        System.out.println("Number of seasons: " + dexter.getNumSeasons());

        // printer ut info om valgt serie
        System.out.println(dexter);

        // printer ut episodene til valgt serie
        System.out.println("\nEpisodes:");
        for (Episode episode : dexter.getEpisodes()) {
            System.out.println(episode + "\n");
        }

        // henter alle episoder i valgt sesong og legger dem til liste
        ArrayList<Episode> season4Episodes = dexter.getEpisodesInSeason(4);

        // printer ut episodene fra valgt sesong
        System.out.println("Episodes from Season 4:" + "\n");
        for (Episode episode : season4Episodes) {
            System.out.println(episode + "\n");
        }
        // printer ut nåværende gjenomsnitstid for alle episoder i tv serie
        System.out.println("\nAverage runtime: " + dexter.getAverageRuntime() + " minutes");

        //legge til episode i eldre sesong og hoppe over en eksisterende sesong
        dexter.addEpisode(ep11S3);
        System.out.println("Number of seasons: " + dexter.getNumSeasons());
        dexter.addEpisode(ep11S5);
        System.out.println("Number of seasons: " + dexter.getNumSeasons());

        //legge til episode som hopper over over ikke eksisterende sesong current 5 til 7
        dexter.addEpisode(ep12S5);
        System.out.println("Number of seasons: " + dexter.getNumSeasons());
        dexter.addEpisode(ep12S7);
        System.out.println("Number of seasons: " + dexter.getNumSeasons());

        //legge til episode som er en over og entil over
        dexter.addEpisode(ep11S6);
        System.out.println("Number of seasons: " + dexter.getNumSeasons());
        dexter.addEpisode(ep12S3);
        System.out.println("Number of seasons: " + dexter.getNumSeasons());
        dexter.addEpisode(ep11S7);
        System.out.println("Number of seasons: " + dexter.getNumSeasons());

        System.out.println("\nAverage runtime: " + dexter.getAverageRuntime() + " minutes");
    }
}