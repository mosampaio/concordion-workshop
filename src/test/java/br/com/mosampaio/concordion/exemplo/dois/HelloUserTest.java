package br.com.mosampaio.concordion.exemplo.dois;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.Before;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class) 
public class HelloUserTest {
    
    private HelloUser helloUser;
    
    @Before
    public void setUp() {
        this.helloUser = new HelloUser();
    }
    
    public String helloTest(String nome) {
        return helloUser.hello(nome);
    }
    
    
}
