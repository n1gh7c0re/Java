enum DayOfWeek {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private final String dayName;

    // Конструктор для инициализации имени дня
    DayOfWeek(String dayName) {
        this.dayName = dayName;
    }

    // Метод для получения имени дня
    public String getDayName() {
        return dayName;
    }

    // Дополнительный метод для проверки, является ли день выходным
    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}

public class Example {
    public static void main(String[] args) {
        // Пройтись по всем дням недели
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println("Day: " + day.getDayName());
            System.out.println("Is weekend? " + (day.isWeekend() ? "Yes" : "No"));
            System.out.println();
        }
    }
}
