package bo;

import java.util.HashMap;
import java.util.Map;

public class ContaLetrasBo {
    public static Map<Character, Integer> contaletras(String frase){
        frase = frase.toLowerCase().replaceAll(" ", "");
        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for (int i=0; i<frase.length(); i++){
            if (map.get(frase.charAt(i)) == null){
                map.put(frase.charAt(i), 1);
            }
            else{
                map.put(frase.charAt(i), map.get(frase.charAt(i)) + 1);
            }
        }

        return map;
    }
}
