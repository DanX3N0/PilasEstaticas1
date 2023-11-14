public class Main {
   public static void main(String[] args) {
      
      int numeroDePersonas = 20;
      ColaEstatica colaA = new ColaEstatica(numeroDePersonas);
      String[] nombres = {"ALVIN", "B", "C", "D", "E", "F",
                          "G", "H", "I", "JOSUE", "K", "LUIS",
                          "M", "N", "O", "P", "Q", "R",
                          "S", "T"};

      for(int i = 0; i < numeroDePersonas; i++) {
         int edad = (int)(Math.random() * 150);
         String nombre = nombres[i];
         Persona persona = new Persona(nombre,edad);
         System.out.println(persona.getNombre() + "--" + persona.getEdad());
         colaA.push(persona);
      }
      ColaEstatica cola1 = new ColaEstatica(numeroDePersonas);
      ColaEstatica cola2 = new ColaEstatica(numeroDePersonas);
      ColaEstatica cola3 = new ColaEstatica(numeroDePersonas);

      //CLASIFICACION DE PERSONAS SEGUN SU EDAD
      while(!colaA.isEmpty()) {
         Persona persona = colaA.pop();
         if(persona.getEdad() >= 0 && persona.getEdad() <= 33) {
            cola1.push(persona);
         }else if(persona.getEdad() >= 34 && persona.getEdad() <= 66) {
            cola2.push(persona);
         }else {//67 - 150 años
            cola3.push(persona);
         }
      }

      System.out.println("COLA 1 ");
      while (!cola1.isEmpty()) {
         Persona persona = cola1.pop();
         System.out.println(persona.getNombre() + " - " + persona.getEdad());
      }
      System.out.println();
      System.out.println("COLA 2");
      while (!cola2.isEmpty()) {
         Persona persona = cola2.pop();
         System.out.println(persona.getNombre() + " - " + persona.getEdad());
      }
      System.out.println();
      System.out.println("COLA 3");
      while (!cola3.isEmpty()) {
         Persona persona = cola3.pop();
         System.out.println(persona.getNombre() + " - " + persona.getEdad());
      }


   }
}
