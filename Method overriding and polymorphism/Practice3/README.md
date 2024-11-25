# Вопрос:
Приведите пример и объясните, когда использование аннотации `@Override` помогает обнаружить ошибку.
# Ответ:
Например, `@Override` позволяет компилятору проверять правильность переопределения.
```
class Animal {
    public void sound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {
    // Ошибка: неправильно переопределен метод (опечатка в имени метода)
    @Override
    public void sounds() { // Добавлена буква "s", должно быть sound()
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound(); // Ожидается, что этот вызов должен напечатать "Bark"
    }
}
```
