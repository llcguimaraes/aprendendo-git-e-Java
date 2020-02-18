import bo.FilaBo;
import bo.ListaBo;
import util.ArrayPessoasUtil;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> vetor = ArrayPessoasUtil.pessoas;

        FilaBo.fila(vetor);
        ListaBo.lista(vetor);
    }
}


