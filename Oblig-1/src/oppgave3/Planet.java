package oppgave3;

public class Planet {
    // Instansvariabler
    private String navn;
    private double radius;
    private double masse;

    // Konstruktør
    public Planet(String navn, double radius, double masse) {
        this.navn = navn;
        this.radius = radius;
        this.masse = masse;
    }

    // Get-metoder
    public String getNavn() {
        return navn;
    }

    public double getRadius() {
        return radius;
    }

    public double getMasse() {
        return masse;
    }

    // Set-metoder
    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setMasse(double masse) {
        this.masse = masse;
    }
}

