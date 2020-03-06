package bo;

public class ReservaPoltronaBo {
    private static boolean[][] matriz = new boolean[6][12];

    public static String reservapoltrona(int fila, int assento){
        String resultado = "";

        if (matriz[fila-1][assento-1]){
            resultado = "Esse assento já foi reservado";
        }
        else {
            matriz[fila-1][assento-1] = true;
            resultado = "Assento reservado com sucesso";
        }
        return resultado;
    }
}
