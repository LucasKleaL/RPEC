public class Fila {

    private ListaEncadeada lista;

    public Fila() {

        lista = new ListaEncadeada();

    }

    public boolean vazia() {

        if (lista.vazia()) {
            return true;
        }
        else {
            return false;
        }
    }

    public void insere(int dado) {

        lista.insereUltimo(dado);
        System.out.println("O elemento (" + dado + ") foi inserido na fila.");

    }

    public int remove() {

        if (vazia()) {
            System.out.println("Nao foi possivel remover. Lista vazia");
            return -1;
        }
        else {
            lista.removePrimeiro();
            System.out.println("O primeiro elemento foi removido da fila");
            return lista.getPrimeiro();
        }
    }

    public void mostra_fila() {
    	System.out.println();
        System.out.println("Imprimindo fila");
        System.out.println();
        lista.imprime();
        System.out.println("-------------------");
    }
    
}
