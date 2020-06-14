import java.util.Scanner;
public class Principal {
    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in);
        
        Melancia melancia = new Melancia();
        System.out.println("Melancia");
        System.out.println("Digite a cor da fruta:");
        melancia.setCor(scanner.next());                
        System.out.println(melancia);
        
        Banana banana = new Banana();
        System.out.println("Banana");
        System.out.println("Digite a cor da fruta:");
        melancia.setCor(scanner.next());                
        System.out.println(banana);
        
        Kiwi kiwi = new Kiwi();
        System.out.println("Kiwi");
        System.out.println("Digite a cor da fruta:");
        melancia.setCor(scanner.next());                
        System.out.println(kiwi);
        
        
        
    }
}
        