public class ListaSimple {
   
   Nodo primero;
   int tamaño;

   public ListaSimple() {
      this.primero = null;
      this.tamaño = 0;
   }
   // 1)
   public void insertarInicio(int dato) {
      Nodo nuevoNodo = new Nodo(dato);
      nuevoNodo.siguiente = primero;
      primero = nuevoNodo;
      tamaño++;
   }

   // 2)
   public void insertarFinal(int dato) {
      Nodo aux = primero;
      while(aux.siguiente != null) { aux = aux.siguiente; }
      Nodo nuevoNodo = new Nodo(dato);
      aux.siguiente = nuevoNodo;
      tamaño++;
   }

   // 3)
   public void mostrarLista() {
      Nodo aux = primero;
      while(aux != null) {
         //OPERACIONES
         if(aux.siguiente == null)
            System.out.println(aux.dato);
         else 
            System.out.print(aux.dato + " - ");
         //
         aux = aux.siguiente;
      }
   }

   //4) 
   public void contarElementos(){
      System.out.println(tamaño);
   }

   // 5)
   public void eliminarElementos(int datosAEliminar) {
      for(int i = 0; i < tamaño; i++) {
         eliminarPorBusqueda(datosAEliminar);
      }
   }

   public void eliminarInicio() {
      primero = primero.siguiente;
      tamaño--;
   }

   public void eliminarPorBusqueda(int datoAEliminar) {
      if(datoAEliminar == primero.dato) {
         eliminarInicio();
      }else {
         Nodo aux = primero;
         while(aux.siguiente != null) {
            //
            if(datoAEliminar == aux.siguiente.dato) {
               aux.siguiente = aux.siguiente.siguiente;
               tamaño--;
               break;
            }
            //
            aux = aux.siguiente;
         }
      }
   }

}
