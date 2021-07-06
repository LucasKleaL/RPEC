
public class Pilha {

    private int topo;
    private int max;
    private ListaEncadeada lista;

    public Pilha(int tamanho) {
        topo = -1;
        max = tamanho;
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

    public boolean cheia() {

        if (topo == max-1) {
            return true;
        }
        else {
            return false;
        }

    }
	
	public void empilha(int dado) {

        if (cheia()) {
            System.out.println("Pilha cheia");
        }
        else {
            lista.insereUltimo(dado);
            topo++;
            System.out.println("O elemento (" + dado + ") foi empilhado.");
        }
	}
	
	public int desempilha() {

        if (vazia()) {
            System.out.println("Pilha vazia");
            return -1;
        }
        else {
            lista.removeUltimo();
            topo--;
            System.out.println("O elemento (" + lista.getUltimo() + ") foi desempilhado.");
            return lista.getUltimo();
        }
	}

    public int topo() {
        return topo;
    }
	
	public void mostra_pilha() {
		System.out.println();
		System.out.println("Imprimindo pilha");
		System.out.println();
        lista.imprime();
        System.out.println("-------------------");
	}

}
