public class ListaEnlazadaSimple {

   public Nodo primero;//puntero
   public int tamañoDeLaLista;

   public ListaEnlazadaSimple() { 
      this.primero = null;
      this.tamañoDeLaLista = 0;
   }

   public void add(String nombreAInsertar) {
      Nodo nuevoNodo = new Nodo(nombreAInsertar);//PASO 1
      nuevoNodo.siguiente = primero;//PASO 2
      primero = nuevoNodo;// PASO 3
      tamañoDeLaLista++;
   }
   
   public void remove() {
      primero = primero.siguiente;
      this.tamañoDeLaLista--;
   }

   public void eliminacionPorBusqueda(String elementoABorrar) {
      if(elementoABorrar.equals(primero.nombre)) {
         remove();
      }else {
         Nodo aux = primero;
         while(aux.siguiente != null) { 
            if(aux.siguiente.nombre.equals(elementoABorrar)) {
               aux.siguiente = aux.siguiente.siguiente;
            }
            aux = aux.siguiente;
         }  
      }
      this.tamañoDeLaLista--;
   }

   public void show() {
      Nodo aux = primero;
      while(aux != null) { 
         System.out.println(aux.nombre);
         aux = aux.siguiente;
      }
   }
      
   public int getTamaño() {
      return this.tamañoDeLaLista;
   }

}
