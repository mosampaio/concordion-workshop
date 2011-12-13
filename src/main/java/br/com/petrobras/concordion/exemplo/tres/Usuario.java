package br.com.petrobras.concordion.exemplo.tres;

public class Usuario {

    private Long id;
    private String nome;
    private Sexo sexo;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Usuario(Long id, String nome, Sexo sexo) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
    }
    
    public Usuario(String nome, Sexo sexo) {
        this(null, nome, sexo);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Gets e Sets">
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * @return the sexo
     */
    public Sexo getSexo() {
        return sexo;
    }
    
    /**
     * @param sexo the sexo to set
     */
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    
    //</editor-fold>
    
    
    
}
