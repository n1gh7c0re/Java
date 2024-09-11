## Вопрос
Что выведет данный код и почему?
```
public class A {
    {
        System.out.println("logic (1) id= " + this.id);
    }

    static {
        System.out.println("static logic");
    }

    private int id = 1;

    public A(int id) {
        this.id = id;
        System.out.println("ctor id= " + id);
    }

    {
        System.out.println("logic (2) id= " + id);
    }
}

public class Main {
    public static void main(String[] args) {
        new A(100);
    }
}
```
## Ответ
Рассмотрим порядок выполнения кода:

- Статический блок:
```
static { 
    System.out.println("static logic"); 
}
```
Результатом работы данного блока будет следующий текст:
```
static logic
```
- Первый инициализационный блок:
```
{ 
    System.out.println("logic (1) id= " + this.id); 
}
```
На данном этапе поле id еще не инициализировано, оно еще не получило значение 1 (это произойдет позже, в строке private int id = 1;). 

Поэтому this.id будет равно значению по умолчанию для int, что равно 0. Вывод будет:
```
logic (1) id= 0
```
- Второй инициализационный блок:
```
{ 
    System.out.println("logic (2) id= " + id); 
}
```
Поскольку теперь `id` уже инициализировано значением `1`, то вывод будет:
```
logic (2) id= 1
```
- Вызов конструктора:
```
public A(int id) { 
    this.id = id; 
    System.out.println("ctor id= " + id); 
}
```
Здесь `this.id` будет присвоено значение, равное `100` (в классе `Main` при создании объекта класса указали число `100`), и будет выведено:
```
ctor id= 100
```
**Общий вывод**
```
static logic
logic (1) id= 0
logic (2) id= 1
ctor id= 100
```
