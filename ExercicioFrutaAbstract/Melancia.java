public class Melancia extends Fruta {
    
    @Override
    public String comer() {
        return "Corte em quatro pedaços e coma ao redor da casca";
    }
    
     @Override
    public String retirarCasca() {
        return "Não tem necessidade de retirar a casca";
    }
    
     @Override
    public String toString() {
        return "\nModo de comer: " + this.comer()
             + "\nComo retirar a casca: " + this.retirarCasca();
    }

}