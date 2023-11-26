import java.util.Scanner;
public class Pregunta2 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      int n = scan.nextInt();
      ColaEstatica colaA = new ColaEstatica(n);
      while(!colaA.isFull()) {
         int edadPersona = scan.nextInt();
         colaA.push(edadPersona);
      }
      int contadorMenores = 0;
      int contadorMayores = 0;

      while(!colaA.isEmpty()) {
         int dato = colaA.pop();
         if(dato >= 5 && dato <= 10) contadorMenores++;
         else contadorMayores++;
      }

      int gananciaTotal = (contadorMenores * 10) + (contadorMayores * 20);
      System.out.println("Boleto 1 : " + contadorMenores);
      System.out.println("Boleto 2 : " + contadorMayores);
      System.out.println("Ganancia Total : " + gananciaTotal + " Bs.");

   }
}
