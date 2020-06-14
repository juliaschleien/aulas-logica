/**
 * @author Julia Schleien
 * @version 1.0
 * @since 27/05/2020 - 15:07
 * @category View
 */
import java.util.Scanner;
public class Principal {

    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        
        Aluno aluno = new Aluno();
        System.out.println("Digite o nome do aluno: ");
        aluno.setNome(scanner.next());
        System.out.println("Digite a nota 1: ");
        aluno.setNota1(scanner.nextDouble());
        System.out.println("Digite a nota 2: ");
        aluno.setNota2(scanner.nextDouble());
        System.out.println("Digite o total de aulas dadas no mês: ");
        aluno.setTotalDeAulas(scanner.nextInt());
        System.out.println("Digite o número de presenças do aluno: ");
        aluno.setNumeroDePresencas(scanner.nextDouble());
        System.out.println("Média: " + aluno.calcularMediaAritmetica());
        System.out.println("Porcentagem de frequência: " + aluno.calcularFrequencia());
        
    }

}