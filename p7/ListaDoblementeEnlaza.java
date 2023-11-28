public class ListaDoblementeEnlaza {
   
   Nodo inicio;
   Nodo fin;
   int tamaño;

   public ListaDoblementeEnlaza() {
      this.inicio = null;
      this.fin = null;
      this.tamaño = 0;
   }

   public void addLeft(int dato) {
      Nodo nuevoNodo = new Nodo(dato); // PASO 1
      
      if(inicio == null && fin == null) {//LISTA VACIA
         inicio = nuevoNodo;
         fin = nuevoNodo;
      }else {
         nuevoNodo.siguiente = inicio; // PASO 2
         inicio.anterior = nuevoNodo; // PASO 3
         inicio = nuevoNodo; // PASO 4
      }
      tamaño++;
   }

   public void addRight(int dato) {
      Nodo nuevoNodo = new Nodo(dato); // PASO 1
      
      if(inicio == null && fin == null) {//LISTA VACIA
         inicio = nuevoNodo;
         fin = nuevoNodo;
      }else {
         nuevoNodo.anterior = fin; // PASO 2
         fin.siguiente = nuevoNodo; // PASO 3
         fin = nuevoNodo; // PASO 4
      }
      tamaño++;
   } 

   public int getTamaño() { return this.tamaño; }

   public void removeLeft() {
      this.inicio = inicio.siguiente;
      inicio.anterior = null;
      tamaño = tamaño - 1;
   }

   public void removeRight() {
      this.fin = fin.anterior;
      fin.siguiente = null;
      tamaño--;
   }

   public void removeBySearch(int datoAEliminar) {
      if(datoAEliminar == inicio.dato) {
         removeLeft();
      }else if(datoAEliminar == fin.dato) {
         removeRight();
      } else {
         Nodo aux = inicio;
         while(aux != null) {
            if(aux.dato == datoAEliminar) {
               break;
            }   
            aux = aux.siguiente;
         }

         if(aux == null) {
            System.out.println("No se encontro el elemento.");
         }else {
            Nodo nodoAnterior = aux.anterior;
            Nodo nodoSiguiente = aux.siguiente;
            nodoAnterior.siguiente = nodoAnterior.siguiente.siguiente;
            nodoSiguiente.anterior = nodoSiguiente.anterior.anterior;
         }

      }
   }

   public void mostarListaIzqDer() {
      Nodo aux = inicio;
      System.out.print("Lista: ");
      while(aux != null) {
         //---
         if(aux.siguiente == null)
            System.out.println(aux.dato);
         else
            System.out.print(aux.dato + " - ");
         //---
         aux = aux.siguiente;
      }
   }

   public void mostarListaDerIzq() {
      Nodo aux = fin;
      while(aux != null) {
         //---
         System.out.println(aux.dato);
         //---
         aux = aux.anterior;
      }
   }

}
















