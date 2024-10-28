class OuterClass {
    private String privateField = "Private Field";
    String defaultField = "Default Field"; // package-private
    protected String protectedField = "Protected Field";
    public String publicField = "Public Field";

    private void privateMethod() {
        System.out.println("Private Method");
    }

    void defaultMethod() {
        System.out.println("Default Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    public void publicMethod() {
        System.out.println("Public Method");
    }

    class InnerClass {
        public void accessOuterMembers() {
            // Доступ ко всем полям внешнего класса
            System.out.println(privateField);     // Доступен
            System.out.println(defaultField);     // Доступен
            System.out.println(protectedField);   // Доступен
            System.out.println(publicField);      // Доступен

            // Вызов всех методов внешнего класса
            privateMethod();     // Доступен
            defaultMethod();     // Доступен
            protectedMethod();   // Доступен
            publicMethod();      // Доступен
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.accessOuterMembers();  // Демонстрация доступа ко всем элементам внешнего класса
    }
}
