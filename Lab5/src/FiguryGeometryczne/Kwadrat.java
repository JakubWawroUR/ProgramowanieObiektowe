package FiguryGeometryczne;

public class Kwadrat {
    double a;

    public Kwadrat(double a) {
        this.a = a;
    }
    public double obliczPole(){
        return a*a;
    }
    public double obliczObwod(){
        return 4*a;
    }
    public void wyswietlDane(){
        System.out.println("Pole: " + obliczPole());
        System.out.println("Obwod: " + obliczObwod());
    }
}
