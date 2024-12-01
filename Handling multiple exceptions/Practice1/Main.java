// Определяем иерархию пользовательских исключений
class Ex1 extends Exception {
    public Ex1(String message) {
        super(message);
    }
}

class Ex2 extends Ex1 {
    public Ex2(String message) {
        super(message);
    }
}

class Ex3 extends Ex2 {
    public Ex3(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            // Вызываем метод, который генерирует исключения
            generateException(1); // Меняем число, чтобы вызвать разные исключения
        } catch (Ex1 e) {
            // Обработка исключений Ex1, Ex2, Ex3 одинаково
            System.out.println("Обработано исключение: " + e.getMessage());
        }
    }

    // Метод выбрасывает исключения в зависимости от переданного типа
    public static void generateException(int exceptionType) throws Ex1 {
        switch (exceptionType) {
            case 1:
                throw new Ex1("Исключение класса Ex1");
            case 2:
                throw new Ex2("Исключение класса Ex2");
            case 3:
                throw new Ex3("Исключение класса Ex3");
            default:
                System.out.println("Нет исключения");
        }
    }
}
