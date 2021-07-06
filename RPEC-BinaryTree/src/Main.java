
public class Main {
	
	public static void main(String[] args) {
		
		ArvoreBinaria arvoreBinaria;
		arvoreBinaria = new ArvoreBinaria();
		
		/*
		arvoreBinaria.inserir(100);
		arvoreBinaria.inserir(56);
		arvoreBinaria.inserir(32);
		arvoreBinaria.inserir(80);
		arvoreBinaria.inserir(127);
		arvoreBinaria.inserir(115);
		arvoreBinaria.remover(32);
		arvoreBinaria.inserir(85);
		arvoreBinaria.inserir(130);
		arvoreBinaria.inserir(82);
		arvoreBinaria.inserir(90);
		arvoreBinaria.inserir(120);
		arvoreBinaria.remover(80);
		arvoreBinaria.inserir(95);
		arvoreBinaria.remover(127);
		arvoreBinaria.inserir(40);
		arvoreBinaria.inserir(68);
		arvoreBinaria.remover(56);
		arvoreBinaria.remover(40);
		arvoreBinaria.remover(82);
		*/
		
		arvoreBinaria.inserir(3);
		arvoreBinaria.inserir(1);
		arvoreBinaria.inserir(8);
		arvoreBinaria.inserir(10);
		arvoreBinaria.inserir(5);
		
		arvoreBinaria.imprimir();
		
		arvoreBinaria.chamarBusca(1);
		
	}

}
