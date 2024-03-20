package miPrincipal;
/*
 * La API de java tra implementada la cola mediante la interface 
 * java.util.Queue,como es una interface se requiere instanciar 
 * como un objeto en concreto,esta interfaz se puede implementar con la API colection de java:
 *  java.util.LinkedList
 * java.util.PriorityQueue
 * LinkedList es una aplicacion de cola estandar.
 * PriorityQueue es una cola de prioridades que almacena
 * sus elementos internos de acuerdo a un orden.
 * las operaciones basica de Queue son:
 * add(). inserta un elemento en la cola 
 * remove(). devuelve y remueve el primer elemento de la cola
 * peek(). devuelve el primer elemento de la cola y devuelve 
 *         null cuando la cola esta vacia
 */

import java.util.Queue;
import java.util.LinkedList;
public class Demoqueue {

    public static void menu(){
        System.out.println("*************************");
        System.out.println("           Queue         ");
        System.out.println("*************************");
        System.out.println();
        //Creamos una cola generica
        Queue micola = new LinkedList();
        //Agregar tres elementos a la cola
        micola.add("Elemento 0");
        micola.add("Elemento 1");
        micola.add("Elemento 2");
        //Muestra tres elementos de la cola en ese orden
        System.out.println("el primer elemnto de la cola es "+ micola.peek());
        //Eliminar el primer elemento de la cola
        micola.remove();
        //Muestra tres elementos de la cola en ese orden
        System.out.println("el primer elemnto de la cola es "+ micola.peek());
        micola.remove();
        //Muestra tres elementos de la cola en ese orden
        System.out.println("el primer elemnto de la cola es "+ micola.peek());
        micola.remove();
        //Muestra tres elementos de la cola en ese orden
        System.out.println("el primer elemnto de la cola es "+ micola.peek());
   

        
    }

}