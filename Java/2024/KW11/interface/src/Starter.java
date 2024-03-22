import java.util.ArrayList;

public class Starter {
    public static void main(String[] args) {

        Human h = new Human();
        h.move();

        Dog d = new Dog();
        d.move();

        ArrayList<Moveable> items = new ArrayList<>();

        items.add(h);
        items.add(d);

        for (Moveable i : items){
            i.move();
        }
    }
}