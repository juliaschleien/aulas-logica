public class Principal {
    
    public static void main (String args[]) {
        
        System.out.println("\f");
        
        Mosca mosca = new Mosca();
        mosca.setQuantidadePatas(6);
        
        System.out.println(mosca);
        
        Cachorro cachorro = new Cachorro();
        cachorro.setCorPelo("Amarelo"); 
        
        System.out.println(cachorro);
        
        Papagaio papagaio = new Papagaio();
        papagaio.setCorPena("Verde");
        
        System.out.println(papagaio);
        
        
     }
}