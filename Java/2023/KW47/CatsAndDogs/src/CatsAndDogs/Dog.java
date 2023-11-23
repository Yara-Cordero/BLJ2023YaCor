package CatsAndDogs;

public class Dog {
    private String name;
    private String nickname;
    private String breed;
    private String color;
    private String special;
    private int birthyear;

    public Dog(String name, String nickname, String breed, String color, String special, int Birthyear) {
        this.name = name;
        this.nickname = nickname;
        this.breed = breed;
        this.color = color;
        this.special = special;
        this.birthyear = Birthyear;
    }

    void barking() {
        System.out.println(name + ":Woof¨! Woof!");
    }

    void sleeping() {
        System.out.println(name + ":zzZZZzz...");
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public String getSpecial() {
        return special;
    }

    public int getBirthyear() {
        return birthyear;
    }

    @Override
    public String toString() {
        return "Dog " +
                "name:'" + name + '\'' +
                ", nickname:" + nickname + '\'' +
                ", breed:'" + breed + '\'' +
                ", color:'" + color + '\'' +
                ", special:'" + special + '\'' +
                ", birthyear:" + birthyear
                ;
    }
}
