 # Вопрос:
 Объясните, как нужно использовать ключевые слова `this` и `super` в подклассах?
 # Ответ:
 1. `this`
- Используется для различения полей объекта и параметров конструктора
```
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + this.name);
    }
}
```
- Используется для вызова другого конструктора в том же классе
```
class Person {
    private String name;
    private int age;

    public Person(String name) {
        this(name, 0); // Вызов другого конструктора
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

2. `super`
- Используется для доступа к методам и полям родительского класса
```
class Animal {
    protected String type;

    public Animal(String type) {
        this.type = type;
    }

    public void display() {
        System.out.println("Type: " + type);
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String type, String breed) {
        super(type); // Вызов конструктора родительского класса
        this.breed = breed;
    }

    public void display() {
        super.display(); // Вызов метода родительского класса
        System.out.println("Breed: " + breed);
    }
}
```
- Используется для вызова конструктора суперкласса. Это необходимо, чтобы инициализировать поля, унаследованные от родительского класса.
```
class Animal {
    public Animal() {
        System.out.println("Animal created");
    }
}

class Dog extends Animal {
    public Dog() {
        super(); // Явный вызов конструктора суперкласса (можно не вызывать, так как вызывается автоматически)
        System.out.println("Dog created");
    }
}
```
