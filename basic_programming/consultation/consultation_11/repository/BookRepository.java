package repository;

import entity.Book;
import util.MyArrayList;
import util.MyList;

public class BookRepository {
    private final MyList<Book> books;

    public BookRepository(MyList<Book> books) {
        this.books = books;
    }

    public void add(Book newBook){
        books.add(newBook);
    }

    public Book findById(Integer bookId){

        //------
        for (int i = 0; i < books.size(); i++) {

            Book currentBook = books.get(i);

            if (currentBook.getBookId().equals(bookId)) {
                return currentBook;
            }
        }
        //------
        return null;
    }

    public MyList<Book> findAll(){
        return books;
    }
}
