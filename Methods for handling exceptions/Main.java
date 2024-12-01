public class Main {
    public static void main(String[] args) {
        try {
            // Генерируем первое исключение (ArithmeticException), которое будет перехвачено
            int result = divide(10, 0);
            System.out.println("Result: " + result);

            // Генерируем второе исключение (ArrayIndexOutOfBoundsException), которое приведет к аварийному завершению
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing index 5: " + numbers[5]); // Эта строчка вызовет исключение

        } catch (ArithmeticException e) {
            System.out.println("Перехвачено: " + e.getMessage()); // Обработка первого исключения
        }

        // Этот код выполнится, если не произойдет аварийное завершение
        System.out.println("Выполнение продолжается...");
    }

    // Метод генерации исключения ArithmeticException для деления
    public static int divide(int a, int b) {
        return a / b; // Деление на 0 приведет к ArithmeticException
    }
}
