// Book.java
// Encapsulation
public class Book {
    private String title;  // Encapsulation
    private String author;  // Encapsulation
    private String ISBN;  // Encapsulation
    private boolean isAvailable;  // Encapsulation

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    // Getter and Setter methods
    public String getTitle() {  // Encapsulation
        return title;
    }

    public void setTitle(String title) {  // Encapsulation
        this.title = title;
    }

    public String getAuthor() {  // Encapsulation
        return author;
    }

    public void setAuthor(String author) {  // Encapsulation
        this.author = author;
    }

    public String getISBN() {  // Encapsulation
        return ISBN;
    }

    public void setISBN(String ISBN) {  // Encapsulation
        this.ISBN = ISBN;
    }

    public boolean isAvailable() {  // Encapsulation
        return isAvailable;
    }

    public void setAvailable(boolean available) {  // Encapsulation
        isAvailable = available;
    }

    @Override
    public String toString() {  // Polymorphism (method overriding)
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Available: " + isAvailable;
    }
}
