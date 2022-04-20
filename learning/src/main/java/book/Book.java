package book;
import java.util.UUID;
import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Book {
    UUID id;
    String name;
    String author;
    Integer numPages;
    public Book(UUID id, String name, String author, Integer numPages) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.numPages = numPages;
    }
}
