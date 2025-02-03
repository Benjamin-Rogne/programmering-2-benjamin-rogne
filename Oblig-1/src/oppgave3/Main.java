package oppgave3;

public class Main {
    public static void main(String[] args) {
        // Oppretter Planet-objekter.
        Planet mars = new Planet("Mars", 3389.5, 6.39E23);
        Planet jorden = new Planet("Jorden", 6371.0, 5.97E24);
        Planet venus = new Planet("Venus", 6051.8, 4.87E24);

        // Skriver ut informasjon om hver planet.
        skrivUtPlanetInfo(mars);
        skrivUtPlanetInfo(jorden);
        skrivUtPlanetInfo(venus);
    }

    // Metode for å skrive ut informasjon om en planet.
    public static void skrivUtPlanetInfo(Planet planet) {
        System.out.printf(
                "Planeten %s har en radius på %.1f km og en masse på %.2E kg.%n",
                planet.getNavn(),
                planet.getRadius(),
                planet.getMasse()
        );
    }
}
