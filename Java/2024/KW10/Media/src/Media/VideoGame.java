package Media;

public class VideoGame extends Media{
    private String console;

    public VideoGame() {
    }

    public VideoGame(String title, String releaseDate, String producer, String language, String console) {
        super(title, releaseDate, producer, language);
        this.console = console;
    }

    @Override
    public void getInfo() {
        super.printInfo();
        String moreInfo = "Console: " + console;
        System.out.println(moreInfo);
    }

    @Override
    public String toString() {
        return  "\nMedia: Video Game" +
                super.toString() +
                "Console: " + console;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }
}
