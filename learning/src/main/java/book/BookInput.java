package book;

import lombok.Data;

@Data
public class BookInput {
    String name;
    String author;
    Integer numPages;

    public BookInput(String name, String author, Integer numPages) {
        this.name = name;
        this.author = author;
        this.numPages = numPages;
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
