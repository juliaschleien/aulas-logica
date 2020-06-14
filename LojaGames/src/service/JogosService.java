package service;

import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.Jogos;

public class JogosService {

    /**
     *
     * metodo que retorna ListaJogos Mockados
     *
     * @return
     */
    public ArrayList<Jogos> listaJogos() {

        //declarando ArrayList de jogos
        ArrayList<Jogos> listaJogos = new ArrayList<>();

        //setando valores dos jogos
        Jogos jogos = new Jogos();
        jogos.setNome("XCOM II");
        jogos.setPreco(46L);
        jogos.setGenero("Estratégia");

        Jogos jogos2 = new Jogos();
        jogos2.setNome("Northgard");
        jogos2.setPreco(999L);
        jogos2.setGenero("Estratégia");

        Jogos jogos3 = new Jogos();
        jogos3.setNome("They Are Billions");
        jogos3.setPreco(76L);
        jogos3.setGenero("Estratégia");

        Jogos jogos4 = new Jogos();
        jogos4.setNome("Sudden Strike 4");
        jogos4.setPreco(250L);
        jogos4.setGenero("Estratégia");

        Jogos jogos5 = new Jogos();
        jogos5.setNome("Pac-Man");
        jogos5.setPreco(98L);
        jogos5.setGenero("Arcade");

        Jogos jogos6 = new Jogos();
        jogos6.setNome("Galaga");
        jogos6.setPreco(78L);
        jogos6.setGenero("Arcade");

        Jogos jogos7 = new Jogos();
        jogos7.setNome("Street Fighter II");
        jogos7.setPreco(40L);
        jogos7.setGenero("Arcade");

        Jogos jogos8 = new Jogos();
        jogos8.setNome("Exerion");
        jogos8.setPreco(55L);
        jogos8.setGenero("Arcade");

        Jogos jogos9 = new Jogos();
        jogos9.setNome("Mortal Kombat 11");
        jogos9.setPreco(130L);
        jogos9.setGenero("Luta");

        Jogos jogos10 = new Jogos();
        jogos10.setNome("Dragon Ball FighterZ");
        jogos10.setPreco(170L);
        jogos10.setGenero("Luta");

        Jogos jogos11 = new Jogos();
        jogos11.setNome("Saint Seiya:Soldiers Soul");
        jogos11.setPreco(100L);
        jogos11.setGenero("Luta");

        Jogos jogos12 = new Jogos();
        jogos12.setNome("EA UFC 3");
        jogos12.setPreco(90L);
        jogos12.setGenero("Luta");

        //inserindo dados no ArrayList
        listaJogos.add(0, jogos);
        listaJogos.add(1, jogos2);
        listaJogos.add(2, jogos3);
        listaJogos.add(3, jogos4);
        listaJogos.add(4, jogos5);
        listaJogos.add(5, jogos6);
        listaJogos.add(6, jogos7);
        listaJogos.add(7, jogos8);
        listaJogos.add(8, jogos9);
        listaJogos.add(9, jogos10);
        listaJogos.add(10, jogos11);
        listaJogos.add(11, jogos12);

        return listaJogos;
    }
    
//pesquisa abrangente
    public ArrayList<Jogos> pesquisarJogosPorGenero(String novoGenero, ArrayList<Jogos> listaJogos) {
        if(novoGenero==null){
            System.out.println("Gênero Nulo");
            return null;
        }
        if(listaJogos==null){
            System.out.println("Jogo Nulo");
            return null;
        }
        
        ArrayList<Jogos> listaGenero = new ArrayList<>();
        for (int i = 0; i < listaJogos.size(); i++) {
            if (listaJogos.get(i).getGenero().equalsIgnoreCase(novoGenero)) {
                listaGenero.add(listaJogos.get(i));
            }

        }
        return listaGenero;
    }
 
    

}
    
