import bo.ContaLetrasBo;
import bo.FilaBo;
import bo.ListaBo;
import util.ArrayPessoasUtil;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static int matrizcontrole[][] = new int[12][6];

    public static void main(String[] args) {
        //ArrayList<String> vetor = ArrayPessoasUtil.pessoas;

        //FilaBo.fila(vetor);
        //ListaBo.lista(vetor);

       // String frase = "Hello World!";
        //Map<Character, Integer> map = ContaLetrasBo.contaletras(frase);
        //System.out.println(map);

        for (int i=0; i<12; i++){
            for (int j=0; j<6; j++){
                matrizcontrole[i][j] = 0;
            }
        }

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();


    }
}


