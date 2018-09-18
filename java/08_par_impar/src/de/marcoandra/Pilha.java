package de.marcoandra;

public class Pilha {

    private No topoPar;
    private No topoImpar;

    public Pilha() {
        topoPar = null;
        topoImpar = null;
    }

    public No getTopoPar() {
        return topoPar;
    }

    public No getTopoImpar() {
        return topoImpar;
    }

    public void empilhar(No no){
        if (no.getConteudo() % 2 == 0){
            no.setProximo(topoPar);
            topoPar = no;
        } else {
            no.setProximo(topoImpar);
            topoImpar = no;
        }
    }

    public No desempilhar(No topo){
        No retorno = topo;
        topo = topo.getProximo();
        retorno.setProximo(null);
        return topo;
    }

}
