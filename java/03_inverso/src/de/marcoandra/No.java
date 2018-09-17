package de.marcoandra;

public class No {

    private char conteudo;
    private No proximo;

    public No(char conteudo) {
        this.conteudo = conteudo;
        proximo = null;
    }

    public char getConteudo() {
        return conteudo;
    }

    public void setConteudo(char conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
