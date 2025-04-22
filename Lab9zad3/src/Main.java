import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Osoba[] tablicaOsob = {
                new Osoba("Anna", 25),
                new Osoba("Jan", 30),
                new Osoba("Piotr", 22),
                new Osoba("Katarzyna", 28),
                new Osoba("Marek", 35)
        };

        List<Osoba> listaOsob = new ArrayList<>();
        for (Osoba osoba : tablicaOsob) {
            listaOsob.add(osoba);
        }

        List<Osoba> podlista = listaOsob.subList(1, 4);

        podlista.clear();

        listaOsob.forEach(System.out::println);
    }
}