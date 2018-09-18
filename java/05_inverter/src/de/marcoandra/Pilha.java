package de.marcoandra;

public class Pilha {

    private No topo;

    public Pilha() {
        topo = null;
    }

    public No getTopo(){
        return topo;
    }

    public void empilhar(No no){
        no.setProximo(topo);
        topo = no;
    }

    public No desempilhar(){
        No retorno = null;
        retorno = topo;
        topo = topo.getProximo();
        return retorno;
    }

    public void inverter(){
        Pilha p2 = new Pilha();
        while (topo != null){
            p2.empilhar(desempilhar());
        }
        topo = p2.getTopo();
    }
}
