package br.com.petrobras.concordion.exemplo.tres;

public enum Sexo {

    MASCULINO("M", "Masculino"), 
    FEMININO("F", "Feminino");
    
    private String id;
    private String descricao;
    
    //<editor-fold defaultstate="collapsed" desc="Construtor">
    Sexo(String id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Gets">
    public String getId() {
        return id;
    }
    
    public String getDescricao() {
        return descricao;
    }
    //</editor-fold>
    
    public static Sexo obterPorDescricao(String descricao) {
        for (Sexo s : values()) {
            if (s.getDescricao().equals(descricao)) {
                return s;
            }
        }
        return null;
    }
    
    public boolean isMasculino() {
        return equals(MASCULINO);
    }
    
    public boolean isFeminino() {
        return equals(FEMININO);
    }
}
