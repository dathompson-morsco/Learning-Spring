package learning.io.learning.resolver;

import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;

import book.Book;
import book.BookInput;
import dao.BookDao;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class BookResolver implements GraphQLQueryResolver, GraphQLMutationResolver{

    private final BookDao bookDao;

    public BookResolver(BookDao bookDao){
        this.bookDao = bookDao;
        bookDao.initDB();
    }

    // Create a Logger
    Logger logger
    = Logger.getLogger("BookResolver");


    public Book bookById(UUID id) {
        logger.info("Retrieving book id: " + id.toString());
        logger.info("Retrieved: " + bookDao.bookById(id).toString());

        return bookDao.bookById(id);
    }

    public Book insertBook(BookInput input){
        BookInput bookInput = new BookInput(input.getName(),input.getAuthor(),input.getNumPages());
        Book newBook = bookDao.insertBook(bookInput);
        return newBook;
    }

    public List<Book> allBooks(){
        logger.info("Retrieving all books!");

        return bookDao.allBooks();
    }
}
