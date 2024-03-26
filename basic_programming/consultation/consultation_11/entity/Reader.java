package entity;

public class Reader {
    private Integer readerId;
    private String readerName;

    public Reader(Integer readerId, String readerName) {
        this.readerId = readerId;
        this.readerName = readerName;
    }

    public Integer getReaderId() {
        return readerId;
    }

    public String getReaderName() {
        return readerName;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "readerId=" + readerId +
                ", readerName='" + readerName + '\'' +
                '}';
    }
}
