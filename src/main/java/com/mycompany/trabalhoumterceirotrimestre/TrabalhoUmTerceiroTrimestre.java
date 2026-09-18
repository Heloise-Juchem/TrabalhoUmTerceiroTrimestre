package com.mycompany.trabalhoumterceirotrimestre;
//import com.mycompany.exercicios.Pessoa;
//import com.mycompany.exercicios.Produto;
//import com.mycompany.exercicios.Livros;
//import com.mycompany.exercicios.Veiculo;
import com.mycompany.exercicios.carteiraDigitel;

public class TrabalhoUmTerceiroTrimestre {

    public static void main(String[] args) {
        //Pessoa lucas = new Pessoa("Lucas de Souza", 24, (float)1.74);
        
        //System.out.printf("%s", lucas.exibirDados());
        //System.out.printf("%s", lucas.fazerAniversario());
        //System.out.printf("%s", lucas.exibirDados());
        
        //Produto maca = new Produto("Maça", (float) 1.50, 300);
        
        //System.out.printf("%s", maca.exibirResumo());
        //System.out.printf("%s", maca.adicionarEstoque(20));
        //System.out.printf("%s", maca.adicionarEstoque(30));
        //System.out.printf("%s", maca.adicionarEstoque(100));
        //System.out.printf("%s", maca.vender(8));
        //System.out.printf("%s", maca.vender(10));
        //System.out.printf("%s", maca.vender(6));
        
        //Livros rainha_vermelha = new Livros ("Rainha Vermelha", "Victoria Aveyard", 424, (float) 70);
        
        //System.out.printf("%s", rainha_vermelha.exibirDetalhes());
        //System.out.printf("%s", rainha_vermelha.aplicarDesconto(-20.00));
        
        //Veiculo fusca = new Veiculo("Volkswagen", "fusca", 1979, (double) 300000);
        //Veiculo kombi = new Veiculo("Volkswagen", "kombi", 1950, (double) 500000);
        
        
        //System.out.printf("%s", fusca.calcularTempo());
        //System.out.printf("%s", fusca.registrarViagem((double) 500));
        //System.out.printf("%S", fusca.exibirDados());
        //System.out.printf("%s", kombi.calcularTempo());
        //System.out.printf("%s", kombi.registrarViagem((double) 500));
        //System.out.printf("%S", kombi.exibirDados());

        carteiraDigitel ana = new carteiraDigitel("Ana Barramas claro", 5000.00, 10);
        carteiraDigitel joana = new carteiraDigitel("joana Pitágoras", 200000.00, 3);
        carteiraDigitel hanna = new carteiraDigitel("Hanna Montana", 20.00, 3);
       
       
        System.out.printf("%s", ana.receber(400));
        System.out.printf("%s", ana.pagar(300.00));
        System.out.printf("%s", ana.consultarSaldo());
        System.out.printf("%s", ana.exibirExtrato());
        System.out.printf("%s", joana.receber(100000));
        System.out.printf("%s", joana.pagar(400.00));
        System.out.printf("%s", joana.consultarSaldo());
        System.out.printf("%s", joana.exibirExtrato());
         System.out.printf("%s",hanna.receber(1));
        System.out.printf("%s", hanna.pagar(400.00));
        System.out.printf("%s", hanna.consultarSaldo());
        System.out.printf("%s", hanna.exibirExtrato());
       
    }

}
