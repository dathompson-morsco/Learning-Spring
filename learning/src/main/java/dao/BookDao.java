package dao;

import java.util.List;
import java.util.UUID;

import book.Book;
import book.BookInput;

public interface BookDao {

    void initDB();

    default Book bookById(UUID id){
        return bookById(id);
    };

    
    Book insertBook(UUID id, BookInput bookInput);

    default Book insertBook(BookInput bookInput){
        UUID id = UUID.randomUUID();
        return insertBook(id, bookInput);
    }

    default List<Book> allBooks(){
        return allBooks();
    }
}
