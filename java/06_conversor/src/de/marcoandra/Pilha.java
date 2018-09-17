package de.marcoandra;

public class Pilha {

    private No topo;

    public Pilha() {
        topo = null;
    }

    public void definir(int n){
        int resto;
        do {
            resto = n % 2;
            n = n / 2;
            No no  = new No(resto);
            no.setProximo(topo);
            topo = no;
        } while(n > 0);
    }

    public void converter(){
        while (topo != null){
            System.out.print(topo.getConteudo());
            topo = topo.getProximo();
        }
    }


}
