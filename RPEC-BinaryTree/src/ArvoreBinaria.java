
public class ArvoreBinaria {
	
	private Node raiz;
	
	public ArvoreBinaria() {
		
	}
	
	public void inserir(int info) {
		
		Node node = new Node();
		
		node.setInfo(info);
		node.setEsquerda(null);
		node.setDireita(null);
		
		if (raiz == null) { //verifica se a arvore está vazia, se estiver, inicia a raiz
			raiz = node;
			System.out.println("Inserindo " + node.getInfo() + " na raiz da árvore.");
		}
		else {
			Node aux = raiz;
			Node anterior;
			
			while(true) {
				anterior = aux;
				
				if (info <= aux.getInfo()) { //esquerda
					aux = aux.getEsquerda();
					if (aux == null) {
						anterior.setEsquerda(node);
						System.out.println("Inserindo " + node.getInfo() + " a esquerda de " + anterior.getInfo());
						return;
					}
				}
				else {
					aux = aux.getDireita();
					if (aux == null) {
						anterior.setDireita(node);
						System.out.println("Inserindo " + node.getInfo() + " a direita de " + anterior.getInfo());
						return;
					}
				}
			}
		}
	}
	
	public void remover(int info) {
		
		if (raiz == null) {
			//
		}
		
		Node atual = raiz;
		Node aux = raiz;
		boolean filhoEsquerda = true;
		
		while (atual.getInfo() != info) {
			aux = atual;
			if (info < atual.getInfo()) {
				atual = atual.getEsquerda();
				filhoEsquerda = true;
			}
			else {
				atual = atual.getDireita();
				filhoEsquerda = false;
			}
			if (atual == null) { //se econtrar uma folha null sai do while
				return;
			}
		}
		
		System.out.println(""); //pulando linha
		
		if (atual.getEsquerda() == null && atual.getDireita() == null) { //verifica se é uma folha, se for remove
			if (atual == raiz) {
				raiz = null;
			}
			else if (filhoEsquerda) {
				System.out.println("Removendo " + aux.getEsquerda().getInfo());
				aux.setEsquerda(null);
			}
			else {
				System.out.println("Removendo " + aux.getDireita().getInfo());
				aux.setDireita(null);
			}
		}
		
		else if (atual.getDireita() == null) { //se possui filho apenas a esquerda
			if (atual == raiz) {
				raiz = atual.getEsquerda();
			}
			else if (filhoEsquerda) {
				System.out.println("Removendo " + aux.getEsquerda().getInfo());
				aux.setEsquerda(atual.getEsquerda());
			}
			else {
				System.out.println("Removendo " + aux.getDireita().getInfo());
				aux.setDireita(atual.getEsquerda());
			}
		}
		
		else if (atual.getEsquerda() == null) { //se possui filho apenas a direita
			if (atual == raiz) {
				raiz = atual.getDireita();
			}
			else if (filhoEsquerda) {
				System.out.println("Removendo " + aux.getEsquerda().getInfo());
				aux.setEsquerda(atual.getDireita());
			}
			else {
				System.out.println("Removendo " + aux.getDireita().getInfo());
				aux.setDireita(atual.getDireita());
			}
		}
		
		else { //se possui mais de um filho
			Node sucessor = nodeSucessor(atual);
			
			if (atual == raiz) {
				raiz = sucessor;
			}
			else if (filhoEsquerda) {
				System.out.println("Removendo " + aux.getEsquerda().getInfo());
				aux.setEsquerda(sucessor);
			}
			else {
				System.out.println("Removendo " + aux.getDireita().getInfo());
				aux.setDireita(sucessor);
			}
		}
		System.out.println("");
	}
	
	public Node nodeSucessor(Node node) {
		
		Node paiSucessor = node;
		Node sucessor = node;
		Node aux = node.getDireita();
		
		while (aux != null) { //fca no while ate chegar a mais esquerda possivel, dentro da subarvore direita
			paiSucessor = sucessor;
			sucessor = aux;
			aux = aux.getEsquerda();
		}
		
		if (sucessor != node.getDireita()) {
			paiSucessor.setEsquerda(sucessor.getDireita());
			
			sucessor.setDireita(node.getDireita());
		}
		return sucessor;
	}
	
	public void buscar(Node node, int info) {
		if (node != null) {
			if (node.getInfo() == info) {
				System.out.println("");
				System.out.println("O elemento " + info + " está na árvore.");
			}
			else if (info < node.getInfo()) {
				buscar(node.getEsquerda(), info);
			}
			else if (info > node.getInfo()){
				buscar(node.getDireita(), info);
			}
		}
		else {
			System.out.println("");
			System.out.println("O elemento " + info + " não está na árvore.");
		}
	}
	
	public void chamarBusca(int info) {
		System.out.println("");
		System.out.println("Buscando pelo elemento " + info + " na árvore.");
		buscar(raiz, info);
	}
	
	public void inOrder(Node atual) {
	    if (atual != null) {
	    	inOrder(atual.getEsquerda());
	      	System.out.print(atual.getInfo() + " ");
	      	inOrder(atual.getDireita());
	    }
	}
	
	public void preOrder(Node atual) {
	    if (atual != null) {
	    	System.out.print(atual.getInfo() + " ");
	    	preOrder(atual.getEsquerda());
	    	preOrder(atual.getDireita());
	    }
	}
	public void posOrder(Node atual) {
		if (atual != null) {
			posOrder(atual.getEsquerda());
			posOrder(atual.getDireita());System.out.print(atual.getInfo() + " ");
		}
	 }
	
	public void imprimir() {
		System.out.println("");
		System.out.println("Imprimindo InOrder");
		inOrder(raiz);
		System.out.println("");
		System.out.println("Imprimindo PreOrder");
		preOrder(raiz);
		System.out.println("");
		System.out.println("Imprimindo PosOrder");
		posOrder(raiz);
		System.out.println("");
	}
	
}