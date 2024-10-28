// Параметризованный класс с интерфейсом
interface Identifiable {
    String getId();
}

class Item implements Identifiable {
    private String id;

    public Item(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }
}

class Box<T extends Identifiable> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class Example3 {
    public static void main(String[] args) {
        Box<Item> itemBox = new Box<>(new Item("Item1"));

        // Проверка с использованием instanceof
        if (itemBox instanceof Box) {
            System.out.println("itemBox is an instance of Box");
        }

        // Проверка на наличие интерфейса Identifiable
        if (itemBox.getItem() instanceof Identifiable) {
            System.out.println("The item in itemBox is Identifiable");
        }
    }
}
