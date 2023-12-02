import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      ListaSimple lista = new ListaSimple();
      while(true) {
         menu();
         System.out.println("Ingrese la opcion:");
         int opcion = scan.nextInt();
         if(opcion == 1) { 
            System.out.println("Ingrese el dato:");
            int dato = scan.nextInt();
            lista.insertarInicio(dato);
         } else if(opcion == 2) {
            System.out.println("Ingrese un dato:");
            int dato = scan.nextInt();
            lista.insertarFinal(dato);
         } else if(opcion == 3) {
            System.out.println("La Lista es: ");
            lista.mostrarLista();
         } else if(opcion == 4) {
            lista.contarElementos();
         } else if(opcion == 5) {
            System.out.println("Ingrese el dato a eliminar:");
            int dato = scan.nextInt();
            lista.eliminarElementos(dato);
         } else if(opcion == 6) {
            System.exit(0);
         } else {
            System.out.println("Numero no valido.");
         }
      }

   }

   public static void menu() {
      System.out.println("1.- Insertar al Inicio.");
      System.out.println("2.- Insertar al Final.");
      System.out.println("3.- Mostrar Lista.");
      System.out.println("4.- Contar Elementos.");
      System.out.println("5.- Eliminar elementos.");
      System.out.println("6.- Finalizar el programa.");
   }

}
