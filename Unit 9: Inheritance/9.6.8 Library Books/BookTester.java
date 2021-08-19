import java.util.ArrayList;

public class BookTester {
    public static void main(String[] args) {
        ArrayList<Book> array = new ArrayList<Book>();

        array.add(new Book("title1", "author1"));
        array.add(new Book("title2", "author2"));
        array.add(new Book("title3", "author3"));

        array.add(new TextBook("title4", "author4", "subject1", "edition1"));
        array.add(new TextBook("title5", "author5", "subject2", "edition2"));
        array.add(new TextBook("title6", "author6", "subject3", "edition3"));

        array.add(new Novel("title7", "author7", "genre1", 100));
        array.add(new Novel("title8", "author8", "genre2", 200));
        array.add(new Novel("title9", "author9", "genre3", 300));

        for (Book b : array) {
            System.out.println(b);
        }
    }
}

