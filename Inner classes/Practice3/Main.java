class OuterClass {
    class InnerClass {
        private String innerPrivateField = "Inner Private Field";
        String innerDefaultField = "Inner Default Field"; // package-private
        protected String innerProtectedField = "Inner Protected Field";
        public String innerPublicField = "Inner Public Field";

        private void innerPrivateMethod() {
            System.out.println("Inner Private Method");
        }

        void innerDefaultMethod() {
            System.out.println("Inner Default Method");
        }

        protected void innerProtectedMethod() {
            System.out.println("Inner Protected Method");
        }

        public void innerPublicMethod() {
            System.out.println("Inner Public Method");
        }
    }

    public void accessInnerMembers() {
        InnerClass inner = new InnerClass();

        // Доступ к полям внутреннего класса
        System.out.println(inner.innerPrivateField);     // Доступно
        System.out.println(inner.innerDefaultField);     // Доступно
        System.out.println(inner.innerProtectedField);   // Доступно
        System.out.println(inner.innerPublicField);      // Доступно

        // Вызов методов внутреннего класса
        inner.innerPrivateMethod();    // Доступно
        inner.innerDefaultMethod();    // Доступно
        inner.innerProtectedMethod();  // Доступно
        inner.innerPublicMethod();     // Доступно
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.accessInnerMembers(); // Демонстрация доступа к полям и методам внутреннего класса
    }
}
