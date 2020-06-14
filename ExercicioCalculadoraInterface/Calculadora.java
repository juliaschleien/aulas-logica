public class Calculadora implements calculadoraInterface {

    double numero1;
    double numero2;
    
    public Calculadora() {
    }
    
    public Calculadora (double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public double getNumero1() {
        return this.numero1;
    }
    
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }    
    
    public double getNumero2() {
        return this.numero2;
    }
    
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }    
    
    @Override 
    public double somarValores(){
        return this.numero1 + this.numero2;
    }
    
    @Override 
    public double diminuirValores(){
        return this.numero1 - this.numero2;
    }
    
    @Override 
    public double multiplicarValores(){
        return this.numero1 * this.numero2;
    }
    
    @Override 
    public double dividirValores(){
        return this.numero1 / this.numero2;
    }
    
    public double calcularRaizQuadradaDoNumeroUm(){
        return Math.sqrt(this.numero1);
    }
    
    public double calcularPotenciaDoNumeroUm(){
        return Math.pow(this.numero1, 2);
    }
    
    
    @Override
    public String toString() {
        return "Numero 1: " + this.numero1
             + "\nNumero 2: " + this.numero2
             + "\nValor da soma do número 1 pelo número 2: " + this.somarValores()
             + "\nValor da subtração do número 1 pelo número 2: " + this.diminuirValores()
             + "\nValor da multiplicaçãi do número 1 pelo número 2" + this.multiplicarValores()
             + "\nValor da divisão do número 1 pelo número 2" + this.dividirValores()
             + "\nValor da raiz quadrada do número 1:" + this.calcularRaizQuadradaDoNumeroUm()
             + "\nValor da potência número 1:" + this.calcularPotenciaDoNumeroUm();
    }
}