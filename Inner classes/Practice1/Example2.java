// Внутренний класс с спецификатором private
class OuterClass2 {
    private class PrivateInnerClass {
        public void display() {
            System.out.println("Private Inner Class");
        }
    }

    public void createInner() {
        PrivateInnerClass inner = new PrivateInnerClass();
        inner.display(); // Доступен здесь, внутри внешнего класса
    }
}

public class Example2 {
    public static void main(String[] args) {
        OuterClass2 outer = new OuterClass2();
        outer.createInner();  // Доступен через метод внешнего класса
        // PrivateInnerClass inner = outer.new PrivateInnerClass(); // Ошибка: недоступен вне OuterClass2
    }
}
