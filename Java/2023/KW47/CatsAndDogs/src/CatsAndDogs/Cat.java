package CatsAndDogs;

public class Cat {

    private String name;
    private String breed;
    private int birthyear;

    public Cat(String name, String breed, int birthyear) {
        this.name = name;
        this.breed = breed;
        this.birthyear = birthyear;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getBirthyear() {
        return birthyear;
    }

    @Override
    public String toString() {
        return "Cat " +
                "name:'" + name + '\'' +
                ", breed: '" + breed + '\'' +
                ", birthyear: '" + birthyear + '\'';
    }
}
