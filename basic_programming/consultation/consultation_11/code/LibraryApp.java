package code;

import code.entity.Author;
import code.entity.Book;
import code.entity.BookByReader;
import code.entity.Reader;
import code.repository.BookByReaderRepository;
import code.repository.BookRepository;
import code.repository.ReaderRepository;
import code.service.LibraryService;
import code.util.MyArrayList;
import code.util.MyList;

public class LibraryApp {
    public static void main(String[] args) {
        MyList<Book> books = new MyArrayList<>();
        MyList<Reader> readers = new MyArrayList<>();
        MyList<BookByReader> bookAndReaders = new MyArrayList<>();



        LibraryService management = new LibraryService(new BookRepository(books), new ReaderRepository(readers), new BookByReaderRepository(bookAndReaders));

        Author author1 = new Author("", "Пушкин");
        Author author2 = new Author("", "Дюма");
        Author author3 = new Author("", "Драйзер");
        Author author4 = new Author("", "Блок");
        Author author5 = new Author("", "Твен");






        System.out.println("======= список книг у читателя Reader 3");


    }

    private static void printList(MyList list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
