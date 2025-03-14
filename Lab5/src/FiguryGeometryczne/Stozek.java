package FiguryGeometryczne;

public class Stozek {
    double r;
    double h;
    double l;

    public Stozek(double r, double h, double l) {
        this.r = r;
        this.h = h;
        this.l = l;
    }
    public double obliczPole() {
        return Math.PI *r*(r+l);
    }
    public double obliczObjetosc() {
        return (Math.PI*r*r*h)/3;
    }
    public void wyswietlDane() {
        System.out.println("Pole: " + obliczPole());
        System.out.println("Objetosc: " + obliczObjetosc());
    }
}
