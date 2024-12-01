public class Main {
    public static void main(String[] args) {
        // Пример 1: ArithmeticException
        try {
            int result = 10 / 0; // Деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        // Пример 2: ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3};
            int number = numbers[5]; // Неправильный индекс
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // Пример 3: IllegalArgumentException
        try {
            setAge(-5); // Неправильное значение возраста
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }

        // Пример 4: ClassCastException
        try {
            Object obj = new Integer(100);
            String str = (String) obj; // Ошибка: попытка привести к несовместимому типу
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }

        // Пример 5: NullPointerException
        try {
            String text = null;
            int length = text.length(); // Ошибка: обращение к методу на null
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }

    // Метод для проверки возраста
    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным.");
        }
        System.out.println("Возраст установлен: " + age);
    }
}
