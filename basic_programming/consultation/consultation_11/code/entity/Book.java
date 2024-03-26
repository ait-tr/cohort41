package code.entity;

public class Book {
    private Integer bookId;
    private String isbn;
    private String bookName;
    private Author author;

    public Book(Integer bookId, String isbn, String bookName, Author author) {
        this.bookId = bookId;
        this.isbn = isbn;
        this.bookName = bookName;
        this.author = author;
    }

    public Integer getBookId() {
        return bookId;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", isbn='" + isbn + '\'' +
                ", bookName='" + bookName + '\'' +
                ", author=" + author +
                '}';
    }
}
