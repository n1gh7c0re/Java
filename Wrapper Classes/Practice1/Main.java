import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class Main {
    public static void main(String[] args) {
        // 1. Декодирование URL
        try {
            String encodedString = "Hello%20World%21";
            String decodedString = URLDecoder.decode(encodedString, "UTF-8");
            System.out.println("Decoded String: " + decodedString);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        // 2. Декодирование строк, представляющих числа с различными системами счисления
        // Декодирование десятичного числа с помощью Integer.decode
        Integer decimal = Integer.decode("123");
        System.out.println("Decimal to Int: " + decimal);

        // Декодирование шестнадцатеричного числа с помощью Integer.decode
        Integer hex = Integer.decode("0x1A");
        System.out.println("Hexadecimal to Int: " + hex); // 26 в десятичном

        // Декодирование шестнадцатеричного числа с помощью Long.decode
        Long hex2 = Long.decode("0x1F4");
        System.out.println("Hexadecimal to Long: " + hex2); // 500 в десятичном

        // 3. Обработка исключений при декодировании - ошибка NumberFormatException
        try {
            Integer invalid = Integer.decode("NotANumber");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }
    }
}
