package bo;

import java.util.ArrayList;

public class ListaBo {
    public static String lista(ArrayList<String> vetor) {
        String retorno = "[";
        for (int i = vetor.size() - 1; i >= 0; i--) {
            retorno = retorno + vetor.get(i);
            if (i > 0){
                retorno = retorno + ", ";
            }
        }
        retorno = retorno + "]";
        return retorno;
    }

}
