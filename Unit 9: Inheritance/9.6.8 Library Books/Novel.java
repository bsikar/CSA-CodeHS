public class Novel extends Book {
    private String genre;
    private int pages;

    public Novel(String title, String author, String genre, int pages) {
        super(title, author);
        this.genre = genre;
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return super.toString() + "\ngenre: " + genre + "\npages: " + pages;
    }
}

