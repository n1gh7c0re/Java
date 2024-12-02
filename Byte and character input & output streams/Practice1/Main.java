import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Определяем массив байтов
        byte[] data = "Hello, World!".getBytes(); // Преобразуем строку в массив байтов

        // Создаем объект ByteArrayInputStream
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);

        int byteData; // Переменная для хранения считанного байта

        // Читаем данные из потока
        while ((byteData = byteArrayInputStream.read()) != -1) { // Читаем байты до конца потока
            System.out.print((char) byteData); // Преобразуем байт в символ и выводим
        }

        try {
            byteArrayInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
