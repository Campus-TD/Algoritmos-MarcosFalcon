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
    
    public void II(int valor){
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
    
    public void mostrarTodo(){
        Nodo aux = new Nodo();
        aux = Raiz;
        while(aux != null){
            System.out.print(aux.valor + " ");
            aux = aux.siguiente;
        }
        System.out.println("");
    }
    
    public void mostrarMedio(){
        int i = 0;
        Nodo aux = this.Raiz;
        while(aux != null){
            i++;
            aux = aux.siguiente;
        }
        int m;
        aux = this.Raiz;
        if(i % 2 == 0){
            m = i / 2;
            for(int j = 0; j < m-1; j++){
                aux = aux.siguiente;
            }
            System.out.println(aux.valor + " " + aux.siguiente.valor);
        }else{
            m = Math.round(i/2);
            for(int j = 0; j < m; j++){
                aux = aux.siguiente;
            }
            System.out.println(aux.valor);
        }
    }
    
    private void moda(int valor){
        this.A[valor]++;  
        if(this.A[valor] > this.mayor){
            this.mayor = this.A[valor];
            this.moda = valor;
        }
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
    
    public void IF(int valor){
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
    
    
    public void partirVoltear(){
        int i = 0,m;
        Nodo aux = this.Raiz;
        while(aux != null){
            i++;
            aux = aux.siguiente;
        }
        m = i / 2;
        
        aux = this.Raiz;
        Lista RA = new Lista();
        int j = 0;
        aux = this.Raiz;
        while(aux.siguiente != null){
            if(j < m)RA.IF(aux.valor);
            j++;
            aux = aux.siguiente;
        }
        aux.siguiente = RA.Raiz;
        aux = this.Raiz;
        for(j = 0; j < m; j++){
            aux = aux.siguiente;
        }
        this.Raiz = aux;
    }
    
    //Corregir
    public void IE(int valor, int pos){
        Nodo nuevo = new Nodo();
        nuevo.valor = valor;
        Nodo aux = this.Raiz;
        
        if(aux == null){
            this.Raiz = nuevo;
        }else{
            int i = 1;
            pos--;
            while(i < pos && aux.siguiente != null){
                aux = aux.siguiente;
                i++;
            }
            nuevo.siguiente = aux.siguiente;
            aux.siguiente = nuevo;
        }
        
    }
    
    public void reversaIterativa(){
        
    }
    
    public void eliminar(int valor){
        Nodo aux = this.Raiz;
        Nodo aux2;
        if(aux.valor == valor){
            this.Raiz = aux.siguiente;
        }else{
            aux2 = null;
            while(aux != null && aux.valor != valor){
                aux2 = aux;
                aux = aux.siguiente;
            }
            
            if(aux != null){
                aux2.siguiente = aux.siguiente;
            }
        }
    }
    
    public void mostrarUSUN(){
        Nodo aux = this.Raiz;
        boolean ck = true;
        while(aux != null){
            if(ck){
                System.out.println(aux.valor + " ");
            }
            ck = !ck;
            aux = aux.siguiente;
        }
    }
    
    public void mostrarUSASC(){
        Nodo aux = this.Raiz;
        boolean ck = true;
        int i = 0, j = 2;
        while(aux != null){
            if(ck){
                System.out.println(aux.valor + " ");
                ck = false;
            }
            if(i == j){
                ck = true;
                j++;
                i = 0;
            }else{
                i++; 
            }
            aux = aux.siguiente;
        }
    }
    
    public void EliminarUSUN(){
        Nodo aux = this.Raiz;
        Nodo aux2 = null;
        boolean ck = true;
        while(aux != null){
            if(ck){
                aux2.siguiente = aux.siguiente;
            }
            aux2 = aux;
            aux = aux.siguiente;
        }
    }
    
    public void ElimiarUSASC(){
        Nodo aux = this.Raiz;
        Nodo aux2 = null;
        boolean ck = true;
        int i = 0, j = 2;
        while(aux != null){
            if(ck){
                aux2.siguiente = aux.siguiente;
                ck = false;
            }
            if(i == j){
                ck = true;
                j++;
                i = 0;
            }else{
                i++; 
            }
            aux2 = aux;
            aux = aux.siguiente;
        }
    }
    
    public void afueraDentro(){
        
    }
    
    public void adentroFuera(){
        
    }
    
    public void Solo(){
        
    }
    
    private void promedio(int valor){
        this.i++;
        promedio += valor;
    }
    
    
}