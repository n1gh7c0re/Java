import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        // Получаем текущую дату и время
        Date now = new Date();

        // Форматирование с помощью SimpleDateFormat для конкретных спецификаторов
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Получаем формат даты и времени
        String formattedDate = dateFormatter.format(now);

        // Выводим дату и время с использованием спецификаторов формата
        System.out.printf("Текущая дата и время: %s%n", formattedDate); // Используем %s для строки

        System.out.printf("Год (4 знака): %tY%n", now); // %tY - год (4 знака)
        System.out.printf("Год (2 знака): %ty%n", now); // %ty - год (2 знака)
        System.out.printf("Месяц (полное имя): %tB%n", now); // %tB - полный месяц
        System.out.printf("Час (24-часовой формат): %tH%n", now); // %tH - час (00-23)
        System.out.printf("Час (12-часовой формат): %tI%n", now); // %tI - час (1-12)
        System.out.printf("Минуты: %tM%n", now); // %tM - минуты (00-59)
        System.out.printf("Секунды: %tS%n", now); // %tS - секунды (00-59)
        System.out.printf("День недели: %tA%n", now); // %tA - день недели
    }
}
