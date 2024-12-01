public class Main {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "Hello, Java!";

        // 1. length() - возвращает длину строки
        System.out.println("1. Length of str1: " + str1.length()); // Ожидаем 13

        // 2. charAt(int index) - возвращает символ по заданному индексу
        System.out.println("2. Character at index 7 in str1: " + str1.charAt(7)); // Ожидаем 'W'

        // 3. substring(int beginIndex, int endIndex) - возвращает подстроку из строки
        System.out.println("3. Substring from index 7 to 12 in str1: " + str1.substring(7, 12)); // Ожидаем "World"

        // 4. indexOf(String str) - возвращает индекс первого вхождения подстроки
        System.out.println("4. Index of 'World' in str1: " + str1.indexOf("World")); // Ожидаем 7

        // 5. toLowerCase() - возвращает строку в нижнем регистре
        System.out.println("5. str1 in lowercase: " + str1.toLowerCase()); // Ожидаем "hello, world!"

        // 6. toUpperCase() - возвращает строку в верхнем регистре
        System.out.println("6. str2 in uppercase: " + str2.toUpperCase()); // Ожидаем "HELLO, JAVA!"

        // 7. replace(char oldChar, char newChar) - заменяет символы
        System.out.println("7. Replace 'o' with 'X' in str1: " + str1.replace('o', 'X')); // Ожидаем "HellX, WXrld!"

        // 8. trim() - удаляет пробелы в начале и в конце строки
        String str3 = "   Hello, Java!   ";
        System.out.println("8. Trimmed str3: '" + str3.trim() + "'"); // Ожидаем "'Hello, Java!'"

        // 9. split(String regex) - разбивает строку по регулярному выражению
        String[] words = str1.split(", ");
        System.out.println("9. Split str1 by ', ': ");
        for (String word : words) {
            System.out.println("  Word: " + word); // Ожидаем "Hello" и "World!"
        }

        // 10. concat(String str) - объединяет две строки
        System.out.println("10. Concatenation of str1 and str2: " + str1.concat(" ").concat(str2)); // Ожидаем "Hello, World! Hello, Java!"
    }
}
