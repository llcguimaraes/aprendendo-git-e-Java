import bo.ContaLetrasBo;
import bo.FilaBo;
import bo.ListaBo;
import bo.ReservaPoltronaBo;
import sun.font.TrueTypeFont;
import util.ArrayPessoasUtil;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static int matrizcontrole[][] = new int[12][6];

    public static void main(String[] args) {
        /*
        ArrayList<String> vetor = ArrayPessoasUtil.pessoas;

        FilaBo.fila(vetor);
        ListaBo.lista(vetor);

        String frase = "Hello World!";
        Map<Character, Integer> map = ContaLetrasBo.contaletras(frase);
        System.out.println(map);
        */
        for (int i=0; i<12; i++){
            for (int j=0; j<6; j++){
                matrizcontrole[i][j] = 0;
            }
        }

        while (true){
            int fila;
            int assento;

            while (true){
                System.out.println("Qual fila deseja?");
                Scanner scannerfila = new Scanner(System.in);
                fila = scannerfila.nextInt();
                if (fila > 6){
                    System.out.println("Existem apenas 6 filas, escolha novamente.");
                }
                else{
                    break;
                }
            }

            while (true){
                System.out.println("Qual assento deseja?");
                Scanner scannerassento = new Scanner(System.in);
                assento = scannerassento.nextInt();
                if (assento > 12 ){
                    System.out.println("Existem apenas 12 assentos por fila, escolha novamente.");
                }
                else{
                    break;
                }
            }

            String resultado = ReservaPoltronaBo.reservapoltrona(fila, assento);
            System.out.println(resultado);

            System.out.println("Deseja reservar outra poltrona? [s/n]");
            Scanner scannermenu = new Scanner(System.in);
            char variavelmenu = scannermenu.next().charAt(0);

            if (variavelmenu == 'n'){
                break;
            }
        }



    }
}


