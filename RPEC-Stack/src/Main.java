
public class Main {

	public static void main(String[] args) {
		
		Pilha p = new Pilha();
		
		p.cria_pilha(5);
		
		p.empilha(8);
		p.empilha(5);
		p.empilha(3);
		p.empilha(4);
		p.empilha(5);
		p.empilha(6);
		
		p.imprime_pilha();
		

	}

}
