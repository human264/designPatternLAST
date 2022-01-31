package HowToMakeObject.builder;

import lombok.Builder;

public interface BookBuilder {

    BookBuilder getBookName(String bookName);
    BookBuilder getBookAuthor(String bookAuthor);

    Book builder();

}
