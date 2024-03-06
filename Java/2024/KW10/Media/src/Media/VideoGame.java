package Media;

public class VideoGame extends Media{
    private String console;

    public VideoGame() {
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
