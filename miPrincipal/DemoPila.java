package miPrincipal;

public class DemoPila{

    public static void menu() {
        System.out.println("*************************");
        System.out.println("           Pila          ");
        System.out.println("*************************");
        //crear una nueva pila de entero
        Pila<Integer> pila = new Pila<Integer>();
        //apilar algunos datos enteros
        pila.apilar(2);
        pila.apilar(5);
        pila.apilar(7);
        System.out.println("El tope de la fila es "+pila.cima());
        //Se desapila
        pila.retirar();
        System.out.println("El tope de la fila es "+pila.cima());
        //se desapila
        pila.retirar();
        System.out.println("El tope de la pilar es "+pila.cima());
    }
}