package br.com.mosampaio.concordion.exemplo.cinco;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class ProcessoSecurityTest {
    
    
    public String isPossivelExcluirProcessoTest(
            double teste,
            String perfil, 
            String chaveUsuarioLogado,
            String chaveUsuarioCadastradorDoProcesso,
            String statusDoProcesso
            ) {
        System.out.println(teste);
        Usuario usuarioLogado = new Usuario(chaveUsuarioLogado, perfil);
        Processo processo = new Processo("1232321", chaveUsuarioCadastradorDoProcesso, statusDoProcesso);
        ProcessoSecurity security = new ProcessoSecurity(processo, usuarioLogado);
        
        return parseBoolean(security.isPossivelExcluirProcesso());
    }
    
    private String parseBoolean(boolean value) {
        return value ? "SIM" : "NAO";
    }
}
