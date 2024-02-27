package service;

import entity.Book;
import entity.BookByReader;
import entity.Reader;
import repository.BookByReaderRepository;
import repository.BookRepository;
import repository.ReaderRepository;
import util.MyArrayList;
import util.MyList;

public class LibraryService {

    private BookRepository bookRepository;
    private ReaderRepository readerRepository;
    private BookByReaderRepository bookByReaderRepository;

    public LibraryService(BookRepository bookRepository, ReaderRepository readerRepository, BookByReaderRepository bookByReaderRepository) {
        this.bookRepository = bookRepository;
        this.readerRepository = readerRepository;
        this.bookByReaderRepository = bookByReaderRepository;
    }

    public MyList<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public MyList<Reader> getAllReaders(){
        return readerRepository.findAll();
    }

    // получить список книг которые выданы читателю

    public MyList<Book> getBookByReader(Integer readerId){
        /*
        мы должны пройтись по списку всех объектов(записей) читатель-книга
        найти в этих записях те, в которых фигурирует id читателя
        если такая запись есть - то мы берем из нее id книги
        имея этот id мы должны пройтись по списку книг и положить ее в список книг читателя
         */

        MyList<Book> allBooksByReader = new MyArrayList<>();

        MyList<BookByReader> bookByReader = bookByReaderRepository.getBookByReaders();

        for (int i = 0; i < bookByReader.size(); i++) {
            BookByReader bookByReaderRecord = bookByReader.get(i);
            Integer currentReaderId = bookByReaderRecord.getReaderId();

            if (currentReaderId.equals(readerId)) {
                Integer currentBookId = bookByReaderRecord.getBookId();
                Book foundedBookById = bookRepository.findById(currentBookId);

                if (foundedBookById != null) {
                    allBooksByReader.add(foundedBookById);
                } else {
                    System.out.println("Книга потеряна!");
                }
            }
        }

        return allBooksByReader;
    }


}
