interface Container {
    void show();

    class Helper {
        public void assist() {
            System.out.println("Assistance from Helper class");
        }
    }
}

class ContainerImplementation implements Container {
    @Override
    public void show() {
        System.out.println("Container Implementation");
    }
}

public class Main {
    public static void main(String[] args) {
        ContainerImplementation ci = new ContainerImplementation();
        ci.show();  // Вызов метода реализационного класса

        // Вызов метода вложенного класса Helper
        Container.Helper helper = new Container.Helper();
        helper.assist();  // Вызов метода assist из класса Helper
    }
}
