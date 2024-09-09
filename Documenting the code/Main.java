/**
 * Класс определяющий математические операции с двумя целыми числами
 * @author Sergey Tishkovets
 * @since 09.09.2024
 * @version 1.0
 */
class MathOperations {

    private int value1;
    private int value2;

    /**
     * Конструктор класса MathOperations
     * @param value1 первое целое значение
     * @param value2 второе целое значение
     */
    public MathOperations(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    /**
     * Функция, получающая результат операции сложения
     * @return сумму чисел
     */
    public int getSum() {
        return value1 + value2;
    }

    /**
     * Функция, получающая результат операции вычитания
     * @return разность чисел
     */
    public int getDifference() {
        return value1 - value2;
    }

    /**
     * Функция, получающая результат операции умножения
     * @return произведение чисел
     */
    public int getMultiplication() {
        return value1 * value2;
    }

    /**
     * Функция, получающая результат операции умножения
     * @return произведение чисел
     */
    public int getDivision() {
        return value1 / value2;
    }
}

/**
 * Основной класс, в котором тестируются операции
 */
public class Main{
    public static void main(String[] args) {
        /**
         * Создание объекта класса MathOperations и инициализация 2 целых чисел
         */
        MathOperations math = new MathOperations(100, 20);
        /**
         * Вывод на экран результата операций
         */
        System.out.println(math.getSum());
        System.out.println(math.getDifference());
        System.out.println(math.getMultiplication());
        System.out.println(math.getDivision());
    }
}

