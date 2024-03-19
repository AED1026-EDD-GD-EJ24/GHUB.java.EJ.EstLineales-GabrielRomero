package miPrincipal;

public class Cola<T>{
//Atributo cabeza que apunta al primer elemento de la cola
private Nodo<T> cabeza;
//Atributo cola que apunta al primer elemento de la cola
private Nodo<T> cola;
//ALmacena el total de elementos de la cola
private int tamanio;
  //Constructor por defecto  
public Cola(){
    cabeza=null;
    cola=null;
    tamanio=0;
    }
//Devuelva el total de elementos de la cola
public int getTamanio(){
    return tamanio;
}
//Verificar si la cola esta vacia
public boolean esVacia(){
    return(cabeza == null);
}
//Encolar el elemento nuevo
public void encolar(T valor){
    //crear un nuevo nodo
    Nodo<T> nuevo = new Nodo<T>();
    //Fija el valor dentro del nodo
    nuevo.setValor(valor);
    if(esVacia()){
        //cabeza y cola apuntan al nodo nuevo
        cabeza=nuevo;
        cola=nuevo;
    }else{
        //se enlasa el campo siguiente con el nuevo elemento
        cola.setSiguiente(nuevo);
        //La nueva cola para a ser nuevo
        cola=nuevo;
    }
    //incrementa eñ tamanio por que hay un elemento en la cola
    tamanio++;
}
//Elimina el rpimer elemento de la cola
public void desencolar(){
    //Si no esta vacia
    if(!esVacia()){
        //Verificar si hay un solo elemento en la cola
        if(cabeza == cola){
            cabeza=null;
            cola=null;

        }else{
            //Se elimina el primer elemento de la cola
            //desplazando la cabeza al siguiente nodo
            cabeza = cabeza.getSiguiente();
        }
        //Se disminulle el total de elementos
        tamanio--;
    }

}

//Devuelve el primer elemento de la cola
public T frente(){
    if(!esVacia()){
        return cabeza.getValor();
    }else{
        return null;
    }
}

}