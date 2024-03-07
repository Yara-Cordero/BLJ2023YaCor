package Media;

public class Book extends Media{
    private String author;
    private int pages;

    @Override
    public void getInfo(){
        super.printInfo();
        String moreInfo = "Author: " + author +
                "\nPages: " + pages;
        System.out.println(moreInfo);
    }

    public Book(String title, String releaseDate, String producer, String language, String author, int pages) {
        super(title, releaseDate, producer, language);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
