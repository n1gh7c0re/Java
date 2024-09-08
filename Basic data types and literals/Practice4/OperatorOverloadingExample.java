public class OperatorOverloadingExample {
    public static void main(String[] args) {
        // Примеры с объектами типа String
        String str1 = "Hello";
        String str2 = "World";

        // Конкатенация (объединение) двух строк
        String result1 = str1 + " " + str2;
        System.out.println(result1); // Вывод: "Hello World"

        // Использование с целыми числами
        int num = 2024;
        String result2 = str1 + " " + num;
        System.out.println(result2); // Вывод: "Hello 2024"

        // Использование с плавающей запятой
        double decimalValue = 1.57;
        String result3 = "Value: " + decimalValue;
        System.out.println(result3); // Вывод: "Value: 1.57"

        // Использование с классом
        Person person = new Person("Alice", 30);
        String result4 = "Person Info: " + person;
        System.out.println(result4); // Вывод: "Person Info: Alice, Age: 30"
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Переопределение метода toString для вывода информации о человеке
    @Override
    public String toString() {
        return name + ", Age: " + age;
    }
}
