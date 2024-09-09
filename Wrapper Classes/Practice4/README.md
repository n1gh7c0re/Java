## Вопрос
Какие значения напечатает следующий код?
```
int i1 = 128;
Integer a1 = i1;
Integer b1 = i1;
System.out.println("a1==i1 " + (a1 == i1));
System.out.println("b1==i1 " + (b1 == i1));
System.out.println("a1==b1 " + (a1 == b1));
System.out.println("a1.equals(i1) -> " + a1.equals(i1));
System.out.println("b1.equals(i1) -> " + b1.equals(i1));
System.out.println("a1.equals(b1) -> " + a1.equals(b1));

int i2 = 127;
Integer a2 = i2;
Integer b2 = i2;
System.out.println("a2==i2 " + (a2 == i2));
System.out.println("b2==i2 " + (b2 == i2));
System.out.println("a2==b2 " + (a2 == b2));
System.out.println("a2.equals(i2) -> " + a2.equals(i2));
System.out.println("b2.equals(i2) -> " + b2.equals(i2));
System.out.println("a2.equals(b2) -> " + a2.equals(b2));
```
Объясните полученный результат. Для чего используется класс IntegerCache?

## Ответ
Вывод в консоль:
```
a1==i1 true
b1==i1 true
a1==b1 false
a1.equals(i1) -> true
b1.equals(i1) -> true
a1.equals(b1) -> true
a2==i2 true
b2==i2 true
a2==b2 true
a2.equals(i2) -> true
b2.equals(i2) -> true
a2.equals(b2) -> true
```
- `a1==i1`: true

`a1` (типа `Integer`) при сравнении с `i1` (типа `int`) проходит автораспаковку, и сравниваются примитивные значения. Оба равны 128.

- `b1==i1`: true

Аналогично, `b1` распаковывается и сравнивается с `i1`. Результат тот же.

- `a1==b1`: false

`a1` и `b1` ссылаются на разные объекты `Integer`, поскольку 128 не входит в диапазон кэша.

- `a1.equals(i1)`: true

`equals` сравнивает значения, и 128 (значение `a1`) равно 128 (значение `i1`).

- `b1.equals(i1)`: true

То же самое. Значение совпадает.

- `a1.equals(b1)`: true
  
То же самое. Значение совпадает.

- `a2==i2`: true

`a2` распаковывается до 127, что совпадает с `i2`.

- `b2==i2`: true

Аналогично. `b2` тоже распаковывается до 127.

- `a2==b2`: true

Оба ссылаются на один и тот же объект, так как 127 попадает в диапазон кэша.

- `a2.equals(i2)`: true

`equals` работает, как и раньше.

- `b2.equals(i2)`: true

Аналогично.

- `a2.equals(b2)`: true

Оба `Integer` значения равны, и ссылки указывают на один и тот же объект.
