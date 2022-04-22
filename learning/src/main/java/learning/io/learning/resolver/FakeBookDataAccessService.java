package learning.io.learning.resolver;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import book.Book;
import book.BookInput;
import dao.BookDao;

@Repository
public class FakeBookDataAccessService implements BookDao{

    private static List<Book> DB = new ArrayList<>();
    
    public void initDB(){
        UUID id = UUID.randomUUID();
        Book newBook = new Book(id, "Harry Potter", "J.K. Rowling", 250);
        DB.add(newBook);

        id = UUID.randomUUID();
        newBook = new Book(id, "Cradle", "Will Wight", 150);
        DB.add(newBook);

        id = UUID.randomUUID();
        newBook = new Book(id, "Cradle", "Will Wight", 150);
        DB.add(newBook);

        id = UUID.randomUUID();
        newBook = new Book(id, "Iron Price", "Bryce O'Conner", 900);
        DB.add(newBook);

        id = UUID.randomUUID();
        newBook = new Book(id, "Lord of the Rings", "J. R. R. Tolkien", 2000);
        DB.add(newBook);
    }

    @Override
    public Book insertBook(UUID id, BookInput bookInput) {
        Book newBook = new Book(id, bookInput.getName(), bookInput.getAuthor(), bookInput.getNumPages());
        DB.add(newBook);
        return newBook;
    }

    @Override
    public List<Book> allBooks(){
        return DB;
    }

    @Override
    public Book bookById(UUID id) {
        /// using a map would speed this up
        for (Book book : DB)
            {
                if(book.getId() == id){
                    return book;
                }
            }
        return null;
    }
    
}
