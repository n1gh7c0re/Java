// Внутренний класс с спецификатором public
class OuterClass1 {
    public class PublicInnerClass {
        public void display() {
            System.out.println("Public Inner Class");
        }
    }
}

public class Example1 {
    public static void main(String[] args) {
        OuterClass1 outer = new OuterClass1();
        OuterClass1.PublicInnerClass inner = outer.new PublicInnerClass();
        inner.display();  // Доступен извне, создаем экземпляр через внешний класс
    }
}
