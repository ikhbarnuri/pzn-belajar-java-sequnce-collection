package belajar.sequence.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.SequencedSet;
import java.util.TreeSet;

public class SetTest {

    @Test
    void set() {
        SequencedSet<String> set = new TreeSet<>();
        set.addFirst("ruli");
        set.add("eko");
        set.add("budi");
        set.add("joko");

        Assertions.assertEquals("budi", set.getFirst());
        Assertions.assertEquals("joko", set.getLast());

        SequencedSet<String> reversed = set.reversed();
        Assertions.assertEquals("joko", reversed.getFirst());
        Assertions.assertEquals("budi", reversed.getLast());

        String removed = set.removeFirst();
        Assertions.assertEquals("budi", removed);

        removed = set.removeFirst();
        Assertions.assertEquals("eko", removed);
    }
}
