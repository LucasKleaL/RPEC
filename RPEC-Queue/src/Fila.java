public class Fila {

    private int primeiro;
    private int ultimo;
    private int elementos;
    private int dados[];

    public Fila() {
        primeiro = -1;
        ultimo = -1;
        elementos = 0;
    }

    public boolean cheia() {

        if (elementos == dados.length - 1) {
            return true;
        }
        else {
            return false;
        }

    }

    public boolean vazia() {

        if (elementos == 0) {
            return true;
        }
        else {
            return false;
        }

    }

    public void insere(int i) {
        
        if (!cheia()) {

            if (primeiro == -1) {
                primeiro = 0;
            }
            ultimo++;
            dados[ultimo] = i;
            elementos++;

        }

    }

    public void remove() {

        if (!vazia()) {
            primeiro++;
            elementos--;
        }

    }

    public void imprimir(){

        for (int i = primeiro; i <= ultimo; i++) {
            System.out.println(dados[i]);
        }

    }

    public void criarFila(int tamanho) {
        dados = new int[tamanho];
    }
    
}
