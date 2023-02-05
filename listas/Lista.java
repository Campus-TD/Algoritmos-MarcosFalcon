
package com.mycompany.listas;

public class Lista {
    
    Nodo Raiz;

    public void addNodoI(int valor){
        Nodo nuevo = new Nodo();
        nuevo.valor = valor;
        if(Raiz != null){
            nuevo.siguiente = Raiz;
            Raiz = nuevo;
        }else{
            Raiz = nuevo;
        }
    }
    
    public void mostrarLista(){
        Nodo aux = new Nodo();
        aux = Raiz;
        while(aux != null){
            System.out.print(aux.valor + " ");
            aux = aux.siguiente;
        }
    }
}


