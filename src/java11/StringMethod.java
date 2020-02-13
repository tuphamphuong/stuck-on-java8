package java11;

import java.util.stream.Collectors;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 2/13/20.
 */
public class StringMethod {
    public static void main(String[] args) {
        // This instance method returns a boolean value. Empty Strings and Strings with only white spaces are treated as blank
        System.out.println(" ".isBlank()); //true
        String s = "Anupam";
        System.out.println(s.isBlank()); //false
        String s1 = "";
        System.out.println(s1.isBlank()); //true

        // This method returns a stream of strings, which is a collection of all substrings split by lines
        String str = "JD\nJD\nJD";
        System.out.println(str);
        System.out.println(str.lines().collect(Collectors.toList()));

        // The repeat method simply repeats the string that many numbers of times as mentioned in the method in the form of an int
        String str1 = "=".repeat(2);
        System.out.println(str1); //prints ==

        // It is helpful to remove the white space from the beginning and the end of a string
        var s4 = " Michale ";
        String stripResult = s4.strip();
        System.out.println(stripResult);

        // The stripLeading() method is used to remove the white space from the beginning of a string
        var s5 = " Michale ";
        String stripLeadingResult = s5.stripLeading();
        System.out.println(stripLeadingResult);

        var s6 = " Michale ";
        String stripTrailingResult = s6.stripTrailing();
        System.out.println(stripTrailingResult);

    }
}
