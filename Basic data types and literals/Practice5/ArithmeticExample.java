public class ArithmeticExample {
    public static void main(String[] args) {
        int intValue = 10;
        double doubleValue = 5.5;

        // Сложение int и double
        double result1 = intValue + doubleValue;
        System.out.println("Сложение int и double: " + result1); // Вывод: 15.5
        // Объяснение: В этом случае int автоматически приводится к double перед выполнением операции сложения.
        // Результат будет типа double.

        float floatValue = 2.5f;
        // Вычитание float и int
        float result2 = floatValue - intValue;
        System.out.println("Вычитание float и int: " + result2); // Вывод: -7.5
        // Объяснение: Здесь int приводится к float, так как операция происходит между float и int.
        // Результат будет float.

        long longValue = 100L;
        // Умножение long и double
        double result3 = longValue * doubleValue;
        System.out.println("Умножение long и double: " + result3); // Вывод: 550.0
        // Объяснение: Аналогично предыдущим примерам, long будет приведен к double,
        // и операция даст результат типа double.

        // Деление int на float
        float result4 = intValue / floatValue;
        System.out.println("Деление int на float: " + result4); // Вывод: 4.0
        // Объяснение: Значение intValue приводится к типу float, и результат становится float.

        String strValue = "Значение: ";
        // Конкатенация строки и int
        String result5 = strValue + intValue;
        System.out.println("Конкатенация строки и int: " + result5); // Вывод: "Значение: 10"
        // Объяснение: Оператор + перегружен для работы с String, и int будет автоматически приведен к строке
        // Так что результат будет строкой.
    }
}

