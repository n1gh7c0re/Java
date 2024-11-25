# Вопрос:
- Приведите пример переопределенного метода:

- Что будет, если у переопределенного и переопределяемого (из суперкласса) методов не будет совпадать тип возвращаемого значения?

# Ответ:
### Пример переопределенного метода.
```
class Animal {
    // Переопределяемый метод
    public void sound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {
    // Переопределенный метод
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sound(); // Вывод: Some animal sound

        Dog myDog = new Dog();
        myDog.sound(); // Вывод: Bark
    }
}
```
### Ответ на вопрос:
Если у переопределенного и переопределяемого (из суперкласса) методов тип возвращаемого значения не совпадает (например, метод в суперклассе возвращает `void`, а метод в подклассе возвращает `int`), вы получите ошибку компиляции.
