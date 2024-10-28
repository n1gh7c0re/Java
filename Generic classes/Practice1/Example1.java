
class Container<T> {
    private T item;

    public Container(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class Example1 {
    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>("Hello");
        Container<Integer> integerContainer = new Container<>(42);

        // Проверка экземпляра Container
        if (stringContainer instanceof Container) {
            System.out.println("stringContainer is an instance of Container");
        }

        // Проверка конкретного типа внутри Container
        if (stringContainer.getItem() instanceof String) {
            System.out.println("The item in stringContainer is a String");
        }

        if (integerContainer.getItem() instanceof Integer) {
            System.out.println("The item in integerContainer is an Integer");
        }
    }
}
