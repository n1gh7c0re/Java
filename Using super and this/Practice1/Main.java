// Суперкласс
class Animal {
    // Поле суперкласса
    protected String name;

    // Конструктор суперкласса
    public Animal(String name) {
        this.name = name;
    }

    // Метод суперкласса
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

// Подкласс
class Dog extends Animal {
    // Поле подкласса
    private String breed;

    // Конструктор подкласса
    public Dog(String name, String breed) {
        // Используем super для вызова конструктора суперкласса
        super(name);
        this.breed = breed;
    }

    // Переопределяем метод суперкласса
    @Override
    public void makeSound() {
        // Используем super для доступа к методу суперкласса
        super.makeSound(); // Вызов метода суперкласса
        System.out.println("Bark!"); // Добавление к звуку собаки
    }

    // Метод для отображения информации о собаке
    public void displayInfo() {
        // Используем super для доступа к полю суперкласса
        System.out.println("Name: " + super.name);
        System.out.println("Breed: " + this.breed);
    }
}

// Основной класс
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.makeSound(); // Вызов метода, который демонстрирует доступ к методу суперкласса
        dog.displayInfo(); // Вызов метода, который демонстрирует доступ к полю суперкласса
    }
}
