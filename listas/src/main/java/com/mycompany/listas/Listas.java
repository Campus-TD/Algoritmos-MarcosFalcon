package com.mycompany.listas;

public class Listas {

    static String[] menu = {
        "1.-Insertar nodo al inicio",
        "2.-Mostrar lista",
        "3.-Imprimir promedio",
        "4.-Insertar ultimo",
        "5.-Moda imprimir",
        "6.-Imprimir par",
        "7.-Imprimir impar",
        "8.-Finalizar"
            
    };
    static Lista lista = new Lista();
    
    public static void main(String[] args) {
        String op;
        do{
            Libreria.mostrarMenus(menu);
            op = Libreria.validarString("Ingrese una opcion");
            
            switch(op){
                case "1" -> insertarInicio();
                case "2" -> lista.mostrarLista();
                case "3" -> System.out.println(lista.getPromedio());
                case "4" -> insertarFinal();
                case "5" -> System.out.println(lista.getModa());
                case "6" -> lista.mostrarPar();
                case "7" -> lista.mostrarImpar();
                case "8" -> System.out.println("Finalizado");
            }
        }while(!op.equals("8"));
    }
    
    public static void insertarInicio(){
        int valor = Libreria.validarInt("Ingrese el valor que tendra el nodo");
        lista.addNodoI(valor);
    }
    
    public static void insertarFinal(){
        int valor = Libreria.validarInt("Ingrese el valor que tendra el nodo");
        lista.addNodoF(valor);
    }
}

