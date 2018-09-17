package de.marcoandra;

import java.util.Random;

public class Pilha {

    private No topo;

    public void empilhar(No no){
        no.setProximo(topo);
        topo = no;
    }

    public No desempilhar(){
        No no = null;
        no = topo;
        topo = topo.getProximo();
        if (no != null) no.setProximo(null);
        return no;
    }

    public void gerarPilha(int quantidade){

        Random gerador = new Random(0);

        for (int i = 0; i < quantidade; i++){
            No no = new No(gerador.nextInt(100));
            no.setProximo(topo);
            topo = no;
        }
    }

    public void maiorEMenor(){

        Pilha p2 = new Pilha();

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        while (topo != null){
            No no = desempilhar();
            if (no.getConteudo() > maior) {
                maior = no.getConteudo();
            }
            if (no.getConteudo() < menor){
                menor = no.getConteudo();
            }
            p2.empilhar(no);
        }

        System.out.println("O maior é " + maior);
        System.out.println("O menor é " + menor);
    }
}
