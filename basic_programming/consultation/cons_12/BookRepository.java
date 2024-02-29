import util.MyArrayList;
import util.MyList;

public class BookRepository {

    /*
    CRUD
    - create
    - read (find)
    - update
    - delete
     */

    private MyList<Book> books = new MyArrayList<>();

    public void add(Book newBook){
        books.add(newBook);
    }

    public void update(Book updateBook){
        /*
        - проверить есть ли такая книга
        - если "нет" - то написать что такой книги не найдено
        - если "да" - то заменить ту которая была (вернее данные в ней) на новые данные

         */
    }

    public void remove(){}

    public void findById(){}

    public void findByName(){}


}
