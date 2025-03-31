package LibraryManagementSystem;
import java.util.Scanner;
public class ConsoleBookInput implements BookInput {
    private Scanner scanner = new Scanner(System.in);
    @Override
    public Book readBook() throws InvalidBookException {
        // Wczytywanie danych z konsoli i tworzenie obiektu Book
        System.out.println("Podaj Tytul");
        String title = scanner.next();
        System.out.println("Podaj autora");
        String author = scanner.next();
        System.out.println("Podaj isbn");
        String isbn = scanner.next();
        Book book1 = new Book(title,author,isbn);
        return book1;
    }
}
