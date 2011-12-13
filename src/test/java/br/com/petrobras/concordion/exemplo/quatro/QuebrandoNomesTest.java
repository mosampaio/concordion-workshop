package br.com.petrobras.concordion.exemplo.quatro;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class) 
public class QuebrandoNomesTest {
 
    public Cliente nomeTest(String nomeCompleto) {
        return new Cliente(nomeCompleto);
    }
}
