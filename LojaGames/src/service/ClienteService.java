package service;

import java.util.ArrayList;
import modelo.Cliente;

public class ClienteService {
    
    private ArrayList<Cliente> listaCliente;
    
    public ClienteService(){// construtor vazio
        this.listaCliente = new ArrayList<>();
    }

    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }
    
    // metodo para adicionar um cliente 
    public void adicionarCliente(Cliente cliente){
        this.listaCliente.add(cliente);
           
    }
    
    // exclusão de dados
    public void excluirRegistros(){
        this.listaCliente.clear();
    }
    
    //verificação de registros cadastrados
    public void verificarRegistros(){
        if(listaCliente.isEmpty()){
            System.out.println("Não há clientes cadastrados..");
        }else{
            for(int i=0; i<listaCliente.size(); i++){
                System.out.println("Cliente:  "+i+" =>"+
                        listaCliente.get(i).getNome());
            }
        }
    }
    //retorna a quantidade de clientes
    public int obterQntDeClientes(){
        return this.listaCliente.size();
    }
    //removendo um cliente por vez do sistema
    public void removerCliente(int indice){
        this.listaCliente.remove(indice);
    }
    
    //pesquisa abrangente
    public ArrayList<Cliente> pesquisarClientePorGenero(int novoGenero) {
        ArrayList<Cliente> listaGenero = new ArrayList<>();
        for (int i = 0; i < this.listaCliente.size(); i++) {
            if (this.listaCliente.get(i).getGenero() == novoGenero) {
                listaGenero.add(this.listaCliente.get(i));
            }
       
 } 
        return listaGenero;
    } 
    // mostrar os registros 
    public String toString(){
        return " "+this.listaCliente;
    }
    
}
