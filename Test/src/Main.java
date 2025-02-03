public class Main {

    public static void main(String[] args) {
        System.out.println("Velkommen til programmet!");

        // Kall metoden for å beregne vekt på månen
        beregnVektPaaMaanen();
    }

    // Metode for å beregne vekt på månen
    public static void beregnVektPaaMaanen() {
        // Fast verdi for vekten på jorden i kilo
        double jordVekt = 70.0; // Du kan endre denne verdien
        double maanVekt = jordVekt * 0.165;

        // Skriv ut resultatet
        System.out.printf("Med en vekt på jorden på %.2f kilo, vil din vekt på månen være ca. %.2f kilo.%n", jordVekt, maanVekt);
    }
}
