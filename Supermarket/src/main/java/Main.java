import java.lang.reflect.Array;
import java.util.List;
import java.util.Scanner;


/**
 * @author Julia Schleien
 * @version 1.0
 * @category View
 * @since 06/06/2020 - 23:00
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BankArray collection = new BankArray();

        Supermarket supermarket;

        int option = 0;
        do {
            System.out.println("1-Cadastrar" +
                    "\n2-Ver produtos" +
                    "\n3-Filtrar produto por nome" +
                    "\n4-Filtrar produto por sessão" +
                    "\n5-Filtrar produto por quantidade" +
                    "\n6-Filtrar produto por valor" +
                    "\n7-Ver quantidade" +
                    "\n8-Alterar" +
                    "\n9-Excluir" +
                    "\n10-Apagar Lista" +
                    "\n11-Sair");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    supermarket = new Supermarket();
                    System.out.println("Digite o produto: ");
                    supermarket.setProducts(scanner.next());
                    System.out.println("Digite a sessão: ");
                    supermarket.setSession(scanner.next());
                    System.out.println("Digite o valor: ");
                    supermarket.setValue(scanner.nextDouble());
                    System.out.println("Digite a quantidade: ");
                    supermarket.setQuantity(scanner.nextInt());
                    System.out.println("Digite o peso: ");
                    supermarket.setWeight(scanner.next());
                    System.out.println("Valor com acréscimo de 10%: " + supermarket.addTenPercentToTheValue());
                    collection.create(supermarket);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:
                    if (collection.checkQuantity() != 0) {
                        collection.search().forEach(System.out::println);
                    } else {
                        System.out.println("Não há produtos cadastrados!");
                    }
                    break;

                case 3:
                    supermarket = new Supermarket();
                    System.out.println("Digite o nome do produto que deseja filtrar: ");
                    supermarket.setProducts(scanner.next());

                    collection.filter(supermarket, 1)
                            .forEach(market -> System.out.println(market != null ? market : "Produto não encontrado!"));
                    break;

                case 4:
                    supermarket = new Supermarket();
                    System.out.println("Digite a sessão do produto que deseja filtrar: ");
                    supermarket.setSession(scanner.next());

                    collection.filter(supermarket, 2)
                            .forEach(market -> System.out.println(market != null ? market : "Produto não encontrado!"));
                    break;

                case 5:
                    supermarket = new Supermarket();
                    System.out.println("Digite a quantidade do produto que deseja filtrar: ");
                    supermarket.setQuantity(scanner.nextInt());

                    collection.filter(supermarket, 3)
                            .forEach(market -> System.out.println(market != null ? market : "Produto não encontrado!"));
                    break;

                case 6:
                    supermarket = new Supermarket();
                    System.out.println("Digite o valor do produto que deseja filtrar: ");
                    supermarket.setValue(scanner.nextInt());

                    collection.filter(supermarket, 4)
                            .forEach(market -> System.out.println(market != null ? market : "Produto não encontrado!"));
                    break;

                case 7:
                    System.out.println("Há " + collection.checkQuantity() + " produtos");
                    break;

                case 8:
                    supermarket = new Supermarket();
                    System.out.println("Digite o nome do produto que deseja alterar: ");
                    supermarket.setProducts(scanner.next());

                    List<Supermarket> alterMarket = collection.filter(supermarket, 1);

                    alterMarket.forEach(product -> {
                        System.out.println("Alterando produto");

                        System.out.println("\nDigite o novo produto: ");
                        product.setProducts(scanner.next());
                        System.out.println("Digite a nova sessão: ");
                        product.setSession(scanner.next());
                        System.out.println("Digite o novo valor: ");
                        product.setValue(scanner.nextDouble());
                        System.out.println("Digite a nova quantidade: ");
                        product.setQuantity(scanner.nextInt());
                        System.out.println("Digite o novo peso: ");
                        product.setWeight(scanner.next());

                        collection.alter(collection.getI(), product);

                        System.out.println("Produto alterado com sucesso!");
                    });

                    break;

                case 9:
                    System.out.println("Digite uma posição para excluir: ");
                    int index = scanner.nextInt();
                    collection.delete(index);
                    System.out.println("Produto apagado com sucesso!");
                    break;

                case 10:
                    collection.deleteCollection();
                    System.out.println("Lista limpa!");
                    break;

                case 11:
                    System.exit(0);
                    break;

            }
        } while (option != 11);
    }
}
