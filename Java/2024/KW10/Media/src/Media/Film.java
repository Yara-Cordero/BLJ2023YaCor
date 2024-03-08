package Media;

public class Film extends Media{
    private String length;
    private String director;

    public Film(String title, String releaseDate, String producer, String language, String length, String director) {
        super(title, releaseDate, producer, language);
        this.length = length;
        this.director = director;
    }
    @Override
    public void getInfo() {
        super.printInfo();
        String moreInfo = "Length: " + length +
                "\nDirector: " + director;
        System.out.println(moreInfo);
    }
    @Override
    public String toString() {
        return  "\nMedia: Film" +
                super.toString() +
                "Length" + length + '\n' +
                "Director: " + director;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
