## Вопрос
Приведите тривиальные примеры бесконечных циклов для конструкций `while` и `do-while`.
## Ответ
```
public class Main {
    public static void main(String[] args) {
        while (1 == 1) {
            System.out.println("Hello World");
        }

        do {
            System.out.println("Goodbye World");
        } while (true);
    }
}
```
