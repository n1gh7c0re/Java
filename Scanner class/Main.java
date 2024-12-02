import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Указываем путь к файлу
        File file = new File("example.txt");

        // Используем try-catch для обработки FileNotFoundException
        try (Scanner scanner = new Scanner(file)) { // try-with-resources для автоматического закрытия
            // Чтение строк из файла
            while (scanner.hasNextLine()) { // Проверяем, есть ли следующая строка
                String line = scanner.nextLine(); // Считываем следующую строку
                System.out.println(line); // Выводим на консоль
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}
