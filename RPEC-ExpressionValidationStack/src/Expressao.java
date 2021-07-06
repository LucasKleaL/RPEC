
public class Expressao {
	
	private char caracterAtual;
	private Pilha pilha;
	
	public Expressao() {
		
		pilha = new Pilha();
		
	}
	
	public boolean validaExpressao(String expressao) {
		
		pilha.cria_pilha(expressao.length());
		
		for (int i = 0; i < expressao.length(); i++) {
			
			caracterAtual = expressao.charAt(i);
			
			if (caracterAtual == '[') {
				pilha.empilha('[');	
			}
			else if (caracterAtual == '(') {
				pilha.empilha('(');
			}
			else if (caracterAtual == '{') {
				pilha.empilha('{');
			}
			
			if (caracterAtual == ']' && pilha.caracterTopo() == '[') {
				pilha.desempilhar();
			}
			else if (caracterAtual == '}' && pilha.caracterTopo() == '{') {
				pilha.desempilhar();
			}
			else if (caracterAtual == ')' && pilha.caracterTopo() == '(') {
				pilha.desempilhar();
			}
			else {
				continue;
			}
			
		}
		
		if (pilha.vazia()) {
			System.out.println("A expressão " + expressao + " é válida.");
			return true;
		}
		else {
			System.out.println("A expressão " + expressao + " é inválida.");
			return false;
		}
		
	}
	
}
