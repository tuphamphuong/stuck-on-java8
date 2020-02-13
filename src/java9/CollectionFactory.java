package java9;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 2/13/20.
 */
public class CollectionFactory {
    public static void main(String[] args) {
        // Besides being shorter and nicer to read, these methods also relieve you from having to pick a specific collection implementation
        Set<Integer> nonEmptyImmutableSet = Set.of(1, 2, 3);
        List<String> nonEmptyImmutableList = List.of("first", "second");

        List immutableList = List.of();
        Map emptyImmutableMap = Map.of();
    }
}
