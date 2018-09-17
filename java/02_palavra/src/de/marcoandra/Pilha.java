package de.marcoandra;

public class Pilha {

    private No topo;

    public Pilha() {
        topo = null;
    }

    public void empilhar(String palavra){
        for (int i = 0; i < palavra.length(); i++){
            No no = new No((char) palavra.charAt(i));
            no.setProximo(topo);
            topo = no;
        }
    }

    public void ordemInversa(){
        while (topo != null){
            System.out.println(topo.getConteudo());
            topo = topo.getProximo();
        }
    }

}
