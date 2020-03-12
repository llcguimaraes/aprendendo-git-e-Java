package bo.reservaPoltrona;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReservaPoltronaBoTest {

    @Test
    public void ReservaPoltronaSeLivreRetornaSucesso() {
        assertEquals("Assento reservado com sucesso", ReservaPoltronaBo.reservapoltrona(1, 1));
    }
}