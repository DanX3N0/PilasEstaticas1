import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      int n = scan.nextInt();
      PilaEstatica pila = new PilaEstatica(n);
      PilaEstatica pilaB = new PilaEstatica(n);

      for (int i = 0; i < n; i++) {
         int contenedor = scan.nextInt();
         pila.push(contenedor);
      }
      // VERIFICAR SI EL PRIMER ELEMENTO ES CORRECTO
      int aux = pila.pop();
      int aux2 = pila.pop();// Segundo contendor

      if (aux - aux2 != 1) {

         int aux3 = pila.pop();
         if (aux - aux3 == 2) {
            // Segundo contendor esta mal
            pila.push(aux3);
            pila.push(aux3 + 1);
            pila.push(aux);
         } else {
            // Primer contenedor esta mal
            pila.push(aux3);
            pila.push(aux2);
            pila.push(aux2 + 1);
         }

      } else {
         while (!pila.isEmpty()) {
            int dato = pila.pop();

            if (aux - dato == 1) {
               pilaB.push(dato);
            } else {
               pila.push(aux - 1);
               while (!pilaB.isEmpty()) {
                  pila.push(pilaB.pop());
               }
            }
            aux = dato;
         }
      }

      while (!pila.isEmpty()) {
         System.out.println(pila.pop());
      }

   }
}
