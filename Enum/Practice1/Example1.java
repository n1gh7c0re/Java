enum VehicleType {
    CAR("Car", 4) {
        @Override
        public String description() {
            return "A road vehicle powered by an engine.";
        }
    },
    TRUCK("Truck", 6) {
        @Override
        public String description() {
            return "A motor vehicle designed to transport cargo.";
        }
    },
    MOTORCYCLE("Motorcycle", 2) {
        @Override
        public String description() {
            return "A two-wheeled motor vehicle.";
        }
    };

    private final String name;
    private final int wheels;

    // Конструктор
    VehicleType(String name, int wheels) {
        this.name = name;
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    // Метод, который будет переопределяться в конкретных элементах перечисления
    public abstract String description();
}

public class Example1 {
    public static void main(String[] args) {
        for (VehicleType type : VehicleType.values()) {
            System.out.println("Vehicle Type: " + type.getName());
            System.out.println("Number of Wheels: " + type.getWheels());
            System.out.println("Description: " + type.description());
            System.out.println();
        }
    }
}
