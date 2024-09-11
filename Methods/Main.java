class MathOperations {
    // Метод для сложения двух целых чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Перегрузка за счет количества аргументов
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Перегрузка за счет типа аргументов
    public double add(double a, double b) {
        return a + b;
    }
}

class Animal {
    // Метод, который будет переопределен
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Переопределение метода sound()
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Переопределение метода sound()
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        // Overloading example
        MathOperations math = new MathOperations();

        System.out.println("Sum of 2 and 3: " + math.add(2, 3));             // Вызов метода add(int, int)
        System.out.println("Sum of 2, 3, and 4: " + math.add(2, 3, 4));     // Вызов метода add(int, int, int)
        System.out.println("Sum of 2.5 and 3.5: " + math.add(2.5, 3.5));   // Вызов метода add(double, double)

        // Overriding example
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound(); // Выводит: Dog barks
        myCat.sound(); // Выводит: Cat meows
    }
}
