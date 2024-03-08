package Media;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final ArrayList <Book> books = new ArrayList<>();
    private static final ArrayList <Film> films = new ArrayList<>();
    private static final ArrayList <CD> cds = new ArrayList<>();
    private static final ArrayList <VideoGame> videoGames = new ArrayList<>();
    private static final ArrayList <Media> mediaCollection = new ArrayList<>();

    static boolean isRunning;
    static boolean error;
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        setScene();

        do {
            do {
                System.out.println("Do you");


            }while (error);
        }while (isRunning);
        //videoGame1.getInfo();

        for (Media media : mediaCollection){
            System.out.println(media);
        }
    }

    public static void setScene(){
        Book book1 = new Book("Poppy War", "18.10.2018", "Harper Voyage", "English", "R.F Kuang", 544 );
        Book book2 = new Book("The Name Of The Wind", "01.04.2007", "DAW Books" ,"English", "Patrick Rothfuss", 661);

        Film film1 = new Film("Fight Club", "10.11.1999", null, "English", "2h 19min", "David Fincher");
        Film film2 = new Film("Girl, Interrupted", "21.12.1999", null, "English", "2h 7min", "James Mangold");

        CD cd1 = new CD("Blonde", "20.08.2016", "Boys Don't Cry", "English", "Frank Ocean", 17, "1h");
        CD cd2 = new CD("CALL ME IF YOU GET LOST", "25.06.2021", "Columbia Records", "English", "Tyler, The Creator", 16, "52min");

        VideoGame videoGame1 = new VideoGame("Spider-Man 2", "20.10.2023", "Insomniac Games", "English", "PS5");
        VideoGame videoGame2 = new VideoGame("Red Dead Redemption II", "26.10.2018", "Rockstar Games", "English", "PS4/5, XBOX One");

        books.add(book1);
        books.add(book2);
        films.add(film1);
        films.add(film2);
        cds.add(cd1);
        cds.add(cd2);
        videoGames.add(videoGame1);
        videoGames.add(videoGame2);

        mediaCollection.addAll(books);
        mediaCollection.addAll(films);
        mediaCollection.addAll(videoGames);
        mediaCollection.addAll(cds);
    }

    private String promptSide(String side) {
        System.out.print(side);
        // TODO: Ask user for input
        return scan.nextLine();
    }

}