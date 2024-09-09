
public class Main {
    public static void main(String[] args) {
        // int (long, byte и short, а также обертки аналогично)
        int number = 2;
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Other number");
        }

        // char (обертка аналогично)
        char letter = 'A';
        switch (letter) {
            case 'A':
                System.out.println("Letter A");
                break;
            case 'B':
                System.out.println("Letter B");
                break;
            default:
                System.out.println("Other letter");
        }

        // String
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Start of the week");
                break;
            case "Friday":
                System.out.println("End of the week");
                break;
            default:
                System.out.println("Other day");
        }

        // enum
        enum Color {
            RED,
            GREEN,
            BLUE;
        }

        Color color = Color.GREEN;
        switch (color) {
            case RED:
                System.out.println("Red color");
                break;
            case GREEN:
                System.out.println("Green color");
                break;
            case BLUE:
                System.out.println("Blue color");
                break;
        }

    }
}
