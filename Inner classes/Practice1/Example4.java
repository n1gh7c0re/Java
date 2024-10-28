// Внутренний класс с package-private (по умолчанию)
class OuterClass4 {
    class PackagePrivateInnerClass {
        public void display() {
            System.out.println("Package-Private Inner Class");
        }
    }
}

// Пример использования внутри того же пакета
public class Example4 {
    public static void main(String[] args) {
        OuterClass4 outer = new OuterClass4();
        OuterClass4.PackagePrivateInnerClass inner = outer.new PackagePrivateInnerClass();
        inner.display(); // Доступен, так как в том же пакете
    }
}
