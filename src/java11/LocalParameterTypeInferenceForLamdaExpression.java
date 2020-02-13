package java11;

import java.util.function.Function;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 2/13/20.
 */
public class LocalParameterTypeInferenceForLamdaExpression {
    public static void main(String[] args) {
        // JDK 11 allows var keyword to be used when declaring the formal parameters of implicitly typed lambda expressions
        Function<String, String> append = (var string) -> string + " World";
        String appendedString = append.apply("Hello");
        System.out.println(appendedString);
    }
}
