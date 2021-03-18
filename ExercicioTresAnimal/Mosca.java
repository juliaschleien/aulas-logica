public class Mosca extends Animal {
    
    private int quantidadePatas;
    
    public Mosca() {
        super();
      }
    
    public int getQuantidadePatas() {
        return this.quantidadePatas;
     } 
    
    public void setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
     }
     
    public Mosca(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
     }
   
    @Override
    public String toString() {
           
        return "TO STRING MOSCA"
             + "\nQuantidade De Patas: " + this.getQuantidadePatas();
            
     }
}