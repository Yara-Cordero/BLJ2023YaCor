package Media;

public class CD extends Media {
    private String artist;
    private int songAmount;
    private String length;

    public CD() {
    }


    public CD(String title, String releaseDate, String producer, String language, String artist, int songAmount, String length) {
        super(title, releaseDate, producer, language);
        this.artist = artist;
        this.songAmount = songAmount;
        this.length = length;
    }

    @Override
    public void getInfo() {
        super.printInfo();
        String moreInfo = "Artist: " + artist +
                "\nSongs: " + songAmount +
                "\nLength: " + length;
        System.out.println(moreInfo);
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongAmount() {
        return songAmount;
    }

    public void setSongAmount(int songAmount) {
        this.songAmount = songAmount;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
}
