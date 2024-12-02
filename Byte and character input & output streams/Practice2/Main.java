import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр ByteArrayOutputStream
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        // Пример данных для записи
        String data = "Hello, World!";

        // Запись данных в ByteArrayOutputStream
        try {
            for (int i = 0; i < data.length(); i++) {
                // Записываем каждый символ как байт
                byteArrayOutputStream.write(data.charAt(i));
            }

            // Преобразуем записанные байты в строку
            String result = byteArrayOutputStream.toString();
            System.out.println("Записанные данные: " + result);
        } finally {
            // Закрываем поток, чтобы освободить ресурсы
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
