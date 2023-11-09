public class PilaEstatica {
   
   private int tope = -1;
   private String pila[];
   private int tamaño;
   //CONSTRUCTOR
   public PilaEstatica(int tamaño) {
      this.tamaño = tamaño;
      pila = new String[tamaño];
   }
   //METODOS DE LA PILA
   //PUSH
   public void push(String dato) {
      tope++;
      pila[tope] = dato;
   }
   //POP
   public String pop() {
      String elementoARecuperar = pila[tope];
      tope--;
      return elementoARecuperar;
   }
   //ESTA VACIO?
   public boolean isEmpty() {
      if(tope == -1) return true;
      return false;
   }
   //ESTA LLENO?
   public boolean isFull() {
      if(tope == tamaño - 1) return true;
      return false;
   }

}










