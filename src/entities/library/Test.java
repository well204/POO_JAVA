package entities.library;

public class Test {
    public static void main(String[] args) {
        // Criando o primeiro livro
        Book book1 = new Book("Dune", new Author("Frank Herbert"), 1234, 2024);
        book1.addCategory(Category.valueOf("ACTION"));
        book1.addCategory(Category.valueOf("HORROR"));
        book1.addCategory(Category.valueOf("FICTION"));

        // Criando o segundo livro
        Book book2 = new Book("The Great Gatsby", new Author("F. Scott Fitzgerald"), 5678, 1925);
        book2.addCategory(Category.valueOf("FICTION"));
        book2.addCategory(Category.valueOf("ROMANCE"));

        Book book21 = new Book("The Great Gatsby", new Author("F. Scott Fitzgerald"), 5678, 1925);
        book2.addCategory(Category.valueOf("FICTION"));
        book2.addCategory(Category.valueOf("ROMANCE"));

        Book book212 = new Book("The Great Gatsby", new Author("F. Scott Fitzgerald"), 5678, 1925);
        book2.addCategory(Category.valueOf("FICTION"));
        book2.addCategory(Category.valueOf("ROMANCE"));

        // Criando o terceiro livro
        Book book3 = new Book("To Kill a Mockingbird", new Author("Harper Lee"), 91011, 1960);
        book3.addCategory(Category.valueOf("FICTION"));
        book3.addCategory(Category.valueOf("DRAMA"));

        // Criando o quarto livro
        Book book4 = new Book("1984", new Author("George Orwell"), 121314, 1949);
        book4.addCategory(Category.valueOf("FICTION"));
        book4.addCategory(Category.valueOf("DYSTOPIAN"));

        // Criando o quinto livro
        Book book5 = new Book("The Lord of the Rings", new Author("J.R.R. Tolkien"), 151617, 1954);
        book5.addCategory(Category.valueOf("FANTASY"));
        book5.addCategory(Category.valueOf("ADVENTURE"));

        // Adicionando os livros à biblioteca
        Library lib = new Library("Library National", "Av. John Snow, N° 323");
        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);
        lib.addBook(book4);
        lib.addBook(book5);
        lib.addBook(book21);
        lib.addBook(book212);
        lib.showBooks();
        lib.loan("The Great Gatsby");
        lib.loan("The Great Gatsby");
        lib.giveBack("The Great Gatsby");
        lib.loan("The Great Gatsby");

    }
}
