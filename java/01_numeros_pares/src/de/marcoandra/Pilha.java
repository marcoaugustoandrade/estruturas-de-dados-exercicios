package de.marcoandra;

public class Pilha {

    private No topo;

    public Pilha() {
        topo = null;
    }

    public void empilhar(No no){
        if (no.getConteudo() % 2 == 0){
            no.setProximo(topo);
            topo = no;
        }
    }

    public No desempilhar(){
        No retorno = null;
        retorno = topo;
        topo = topo.getProximo();
        if (retorno!= null) retorno.setProximo(null);
        return retorno;
    }
}
