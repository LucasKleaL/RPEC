public class Node {

    private Integer informacao;
    private Node proximo;

    public Node() {
        informacao = null;
        proximo = null;
    }

    public void setInformacao(int informacao) {
        this.informacao = informacao;
    }

    public int getInformacao() {
        return this.informacao;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

    public Node getProximo() {
        return this.proximo;
    }
    
}
