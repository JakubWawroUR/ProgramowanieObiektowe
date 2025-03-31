package LibraryManagementSystem;
import java.util.*;
public class Library {
    // Kolekcja książek (np. HashMap<String, Book> z kluczem ISBN)
    private Set<Book> books = new HashSet<>();
    // Dodawanie książki (CRUD - Create)
    public void addBook(Book book) {
        // sprawdzenie duplikatów i dodanie
        books.add(book);
    }
    // Usuwanie książki (CRUD - Delete)
    public void removeBook(String isbn) {
        // usunięcie po ISBN
    }
    // Edycja książki (CRUD - Update)
    public void editBook(String isbn, Book updatedBook) {
        // aktualizacja danych
    }
    // Lista książek (CRUD - Read)
    public void listBooks(Book book) {
        // wypisanie wszystkich książek
        System.out.println(book.getTitle());
    }
    // Wyszukiwanie książki po ISBN
    public void findBook(String isbn) {
        // wypisanie konkretnej książki
    }
}
