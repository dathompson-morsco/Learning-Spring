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
    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getNumPages() {
        return numPages;
    }
}
