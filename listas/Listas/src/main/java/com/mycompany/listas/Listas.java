package com.mycompany.listas;

public class Listas {

    static String[] menu = {
        "\n1.-Insertar nodo al inicio",
        "2.-Mostrar lista",
        "3.-Imprimir promedio",
        "4.-Insertar ultimo",
        "5.-Moda imprimir",
        "6.-Imprimir par",
        "7.-Imprimir impar",
        "8.-Imprimir medio",
        "9.-Partir y voltear",
        "10.-Insertar en",
        "11.-Reversa (iterativa)(No terminado)",
        "12.-Reversa (recursiva)(No terminado)",
        "13.-Eliminar numero",
        "14.-Mostrar uno si uno no",
        "15.-Mostrar uno si dos no, uno si tres no..."
            
    };
    static Lista lista = new Lista();
    
    public static void main(String[] args) {
        String op;
        do{
            Libreria.mostrarMenus(menu);
            op = Libreria.validarString("Ingrese una opcion");
            
            switch(op){
                case "1" -> insertarInicio();
                case "2" -> lista.mostrarTodo();
                case "3" -> System.out.println(lista.getPromedio());
                case "4" -> insertarFinal();
                case "5" -> System.out.println(lista.getModa());
                case "6" -> lista.mostrarPar();
                case "7" -> lista.mostrarImpar();
                case "8" -> lista.mostrarMedio();
                case "9" -> lista.partirVoltear();
                case "10" -> insertarEn();
                case "13" -> eliminar();
                case "14" -> lista.mostrarUSUN();
                case "15" -> lista.mostrarUSASC();
            }
        }while(!op.equals("11"));
    }
    
    public static void insertarInicio(){
        int valor = Libreria.validarInt("Ingrese el valor que tendra el nodo");
        lista.II(valor);
    }
    
    public static void insertarFinal(){
        int valor = Libreria.validarInt("Ingrese el valor que tendra el nodo");
        lista.IF(valor);
    }
    
    public static void insertarEn(){
        int valor = Libreria.validarInt("Ingrese el valor que tendra el nodo");
        int pos = Libreria.validarInt("Ingrese la posicion a insertar el nodo");
        lista.IE(valor, pos);
    }
    
    public static void eliminar(){
        int valor = Libreria.validarInt("Ingrese el valor a eliminar");
        lista.eliminar(valor);
    }
}

