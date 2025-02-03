package oppgave2;

public class Main {

    public static void main(String[] args) {
        beregnVektPaaMaanen();
    }

    // Metode for å beregne vekt på månen.
    public static void beregnVektPaaMaanen() {
        // Verdi for vekten på jorden i kilo.
        double jordVekt = 70.0;
        double maanVekt = jordVekt * 0.165; // formel for vekt på månen

        // Utskrift for resultatet.
        System.out.printf("Med en vekt på jorden på %.2f kilo, vil din vekt på månen være ca. %.2f kilo.%n", jordVekt, maanVekt);
    }
}
