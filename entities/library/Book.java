package entities.library;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private Author author;
    private boolean disponible = true;
    private Integer isbn;
    private int publicationDate;
    private List<Category> category = new ArrayList<>();

    public Book() {
    }

    public Book(String title, Author author, Integer isbn, int publicationDate) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationDate = publicationDate;
    }

    public void addCategory(Category category) {
        this.category.add(category);
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public boolean isDisponible() {
        if (disponible) {
            return this.disponible;
        }
        return false;
    }

    public void loan() {
        this.disponible = false;
    }

    public void giveBack() {
        this.disponible = true;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        StringBuilder categoriesBuilder = new StringBuilder();
        for (int i = 0; i < category.size(); i++) {
            categoriesBuilder.append(category.get(i));
            if (i < category.size() - 1) {
                categoriesBuilder.append(", ");
            }
        }
        return "Book =" + "\n" + "Title: " + title + "\n" + "Author: " + author.getAuthorName() + "\n" + "ISBN: " + isbn
                + "\n" + "Publication date: " + publicationDate + "\n" + "Categories: " + categoriesBuilder;

    }
}
