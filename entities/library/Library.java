package entities.library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private String name;
    private String address;
    private List<Book> books = new ArrayList<>();

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Library() {
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(int isbn) {
        for (Book b : books) {
            if (b.getIsbn() == isbn) {
                books.remove(b);
            }
        }
    }

    public void showBooks() {
        Collections.sort(books, (book1, book2) -> book1.getTitle().compareToIgnoreCase(book2.getTitle()));
        for (Book b : books) {
            System.out.println(b);
            System.out.println();
        }
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void searchBookByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle() == title) {
                System.out.println(b);
            }
        }
    }

    public void loan(String title) {
        for (Book b : books) {
            if (b.getTitle() == title) {
                if (!b.isDisponible()) {
                    System.err.println("Sorry, but this book is indisponible.");
                }
                if (b.isDisponible()) {
                    System.out.println("You get the book: " + b.getTitle());
                    b.loan();
                }
            }
        }
    }

    public void giveBack(String title) {
        for (Book b : books) {
            if (b.getTitle() == title) {
                if (b.isDisponible()) {
                    System.err.println("This book is already disponible.");
                }
                if (!b.isDisponible()) {
                    System.out.println("You gived back the book: " + b.getTitle());
                    b.giveBack();
                }
            }
        }
    }
}
