package miPrincipal;

public class Delimitadores{

    public boolean evaluacion(String cadena){
    Pila<String>pcaracteres= new Pila<String>();
    int i=0;
    boolean masElementosPorLeer = true;
    while (i<cadena.length() && masElementosPorLeer){
        char car = cadena.charAt(i);
        String s = charToString(car);
        i++;
        switch(car){
            //en caso de apilar se da cuanto el caracter sea un operador de apertura
            // ( [ { /*
                case '(':
                    pcaracteres.apilar(charToString( ')' ));
                        break;
                case '[':
                    pcaracteres.apilar(charToString( ']' ));
                        break;
                case '{':
                    pcaracteres.apilar(charToString( '}' ));
                        break;
                case '/':
                    //Verificar si el siguientes es un *
                if(siguienteEsAsterisco(cadena, i) ){
                    pcaracteres.apilar(charToString('/') );
                    i++;
                }
                        break;
                //para desapilar cuando el caracter leido sea
                // ) ] } */
                case ')':
                case ']':
                case '}':
                {
                    //Comparar que corresponda
                    String aux = pcaracteres.cima();
                    if(aux !=null){
                        if(s.compareTo(aux)==0){
                            //hay correspondencia y por lo tanto lo elimino
                            pcaracteres.retirar();
                        }
                        else{
                            //Ya no tiene caso seguir leyendo
                            //ya la evaluacion esta determinada en falso
                            //es decir la exprecion es incorrecta
                            masElementosPorLeer = false;
                        }
                    }
                    break;
                }
                case '*':
                     if(siguienteEsDiagonal(cadena,i) ){
                         pcaracteres.retirar();
                        i++;
                        }
                          break;

        }

    }
    if(pcaracteres.esVacia() && masElementosPorLeer ){
        return true;
    }
    else {
        return false;
    }

    }//Termina metodo

    private static String charToString(char ch){
        return String.valueOf(ch);
    }
    private static boolean siguienteEsAsterisco(String cadena,int posicion){
        char car = cadena.charAt(posicion);
        if(car=='*') return true;
        else return false;

    }
    private static boolean siguienteEsDiagonal(String cadena,int posicion){
        char car = cadena.charAt(posicion);
        if(car=='/') return true;
        else return false;
    }

}