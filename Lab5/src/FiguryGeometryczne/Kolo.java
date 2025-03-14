package FiguryGeometryczne;

public class Kolo {
    double r;

    public Kolo(double r) {
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public double obliczPole() {
        return r * r * Math.PI;
    }
    public double obliczObwod(){
        return 2* Math.PI*r;
    }
    public void wyswietlDane(){
        System.out.println("Pole: " + obliczPole());
        System.out.println("Obwod: " + obliczObwod());
    }
}
