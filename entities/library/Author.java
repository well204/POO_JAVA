package entities.library;

public class Author {
    private String authorName;

    public Author() {
    }

    public Author(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
