/* При автоупаковке и автораспаковке в Java может возникать
 исключение NullPointerException в случае, если вы пытаетесь распаковать
 (т.е. конвертировать в примитивный тип) значение, которое равно null. */
public class Main {
    public static void main(String[] args) {
        // Создаем объект Boolean и присваиваем ему значение null
        Boolean boolObj = null;

        // Попробуем распаковать значение в примитивный тип boolean
        try {
            boolean primitiveValue = boolObj; // Здесь произойдет автоупаковка
            System.out.println("Primitive Value: " + primitiveValue);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
