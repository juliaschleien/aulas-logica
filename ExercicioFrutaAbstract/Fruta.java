public abstract class Fruta {
    
    protected String cor;
    
    public Fruta() {
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public abstract String comer();
    public abstract String retirarCasca();

}