package br.com.mosampaio.concordion.exemplo.tres;

public class BemVindo {
    
    public String getMessage(Usuario usuario) {
        String retorno = null;
        switch (usuario.getSexo()) {
            case MASCULINO: 
                retorno= String.format("%s, seja bem-vindo!", usuario.getNome());
                break;
            case FEMININO: 
                retorno= String.format("%s, seja bem-vinda!", usuario.getNome());
                break;
            default: 
                retorno= String.format("%s, seja bem-vindo(a)!", usuario.getNome());
                break;
        }
        return retorno;
    }
}
