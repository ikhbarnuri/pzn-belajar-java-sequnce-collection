package belajar.sequence.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.SequencedCollection;

public class CollectionTest {

    @Test
    void collection() {
        SequencedCollection<String> list = new ArrayList<>();
        list.addLast("khannedy");
        list.addFirst("kurniawan");
        list.addFirst("eko");

        Assertions.assertEquals(List.of("eko", "kurniawan", "khannedy"), list);

        Assertions.assertEquals("eko", list.getFirst());
        Assertions.assertEquals("khannedy", list.getLast());

        SequencedCollection<String> reversed = list.reversed();
        Assertions.assertEquals(List.of("khannedy", "kurniawan", "eko"), reversed);

        String removed = list.removeFirst();
        Assertions.assertEquals("eko", removed);
        Assertions.assertEquals("kurniawan", list.getFirst());

        String removeLast = list.removeLast();
        Assertions.assertEquals("khannedy", removeLast);
        Assertions.assertEquals("kurniawan", list.getLast());
    }
}
