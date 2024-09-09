public class Main {
    public static void main(String[] args) {
        // break
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Выход из цикла на i = " + i);
                break; // Выход из цикла при i == 5
            }
            System.out.println("i = " + i);
        }
        System.out.println("Цикл завершён.");

        // continue
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // Пропуск итерации, если i четное
            }
            System.out.println("Нечетное число: " + i);
        }
        System.out.println("Цикл завершён.");
    }
}
