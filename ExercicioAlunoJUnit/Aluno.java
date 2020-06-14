/**
 * @author Julia Schleien
 * @version 1.0
 * @since 27/05/2020 - 13:25
 * @category Model
 */
public class Aluno {
    
    private String nome;
    private double nota1;
    private double nota2;
    private int totalDeAulas;
    private double numeroDePresencas;
    
    public Aluno() {
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getNota1() {
        return this.nota1;
    }
    
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    
    public double getNota2() {
        return this.nota2;
    }
    
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public int getTotalDeAulas() {
        return this.totalDeAulas;
    }
    
    public void setTotalDeAulas(int totalDeAulas) {
        this.totalDeAulas = totalDeAulas;
    }
    
    public double getNumeroDePresencas() {
        return this.numeroDePresencas;
    }
    
    public void setNumeroDePresencas(double numeroDePresencas) {
        this.numeroDePresencas = numeroDePresencas;
    }
    
    /**
     * @return Retorna a média aritmetica do aluno. nota1+nota2/2
     */
    public double calcularMediaAritmetica() {
        return (this.nota1 + this.nota2) / 2;
    }
    
    /**
     * @return Retorna a frequência do aluno em %
     */
    public double calcularFrequencia() {
        return (this.numeroDePresencas * 100) / this.totalDeAulas;
    }
    
    
   
    

}