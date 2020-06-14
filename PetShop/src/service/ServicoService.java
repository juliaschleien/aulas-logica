package service;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.Servicos;

public class ServicoService {

    public ArrayList<Servicos> listaDeServicos() {

        //ArrayList de serviços
        ArrayList<Servicos> listaDeServicos = new ArrayList<>();

        //setando valor dos serviços
        Servicos servicos = new Servicos();
        servicos.setServico("Banho");
        servicos.setPorte("Pequeno");
        servicos.setPreco(30L);

        Servicos servicos2 = new Servicos();
        servicos2.setServico("Banho + Tosa");
        servicos2.setPorte("Pequeno");
        servicos2.setPreco(60L);

        Servicos servicos3 = new Servicos();
        servicos3.setServico("Banho");
        servicos3.setPorte("Médio");
        servicos3.setPreco(55L);

        Servicos servicos4 = new Servicos();
        servicos4.setServico("Banho + Tosa");
        servicos4.setPorte("Médio");
        servicos4.setPreco(80L);

        Servicos servicos5 = new Servicos();
        servicos5.setServico("Banho");
        servicos5.setPorte("Grande");
        servicos5.setPreco(100L);

        Servicos servicos6 = new Servicos();
        servicos6.setServico("Banho + Tosa");
        servicos6.setPorte("Grande");
        servicos6.setPreco(150L);

        //inserindo dados no ArrayList
        listaDeServicos.add(0, servicos);
        listaDeServicos.add(1, servicos2);
        listaDeServicos.add(2, servicos3);
        listaDeServicos.add(3, servicos4);
        listaDeServicos.add(4, servicos5);
        listaDeServicos.add(5, servicos6);

        return listaDeServicos;

    }

}
