package LibraryManagementSystem;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Inicjalizacja obiektów: biblioteki, BookInput
        // Pętla główna z menu
        // Obsługa opcji (dodawanie, usuwanie, edycja itd.)
        // Obsługa wyjątków (try-catch)
        ConsoleBookInput consoleBookInput = new ConsoleBookInput();
        Book book1 = consoleBookInput.readBook();
        Library library = new Library();
        library.addBook(book1);
        library.listBooks(book1);
    }
}