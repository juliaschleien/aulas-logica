package modelo;

public class Cliente {

    private String nome;
    private String telefone;
    private int sexo;
    private String endereco;
    private int porte;

    public Cliente() {//construtor vazio

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() { return telefone; }

    public void setTelefone(String telefone){ this.telefone = telefone; }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String getEnderecoo() {
        return endereco;
    }

    public void setEnderecoo(String endereco) {
        this.endereco = endereco;
    }

    public double getPorte() {
        return porte;
    }

    public void setPorte(int porte) {
        this.porte = porte;
    }

    public String toString() {
        String valorSexo;
        switch (sexo) {
            case 1:
                valorSexo = "Macho";
                break;
            case 2:
                valorSexo = "Fêmea";
                break;
        }

        String valorPorte;
        switch (porte) {
            case 1:
                valorPorte = "Pequeno";
                break;
            case 2:
                valorPorte = "Médio";
                break;
            default:
                valorPorte = "Grande";
        }

        return "\n\n\nCliente:" + nome
                + "\nSexo: " + sexo
                + "\nEndereço: " + endereco
                + "\nPorte: " + porte;

    }
}
