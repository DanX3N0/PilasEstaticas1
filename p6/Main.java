import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
      Scanner scan = new Scanner(System.in);
      /*lista.add("Jherson + 10");
      lista.add("Josue");
      lista.add("Dara");
      lista.remove();
      lista.show();
      System.out.println("Tamaño de la lista: " + lista.getTamaño());*/
      while(true) {
         menu();
         int casoAEvaluar = scan.nextInt();
         switch (casoAEvaluar) {
            case 1 -> {
               String nombre = scan.next();
               lista.add(nombre);
            }
            case 2 -> { lista.remove(); }
            case 3 -> { System.out.println(lista.getTamaño()); }
            case 4 -> { 
                  String datoABorrar = scan.next();
                  lista.eliminacionPorBusqueda(datoABorrar);      
            }
            case 5 -> { lista.show(); }
            case 6 -> { System.exit(0); }
            default -> {System.out.println("La entrada no es valida.");}
         }
      }
   }

   public static void menu() {
      System.out.println("1.- Insertar dato.");
      System.out.println("2.- Eliminar dato");
      System.out.println("3.- Obtener tamaño de la lista.");
      System.out.println("4.- Eliminar un dato por busqueda");
      System.out.println("5.- Mostar la lista.");
      System.out.println("6.- Cerrar el programa.");
   }

}

