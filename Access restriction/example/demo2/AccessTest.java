// Пакет example.demo2
package example.demo2;

import example.demo1.AccessLevelExample;

// Класс в другом пакете
public class AccessTest extends AccessLevelExample {
    public static void main(String[] args) {
        AccessLevelExample example = new AccessLevelExample();

        // Доступ к переменным различных уровней доступа
        System.out.println("Public Variable: " + example.publicVar); // Доступен
        // System.out.println("Protected Variable: " + example.protectedVar); // Не доступен
        // System.out.println("Default Variable: " + example.defaultVar); // Не доступен
        // System.out.println("Private Variable: " + example.privateVar); // Не доступен

        AccessTest at = new AccessTest();
        System.out.println("Protected Variable (accessed via subclass): " + at.protectedVar); // Доступен

        example.display(); // Метод public, доступен
    }
}