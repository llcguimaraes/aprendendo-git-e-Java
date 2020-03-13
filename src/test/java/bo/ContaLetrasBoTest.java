package bo;

import org.junit.Test;
import org.hamcrest.collection.IsMapContaining;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContaLetrasBoTest {

    @Test
    public void contaletras() {

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('!', 1);
        map.put('r', 1);
        map.put('d', 1);
        map.put('e', 1);
        map.put('w', 1);
        map.put('h', 1);
        map.put('l', 3);
        map.put('o', 2);

        String frase = "Hello World!";
        Map<Character,Integer> mapresultado = ContaLetrasBo.contaletras(frase);

        assertThat(map, is(mapresultado));

    }
}