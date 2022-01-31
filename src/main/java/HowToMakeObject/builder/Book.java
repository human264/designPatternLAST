package HowToMakeObject.builder;


import lombok.ToString;

@ToString
public class Book {


    private BookBuilder builder;

    String bookName;

    String author;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    Book builderSetBookName(String bookName) {
        this.bookName = bookName;
        return builder.builder();
    }

    Book builderSetAuthor(String author) {
        this.author = author;
        return builder.builder();
    }


}
