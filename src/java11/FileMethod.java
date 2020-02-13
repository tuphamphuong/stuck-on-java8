package java11;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 2/13/20.
 */
public class FileMethod {
    public static void main(String[] args) {
        // Path API, which solves the problem of switching between paths, URIs, URLs, and FILEs.
        // In Java 11 we can use Paths::get and Path::of methods to make them very uniform
        Path googlePath = Path.of(URI.create("www.google.com"));
        Path studentFilePath = Path.of("/home/Students/student.txt");
    }
}
