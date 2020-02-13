package java10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 2/13/20.
 */
public class UnmodifiableCollectionEnhancement {
    public static void main(String[] args) {
        // Collections.unmodifiableList() (and other similar methods) returns a unmodifiable view of the source collection, so changes made to the source collection reflects in it.
        // Whereas, in case of List.copyOf() method, if the source collection is subsequently modified, the returned List will not reflect such modifications.
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        List<Number> unmodifiableList = Collections.unmodifiableList(list);
        List<Integer> copyOfList = List.copyOf(list);
        //modifying the source list
        list.add(3);
        System.out.println("unmodifiableList: " + unmodifiableList);
        System.out.println("copyOfList: " + copyOfList);
    }
}
