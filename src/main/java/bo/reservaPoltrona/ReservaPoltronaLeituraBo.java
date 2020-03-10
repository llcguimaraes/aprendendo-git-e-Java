package bo.reservaPoltrona;

import java.util.Scanner;

public class ReservaPoltronaLeituraBo {
    public static void executa(){
        char variavelmenu = 's';
        while (variavelmenu != 'n'){
            int fila = leFila();
            int assento = leAssento();

            String resultado = ReservaPoltronaBo.reservapoltrona(fila, assento);
            System.out.println(resultado);

            System.out.println("Deseja reservar outra poltrona? [s/n]");
            Scanner scannermenu = new Scanner(System.in);
            variavelmenu = scannermenu.next().charAt(0);

        }

    }
    private static int leFila(){
        int fila = 0;
        while (!ReservaPoltronaValidaReservaBo.validaFila(fila)) {
            System.out.println("Qual fila deseja?");
            Scanner scannerfila = new Scanner(System.in);
            fila = scannerfila.nextInt();
            if (!ReservaPoltronaValidaReservaBo.validaFila(fila))
                System.out.println("Existem apenas 6 filas, escolha novamente.");
        }
        return fila;
    }
    private static int leAssento(){
        int assento = 0;
        while (!ReservaPoltronaValidaReservaBo.validaAssento(assento)) {
            System.out.println("Qual assento deseja?");
            Scanner scannerassento = new Scanner(System.in);
            assento = scannerassento.nextInt();
            if (!ReservaPoltronaValidaReservaBo.validaAssento(assento))
                System.out.println("Existem apenas 12 assentos por fila, escolha novamente.");
        }
        return assento;
    }
}
