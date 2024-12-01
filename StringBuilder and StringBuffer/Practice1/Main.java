public class Main {
    public static void main(String[] args) {
        // Пример работы с StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // 1. append(String str) - добавляет строку в конец
        stringBuffer.append(" World");
        System.out.println("1. After append: " + stringBuffer); // Ожидаем: Hello World

        // 2. insert(int offset, String str) - вставляет строку по указанному индексу
        stringBuffer.insert(5, ",");
        System.out.println("2. After insert: " + stringBuffer); // Ожидаем: Hello, World

        // 3. delete(int start, int end) - удаляет часть строки
        stringBuffer.delete(5, 6);
        System.out.println("3. After delete: " + stringBuffer); // Ожидаем: Hello World

        // 4. reverse() - разворачивает строку
        stringBuffer.reverse();
        System.out.println("4. After reverse: " + stringBuffer); // Ожидаем: dlroW olleH

        // 5. capacity() - возвращает емкость StringBuffer
        System.out.println("5. Capacity of StringBuffer: " + stringBuffer.capacity());

        // Пример работы с StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Java");

        // 6. append(String str) - добавляет строку в конец
        stringBuilder.append(" Programming");
        System.out.println("6. After append: " + stringBuilder); // Ожидаем: Java Programming

        // 7. insert(int offset, String str) - вставляет строку по указанному индексу
        stringBuilder.insert(4, " is fun");
        System.out.println("7. After insert: " + stringBuilder); // Ожидаем: Java is fun Programming

        // 8. delete(int start, int end) - удаляет часть строки
        stringBuilder.delete(4, 15);
        System.out.println("8. After delete: " + stringBuilder); // Ожидаем: Java Programming

        // 9. replace(int start, int end, String str) - заменяет часть строки
        stringBuilder.replace(5, 16, "Builder");
        System.out.println("9. After replace: " + stringBuilder); // Ожидаем: Java Builder

        // 10. reverse() - разворачивает строку
        stringBuilder.reverse();
        System.out.println("10. After reverse: " + stringBuilder); // Ожидаем: redliB avaJ
    }
}
