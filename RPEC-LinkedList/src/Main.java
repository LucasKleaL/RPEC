public class Main {

    public static void main(String args[]) {

        
        Pilha pilha = new Pilha(10);

        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);
        pilha.empilha(4);
        pilha.empilha(5);
        

        pilha.desempilha();
        pilha.desempilha();

        pilha.mostra_pilha();
        
        Fila fila = new Fila();

        fila.insere(1);
        fila.insere(2);
        fila.insere(3);
        fila.insere(4);
        fila.remove();
        

        fila.mostra_fila();

    }

}