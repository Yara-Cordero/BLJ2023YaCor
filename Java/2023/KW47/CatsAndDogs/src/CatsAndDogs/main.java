package CatsAndDogs;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {


        Dog mimi = new Dog("Mimi", "Rat","Malteser", "Black/White", "lifts right back leg while walking", 2016);
        Dog milan = new Dog("Milan", "Milano","Poodle", "Black", "thoroughly enjoys cuddling", 2021);
        Dog sussie = new Dog("Sussie", "Humpelhundi","Malteser/Poodle", "Black", "taps you with her paws", 2023);
        Dog winnie = new Dog("Winnie", "Wienerli", "Malteser/Poodle", "Blonde", "has special sport abilitys", 2023);

        Cat garfield = new Cat("Garfield", "orange tabby", 1978);
        Cat kat = new Cat("Kat", "alien sphinx", 2008);
        Cat oggy = new Cat("Oggy", "chartreux", 1998);

        System.out.println(mimi);

        ArrayList<Dog> myDogs = new ArrayList();
        myDogs.add(mimi);
        myDogs.add(milan);
        myDogs.add(sussie);
        myDogs.add(winnie);

        ArrayList<Cat> myCats = new ArrayList();
        myCats.add(garfield);
        myCats.add(kat);
        myCats.add(oggy);

        System.out.println(oggy);
        System.out.println(myCats);







    }
}
