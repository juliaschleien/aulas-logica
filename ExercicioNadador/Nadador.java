/**
 * @author Julia Schleien e Eduardo Rambo
 * @version 1.0
 * @since 01/06/2020 - 08:06
 */
public class Nadador {
    
    private String nome;
    private int idade;
    
    public Nadador() {
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public void setIdade(int idade) {
        this.idade = (idade > 0) ? idade : 0;
    }
    
    /**
     * @return método que verifica a categoria com a estrutura condicional if
     */
    public String verificarCategoria() {
        if(idade >0 && idade <8) {
            return "Não pode ser nadador. Minímo 8 anos";
        } else if(this.idade >=8 && idade <=10) {
            return "Infantil";
        } else if(this.idade >=10 && idade <=17) {
            return "Juvenil";
        } else if(this.idade >= 18) {
            return "Adulto";
        } else {
            return "Categoria Inexistente";
        }
    }
    
    /**
     * @return método que verifica o nome utilizando a estrutura condicional boolean
     */
    public boolean verificarNome() {
        if(this.nome.length() > 1) {
            return true;
        } else {
            return false;        
        }
    }  
    
    @Override
    public String toString() {
        return "Nome: " + this.nome
             + "\nIdade: " + this.idade
             + "\nVerificação do nome: " + this.verificarNome()
             + "\nSua categoria: " + this.verificarCategoria();
    }
}
    
   