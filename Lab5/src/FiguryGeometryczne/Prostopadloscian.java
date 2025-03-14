package FiguryGeometryczne;

public class Prostopadloscian {
    double a;
    double b;
    double c;

    public Prostopadloscian(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double obliczPole() {
        return 2*(a*b+a*c+b*c);
    }
    public double obliczObjetosc() {
        return a*b*c;
    }
    public void wyswietlDane() {
        System.out.println("Pole: " + obliczPole());
        System.out.println("Objetosc: " + obliczObjetosc());
    }
}
