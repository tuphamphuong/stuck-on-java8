package java13;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 2/13/20.
 */
public class SwitchExpression {
    // It’s almost same in Java 13 except that the “break” has been replaced with “yield” to return a value from the case statement.
    @SuppressWarnings("preview")
    public static void main(String[] args) {
        int choice = 2;

        switch (choice) {
            case 1:
                System.out.println(choice);
                break;
            case 2:
                System.out.println(choice);
                break;
            case 3:
                System.out.println(choice);
                break;
            default:
                System.out.println("integer is greater than 3");
        }

        // from java 13 onwards - multi-label case statements
        switch (choice) {
            case 1, 2, 3:
                System.out.println(choice);
                break;
            default:
                System.out.println("integer is greater than 3");
        }

        // switch expressions, use yield to return, in Java 12 it was break
        int x = switch (choice) {
            case 1, 2, 3:
                yield choice;
            default:
                yield -1;
        };
        System.out.println("x = " + x);

    }

    enum Day {
        SUN, MON, TUE
    };

    @SuppressWarnings("preview")
    public String getDay(Day d) {
        String day = switch (d) {
            case SUN -> "Sunday";
            case MON -> "Monday";
            case TUE -> "Tuesday";
        };
        return day;
    }
}
