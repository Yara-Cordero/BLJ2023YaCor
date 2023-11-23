package PersonenManager;


public class Person {
    String firstname;
    String lastname;
    int birthyear;
    int height;
    String firm;

    public Person(String firstname, String lastname, int birthyear, int height, String firm
    ) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthyear = birthyear;
        this.height = height;
        this.firm = firm;
    }

    @Override
    public String toString() {
        return
                "firstname: " + firstname +
                " lastname: " + lastname +
                " birthyear: " + birthyear +
                " height: " + height +
                " firm: " + firm ;
    }
}


