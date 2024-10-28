# Вопрос:
Объясните как спецификаторы private, protected, public и спецификатор по умолчанию, меняются при наследовании на следующем примере.
```
class A {
  int a1;
  public int a2;
  protected int a3;
  private int a4;

  void method1() {
    ...
  }

  public void method2() {
    ...
  }

  protected void method3() {
    ...
  }
  
  private void method4() {
    ...
  }

}

class B extends A {
  ...
}

class C extends B {
  ...
}
```
# Ответ:
- Class A
```
class A {
    int a1;               // package-private (доступ по умолчанию)
    public int a2;       // доступен всем
    protected int a3;    // доступен в том же пакете и подклассам
    private int a4;      // доступен только внутри класса A

    void method1() { ... }       // package-private (доступ по умолчанию)
    public void method2() { ... } // доступен всем
    protected void method3() { ... } // доступен в том же пакете и подклассам
    private void method4() { ... } // доступен только внутри класса A
}
```
- Class B (Наследник A)
```
class B extends A {
    // Здесь класс B наследует все доступные члены класса A
    // Доступные члены:
    
    a1 (package-private) - доступен в классе B, так как B находится в том же пакете.
    a2 (public) - доступен всем, включая другие классы и пакеты.
    a3 (protected) - доступен в классе B и всем его подклассам (например, класс C).
    a4 (private) - недоступен в классе B, т.к. private члены доступны только в классе A.

    method1 (package-private) - доступен в классе B.
    method2 (public) - доступен всем.
    method3 (protected) - доступен в классе B.
    method4 (private) - недоступен в классе B.
}
```
- Class C (Наследник B)
```
class C extends B {
    // Здесь класс C наследует все доступные члены класса B, а значит и от класса A.
    // Доступные члены:
    
    a1 (package-private) - доступен в классе C, так как C находится в том же пакете.
    a2 (public) - доступен всем, включая другие классы и пакеты.
    a3 (protected) - доступен в классе C, поскольку C является подклассом B.
    a4 (private) - по-прежнему недоступен, т.к. private члены доступны только в классе A.

    method1 (package-private) - доступен в классе C.
    method2 (public) - доступен всем.
    method3 (protected) - доступен в классе C.
    method4 (private) - недоступен в классе C.
}
```
