package de.marcoandra;

public class Pilha {

    private No topo;
    private int quantidade;

    public Pilha() {
        topo = null;
        quantidade = 0;
    }

    public int tamanho(){
        return quantidade;
    }

    public void empilhar(No no){
        no.setProximo(topo);
        topo = no;
        quantidade++;
    }

    public No desempilhar(){
        No removido = null;
        removido = topo;
        topo = topo.getProximo();
        removido.setProximo(null);
        quantidade--;
        return removido;
    }

    public void comparar() {

        //Criando a nova pilha
        Pilha p2 = new Pilha();

        //Empilhando a metade da pilha na nova pilha
        int metade = quantidade / 2;
        for (int i = 1; i <= metade; i++){
            p2.empilhar(desempilhar());
        }

        //Comparando
        if (tamanho() == p2.tamanho()){
            boolean igual = true;
            while (topo != null){
                if (desempilhar().getConteudo() != p2.desempilhar().getConteudo()){
                    igual = false;
                }
            }
            System.out.println("As strings são iguais? " + igual);
        } else {
            System.out.println("As strings têm tamanho diferentes!");
        }

    }
}
