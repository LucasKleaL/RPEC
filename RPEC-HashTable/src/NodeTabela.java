
public class NodeTabela {
	
	private int informacao;
	private ListaEncadeada lista;
	
	public NodeTabela() {
		lista = null;
	}
	
	public void setInformacao(int info) {
		this.informacao = info;
	}
	
	public int getInformacao() {
		return informacao;
	}
	
	public void setLista(ListaEncadeada lista) {
		this.lista = lista;
	}
	
	public ListaEncadeada getLista() {
		return lista;
	}
	
	public boolean chamarBusca(int info) {
		return lista.busca(info);
	}

}
