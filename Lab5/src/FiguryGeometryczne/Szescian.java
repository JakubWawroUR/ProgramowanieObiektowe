package FiguryGeometryczne;

public class Szescian {
    double a;

    public Szescian(double a) {
        this.a = a;
    }
    public double obliczPole() {
        return 6*a*a;
    }
    public double obliczObjetosc() {
        return a*a*a;
    }
    public void wyswietlDane() {
        System.out.println("Pole: " + obliczPole());
        System.out.println("Objetosc: " + obliczObjetosc());
    }
}
