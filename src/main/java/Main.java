import bo.ContaLetrasBo;
import bo.FilaBo;
import bo.ListaBo;
import util.ArrayPessoasUtil;

import java.util.ArrayList;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        //ArrayList<String> vetor = ArrayPessoasUtil.pessoas;

        //FilaBo.fila(vetor);
        //ListaBo.lista(vetor);

        String frase = "Hello World!";
        Map<Character, Integer> map = ContaLetrasBo.contaletras(frase);
        System.out.println(map);
    }
}


