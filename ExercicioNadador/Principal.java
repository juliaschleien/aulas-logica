/**
 * @author Julia Schleien e Eduardo Rambo
 * @version 1.0
 * @since 01/06/2020 - 09:01
 * @category View
 */
import java.util.Scanner;
public class Principal {

   public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        
        Nadador nadador = new Nadador();
        
        System.out.println("Digite seu nome: ");
        nadador.setNome(scanner.next());
        System.out.println("Digite sua idade: ");
        nadador.setIdade(scanner.nextInt());
        System.out.println(nadador);
   }
}