public class Banana extends Fruta {
    
    @Override
    public String comer() {
        return "Descasque e coma";
    }
    
     @Override
    public String retirarCasca() {
        return "Pegue na ponta de cima e puxe para baixo";
    }
    
     @Override
    public String toString() {
        return "\nModo de comer: " + this.comer()
             + "\nComo retirar a casca: " + this.retirarCasca();
    }

}