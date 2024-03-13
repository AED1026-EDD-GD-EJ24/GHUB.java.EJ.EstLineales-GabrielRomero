package miPrincipal;

import java.util.Stack;

public class DemoStack {
    public static void menu() {
        System.out.println("*************************");
        System.out.println("          Stack          ");
        System.out.println("*************************");

        Stack<Integer> pila = new Stack<>();
        //Apilar algunos datos
        //APilar elemento
        pila.push(2);
        pila.push(5);
        pila.push(7);
        pila.push(10);
        //Concultar la posicion del elemento
        System.out.println("Posicion de elementos buscado 2 :"+pila.search(2));
        System.out.println("Posicion de elementos buscado 10 :"+pila.search(10));
        System.out.println("Posicion de elementos buscado 3 :"+pila.search(3));
        //Consultar el elemento de la cima
        System.out.println("El elemento del tope = "+pila.peek());
        //Desapilamos
        pila.pop();
        System.out.println("El elemento del tope ="+pila.peek());
        pila.pop();
        System.out.println("El elemento del tope ="+pila.peek());
        pila.pop();
        System.out.println("El elemento del tope ="+pila.peek());
        pila.pop();
    }
}
