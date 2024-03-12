package miPrincipal;
public class Nodo<T>{
    //Atributo valor de tipo T. Almacena la reerencia al objeto que se aguarda en el nodo
    private T valor;
    //Referencia al siguiente nodo enlazado
    private  Nodo<T> siguiente;
    //constructor por defecto
    public Nodo(){
    valor=null;
    siguiente=null;
    }
    //Devuelve el valor
    public T getValor(){
        return valor;
    }
    //Modifica el valor
    public void setValor(T valor){
        this.valor=valor;
    }
    //Devuelve el atributo siguiente
    public Nodo<T> getSiguiente(){
        return siguiente;
    }
    //Modifica el atributo siguiente
    public void setSiguiente(Nodo<T> siguiente){
        this.siguiente=siguiente;
    }
}
