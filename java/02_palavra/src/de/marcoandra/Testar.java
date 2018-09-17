package de.marcoandra;

import java.util.Scanner;

public class Testar {

    public static void main(String[] args) {

        Pilha pilha = new Pilha();

        String palavra;
        System.out.println("Informe uma palavra: ");
        Scanner entrada = new Scanner(System.in);
        palavra = entrada.next();

        pilha.empilhar(palavra);

        pilha.ordemInversa();

    }
}
