package bo.reservaPoltrona;

public class ReservaPoltronaValidaReservaBo {
    public static boolean validaFila(int fila){
        return fila > 6 || fila < 1;
    }
    public static boolean validaAssento(int assento){
        return assento > 12 || assento < 1;
    }
}
