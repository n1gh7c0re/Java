## Вопрос
```
Объясните, почему в цикле for (1) будут другие результаты, чем в следующих затем вызовах (2), хотя аргументы одинаковые?

public class A {
    public void printNum(Integer i)
    {
        System.out.printf("Integer = %d%n", i);
    }
    public void printNum(int i)
    {
        System.out.printf("int = %d%n", i);
    }
    public void printNum(Float f)
    {
        System.out.printf("Float = %.4f%n", f);
    }
    public void printNum(Number n)
    {
        System.out.println("Number=" + n);
    }
}


public class Main {
    public static void main(String[] args) {
        A a = new A();
        Number[ ] num = {new Integer(1), 11, 1.11f, 11.11 };
        // цикл for (1)
        for (Number n : num) {
            a.printNum(n);
        }
        // (2)
        a.printNum(new Integer(1));
        a.printNum(11);
        a.printNum(1.11f);
        a.printNum(11.11);
    }
}
```
## Ответ
- В цикле `for(1)` перебираются все элементы массива `num`, и каждый элемент рассматривается как тип `Number`, так как переменная `n` объявлена как `Number`.

При вызове `a.printNum(n)` Java выбирает метод с самым подходящим типом. Так как все элементы интерпретируются как `Number`, вызывается метод:
```
public void printNum(Number n) {
    System.out.println("Number=" + n);
}
```
Вывод программы:
```
Number=1
Number=11
Number=1.11
Number=11.11
```
- Теперь остальные вызовы:
1. `a.printNum(new Integer(1));` - вызывается метод, поскольку передан тип данных `Integer`
```
public void printNum(Integer i) {
    System.out.printf("Integer = %d%n", i);
}
```
Вывод:
```
Integer = 1
```
2. `a.printNum(11);` - вызывается уже другой метод, поскольку 11 это `int`
```
public void printNum(int i) {
    System.out.printf("int = %d%n", i);
}
```
Вывод:
```
int = 11
```
3. `a.printNum(1.11f);` - вызывается снова новый метод, так как это число типа `float`
```
public void printNum(Float f) {
    System.out.printf("Float = %.4f%n", f);
}
```
Вывод:
```
Float = 1.1100
```
4. `a.printNum(11.11);` - наконец, вызывается последний метод, работает уже с типом `double`
```
public void printNum(Number n) {
    System.out.println("Number=" + n);
}
```
Вывод:
```
Number=11.11
```

**Основные различия:**

В цикле (1) все аргументы конвертируются в тип `Number`, и вызывается только один метод - `printNum(Number n)`.

В вызовах (2) Java выбирает наиболее специфический метод в соответствии с типом переданного значения. 

В результате для `Integer`, `int` и `Float` вызываются различные перегруженные методы.
