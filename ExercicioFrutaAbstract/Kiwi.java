public class Kiwi extends Fruta {
    
    @Override
    public String comer() {
        return "Corte no meio e descasque";
    }
    
     @Override
    public String retirarCasca() {
        return "Com uma faca descasque a fruta";
    }
    
     @Override
    public String toString() {
        return "\nModo de comer: " + this.comer()
             + "\nComo retirar a casca: " + this.retirarCasca();
    }

}