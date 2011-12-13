package br.com.mosampaio.concordion.exemplo.um;


import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;
import org.junit.Before;

@RunWith(ConcordionRunner.class) 
public class HelloWorldTest {

    private HelloWorld helloWorld;
    
    @Before
    public void setUp() {
        helloWorld = new HelloWorld();
    }
    
    public String messageTest() {
        return helloWorld.getMessage();
    }
}
