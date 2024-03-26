package code.entity;

public class BookByReader {
    private Integer bookId;
    private Integer readerId;

    public BookByReader(Integer bookId, Integer readerId) {
        this.bookId = bookId;
        this.readerId = readerId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public Integer getReaderId() {
        return readerId;
    }
}
