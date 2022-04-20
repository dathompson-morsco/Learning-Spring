package learning.io.learning.resolver;

import java.util.UUID;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;

import book.Book;
import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class BookResolver implements GraphQLQueryResolver{
    // Create a Logger
    Logger logger
    = Logger.getLogger("BookResolver");


    public Book book(UUID id) {
        logger.info("Retrieving book id: " + id.toString());

        return new Book(id, "bookName", "Author", 250);
    
    }
}
