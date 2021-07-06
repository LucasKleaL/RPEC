
public class Pilha {

	private int topo;
	private int[] dados;
	private int max;
	
	public Pilha() {
		topo();
	}
	
	public int topo() {
	
		topo =  -1;
		return topo;
		
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
	
	public void empilha(int elemento) {
		
		if (cheia()) {
			System.out.println("Não foi possível empilhar. A pilha está cheia.");
		}
		else {
			dados[++topo] = elemento;
		}
		
	}
	
	public int desempilhar() {
		
		if (vazia()) {
			System.out.println("Pilha vazia.");
			return 0;
		}else {
			int x = dados[topo];
			topo--;
			return x;
		}
		
	} 
	
	public void cria_pilha(int n) {
		
		max = n;
		this.dados = new int[max];	
		
	}
	
	public void imprime_pilha() {
		
		System.out.println("-------------------------------");
		System.out.println("Iniciando a impressão da pilha.");
		
		for (int i = topo; i >= topo; i--) {
			
			if (vazia()) {
				System.out.println("-------------");
				System.out.println("Pilha vazia.");
			}
			else {
				System.out.println(desempilhar());
			}
			
		}
		
	}
	
}
