// Определение пользовательского исключения
class CustomException extends Exception {

    // Конструктор без параметров
    public CustomException() {
        super("Произошло пользовательское исключение");
    }

    // Конструктор с сообщением об ошибке
    public CustomException(String message) {
        super(message);
    }

    // Конструктор с сообщением об ошибке и причиной (Throwable)
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}

// Класс, демонстрирующий использование пользовательского исключения
public class Main {
    public static void main(String[] args) {
        try {
            methodThatThrowsException(1);
        } catch (CustomException e) {
            System.out.println("Перехвачено: " + e.getMessage());
        }

        try {
            methodThatThrowsException(2);
        } catch (CustomException e) {
            System.out.println("Перехвачено: " + e.getMessage());
        }

        try {
            methodThatThrowsException(3);
        } catch (CustomException e) {
            System.out.println("Перехвачено: " + e.getMessage());
        }
    }

    public static void methodThatThrowsException(int scenario) throws CustomException {
        if (scenario == 1) {
            throw new CustomException(); // Использует конструктор без параметров
        } else if (scenario == 2) {
            throw new CustomException("Ошибка с сообщением"); // Использует конструктор с сообщением
        } else if (scenario == 3) {
            throw new CustomException("Ошибка с причиной", new NullPointerException()); // Использует конструктор с сообщением и причиной
        }
    }
}
