public class ColaEstatica {

   private int colaEstatica[];
   private int inicio = 0;
   private int fin = 0;
   private int tamaño;
   //Constructor
   public ColaEstatica(int tamaño) {
      this.tamaño = tamaño;
      colaEstatica = new int[tamaño];
   }
   //Metodo push
   public void push(int persona) {
      colaEstatica[fin] = persona;
      fin++;
   } 
   //Metodo pop
   public int pop() {
      int personaARecuperar = colaEstatica[inicio];
      inicio++;
      return personaARecuperar;
   }
   //Metodo EstaVacio?
   public boolean isEmpty() {
      if(inicio == fin) return true;
      return false;
   }
   //Metodo EstaLleno?
   public boolean isFull() {
      if(fin == tamaño) return true;
      return false;
   }
   //METODO RESETEO DE COLA
   public void reset() { 
      this.inicio = 0;
      this.fin = 0;
   }

}
