package Media;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList <Book> books = new ArrayList<>();



        Book book1 = new Book("Poppy War", "18.10.2018", "Harper Voyage", "English", "R.F Kuang", 544 );
        books.add(book1);

        /* //old way to create a book using setters
        Book book1 = new Book();
        book1.setTitle("Poppy War");
        book1.setAuthor("R.F. Kuang");
        book1.setPages(544);
        book1.setProducer("Harper Voyage");
        book1.setLanguage("English");
        book1.setReleaseDate("18.10.2018");

         */

        book1.getInfo();

        Film film1 = new Film("Fight Club", "10.11.1999", null, "English", "2h 19min", "David Fincher");
        /*
        film1.setDirector("David Fincher");
        film1.setLanguage("English");
        film1.setLength("2h 19min");
        film1.setTitle("Fight Club");
        film1.setReleaseDate("10.11.1999");
         */

        film1.getInfo();

        CD cd1 = new CD("Blonde", "20.08.2016", "Boys Don't Cry", "English", "Frank Ocean", 17, "1h");
        /*
        cd1.setTitle("Blonde");
        cd1.setArtist("Frank Ocean");
        cd1.setLength("1h");
        cd1.setSongAmount(17);
        cd1.setLanguage("English");
        cd1.setProducer("Boys Don't Cry");
        cd1.setReleaseDate("20.08.2016");
         */

        cd1.getInfo();

        VideoGame videoGame1 = new VideoGame("Spider-Man 2", "20.10.2023", "Insomniac Games", "English", "PS5");
        VideoGame videoGame2 = new VideoGame("");
        /*
        videoGame1.setTitle("Spider-Man 2");
        videoGame1.setConsole("PS5");
        videoGame1.setLanguage("English");
        videoGame1.setProducer("Insomniac Games");
        videoGame1.setReleaseDate("20.10.2023");
         */

        videoGame1.getInfo();
    }
}