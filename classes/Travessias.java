package classes;

public class Travessias {
   private No raiz;

   // Constructor
   public Travessias(No raiz) {
    this.raiz = raiz;
}

// Setter para definir a raiz
public void setRaiz(No raiz) {
    this.raiz = raiz;
}

// passeios
   public void emOrdem(){ 
    emOrdem(this.raiz); 
}

private void emOrdem(No _raiz){
    if(_raiz != null){
        emOrdem(_raiz.esquerda);
        System.out.println(_raiz.chave + " ");
        emOrdem(_raiz.direita);
    }
}

public void posOrdem(){ 
    posOrdem(this.raiz); 
}

private void posOrdem(No _raiz){
    if(_raiz != null){
        posOrdem(_raiz.esquerda);
        posOrdem(_raiz.direita);
        System.out.println(_raiz.chave + " ");
    }
}

public void preOrdem(){ 
    preOrdem(this.raiz); 
}

private void preOrdem(No _raiz){
    if(_raiz != null){ // checar se nao eh folha
        System.out.println(_raiz.chave + " "); // visitar nó
        preOrdem(_raiz.esquerda); // visitar subarvore da esquerda
        preOrdem(_raiz.direita); // visitar subarvore da direita
    }
}
}
