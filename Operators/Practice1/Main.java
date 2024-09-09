public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = -10;
        // Операторы присваивания
        a += 3; // a = a + 3; a теперь равно 8
        a -= 2; // a = a - 2; a теперь равно 6
        a *= 2; // a = a * 2; a теперь равно 12
        a /= 3; // a = a / 3; a теперь равно 4 (в целочисленном делении)
        a %= 3; // a = a % 3; a теперь равно 1

        // Операторы условного выражения
        int max = (a > b) ? a : b; // max = a

        // Логические операторы
        boolean result1 = (a > 0) || (b > 0); // true
        boolean result2 = (a > 0) && (b > 0); // false

        // Побитовые операторы
        int c = a | b; // побитовое "или"
        int d = a & b; // побитовое "и"
        int e = a ^ b; // побитовое исключающее "или"

        // Сравнительные операторы
        boolean isEqual = (a == b); // false
        boolean isGreater = (a > b); // true
        boolean isGreaterOrEqual = (a >= b); // true
        boolean isLess = (a < b); // false
        boolean isLessOrEqual = (a <= b); // false

        // Побитовые сдвиги
        int h = a >> 1; // Сдвинуть биты a вправо на 1
        int g = a >>> 1; // Сдвинуть биты a вправо на 1 с заполнением нулем
        int i = a << 1; // Сдвинуть биты a влево на 1

        // Арифметические операторы
        int sum = a + b;
        String greeting = "Hello, " + "world!"; // Конкатенация строк
        int difference = a - b; // 15
        int product = a * b; // -50
        int quotient = a / b; // Целочисленное деление
        int remainder = a % b; // Остаток от деления

        // Унарные операторы
        int s = 5;
        int t = ++s; // s теперь 6, t теперь 6
        int x = 5;
        int y = x++; // x теперь 6, y теперь 5

        int a1 = 5;
        int b1 = --a1; // a1 теперь 4, b1 теперь 4
        int a2 = 5;
        int b2 = a2--; // a2 теперь 4, b2 теперь 5
        int m = ~a1; // Инверсия всех битов
        boolean isFalse = !true; // isFalse будет false

        // Индексация
        int[] array = {1, 2, 3, 4};
        int result = (a + b) * c; // порядок операций с использованием скобок
    }
}

