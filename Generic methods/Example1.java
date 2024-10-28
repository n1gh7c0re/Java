import java.util.Arrays;

public class Example1 {

    // Параметризованный метод, который принимает массив и возвращает максимальный элемент
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;  // Обновляем максимальное значение
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] intArray = {3, 5, 7, 2, 8};
        String[] stringArray = {"apple", "orange", "banana", "kiwi"};

        // Вызов параметризованного метода с массивом целых чисел
        Integer maxInt = findMax(intArray);
        System.out.println("Max Integer: " + maxInt);

        // Вызов параметризованного метода с массивом строк
        String maxString = findMax(stringArray);
        System.out.println("Max String: " + maxString);
    }
}
