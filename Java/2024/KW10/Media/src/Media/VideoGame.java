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

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }
}
