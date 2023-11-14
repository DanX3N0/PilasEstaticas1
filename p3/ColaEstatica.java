public class ColaEstatica {

   private Persona colaEstatica[];
   private int inicio = 0;
   private int fin = 0;
   private int tamaño;
   //Constructor
   public ColaEstatica(int tamaño) {
      this.tamaño = tamaño;
      colaEstatica = new Persona[tamaño];
   }
   //Metodo push
   public void push(Persona persona) {
      colaEstatica[fin] = persona;
      fin++;
   } 
   //Metodo pop
   public Persona pop() {
      Persona personaARecuperar = colaEstatica[inicio];
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











