package service;

import java.util.ArrayList;
import modelo.Cliente;

public class ClienteService {

    private ArrayList<Cliente> listaDeClientes;

    public ClienteService() {//construtor vazio
        this.listaDeClientes = new ArrayList<>();
    }

    public ArrayList<Cliente> getListaDeClientes() {
        return listaDeClientes;
    }

    public void setListaDeClientes(ArrayList<Cliente> listaDeClientes) {
        this.listaDeClientes = listaDeClientes;
    }

    //metodo para adc cliente
    public void adicionarCliente(Cliente cliente) {
        this.listaDeClientes.add(cliente);
    }

    //metodo para excluir registros
    public void excluirRegistros() {
        this.listaDeClientes.clear();
    }

    //metodo para verificar registros cadastrados
    public void verificarRegistros() {
        if (listaDeClientes.isEmpty()) {
            System.out.println("Não há clientes cadastrados");
        } else {
            for (int i = 0; i < listaDeClientes.size(); i++) {
                System.out.println("Cliente: " + i + "=>"
                        + listaDeClientes.get(i).getNome());
            }
        }
    }

    //metodo para retornar quantidade de clientes
    public int obterQtdDeClientes() {
        return this.listaDeClientes.size();
    }

    //metodo para remover um cliente por vez do sistema
    public void removerCliente(int indice) {
        this.listaDeClientes.remove(indice);
    }

    //metodo para pesquisar cliente por sexo
    public ArrayList<Cliente> pesquisarClientePorSexo(int novoSexo) {
        ArrayList<Cliente> listaSexo = new ArrayList<>();
        for (int i = 0; i < this.listaDeClientes.size(); i++) {
            if (this.listaDeClientes.get(i).getSexo() == novoSexo) {
                listaSexo.add(this.listaDeClientes.get(i));
            }
        }

        return listaSexo;
    }

    //metodo para pesquisar cliente por porte
    public ArrayList<Cliente> pesquisarClientePorPorte(int novoPorte) {
        ArrayList<Cliente> listaPorte = new ArrayList<>();
        for (int i = 0; i < this.listaDeClientes.size(); i++) {
            if (this.listaDeClientes.get(i).getPorte() == novoPorte) {
                listaPorte.add(this.listaDeClientes.get(i));
            }
        }

        return listaPorte;
    }

//metodo para mostrar registros
    public String toString() {
        return " " + this.listaDeClientes;
    }
}
