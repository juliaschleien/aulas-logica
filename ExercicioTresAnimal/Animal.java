public class Animal {
    
    protected String cor;
    protected String especie;
    
    public Animal() {
      } 

    public Animal(String cor, String especie) {
        this.cor = cor;
        this.especie = especie;
      }
 
    public String getCor() {
          return this.cor;
     }

    public void setCor(String cor) {
         this.cor = cor;
     }
     
    public String getEspecie() {
          return this.especie;
     }

    public void setEspecie(String especie) {
         this.especie = especie;
     }
}
    
    