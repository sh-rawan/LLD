package LibraryManagementSystem.book;

import java.util.Date;
import java.util.List;

public class BookDetails {
    private final String name;
    private final Date publicationDate;
    private final List<String> author;

    public BookDetails(String name, Date publicationDate, List<String> author){
        this.name = name;
        this.publicationDate = publicationDate;
        this.author = author;
    }    
}
