package learning.io.learning.resolver;

import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;

import book.Book;
import book.BookInput;
import dao.BookDao;
import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class BookResolver implements GraphQLQueryResolver{

    private final BookDao bookDao;

    public BookResolver(BookDao bookDao){
        this.bookDao = bookDao;
    }

    // Create a Logger
    Logger logger
    = Logger.getLogger("BookResolver");


    public Book book(UUID id) {
        logger.info("Retrieving book id: " + id.toString());

        return new Book(id, "bookName", "Author", 250);
    }

    public Integer insertBook(BookInput bookInput){
        bookDao.insertBook(bookInput);
        return 1;
    }

    public List<Book> allBooks(){
        logger.info("Retrieving all books!");

        return bookDao.allBooks();
    }
}
