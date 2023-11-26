import java.util.Scanner;
public class P2 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int numeroPersonas = scan.nextInt();
      ColaEstatica colaA = new ColaEstatica(numeroPersonas);

      while(!colaA.isFull()) {
         int edad = scan.nextInt();
         colaA.push(edad);
      }

      int contadorMenores = 0;
      int contadorMayores = 0;

      while(!colaA.isEmpty()) {
         int dato = colaA.pop();

         if(dato >= 5 && dato <= 10) contadorMenores++;
         else contadorMayores++;

      }

      System.out.println("Boleto 1: " + contadorMenores);
      System.out.println("Boleto 2: " + contadorMayores);
      int gananciaTotal = contadorMenores * 10 + contadorMayores * 20; 
      System.out.println("Ganancia Total: " + gananciaTotal);
   }
}
