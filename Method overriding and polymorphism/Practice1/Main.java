class Calculator {

    // Метод для сложения двух целых чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Метод для сложения трех целых чисел
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Метод для сложения двух чисел с плавающей точкой
    public double add(double a, double b) {
        return a + b;
    }

    // Метод для сложения массива целых чисел
    public int add(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Вызов метода добавления двух целых чисел
        int sum1 = calculator.add(5, 10);
        System.out.println("Sum of 5 and 10: " + sum1); // Вывод: Sum of 5 and 10: 15

        // Вызов метода добавления трех целых чисел
        int sum2 = calculator.add(1, 2, 3);
        System.out.println("Sum of 1, 2 and 3: " + sum2); // Вывод: Sum of 1, 2 and 3: 6

        // Вызов метода добавления двух чисел с плавающей точкой
        double sum3 = calculator.add(1.5, 2.5);
        System.out.println("Sum of 1.5 and 2.5: " + sum3); // Вывод: Sum of 1.5 and 2.5: 4.0

        // Вызов метода добавления массива
        int[] numbers = {1, 2, 3, 4, 5};
        int sum4 = calculator.add(numbers);
        System.out.println("Sum of array: " + sum4); // Вывод: Sum of array: 15
    }
}
