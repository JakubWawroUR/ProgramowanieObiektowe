package Student;

public class Osoba {
    public String imie,nazwisko;
    public Adres adres;

    public Osoba(String imie, String nazwisko, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
    }


    protected void view(){
        System.out.println("Osoba: " +imie + " " + nazwisko);
        adres.viewAdres();
    }
}
