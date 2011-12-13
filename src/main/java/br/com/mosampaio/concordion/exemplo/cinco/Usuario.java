package br.com.mosampaio.concordion.exemplo.cinco;

public class Usuario {
    private String chave;
    private Perfil perfil; //perfil logado
    
    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Usuario() { }
    public Usuario(String chave) { this.chave = chave; }
    public Usuario(String chave, String perfil) {
        this.chave = chave;
        this.perfil = Perfil.valueOf(perfil);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="gets e sets">
    public Perfil getPerfil() {
        return perfil;
    }
    
    public void setChave(String chave) {
        this.chave = chave;
    }
    
    public String getChave() {
        return chave;
    }
    
    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
    //</editor-fold>
      
    public enum Perfil {
        ADMINISTRADOR, CADASTRADOR, CLIENTE;
        
        //<editor-fold defaultstate="collapsed" desc="gets">
        public boolean isAdministrador() {
            return equals(ADMINISTRADOR);
        }
        
        public boolean isCadastrador() {
            return equals(CADASTRADOR);
        }
        //</editor-fold>
    }   
}
