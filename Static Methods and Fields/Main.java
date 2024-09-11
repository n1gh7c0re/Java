class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }
}

public class Main {
    public static void main(String[] args) {
        // Вариант 1: Прямой вызов через имя класса
        A.printVars();

        // Вариант 2: Вызов из нестатического метода другого класса
        new B().instanceMethod();

        // Вариант 3: Вызов через экземпляр класса
        A example = new A();
        example.printVars();  // Хотя метод статический, его можно вызвать и так

        // Вариант 4: Вызов из статического блока
        C example2 = new C();

    }
}

class B {
    public void instanceMethod() {
        A.printVars();  // Вызов из нестатического метода
    }
}

class C {
    static {
        A.printVars();  // Вызов из статического блока
    }
}
