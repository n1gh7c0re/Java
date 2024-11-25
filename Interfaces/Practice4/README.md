# Вопрос:
Объясните, какая область видимости у интерфейса, объявленного следующим образом.
```
private interface Interface {
  ...
}
```
# Ответ:
Интерфейсы могут быть объявлены с модификатором доступа `private`, но такая ситуация может возникнуть только в контексте вложенных интерфейсов (или вложенных классов). 

Спецификатор `private`, применяемый к вложенному интерфейсу, ограничивает его видимость только на уровень, в котором он объявлен. 

Это означает, что доступ к нему будет иметь только сам класс, в котором он объявлен.