package java12;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 2/13/20.
 */
public class SwitchExpression {
    public static void main(String[] args) {
        // Java 12 has enhanced Switch expressions for Pattern matching.
        //Introduced in JEP 325, as a preview language feature, the new Syntax is L ->.
        //Following are some things to note about Switch Expressions:
        //The new Syntax removes the need for break statement to prevent fallthroughs.
        //Switch Expressions don’t fall through anymore.
        //Furthermore, we can define multiple constants in the same label.
        //default case is now compulsory in Switch Expressions.
        //break is used in Switch Expressions to return values from a case itself.
        String day = args[0];
        String result = switch (day) {
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "S" -> "TTS";
//            default -> {
//                if(day.isEmpty())
//                    break "Please insert a valid day.";
//                else
//                break "Looks like a Sunday.";
//            }
            default -> throw new IllegalStateException("Unexpected value: " + day);
        };

        System.out.println(result);
    }
}
