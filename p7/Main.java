import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {
   public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
      ListaDoblementeEnlaza lista = new ListaDoblementeEnlaza();

      while(true) {
         menu();
         int opcion = scan.nextInt();
         switch(opcion) {
            case 1 -> { 
               System.out.println("Ingrese el dato a insertar:");
               int datoAInsertar = scan.nextInt();
               lista.addLeft(datoAInsertar);
            }
            case 2 -> { 
               System.out.println("Ingrese el dato a insertar:");
               int datoAInsertar = scan.nextInt();
               lista.addRight(datoAInsertar);
            }
            case 3 -> { lista.removeLeft(); }
            case 4 -> { lista.removeRight(); }
            case 5 -> { 
               System.out.println("Ingrese el dato a eliminar:");
               int datoAEliminar = scan.nextInt();
               lista.removeBySearch(datoAEliminar);
            }
            case 6 -> { System.out.println(lista.getTamaño()); }
            case 7 -> { lista.mostarListaIzqDer();}
            case 8 -> { 
               JOptionPane.showMessageDialog(null, "ERROR");
               System.exit(0); 
            }
            default -> { System.out.println("Ingrese un numero valido."); }
         }
      }


   }

   public static void menu() {
      System.out.println("1.- Añadir dato por la Izquierda.");
      System.out.println("2.- Añadir dato por la derecha.");
      System.out.println("3.- Remover por la Izquierda.");
      System.out.println("4.- Remover por la derecha.");
      System.out.println("5.- Remover por busqueda.");
      System.out.println("6.- Obtener el tamaño de la lista.");
      System.out.println("7.- Mostrar lista Izq-Der.");
      System.out.println("8.- Finalizar el programa.");
   }

}