# Вопрос:
Что случится при вызове метода `method()` объекта класса `C`, если переменная `a` и метод `method()` не будут определены в классе `B`, а будут определены только в классе `A`?
```
class A {
  int a;
  void method() {
    ...
  }

}

class B extends A {
  ...
}

class C extends B {
  ...
  void method() {
    ...
    int a = super.a;
    super.method();
  }
  ...
}
```
# Ответ:
Вызов `method()` объекта класса `C` приведет к выполнению следующего:

`int a = super.a;` — будет успешно выполнено. Переменная `a` в данном контексте будет иметь значение поля `a` суперкласса `A`.

`super.method();` — будет успешно выполнен вызов метода `method()` из класса `A`.

Таким образом, программа будет выполнена без исключений, и оба вызова будут корректными благодаря иерархии наследования.

Например:
```
class A {
    int a; // поле a не инициализировано, значение по умолчанию 0

    void method() {
        System.out.println("Method in A");
    }
}

class B extends A {
    // ничего не добавлено
}

class C extends B {
    void method() {
        int a = super.a; // здесь a будет равно 0, поскольку оно не инициализировано
        System.out.println("Value of super.a: " + a);
        super.method(); // вызовет метод из класса A
    }
}

public class Main {
    public static void main(String[] args) {
        C c = new C();
        c.method();
    }
}
```
Вывод в консоль будет:
```
Value of super.a: 0
Method in A
```
