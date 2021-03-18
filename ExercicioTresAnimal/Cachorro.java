public class Cachorro extends Animal {
    
    private String corPelo;
    
    public Cachorro() {
        super();
     }
     
    public String getCorPelo() {
        return this.corPelo;
     } 
    
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
     }
     
    public Cachorro (String corPelo) {
         this.corPelo = corPelo;
        }
        
    @Override
    public String toString() {
           
        return "TO STRING CACHORRO"
             + "\nCorPelo: " + this.getCorPelo();
     }
}
    
      
    
    