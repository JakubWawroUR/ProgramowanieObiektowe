public class Main {
    public static void main(String[] args) {
        Punkt punkt = new Punkt();
        Punkt punkt1 = new Punkt(2.5,4.3);
        punkt1.opis();
        punkt1.przesun(2,12);
        punkt1.opis();d
        Figura figura = new Figura();
        Prostokat prostokat = new Prostokat(10.0,5.5);
        Trojkat trojkat = new Trojkat(12.3,5);
        Okrag okrag1 = new Okrag(new Punkt(5,5),10);
        Punkt test = new Punkt(5,5);
        okrag1.wSrodku(test);
    }
