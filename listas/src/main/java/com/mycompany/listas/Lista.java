
package com.mycompany.listas;

public class Lista {
    
    Nodo Raiz;
    
    private int[] A = new int[1001];
    
    private int i = 0;
    private int promedio = 0;
    private int mayor;
    private int moda;

    public int getModa(){
        return this.moda;
    }
    
    public double getPromedio(){
        return ((double)this.promedio / (double) this.i);
    }
    
    public void addNodoI(int valor){
        Nodo nuevo = new Nodo();
        nuevo.valor = valor;
        if(Raiz != null){
            nuevo.siguiente = Raiz;
            Raiz = nuevo;
        }else{
            Raiz = nuevo;
        } 
        
        this.promedio(valor);
        this.moda(valor);
    }
    
    public void addNodoF(int valor){
        Nodo nuevo = new Nodo();
        nuevo.valor = valor;
        if(Raiz == null){
            Raiz = nuevo;
        }else{
            Nodo aux = this.Raiz;
            while(aux.siguiente != null){
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
        
        this.promedio(valor);
        this.moda(valor);
    }
    
    private void promedio(int valor){
        this.i++;
        promedio += valor;
    }
    
    private void moda(int valor){
        this.A[valor]++;  
        if(this.A[valor] > this.mayor){
            this.mayor = this.A[valor];
            this.moda = valor;
        }
    }
    
    public void mostrarLista(){
        Nodo aux = new Nodo();
        aux = Raiz;
        while(aux != null){
            System.out.print(aux.valor + " ");
            aux = aux.siguiente;
        }
        System.out.println("");
    }
    
    public void mostrarPar(){
        Nodo aux = new Nodo();
        aux = Raiz;
        while(aux != null){
            if(aux.valor % 2 == 0){
                System.out.print(aux.valor + " ");
            }
            aux = aux.siguiente;
        }
        System.out.println("");
    }
    
    public void mostrarImpar(){
        Nodo aux = new Nodo();
        aux = Raiz;
        while(aux != null){
            if(aux.valor % 2 != 0){
                System.out.print(aux.valor + " ");
            }
            aux = aux.siguiente;
        }
        System.out.println("");
    }
}


