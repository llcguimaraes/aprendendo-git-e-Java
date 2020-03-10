package bo.reservaPoltrona;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReservaPoltronaValidaReservaBoTest {

    @Test
    public void validaFilaValorMenorQueUmDeveRetornarFalso() {
        assertEquals(false, ReservaPoltronaValidaReservaBo.validaFila(0));
    }

    @Test
    public void validaFilaValorMaiorQueSeisDeveRetornarFalso() {
        assertEquals(false, ReservaPoltronaValidaReservaBo.validaFila(7));
    }

    @Test
    public void validaFilaValorEntreUmESeisDeveRetornarVerdadeiro() {
        assertEquals(true, ReservaPoltronaValidaReservaBo.validaFila(1));
    }

    @Test
    public void validaAssentoValorMenorQueUmDeveRetornarFalso() {
        assertEquals(false, ReservaPoltronaValidaReservaBo.validaAssento(0));
    }
}