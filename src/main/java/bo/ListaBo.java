package bo;

import java.util.ArrayList;

public class ListaBo {
    public static void lista(ArrayList<String> vetor) {
        for (int i = vetor.size() - 1; i > 0; i--) {
            System.out.println(vetor.get(i));
        }
    }

}
