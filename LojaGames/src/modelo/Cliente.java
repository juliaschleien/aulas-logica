package modelo;

import java.util.Random;

public class Cliente {
    
    private String nome;
    private String cpf;
    private byte idade;
    private String telefone;
    private String email;
    private int genero;
    
    //construtor vazio 
    public Cliente(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }
    
               
// método 
    
   public String toString(){
       String texto;
       switch(genero){
           case 1: 
               texto = "Masculino";
               break;
           case 2: 
               texto = "Feminino";
               break;
           default:
               texto = "Outros";
        }
   
        return "\n\n\nCliente:"+ nome + 
                "\nCPF: " + cpf + 
                "\nTelefone: " + telefone +
                "\nEmail: " + email + 
                "\nIdade: " + idade+
                "\nGênero: "+ genero;
    
    
}
}
