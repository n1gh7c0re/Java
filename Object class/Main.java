class Person {
    private String name;
    private int age;

    // Конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Переопределение метода equals()
    @Override
    public boolean equals(Object obj) {
        // Проверяем, ссылаемся ли мы на один и тот же объект
        if (this == obj) return true;

        // Проверяем, является ли объект null или относится ли он к другому классу
        if (obj == null || getClass() != obj.getClass()) return false;

        // Приводим объект к типу Person
        Person other = (Person) obj;

        // Сравниваем поля name и age
        return name.equals(other.name) && age == other.age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);
        Person person3 = new Person("Bob", 25);

        System.out.println(person1.equals(person2)); // true
        System.out.println(person1.equals(person3)); // false
        System.out.println(person1.equals(null)); // false
        System.out.println(person1.equals("Some String")); // false
    }
}
