package code.repository;

import code.entity.BookByReader;
import code.util.MyList;

public class BookByReaderRepository {
    private final MyList<BookByReader> bookByReaders;

    public BookByReaderRepository(MyList<BookByReader> bookByReaders) {
        this.bookByReaders = bookByReaders;
    }


    public void add(BookByReader newRecord){
        bookByReaders.add(newRecord);
    }

    public MyList<BookByReader> getBookByReaders() {
        return bookByReaders;
    }
}
