
public class TabelaHash {
	
	private int colisao;
	private int tamanho;
	private NodeTabela[] tabela;
	
	public TabelaHash(int tamanho) {
		
		this.tamanho = tamanho;
		this.colisao = 0;
		
		tabela = new NodeTabela[tamanho];
		
		for (int i = 0; i < tamanho; i++) {
			tabela[i] = new NodeTabela();
			tabela[i].setInformacao(-1);
		}
		
		preencher(50);
		
	}
	
	public void insere(int chave) {
		
		int hashValue = funcaoHash(chave);

		if (tabela[hashValue].getInformacao() == -1) {
			tabela[hashValue].setInformacao(chave);
		}
		else {
			if(tabela[hashValue].getLista() == null) {
				ListaEncadeada lista = new ListaEncadeada();
				lista.insereOrdenado(chave);
				tabela[hashValue].setLista(lista);
				colisao++;
			}
			else {
				tabela[hashValue].getLista().insereOrdenado(chave);
				colisao++;
			}
		}
	}
	
	public int funcaoHash(int info) {
		return info % tamanho;
	}
	
	public void imprime() {
		for (int i = 0; i < tamanho; i++) {
			System.out.print("Hash "+i+" ");
			if (tabela[i].getLista() != null) {
				tabela[i].getLista().imprime();
				System.out.println("");
			}
			else {
				System.out.println("");
				System.out.println("");
			}
		}
	}
	
	public void busca(int info) {
		
		int hashValue = funcaoHash(info);
		
		if (tabela[hashValue] != null) {
			if (tabela[hashValue].getInformacao() == info) {
				System.out.println("O valor "+info+" está na tabela hash.");
			}
			else if (tabela[hashValue].getLista() != null){
				if (tabela[hashValue].chamarBusca(info)) {
					System.out.println("O valor "+info+" está na tabela hash.");
				}
				else {
					System.out.println("O valor "+info+" não está na tabela hash.");
				}
			}
			else {
				System.out.println("Elemento não está na tabela hash.");
			}
		}
	}
	
	public void preencher(int quantia) {
		
		for (int i = 0; i < quantia; i++) {
			insere(i);
		}
	}

}
