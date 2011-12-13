package br.com.mosampaio.concordion.exemplo.cinco;

public class Processo {

    private String numero;
    private Usuario cadastrador;
    private Status status;
    
    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Processo () {}
    public Processo (String numero, String chaveUsuario, String status) {
        this.numero = numero;
        this.cadastrador = new Usuario(chaveUsuario);
        this.status = Status.valueOf(status);
    }
    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="gets e sets">
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public Usuario getCadastrador() {
        return cadastrador;
    }
    
    public void setCadastrador(Usuario cadastrador) {
        this.cadastrador = cadastrador;
    }
    
    public Status getStatus() {
        return status;
    }
    
    public void setStatus(Status status) {
        this.status = status;
    }
    //</editor-fold>
    
    public enum Status {
        CRIADO, EM_ANDAMENTO, FINALIZADO;
        
        //<editor-fold defaultstate="collapsed" desc="gets">
        public boolean isCriado() {
            return equals(CRIADO);
        }
        
        public boolean isFinalizado() {
            return equals(FINALIZADO);
        }
        //</editor-fold>
    }
}

