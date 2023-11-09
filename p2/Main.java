import java.util.Scanner;
public class Main{
   public static void main(String[] args) {
      /*//INSERCION DE DATOS
      while(!pila.isFull()) {
         char caracter = scan.next().charAt(0);
         pila.push(caracter);
      }
      //Salida de datos
      System.out.println("==============================");
      while(!pila.isEmpty()) {
         System.out.println(pila.pop());
      }*/
      Scanner scan = new Scanner(System.in);
      int tamaño = scan.nextInt();
      PilaEstatica pila = new PilaEstatica(tamaño);
      PilaEstatica pilaAuxliar = new PilaEstatica(tamaño);
      //INSERCION DE DATOS
      while(!pila.isFull()) {
         int numero = scan.nextInt();
         pila.push(numero);
      }
      if(tamaño % 2 == 0) {//par
         for(int i = 0; i < tamaño / 2 - 1; i++) {
            int dato = pila.pop();
            pilaAuxliar.push(dato);
         }
         pila.pop();
         pila.pop();
         while(!pilaAuxliar.isEmpty()) {
            pila.push(pilaAuxliar.pop());
         }
      }else {//impar
         for(int i = 0; i < tamaño / 2; i++) {
            int dato = pila.pop();
            pilaAuxliar.push(dato);
         }
         pila.pop();
         while(!pilaAuxliar.isEmpty()) {
            pila.push(pilaAuxliar.pop());
         }
      }
      int idx = 0;
      while(!pila.isEmpty()) {
         System.out.println(idx++ + " -> " + pila.pop());
      }
   }
}












