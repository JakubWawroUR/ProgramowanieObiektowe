package FiguryGeometryczne;

public class Kula {
    double r;

    public Kula(double r) {
        this.r = r;
    }
    public double obliczPole(){
        return 4*Math.PI*r*r;
    }
    public double obliczObjetosc(){
        return ((double) 4 /3) * Math.PI*r*r*r;
    }
    public void wyswietlDane(){
        System.out.println("Pole: " + obliczPole());
        System.out.println("Objetosc: " + obliczObjetosc());
    }
}
