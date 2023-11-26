public class PilaEstatica {
   //PASO 1 ATRIBUTOS
   int tamaño; 
   int tope = -1;
   int pila[];
   //PASO 2 CONSTRUCTOR
   public PilaEstatica(int tamaño) {
      this.tamaño = tamaño;
      pila = new int[tamaño];
   }
   //PASO 3 METODOS
   //-> METODO PUSH (insertar datos)
   public void push(int elementoAInsertar) {
      tope++;
      pila[tope] = elementoAInsertar;
   }
   //-> METODO POP (eliminar o recuperar datos)
   public int pop() {
      int elementoARecuperar = pila[tope];
      tope--;
      return elementoARecuperar;
   }
   //-> METODO ESTAVACIO? (comprabar si la pila esta vacia)
   public boolean isEmpty() {
      if(tope == -1) return true;
      return false;
   }
   //-> METODO ESTALLENO? (comprueba si la pila esta llena)
   public boolean isFull() {
      if(tope == tamaño - 1) return true;
      return false;
   }

}
