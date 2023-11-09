import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      /*int n = Integer.parseInt(scan.nextLine());
      for (int i = 0; i < n; i++) { 
         String dato = scan.nextLine();
         pilaA.push(dato);
      }*/
      //INSERCION DE DATOS
      
      int tamaño = Integer.parseInt(scan.nextLine());
      PilaEstatica pilaA = new PilaEstatica(tamaño);
      //insercion de datos
      while(!pilaA.isFull()) {
         String dato = scan.nextLine();
         pilaA.push(dato);
      }
      //voltear la pila
      String arreglo[] = new String[tamaño];

      for(int i = 0; i < tamaño; i++) {
         arreglo[i] = pilaA.pop();
      }

      for(int i = 0; i < tamaño; i++) { 
         String elemento = arreglo[i];
         pilaA.push(elemento);
      }

      while(!pilaA.isEmpty()) {
         System.out.println("Se retiro el elemento: " + pilaA.pop());
      }








   }
}








