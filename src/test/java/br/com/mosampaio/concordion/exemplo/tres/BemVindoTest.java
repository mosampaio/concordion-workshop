package br.com.mosampaio.concordion.exemplo.tres;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.Before;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class) 
public class BemVindoTest {
    
    private BemVindo bemVindo;
    
    @Before
    public void setUp() {
        bemVindo = new BemVindo();
    }
    
    
    public String bemVindoTest(String nome, String sexo){
        return bemVindo.getMessage(new Usuario(nome, Sexo.valueOf(sexo)));
    }
        
}
