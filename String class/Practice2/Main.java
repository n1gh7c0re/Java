import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        // Пример 1: Простой объединитель строк с запятой как разделителем
        StringJoiner joiner1 = new StringJoiner(", ");
        joiner1.add("Java");
        joiner1.add("Python");
        joiner1.add("C++");
        System.out.println("Joined with comma: " + joiner1); // Вывод: Java, Python, C++

        // Пример 2: Объединитель строк с префиксом и суффиксом
        StringJoiner joiner2 = new StringJoiner(", ", "[", "]");
        joiner2.add("Apple");
        joiner2.add("Banana");
        joiner2.add("Cherry");
        System.out.println("Joined with prefix and suffix: " + joiner2); // Вывод: [Apple, Banana, Cherry]

        // Пример 3: Использование с циклом
        StringJoiner joiner3 = new StringJoiner(" | ");
        for (int i = 1; i <= 5; i++) {
            joiner3.add("Item " + i);
        }
        System.out.println("Joined with pipe: " + joiner3); // Вывод: Item 1 | Item 2 | Item 3 | Item 4 | Item 5

        // Пример 4: Объединение строк без добавления лишнего разделителя
        StringJoiner joiner4 = new StringJoiner(", ");
        String str1 = "Hello";
        String str2 = "";
        String str3 = "World";
        if (!str1.isEmpty()) joiner4.add(str1);
        if (!str2.isEmpty()) joiner4.add(str2);
        if (!str3.isEmpty()) joiner4.add(str3);
        System.out.println("Joined with ignored empty strings: " + joiner4); // Вывод: Hello, World

        // Пример 5: Использование StringJoiner с коллекцией
        StringJoiner joiner5 = new StringJoiner("; ");
        for (String city : new String[]{"London", "Paris", "New York"}) {
            joiner5.add(city);
        }
        System.out.println("Joined cities: " + joiner5); // Вывод: London; Paris; New York
    }
}
