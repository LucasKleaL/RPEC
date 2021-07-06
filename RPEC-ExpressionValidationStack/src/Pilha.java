
public class Pilha {

	private int topo;
	private char[] dados;
	private int max;
	
	public Pilha() {
		topo = -1;
	}
	
	public int topo() {
	
		return topo;

	}
	
	public char caracterTopo() {
		
		if (vazia()) {
			return ' ';
		}
		else {
			return dados[topo];
		}
		
	}
	
	public boolean vazia() {
		
		if (topo < 0) {
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
	
	public void empilha(char elemento) {
		
		if (cheia()) {
			System.out.println("Não foi possível empilhar. A pilha está cheia.");
		}
		else {
			dados[++topo] = elemento;
		}
		
	}
	
	public void desempilhar() {
		
		if (vazia()) {
			System.out.println("Pilha vazia.");
		}
		else {
			topo--;
		}
		
	} 
	
	public void cria_pilha(int n) {
		
		max = n;
		this.dados = new char[max];	
		
	}

}
