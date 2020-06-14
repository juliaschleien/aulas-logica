package visao;

import modelo.Cliente;
import modelo.Servicos;
import service.ClienteService;
import service.ServicoService;

import java.util.ArrayList;
import java.util.Scanner;

public class TestePetShop {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        ClienteService clienteService = new ClienteService();
        ServicoService servicoService = new ServicoService();

        int opcao;
        do {
            System.out.println(" _________________________________");
            System.out.println("|1-CADASTRAR                      |");
            System.out.println("|2-CONSULTAR CLIENTES CADASTRADOS |");
            System.out.println("|3-VER QUANTIDADE DE CLIENTES     |");
            System.out.println("|4-REMOVER CLIENTES               |");
            System.out.println("|5-PESQUISAR CLIENTE POR SEXO     |");
            System.out.println("|6-PESQUISAR CLIENTE POR PORTE    |");
            System.out.println("|7-APAGAR REGISTROS               |");
            System.out.println("|8-SERVIÇOS                       |");
            System.out.println("|9-SAIR                           |");
            System.out.println("|ESCOLHA SUA OPÇÃO                |");
            System.out.println(" _________________________________");

            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    Cliente cliente = new Cliente();
                    System.out.println("Cadastro de clientes");
                    System.out.println("Digite o nome do seu pet:");
                    ler.nextLine();
                    cliente.setNome(ler.nextLine());

                    do { //validação do telefone
                        System.out.println("Digite o seu telefone:");
                        cliente.setTelefone(ler.nextLine());
                        if (cliente.getTelefone().length() != 11) {
                            System.out.println("Telefone inválido.");

                        }
                    } while (cliente.getTelefone().length() != 11);


                    System.out.println("Digite seu endereço:");
                    cliente.setEnderecoo(ler.nextLine());

                    do {
                        System.out.println("\nDigite o sexo do seu pet:\n");
                        System.out.println("1-Fêmea");
                        System.out.println("2-Macho");
                        cliente.setSexo(ler.nextInt());
                        if (cliente.getSexo() < 1 || cliente.getSexo() > 2) {
                            System.out.println("Sexo inválido.");

                        }
                    } while (cliente.getSexo() < 1 || cliente.getSexo() > 2);

                    do {
                        System.out.println("Digite o porte do seu pet:");
                        System.out.println("1-Pequeno");
                        System.out.println("2-Médio");
                        System.out.println("3-Grande");
                        cliente.setPorte(ler.nextInt());
                        if (cliente.getPorte() < 1 || cliente.getPorte() > 3) {
                            System.out.println("Porte inválido.");
                        }

                    } while (cliente.getPorte() < 1 || cliente.getPorte() > 3);

                    clienteService.adicionarCliente(cliente);
                    System.out.println("Cliente cadastrado!");

                    break;

                case 2:
                    if (clienteService.getListaDeClientes().isEmpty()) {
                        System.out.println("Não há clientes cadastrados.");
                    } else {
                        System.out.println("Mostrando clientes cadastrados." + clienteService);
                    }
                    break;

                case 3:
                    if (clienteService.getListaDeClientes().isEmpty()) {
                        System.out.println("Não há clientes cadastrados.");
                    } else {
                        System.out.println("Mostrando quantidade de clientes cadastrados." + clienteService.obterQtdDeClientes());
                    }
                    break;

                case 4:
                    if (clienteService.getListaDeClientes().isEmpty()) {
                        System.out.println("Não há clientes cadastrados.");
                    } else {
                        clienteService.verificarRegistros();
                        System.out.println("Digite o indice do cliente que deseja remover");
                        int indice = ler.nextInt();
                        clienteService.removerCliente(indice);
                        System.out.println("Cliente removido.");
                    }
                    break;

                case 5:
                    System.out.println("Pesquisando clientes por sexo.");
                    System.out.println("Digite a opção correspondente ao sexo do seu pet.");
                    System.out.println("1-Fêmea");
                    System.out.println("2-Macho");
                    byte sexo = ler.nextByte();
                    ArrayList<Cliente> buscar = clienteService.pesquisarClientePorSexo(sexo);
                    if (buscar.isEmpty()) {
                        System.out.println("Não há cadastro de clientes com este sexo.");
                    } else {
                        System.out.println(buscar);
                    }
                    break;

                case 6:
                    System.out.println("Pesquisando clientes por porte.");
                    System.out.println("Digite a opção correspondente ao porte do seu pet.");
                    System.out.println("1-Pequeno");
                    System.out.println("2-Médio");
                    System.out.println("3-Grande");
                    byte porte = ler.nextByte();
                    ArrayList<Cliente> localizar = clienteService.pesquisarClientePorPorte(porte);
                    if (localizar.isEmpty()) {
                        System.out.println("Não há cadastro de clientes com este porte.");
                    } else {
                        System.out.println(localizar);
                    }
                    break;

                case 7:
                    if (clienteService.getListaDeClientes().isEmpty()) {
                        System.out.println("Não há clientes cadastrados.");
                    } else {
                        int confirmar;
                        System.out.println("Digite sua opção.");
                        System.out.println("1-Sim");
                        System.out.println("2-Não");
                        confirmar = ler.nextInt();
                        if (confirmar == 1) {
                            clienteService.excluirRegistros();
                            System.out.println("Resgistros excluídos.");
                        } else {
                            System.out.println("Opção cancelada");
                        }
                    }
                    break;

                case 8:
                    System.out.println("1-Visualizar Serviços");
                    System.out.println("2-Voltar ao menu principal");
                    int opcaoServico = ler.nextInt();

                        switch (opcaoServico) {
                            case 1:
                                ArrayList<Servicos> servicosCadastrados = servicoService.listaDeServicos();

                                for (int i = 0; i < servicosCadastrados.size(); i++) {
                                    System.out.println("-----------------------------------------------");
                                    System.out.println("Serviço:" + servicosCadastrados.get(i).getServico());
                                    System.out.println("Porte:" + servicosCadastrados.get(i).getPorte());
                                    System.out.println("Preço:" + servicosCadastrados.get(i).getPreco());
                                }
                                break;

                        }//fecha switch

            }//fecha switch

        } while (opcao < 9);
    }
}




