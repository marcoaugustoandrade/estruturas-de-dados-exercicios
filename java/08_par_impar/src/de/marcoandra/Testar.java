package de.marcoandra;

import java.util.Scanner;

public class Testar {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Pilha pilha = new Pilha();

        int num = 0;

        do {
            System.out.println("Informe um valor inteiro: ");
            num = entrada.nextInt();
            pilha.empilhar(new No(num));
        } while (num != 0);



    }
}
