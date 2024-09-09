import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Создание массива
        int[] numbers = {5, 2, 8, 1, 3};

        // 1. Пример использования метода toString(...)
        String arrayString = Arrays.toString(numbers);
        System.out.println("Array: " + arrayString);

        // 2. Пример использования метода sort(...)
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // 3. Пример использования метода binarySearch(...)
        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("Index of 3: " + index); // Должен вернуть индекс элемента 3

        // 4. Пример использования метода equals(...)
        int[] anotherArray = {1, 2, 3};
        int[] yetAnotherArray = {1, 2, 3};
        boolean areEqual = Arrays.equals(anotherArray, yetAnotherArray);
        System.out.println("Arrays equal: " + areEqual); // Должен вернуть true

        // 5. Пример использования метода compare(...)
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 4};
        int comparisonResult = Arrays.compare(array1, array2);
        System.out.println("Comparison result: " + comparisonResult); // Должен вернуть отрицательное число
    }
}
