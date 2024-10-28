class Calculator {
    // Метод для сложения двух целых чисел
    public int sum(int a, int b) {
        return a + b;
    }

    // Метод для сложения трех целых чисел
    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Метод для сложения переменного числа целых чисел (varargs)
    public int sum(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;  // Суммируем все переданные числа
        }
        return total;
    }
}
public class Example1{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Вызов перегруженных методов
        System.out.println("Sum of two numbers (3 + 5): " + calculator.sum(3, 5));
        System.out.println("Sum of three numbers (1 + 2 + 3): " + calculator.sum(1, 2, 3));
        System.out.println("Sum of multiple numbers (1 + 2 + 3 + 4 + 5): " + calculator.sum(1, 2, 3, 4, 5));
        System.out.println("Sum of no numbers: " + calculator.sum());  // Использование sum без параметров
    }
}
