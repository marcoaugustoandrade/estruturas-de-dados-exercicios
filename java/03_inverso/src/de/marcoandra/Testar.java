package de.marcoandra;

import java.util.Scanner;

public class Testar {
    public static void main(String[] args) {

        Pilha pilha = new Pilha();

        Scanner entrada = new Scanner(System.in);
        String palavra;

        System.out.println("Informe a string X: ");
        palavra = entrada.next();

        for (int i = 0; i < palavra.length(); i++){
            pilha.empilhar(new No(palavra.charAt(i)));
        }

        //System.out.println(pilha.desempilhar().getConteudo());
        //System.out.println(pilha.desempilhar().getConteudo());

        pilha.comparar();
    }
}
