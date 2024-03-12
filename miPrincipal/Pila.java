package miPrincipal;

public class Pila<T>{
    //Atributo cabeza apunta al tope de la fila
    private Nodo<T> cabeza;
    //Almacena el total de elementos de la pila
    private int tamanio;
    //Constructor por defecto
    private Pila(){
        cabeza=null;
        tamanio=0;
    }
    //Devuelve el total de elmentos de la pila
    public int getTamanio(){
        return tamanio;
    }
        //Verifica si la fila esta vacia
    public boolean esVacia(){
        return(cabeza == null);
    }
    public void apilar(T valor){
        //crear un nuevo nodo
        Nodo<T> nuevo = new Nodo<T>();
        //Fijar el valor dentro de nodo
        nuevo.setValor(valor);
        if(esVacia()){
            //cabeza apunta al nuevo nodo
            cabeza = nuevo;
        }else{
            //se enlaza el campo siguiente de nuevo con la cabeza
            nuevo.setSiguiente(cabeza);
            //la nueva cabeza de la pila pasa a ser nuevo
            cabeza = nuevo;
        }
        //inrementar al tamaño por que hay un nuevo elemento en la pila
        tamanio++;

        }
        //Eliminar un elemento de la pila
        public void retirar(){
            if(!esVacia()){
                cabeza = cabeza.getSiguiente();
                tamanio--;


            }
        }
        //Devuelve el elemento almasenado en el tope de la cima
        public T cima(){
            if(!esVacia()){
                return cabeza.getValor();
            }else{
                return null;
            }
        }


    }
