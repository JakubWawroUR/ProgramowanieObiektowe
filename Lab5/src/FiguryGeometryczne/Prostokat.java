package FiguryGeometryczne;

public class Prostokat {
    double a;
    double b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double obliczPole(){
        return a * b;
    }
    public double obliczObwod(){
        return 2*a+2*b;
    }
    public void wyswietlDane(){
        System.out.println("Pole: " + obliczPole());
        System.out.println("Obwod: " + obliczObwod());
    }
}
