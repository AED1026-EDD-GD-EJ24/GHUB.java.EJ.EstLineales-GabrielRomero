package miPrincipal;

import java.util.Scanner;

public class Principal {
    
      public static void main(String[] args) throws Exception {
        Scanner consola = new Scanner(System.in);
        int opc =0;
        do{
            System.out.println("*************************");
            System.out.println("   Estructura lineales   ");
            System.out.println("*************************");
            System.out.println("1)  Pila");
            System.out.println("2)  Stack");
            System.out.println("3)  Delimitadores");
            System.out.println("4)  ");
            System.out.println("5)  ");
            System.out.println("6)  ");
            System.out.println("7)  ");
            System.out.println("8)  ");

            System.out.println("0) SALIR");
            System.out.print("Selecciona opción:");
            opc=consola.nextInt();

            switch (opc){
            case 1:
               DemoPila.menu();
               break;
            case 2:
               DemoStack.menu();
               break;
            case 3:
               DemoDelimitadores.menu();
               break;
            case 4:
               
               break;
            case 0:
               System.out.println("ADIOS!");
               consola.close();
               break;
               

            default:
               System.out.println("Valor incorrecto, intente de nuevo!");

        }
       
    }while (opc != 0);
		
    }


}
