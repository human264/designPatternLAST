package HowToMakeObject.builder;

public class App {

    public static void main(String[] args) {


        DefaultBook defaultBook = new DefaultBook();

        Book builder = defaultBook.getBookAuthor("hi").getBookName("ss").builder();
        System.out.println(builder.toString());

        Book book = new Book();
        Book book1 = book.builderSetAuthor("d").builderSetBookName("er");

        System.out.println(book1);

    }
}
