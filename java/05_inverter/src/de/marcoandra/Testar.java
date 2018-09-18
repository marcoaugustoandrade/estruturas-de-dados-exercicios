package de.marcoandra;

public class Testar {

    public static void main(String[] args) {

        Pilha pilha = new Pilha();

        pilha.empilhar(new No(10));
        pilha.empilhar(new No(20));
        pilha.empilhar(new No(30));
        pilha.empilhar(new No(40));

        pilha.inverter();

        System.out.println(pilha.desempilhar().getConteudo());
        System.out.println(pilha.desempilhar().getConteudo());
        System.out.println(pilha.desempilhar().getConteudo());
        System.out.println(pilha.desempilhar().getConteudo());
    }
}
