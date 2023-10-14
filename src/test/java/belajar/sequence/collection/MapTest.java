package belajar.sequence.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.SequencedMap;
import java.util.TreeMap;

public class MapTest {

    @Test
    void map() {
        SequencedMap<String, String> map = new TreeMap<>();
        map.put("c", "eko");
        map.put("b", "kurniawan");
        map.put("a", "khannedy");

        Assertions.assertEquals("khannedy", map.firstEntry().getValue());
        Assertions.assertEquals("eko", map.lastEntry().getValue());

        SequencedMap<String, String> reversed = map.reversed();
        Assertions.assertEquals("eko", reversed.firstEntry().getValue());
        Assertions.assertEquals("khannedy", reversed.lastEntry().getValue());
    }

    @Test
    void linkedMap() {
        SequencedMap<String, String> map = new LinkedHashMap<>();
        map.putFirst("a", "eko");
        map.putFirst("b", "kurniawan");
        map.putFirst("c", "khannedy");

        Assertions.assertEquals("khannedy", map.firstEntry().getValue());
        Assertions.assertEquals("eko", map.lastEntry().getValue());
    }

}
