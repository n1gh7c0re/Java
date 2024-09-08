public class NarrowingExample {
    public static void main(String[] args) {
        double doubleValue = 9.82;

        // Из double в int
        int intValue = (int) doubleValue;
        System.out.println("Из double в int: " + intValue); // Вывод: 9
        // Объяснение: double содержит дробную часть, которая отбрасывается при преобразовании в int,
        // в результате чего получаем значение 9.

        double floatValue = 257.99f;

        // Из float в byte
        byte byteValue = (byte) floatValue;
        System.out.println("Из float в byte: " + byteValue); // Вывод: 1
        // Объяснение: Значение 257 должно быть преобразовано. Поскольку byte хранит значения только в диапазоне от -128 до 127,
        // по модулю 257 % 256 остается 1. Таким образом, результатом преобразования будет 1.

        short shortValue = 65;

        // Из short в char
        char charValue = (char) shortValue;

        System.out.println("Из short в char: " + charValue); // Вывод: A
        // Объяснение: Значение 65 соответствует символу 'A' в таблице ASCII.
        // При преобразовании int в char происходит корректная конвертация.
    }
}