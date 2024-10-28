interface InterfaceA {
    default void defaultMethod() {
        System.out.println("Default method from InterfaceA");
    }
}

interface InterfaceB {
    default void defaultMethod() {
        System.out.println("Default method from InterfaceB");
    }
}

class MyClass implements InterfaceA, InterfaceB {
    // Разрешение конфликта методом специально для нашего класса
    @Override
    public void defaultMethod() {
        // Можно выбрать реализацию одного из интерфейсов
        InterfaceA.super.defaultMethod();
        // Или можно предложить свою собственную реализацию
        System.out.println("Custom implementation in MyClass");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.defaultMethod(); // Указывает, какая версия метода вызывается
    }
}
