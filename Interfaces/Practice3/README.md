# Вопрос:
Объясните, какая область видимости у интерфейса, объявленного следующим образом.
```
protected interface Interface {
  ...
}
```
# Ответ:
Спецификатор доступа `protected` не может быть применён к интерфейсам. Если попытаться объявить интерфейс с модификатором `protected`, это приведёт к ошибке компиляции.
