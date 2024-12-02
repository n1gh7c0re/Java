# Вопрос
Можно ли использовать следующую конструкцию (`try` только с `finally`):
```
try {
  ...
} finally {
  ...
}
```
# Ответ
Да, в Java можно использовать конструкцию `try` только с блоком `finally`. 

Это допустимо и довольно часто применяется, когда необходимо выполнить некоторый код (например, освобождение ресурсов или закрытие файлов) после выполнения блока `try`, независимо от того, было ли выброшено исключение или нет.

Пример:
```
public class FinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println("Выполнение блока try");
            int result = 10 / 0; // Это вызовет ArithmeticException
        } finally {
            System.out.println("Этот код выполнится в блоке finally");
        }

        // Код ниже не будет выполнен из-за исключения
        System.out.println("Этот код не будет выполнен");
    }
}
```
Вывод на экран:
```
Выполнение блока try
Этот код выполнится в блоке finally
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Main.main(Main.java:5)
```
