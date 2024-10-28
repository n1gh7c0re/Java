import java.util.ArrayList;
import java.util.List;

class Pet {}
class Parrot extends Pet {}

public class Example2 {
    public static void addParrot(List<? super Parrot> Pets) {
        Pets.add(new Parrot());
    }

    public static void main(String[] args) {
        List<Pet> Pets = new ArrayList<>();
        addParrot(Pets);  // Можно добавить Parrot в List<Pet>

        System.out.println("Parrot добавлен в список.");
    }
}
