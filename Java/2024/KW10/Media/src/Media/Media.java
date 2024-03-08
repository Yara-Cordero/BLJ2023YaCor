package Media;

public abstract class Media {
    private String title;
    private String releaseDate;
    private String producer;
    private String language;

    public Media() {
    }

    public Media(String title, String releaseDate, String producer, String language) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.producer = producer;
        this.language = language;
    }



    public void printInfo() {
        String info = "\nTitle: " + title +
                "\nRelease Date: " + releaseDate +
                "\nProducer: " + producer +
                "\nLanguage: " + language;
        System.out.println(info);
    }

    @Override
    public String toString() {
        return "\nTitle: " + title + '\n' +
                "releaseDate: " + releaseDate + '\n' +
                "producer: " + producer + '\n' +
                "language: " + language + '\n';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public abstract void getInfo();
}
