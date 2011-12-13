package br.com.petrobras.concordion.exemplo.cinco;

public class ProcessoSecurity {

    private Processo processo;
    private Usuario usuarioLogado;
    
    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public ProcessoSecurity(Processo processo, Usuario usuarioLogado) {
        this.processo = processo;
        this.usuarioLogado = usuarioLogado;
    }
    //</editor-fold>

    public boolean isPossivelExcluirProcesso() {
//        if (usuarioLogado.getPerfil().isAdministrador() && !processo.getStatus().isFinalizado()){
//            return true;
//        } else if (usuarioLogado.getPerfil().isCadastrador() && processo.getStatus().isCriado()) {
//            return true;
//        }
        return false;
    }
    
    public boolean isPossivelAlterarProcesso() {
        return true;
    }
    
    public boolean isPossivelCriarProcesso() {
        return true;
    }
}
