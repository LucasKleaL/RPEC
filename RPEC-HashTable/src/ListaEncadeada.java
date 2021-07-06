
public class ListaEncadeada {

    private Node Lista;
    private Node primeiro;
    private Node ultimo;
    private int elementos;
    
    public ListaEncadeada() {
        Lista = null;
        primeiro = null;
        ultimo = null;
        elementos = 0;
    }

    public boolean vazia() {
        if (elementos == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void inserePrimeiro(int info) {

        if (! vazia() ) {
            Node node = new Node();
            node.setInformacao(info);
            node.setProximo(primeiro);
            primeiro = node;
            elementos ++;
        }
        else {
            Node node2 = new Node();
            node2.setInformacao(info);
            node2.setProximo(primeiro);
            primeiro = node2;
            elementos ++;
        }

    }

    public void insereDepois(int posicao, int info) {
    	
    	Node novo = new Node();
    	novo.setInformacao(info);
    	Node aux = primeiro;
    	
    	if (posicao == elementos) {
    		this.insereUltimo(info);
    	}else {
    		
    		if (posicao == 0) {
    			this.inserePrimeiro(info);
    		}
    		else {
    			for (int i = 0; i < posicao-1; i++) {
    				aux = aux.getProximo();
    			}
    			novo.setProximo(aux.getProximo());
    			aux.setProximo(novo);
    			aux = novo;
    		}
    		elementos++;
    	}
    	
    }

    public void insereUltimo(int info) {

        Node node = new Node();
        node.setInformacao(info);

        if (vazia()) {
            node.setProximo(ultimo);
            primeiro = node;
            ultimo = node;
        }
        else {
            ultimo.setProximo(node);
            ultimo = node;
        }
        elementos ++;
    }

    public void insereOrdenado(int info) {
        
    	Node novo;
    	Node anterior = null;
    	Node aux = primeiro;
    	
    	while (aux != null && aux.getInformacao() < info) {
    		anterior = aux;
    		aux = aux.getProximo();
    	}
    	
    	novo = new Node();
    	novo.setInformacao(info);
    	
    	if (anterior == null) {
    		novo.setProximo(primeiro);
    		primeiro = novo;
    		elementos++;
    	}
    	else {
    		novo.setProximo(anterior.getProximo());
    		anterior.setProximo(novo);
    		elementos++;
    	}
    	
    }

    public void imprime() {
        
        if (vazia()) {
            System.out.println("Lista vazia, não há elementos para remover.");
        }
        else {

            Node aux = primeiro;
            System.out.print("[ ");
            for (int i = 0; i < elementos-1; i++) {
                System.out.print(aux.getInformacao() + ", ");
                aux = aux.getProximo();
            }
            System.out.println(aux.getInformacao() + " ]");

        }

    }

    public void removePrimeiro() {

        if (vazia()) {
            System.out.println("Lista vazia, não há elementos para remover");
        }
        else {
            Node aux = primeiro;
            primeiro = primeiro.getProximo();
            aux.setProximo(null);
            elementos --;
        }

    }

    public void removeUltimo() {

        if (vazia()) {
            System.out.println("Lista vazia, não há elementos para remover");
        }
        else {
            Node aux = primeiro;
            while(aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(null);
            elementos --;
        }   

    }

    public void remove(int info) {

        Node aux = primeiro;
        Node anterior = null;
        
        while (aux != null && aux.getInformacao() != info) {
        	anterior = aux;
        	aux = aux.getProximo();
        }
        
        if (anterior == null) {
        	primeiro = aux.getProximo();
        	elementos--;
        }
        else {
        	anterior.setProximo(aux.getProximo());
        	elementos--;
        }

    }

    public boolean busca(int info) {
    	
    	Node aux = primeiro;
    	
    	while (aux != null && aux.getInformacao() != info) {
    		aux = aux.getProximo();
    	}
    	
    	if (aux.getInformacao() == info) {
    		return true;
    	}
    	else {
    		return false;
    	}
    	
    }
    
}
