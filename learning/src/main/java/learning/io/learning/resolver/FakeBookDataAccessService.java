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
    

    @Override
    public int insertBook(UUID id, BookInput bookInput) {
        DB.add(new Book(id, bookInput.getName(), bookInput.getAuthor(), bookInput.getNumPages()));
        return 1;
    }

    public List<Book> allBooks(){
        return DB;
    }
    
}
