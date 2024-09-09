import java.lang.*;

public class Main {
    public static void main(String[] args) {
        // Через конструктор Boolean(boolean value)
        Boolean bool1 = new Boolean(true);
        Boolean bool2 = new Boolean(false);

        // С помощью valueOf(boolean value) - самый эффективный способ
        Boolean bool3 = Boolean.valueOf(true);
        Boolean bool4 = Boolean.valueOf(false);

        // С помощью valueOf(String s)
        Boolean bool5 = Boolean.valueOf("true");     // Возвращает Boolean.TRUE
        Boolean bool6 = Boolean.valueOf("false");    // Возвращает Boolean.FALSE
        Boolean bool7 = Boolean.valueOf("invalid");   // Возвращает Boolean.FALSE

        // Boxing
        boolean primitiveValue = true;
        Boolean bool8 = primitiveValue; // Автоупаковка

        // С помощью конструктора Boolean(String s)
        Boolean bool9 = new Boolean("true");            // true
        Boolean bool10 = new Boolean("false");           // false
        Boolean bool11 = new Boolean("anything else");   // false
    }
}
