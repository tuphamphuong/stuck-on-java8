package java9;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 2/13/20.
 */
public class StreamAPIImproment {
    public static void main(String[] args) {
        // The iterate method gets a new overload, allowing you to provide a Predicate on when to stop iterating
        IntStream.iterate(1, i -> i < 100, i -> i + 1).forEach(System.out::println);

        // It's now possible to turn an Optional object into a (possibly empty) Stream with the new `stream` method on Optional
        Stream<Integer> s = Optional.of(1).stream();
    }
}
