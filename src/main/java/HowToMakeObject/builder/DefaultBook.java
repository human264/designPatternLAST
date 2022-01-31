package HowToMakeObject.builder;

public class DefaultBook implements BookBuilder {

    Book book = new Book();


    @Override
    public BookBuilder getBookName(String bookName) {
        book.setBookName(bookName);
        return this;
    }

    @Override
    public BookBuilder getBookAuthor(String bookAuthor) {
        book.setAuthor(bookAuthor);
        return this;
    }

    @Override
    public Book builder() {
        return book;
    }
}
