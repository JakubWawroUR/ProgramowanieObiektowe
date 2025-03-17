package Student;

public class Student extends Osoba {
    String NrAlbumu,kierunek,rokStudiow;

    public Student(String imie, String nazwisko, Adres adres, String nrAlbumu, String kierunek, String rokStudiow) {
        super(imie, nazwisko, adres);
        NrAlbumu = nrAlbumu;
        this.kierunek = kierunek;
        this.rokStudiow = rokStudiow;
    }


    public void view(){
        System.out.println("Student:");
        super.view();
        System.out.println("nr albumu" + NrAlbumu);
    }
}
