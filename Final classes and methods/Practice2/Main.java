// Определяем финальный класс
final class FinalClass {
    public void display() {
        System.out.println("This is a final class.");
    }
}

// Попытка наследоваться от финального класса приведет к ошибке компиляции
/*
class SubClass extends FinalClass {
    // Код не достигнет этой части из-за ошибки
}
*/

public class Main {
    public static void main(String[] args) {
        FinalClass finalObject = new FinalClass();
        finalObject.display();

        // Подкласс не может быть создан
        // SubClass subClassObject = new SubClass(); // Ошибка здесь
    }
}
