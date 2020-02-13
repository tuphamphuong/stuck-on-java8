package java10;

import java.util.HashMap;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 2/13/20.
 */
public class LocalVariableTypeInference {
    public static void main(String[] args) {
        // At compile time, it figures out the reference type based on the value type
        HashMap<String, String> ughThisIsSoVerbose = new HashMap<>();
        System.out.println(ughThisIsSoVerbose.getClass().getName());

        var succinct = new HashMap<String, String>();
        System.out.println(succinct.getClass().getName());

        // Humans benefit from the redundancy of the type declaration in two ways.
        // First, the redundant type serves as valuable documentation — readers do not have to search for the declaration of getMap() to find out what type it returns.
        // Second, the redundancy allows the programmer to declare the intended type and, thereby, benefit from a cross-check performed by the compiler.
    }
}
