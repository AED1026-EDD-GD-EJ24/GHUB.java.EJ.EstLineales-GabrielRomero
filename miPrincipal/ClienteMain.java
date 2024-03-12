package miPrincipal;

public class ClienteMain{

    public static void main(String[] args) {
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
        
    }
}