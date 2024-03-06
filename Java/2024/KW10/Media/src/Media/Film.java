package Media;

public class Film extends Media{
    private String length;
    private String director;

    public Film() {
    }

    @Override
    public void getInfo() {
        super.printInfo();
        String moreInfo = "Length: " + length +
                "\nDirector: " + director;
        System.out.println(moreInfo);
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
