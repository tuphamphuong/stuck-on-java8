package java9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 2/13/20.
 */
public class TryWithResourcesImprovement {
    public static void main(String[] args) throws IOException {
        // Java SE 9 is going to provide some improvements to this statement to avoid some more verbosity and improve some Readability
        BufferedReader reader1 = new BufferedReader(new FileReader("hello.txt"));
        try (reader1) {
            System.out.println(reader1.readLine());
        }
    }
}
