# Вопрос:
Объясните, зачем нужны следующие аннотации и приведите примеры их использования.

- `@Override`
- `@Deprecated`
- `@SuppressWarnings`
# Ответ:
1. `@Override`

Эта аннотация указывается перед методом и указывает, что метод переопределяет метод суперкласса.

Это помогает избежать ошибок, например, если метод не переопределяет, а просто объявлен с ошибкой в имени или параметрах.
```
class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}
```
2. `@Deprecated`

Эта аннотация помечает метод, класс или поле как устаревшее и не рекомендует их использование.

Обычно это делается, когда есть более безопасная или эффективная альтернатива.
```
class OldClass {
    @Deprecated
    void oldMethod() {
        System.out.println("This is an old method");
    }
}

class NewClass {
    void newMethod() {
        System.out.println("This is the new recommended method");
    }
}
```
3. `@SuppressWarnings`

Эта аннотация используется для подавления определенных предупреждений компилятора.

Это может быть полезно, когда вы хотите игнорировать определенные предупреждения, например, связанные с неиспользуемыми переменными или небезопасными операциями.
```
class Example {
    @SuppressWarnings("unchecked")
    void myMethod() {
        List list = new ArrayList(); // сырой тип
        list.add("example"); // Предупреждение о не безопасном приведении типов
    }
}
```
