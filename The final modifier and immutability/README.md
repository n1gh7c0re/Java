## Вопрос
Как можно проинициализировать константу, которая объявлена следующим образом? Приведите все возможные варианты.
```
public class A {
    public final int a;
}
```
## Ответ
- Непосредственно при объявлении:
```
public class A {
    public final int a = 100;  // Инициализация при объявлении
}
```
- В конструкторе:
```
public class A {
    public final int a;

    // Конструктор, принимающий значение
    public A(int value) {
        this.a = value;  // Инициализация через конструктор
    }
}
```
Если конструкторов несколько, нужно инициализировать в каждом данную переменную

- В блоке инициализации:
```
public class A {
    public final int a;

    // Блок инициализации
    {
        a = 10;  // Инициализация по умолчанию
    }

}
```
Однако нельзя использовать блоки инициализации вместе с конструкторами для одного и того же поля, 

так как это приведет к ошибке компиляции (двойная инициализация).
