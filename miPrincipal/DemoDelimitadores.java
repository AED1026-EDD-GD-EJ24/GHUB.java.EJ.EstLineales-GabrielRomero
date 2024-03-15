package miPrincipal;

public class DemoDelimitadores{

    public static void menu(){
        System.out.println("*************************");
        System.out.println("      Delimitadores      ");
        System.out.println("*************************");
        Delimitadores objDel = new Delimitadores();
      //  String expr = "(a+b)/2";
       String expr = "while (m<(n[8]+0)){ "+
                "int p=7 "+
                "/*comentarios*/"+
                "               }"; 
        if(objDel.evaluacion(expr)){
            System.out.println("Exprecion correcta");
        }
        else{
            System.out.println("Exprecion incorrecta"); 
        }
        expr= "while (m<(n[8]+o)) { "+
              "int p=7; "+
              "/*comentarios*/";
        if (objDel.evaluacion(expr)){
            System.out.println("Expresión correcta");
        }
        else{
            System.out.println("Expresión Incorrecta");
        }

    }

}