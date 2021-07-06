import java.util.Scanner;

public class Menu {
	
	private boolean controlMenu;
	
	public TabelaHash tabelaHash;
	
	public Menu() {
		
		controlMenu = true;
		
		tabelaHash = new TabelaHash(10);
		
		telaMenu();
		
	}
	
	public void telaMenu() {
		
		Scanner s = new Scanner(System.in);
		
		while (controlMenu == true) {
			
			System.out.println("-- Tabela Hash ---");
			System.out.println("(1) Imprimir tabela");
			System.out.println("(2) Inserir elemento");
			System.out.println("(3) Buscar por um elemento");
			System.out.println("(4) Buscar varios elementos");
			System.out.println("(5) Encerrar programa");
			System.out.print("Opcao: ");
			
			int opcao = s.nextInt();
			
			selecao(opcao);
		}
	}
	
	public void selecao(int selecao) {
		
		Scanner elemento = new Scanner(System.in);
		Scanner option = new Scanner(System.in);
		
		if (selecao == 1) {
			tabelaHash.imprime();
		}
		else if (selecao == 2) {
			System.out.println("----------------------------------------");
			System.out.print("Digite um int a ser inserido na tabela: ");
			tabelaHash.insere(elemento.nextInt());
			System.out.println("");
		}
		else if (selecao == 3) {
			System.out.println("---------------------------------------");
			System.out.println("Digite um int a ser buscado na tabela: ");
			tabelaHash.busca(elemento.nextInt());
			System.out.println("");
		}
		else if (selecao == 4) {
			System.out.println("---------------------------------------");
			boolean control = true;
			while (control == true) {
				System.out.println("Digite um valor maior que 0 para buscar.");
				System.out.println("Digite -1 para encerrar.");
				System.out.print("Opcao: ");
				int value = option.nextInt();
				
				if (value >= 0) {
					tabelaHash.busca(value);
					System.out.println("");
				}
				else {
					control = false;
					break;
				}
			}
		}
		else if (selecao == 5) {
			controlMenu = false;
		}
	}
}
