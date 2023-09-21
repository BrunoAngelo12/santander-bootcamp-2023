package cliente;

public enum LanchesEnum {
    X_BURGUER("X BURGUER", "PÃO", "HAMBURGUER", "QUEIJO"),
    X_SALADA("X SALADA", "PÃO", "HAMBURGUER", "ALFACE");

    private String nomeLanche;
    private String pao;
    private String carne;
    private String acompanhamento;
    
    private LanchesEnum(String nomeLanche, String pao, String carne, String acompanhamento) {
        this.nomeLanche = nomeLanche;
        this.pao = pao;
        this.carne = carne;
        this.acompanhamento = acompanhamento;
    }

    private LanchesEnum(){
    }

    public void mostrarAcompanhamentos(){
        System.out.println(pao + ", " + carne + ", " + acompanhamento);
    }

    public void mostrarNomeLanche(){
        System.out.println(nomeLanche);
    }

    public String getNomeLanche(){
        return nomeLanche;
    }

    

}
