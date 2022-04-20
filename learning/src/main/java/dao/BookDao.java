package dao;

import java.util.List;
import java.util.UUID;

import book.Book;
import book.BookInput;

public interface BookDao {
    
    int insertBook(UUID id, BookInput bookInput);

    default int insertBook(BookInput bookInput){
        UUID id = UUID.randomUUID();
        return insertBook(id, bookInput);
    }

    default List<Book> allBooks(){
        return allBooks();
    }
}
