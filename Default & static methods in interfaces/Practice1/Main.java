interface MyInterface {
    // Абстрактный метод
    void abstractMethod();

    // Неабстрактный метод (метод по умолчанию)
    default void defaultMethod() {
        System.out.println("This is a default method in the interface.");
    }

    // Статический метод
    static void staticMethod() {
        System.out.println("This is a static method in the interface.");
    }
}

class MyClass implements MyInterface {
    // Реализация абстрактного метода
    @Override
    public void abstractMethod() {
        System.out.println("Implementing the abstract method.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание объекта класса, реализующего интерфейс
        MyClass myClass = new MyClass();

        // Вызов реализованного абстрактного метода
        myClass.abstractMethod(); // Вывод: Implementing the abstract method.

        // Вызов метода по умолчанию
        myClass.defaultMethod();   // Вывод: This is a default method in the interface.

        // Вызов статического метода интерфейса
        MyInterface.staticMethod(); // Вывод: This is a static method in the interface.
    }
}
