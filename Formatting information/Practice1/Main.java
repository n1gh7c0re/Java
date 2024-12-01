public class Main {
    public static void main(String[] args) {
        boolean isJavaFun = true; // %b
        char initial = 'J'; // %c
        int age = 25; // %d
        double pi = 3.14159; // %f
        String name = "Alice"; // %s

        // Используем различные спецификаторы формата
        System.out.printf("Is Java fun? %b%n", isJavaFun); // Используем %b для логического значения
        System.out.printf("Initial of my name: %c%n", initial); // Используем %c для символа
        System.out.printf("My age is: %d years old.%n", age); // Используем %d для целого значения
        System.out.printf("Value of Pi: %.2f%n", pi); // Используем %f для десятичного значения
        System.out.printf("Hello, my name is %s.%n", name); // Используем %s для строки

        // Дополнительно: пример с хэш-кодом и методом %h
        System.out.printf("Hash code of my name: %h%n", name); // Используем %h для получения хэш-кода
    }
}
