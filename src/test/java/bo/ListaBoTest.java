package bo;

import org.junit.Test;
import util.ArrayPessoasUtil;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ListaBoTest {

    @Test
    public void lista() {
        ArrayList<String> vetor = ArrayPessoasUtil.pessoas;
        assertEquals("[Lucas, Achacs, Ed, Frango, Joao, Leo, Adriano]", ListaBo.lista(vetor));
    }
}