class SuperClass {
    // Метод объявлен как final
    public final void finalMethod() {
        System.out.println("This is a final method in SuperClass.");
    }
}

class SubClass extends SuperClass {
    // Попытка переопределить финальный метод приведет к ошибке компиляции
    /*
    @Override
    public void finalMethod() {
        System.out.println("Trying to override the final method.");
    }
    */
}

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.finalMethod();

        SubClass subClass = new SubClass();
        subClass.finalMethod(); // Этот вызов будет корректным
    }
}
