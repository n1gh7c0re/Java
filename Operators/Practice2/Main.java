class Animal {
    // some parameters and functions
}
class Dog extends Animal {
    // some parameters and functions
}

class Cat extends Animal {
    // some parameters and functions
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = new Cat();

        // Проверка, является ли dog экземпляром Dog
        if (dog instanceof Dog) {
            System.out.println("dog is an instance of Dog"); // напечатается это
        } else{
            System.out.println("dog isn't an instance of Dog");
        }

        // Проверка, является ли dog экземпляром Animal
        if (dog instanceof Animal) {
            System.out.println("dog is an instance of Animal"); // напечатается это
        } else{
            System.out.println("dog isn't an instance of Animal");
        }

        // Проверка, является ли animal экземпляром Cat
        if (animal instanceof Cat) {
            System.out.println("animal is an instance of Cat"); // напечатается это
        } else{
            System.out.println("animal isn't an instance of Cat");
        }

        // Проверка, является ли animal экземпляром Dog
        if (animal instanceof Dog) {
            System.out.println("animal is an instance of Dog"); // Это не будет напечатано
        } else{
            System.out.println("animal isn't an instance of Dog"); // напечатается это
        }
    }
}
