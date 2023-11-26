import java.util.Scanner;
public class P1 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int numeroDeContenedores = scan.nextInt();
      PilaEstatica pilaA = new PilaEstatica(numeroDeContenedores);
      
      while(!pilaA.isFull()) {
         int contedor = scan.nextInt();
         pilaA.push(contedor);
      }

      int arreglo[] = new int[numeroDeContenedores];
      for(int i = 0; i < numeroDeContenedores; i++) {
         int dato = pilaA.pop();
         arreglo[i] = dato;
      }

      int datoCorrecto = arreglo[0];
      for(int i = 0; i < arreglo.length; i++) {
         if(datoCorrecto != arreglo[i]) {
            arreglo[i] = datoCorrecto;
            break;
         }
         datoCorrecto--;
      }

      for(int i = arreglo.length - 1; i >= 0; i--) { 
         pilaA.push(arreglo[i]);
      }

      PilaEstatica pilaB = new PilaEstatica(numeroDeContenedores);

      System.out.println("IMPRESION DE LA PILA");
      while(!pilaA.isEmpty()) {
         pilaB.push(pilaA.pop());
      }

      while(!pilaB.isEmpty()) {
         System.out.print(pilaB.pop() + " ");
      }









   }
}
