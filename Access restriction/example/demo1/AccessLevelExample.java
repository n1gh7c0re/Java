
// Пакет example.demo1
package example.demo1;

// Класс с различными уровнями доступа
public class AccessLevelExample {
    public int publicVar = 1; // Доступен везде
    protected int protectedVar = 2; // Доступен в пакете и подклассах
    int defaultVar = 3; // Доступен только в этом пакете
    private int privateVar = 4; // Доступен только в этом классе

    public void display() {
        System.out.println("Public Variable: " + publicVar);
        System.out.println("Protected Variable: " + protectedVar);
        System.out.println("Default Variable: " + defaultVar);
        System.out.println("Private Variable: " + privateVar);
    }
}