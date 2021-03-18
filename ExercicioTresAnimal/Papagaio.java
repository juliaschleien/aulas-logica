public class Papagaio extends Animal {
    
    private String corPena;
    
    public Papagaio() {
        super();
      }
    
    public String getCorPena() {
        return this.corPena;
     } 
    
    public void setCorPena(String corPena) {
        this.corPena = corPena;
     }
     
    public Papagaio(String corPena) {
        this.corPena = corPena;
     }
   
    @Override
    public String toString() {
           
        return "TO STRING PAPAGAIO"
             + "\nCor das Penas: " + this.getCorPena();
            
     }
}