package br.com.mosampaio.concordion.exemplo.quatro;

public class Cliente {
    private String nomeCompleto;
    
    public Cliente(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNome() {
        int index = nomeCompleto.indexOf(" ");
        return nomeCompleto.substring(0, index);
    }
    
    public String getUltimoSobreNome() {
        int index = nomeCompleto.lastIndexOf(" ");
        return nomeCompleto.substring(index, nomeCompleto.length());
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

}
