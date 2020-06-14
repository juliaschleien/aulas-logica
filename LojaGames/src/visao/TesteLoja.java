package visao;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

import modelo.Cliente;
import modelo.Jogos;
import service.ClienteService;
import service.JogosService;

public class TesteLoja {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        ClienteService clienteService = new ClienteService();
        JogosService jogosService = new JogosService();

        int opcao;
        do {
            System.out.println("1 - CADASTRAR");
            System.out.println("2 - CONSULTAR CLIENTES CADASTRADOS");
            System.out.println("3 - VER QUANTIDADE DE CLIENTES");
            System.out.println("4 - REMOVER CLIENTES");
            System.out.println("5 - PESQUISAR CLIENTES POR GÊNERO");
            System.out.println("6 - APAGAR REGISTROS");
            System.out.println("7 - JOGOS");
            System.out.println("8 - SAIR ");
            System.out.println("Escolha sua opção: ");

            opcao = ler.nextInt();

            switch (opcao) {
                case 1:

                    Cliente cliente = new Cliente();
                    System.out.println("Cadastro de Clientes");
                    System.out.println("Digite o nome: ");
                    ler.nextLine();
                    cliente.setNome(ler.nextLine());

                    do {//validação cpf 
                        System.out.println("Digite o CPF: ");
                        cliente.setCpf(ler.nextLine());
//                        if (cliente.getCpf().length() != 11) {
//                            System.out.println("Cpf inválido!");
//                        }
                    } while (cliente.getCpf().length() != 11);

                    do {//validação e-mail
                        System.out.println("Digite o E-mail: ");
                        cliente.setEmail(ler.nextLine());
                        if (cliente.getEmail().indexOf("@") < 0) {
                            System.out.println("Email Inválido!");
                        }
                    } while (cliente.getEmail().indexOf("@") < 0);

                    do {//validação telefone
                        System.out.println("Digite o telefone: ");
                        cliente.setTelefone(ler.nextLine());
//                        if (cliente.getTelefone().length() != 11) {
//                            System.out.println("Telefone inválido!");
//                        }
                    } while (cliente.getTelefone().length() != 11);

                    do {//validação idade
                        System.out.println("Digite a idade: ");
                        cliente.setIdade(ler.nextByte());
                        if (cliente.getIdade() < 0) {
                            System.out.println("Idade Inválida!");
                        }

                    } while (cliente.getIdade() < 0);

                    do {
                        System.out.println("\nDigite o gênero:\n");
                        System.out.println(" 1 - Masculino.");
                        System.out.println(" 2 - Feminino.");
                        cliente.setGenero(ler.nextInt());
                        if (cliente.getGenero() < 1 || cliente.getGenero() > 2) {
                            System.out.println("\nGênero Inválido.");
                        }
                        clienteService.adicionarCliente(cliente);
                        System.out.println("Cliente Adicionado com sucesso!");
                        break;
                    } while (cliente.getGenero() < 1 || cliente.getGenero() > 2);

                case 2:
                    if (clienteService.getListaCliente().isEmpty()) {
                        System.out.println("\nNão há Clientes Cadastrados!");
                    } else {
                        System.out.println("\nMostrando cadastro de Cliente....");
                        System.out.println("\n" + clienteService);
                    }
                    break;

                case 3:
                    if (clienteService.getListaCliente().isEmpty()) {
                        System.out.println("\nNão há Clientes Cadastrados!");
                    } else {
                        System.out.println("\nQuantidade de Clientes Cadastrados: " + clienteService.obterQntDeClientes());
                    }
                    break;

                case 4:
                    if (clienteService.getListaCliente().isEmpty()) {
                        System.out.println("\nNão há Clientes Cadastrados!");
                    } else {

                        clienteService.verificarRegistros();
                        System.out.print("\nDigite o índice que deseja remover: ");
                        int indice = ler.nextInt();
                        clienteService.removerCliente(indice);
                        System.out.println("\nCLiente removido com sucesso.");
                    }
                    break;

                case 5:
                    System.out.println("Pesquisando os Clientes por Gênero");
                    System.out.println("Digite a opção do Gênero: ");
                    System.out.println(" 1 - Masculino ");
                    System.out.println(" 2 - Feminino ");
                    System.out.println(" 3 - Outros ");
                    byte genero = ler.nextByte();
                    ArrayList<Cliente> busca = clienteService.pesquisarClientePorGenero(genero);
                    if (busca.isEmpty()) {
                        System.out.println("Gênero Inesistente.");
                    } else {
                        System.out.println(busca);
                    }

                    break;

                case 6:
                    if (clienteService.getListaCliente().isEmpty()) {
                        System.out.println("\nNão há Clientes Cadastrados!");
                    } else {
                        int confirma;
                        System.out.println("\nDigite sua opção: \n1 - Sim. \n2 - Não.");
                        confirma = ler.nextInt();
                        if (confirma == 1) {
                            clienteService.excluirRegistros();
                            System.out.println("\nRegistros Excluídos!");
                        } else {
                            System.out.println("\nOpção Cancelada.");
                        }
                    }
                    break;

                case 7:
                    System.out.println("1 - VISUALIZAR JOGOS");
                    System.out.println("2 - BUSCAR JOGOS POR GÊNERO");
                    System.out.println("3 - V0LTAR AO MENU PRINCIPAL");
                    int opcaoJogos = ler.nextInt();

                    //enquanto for false continua executando do while para selecionar opção de jogos
                    Boolean finalizarPesquisaGenero = false;

                    do {
                        switch (opcaoJogos) {
                            case 1:

                                ArrayList<Jogos> jogosCadastrados = jogosService.listaJogos();

                                for (int i = 0; i < jogosCadastrados.size(); i++) {
                                    System.out.println(
                                            "------------------------------\n"
                                                    + " nome: " + jogosCadastrados.get(i).getNome() + "\n"
                                                    + " preço: " + jogosCadastrados.get(i).getPreco()
                                                    + "\n------------------------------");
                                }
                                ;

                                finalizarPesquisaGenero = true;

                                break;

                            case 2:

                                System.out.println("Pesquisando os Jogos por Gênero");
                                System.out.println("Digite o gênero do jogo: ");

                                String genero2 = ler.nextLine();

                                ArrayList<Jogos> buscarJogos = jogosService.pesquisarJogosPorGenero(genero2, jogosService.listaJogos());

                                for (int i = 0; i < buscarJogos.size(); i++) {
                                    System.out.println(
                                            "------------------------------\n"
                                                    + " nome: " + buscarJogos.get(i).getNome() + "\n"
                                                    + " preço: " + buscarJogos.get(i).getPreco()
                                                    + "\n------------------------------");
                                    finalizarPesquisaGenero = true;
                                }
                                break;
                        }
                    } while (!finalizarPesquisaGenero);

                    break; // break case 7


                case 8:
                    System.out.println("Sistema Encerrado");
                    break;

            }//fecha switch
        } while (opcao < 8);
    }//fecha linha principal
}//fim

