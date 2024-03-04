package classes;

public class No {
    int chave;
    No esquerda;
    No direita;
    No raiz; // Adicionando o campo raiz

    public No(int chave) {
        this.chave = chave;
        this.esquerda = null;
        this.direita = null;
        this.raiz = null; // Inicializando o campo raiz como null
    }

    // Métodos getter e setter para o campo raiz, se necessário
    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }
}
