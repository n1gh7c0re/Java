// Внутренний класс с спецификатором protected
class OuterClass3 {
    protected class ProtectedInnerClass {
        public void display() {
            System.out.println("Protected Inner Class");
        }
    }
}

class SubClass extends OuterClass3 {
    public void createInner() {
        ProtectedInnerClass inner = new ProtectedInnerClass();
        inner.display(); // Доступен в подклассе
    }
}

public class Example3 {
    public static void main(String[] args) {
        SubClass subclass = new SubClass();
        subclass.createInner();  // Доступен через подкласс
        // ProtectedInnerClass inner = new OuterClass3().new ProtectedInnerClass(); // Ошибка: недоступен
    }
}
