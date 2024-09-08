// Определяем интерфейс
interface Shape {
    double area();  // Метод для вычисления площади
}

// Реализуем интерфейс в классе Circle
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;  // Площадь круга
    }
}

// Реализуем интерфейс в классе Rectangle
class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;  // Площадь прямоугольника
    }
}

public class Main {
    public static void main(String[] args) {
        // Используем var для автоматического определения типа
        var circle = new Circle(5.0);
        var rectangle = new Rectangle(4.0, 6.0);

        // Вывод площади
        System.out.println("Area of Circle: " + circle.area());           // Вывод: Area of Circle: 78.53981633974483
        System.out.println("Area of Rectangle: " + rectangle.area());     // Вывод: Area of Rectangle: 24.0

        // Полиморфизм
        Shape myShape = circle;  // myShape ссылается на Circle
        System.out.println("Area of MyShape (Circle): " + myShape.area()); // Вывод: Area of MyShape (Circle): 78.53981633974483

        myShape = rectangle;  // myShape теперь ссылается на Rectangle
        System.out.println("Area of MyShape (Rectangle): " + myShape.area()); // Вывод: Area of MyShape (Rectangle): 24.0
    }
}
