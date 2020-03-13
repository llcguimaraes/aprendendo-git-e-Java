package bo;

import org.junit.Test;
import util.ArrayPessoasUtil;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FilaBoTest {

    @Test
    public void fila() {
        ArrayList<String> vetor = ArrayPessoasUtil.pessoas;
        assertEquals("[Adriano, Leo, Joao, Frango, Ed, Achacs, Lucas]", FilaBo.fila(vetor));
    }
}