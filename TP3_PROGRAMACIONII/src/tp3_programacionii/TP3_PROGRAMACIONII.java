package tp3_programacionii;

import java.util.HashSet;
import java.util.Set;

public class TP3_PROGRAMACIONII {

    public static void main(String[] args) {
        System.out.println("TRABAJO PRÁCTICO 3 – POO");
        System.out.println("**********************************************");
        System.out.println("");

        // Llama a los métodos que ejecutan cada ejercicio
        System.out.println("");
        ejecutarEjercicio1();
        System.out.println("");
        ejecutarEjercicio2();
        System.out.println("");
        ejecutarEjercicio3();
        System.out.println("");
        ejecutarEjercicio4();
        System.out.println("");
        ejecutarEjercicio5();        
    }

    public static void ejecutarEjercicio1() {
        System.out.println("------------------------------------------------------");
        System.out.println("EJERCICIO 1 –  INSTANCIAR A UN ESTUDIANTE");
        System.out.println("------------------------------------------------------");

        // Se crea un objeto de la clase Estudiante
        Estudiante estudiante = new Estudiante();

        // Asigna valores a los atributos del objeto
        estudiante.setNombre("Natalia");
        estudiante.setApellido("Gutierrez");
        estudiante.setCurso("Comisión 8");
        estudiante.setCalificacion(8.50);

        // Se muestra la información cargada
        estudiante.mostrarInfo();

        // Incrementa la calificación 
        estudiante.subirCalificacion(1.5);
        
        System.out.println("*********CALIFICACION LUEGO DEL INCREMENTO**************");

        // Muestra la nueva nota  del estudiante
        estudiante.mostrarInfo();

        // Reduce la calificación
        estudiante.bajarCalificacion(0.5);

        System.out.println("*********CALIFICACION LUEGO DE LA DISMINUCION***********");        
        // Muestra la informacion actualizada del estudiante
        estudiante.mostrarInfo();
        
    }

    public static void ejecutarEjercicio2() {

        System.out.println("------------------------------------------------------");
        System.out.println("EJERCICIO 2 – MASCOTA");
        System.out.println("------------------------------------------------------");

         // Crea un objeto de la clase Mascota
          Mascota mascota = new Mascota();

           // Asigna valores a los atributos del objeto
         mascota.setNombre("Dhai");
         mascota.setEspecie("Perro");
         mascota.setEdad(11);

         // Muestra la información actual de la mascota
        mascota.mostrarInfo();

        // Incrementa la edad en 1 año
        mascota.cumplirAnios();
        // Muestra la información actualizada de la mascota
        System.out.println("*********EDAD INCREMENTADA EN UN AÑO**************");
  
        mascota.mostrarInfo();
        // Incrementa la edad en otro año
        mascota.cumplirAnios();

         // Muestra la información actualizada de la mascota
        System.out.println("*********EDAD INCREMENTADA EN UN AÑO MAS**************");
        mascota.mostrarInfo();
        System.out.println("");
}
         public static void ejecutarEjercicio3() {
        System.out.println("------------------------------------------------------");   
        System.out.println("EJERCICIO 3 – LIBRO");
        System.out.println("------------------------------------------------------");   

        // Creamos un objeto de la clase Libro
        // Crea un objeto de la clase Libro
        Libro libro = new Libro();

        // Asigna valores a los atributos del objeto
        libro.setTitulo("Muchas vidas, Muchos maestros");
        libro.setAutor("Brian Weiss");
  
        // Intentamos asignar un año inválido
        libro.setAnioPublicacion(-1967);
        libro.mostrarInfo();
        System.out.println("-------------------");
        // Intenta asignar un año válido
        libro.setAnioPublicacion(1993);

        // Muestra la información final del libro
        libro.mostrarInfo();

        System.out.println("");

    }

        public static void ejecutarEjercicio4() {
        System.out.println("------------------------------------------------------");   
        System.out.println("EJERCICIO 4 – GALLINAS");
        System.out.println("------------------------------------------------------");   

        // Creamos objetos de la clase Gallina
        Gallina gallina1 = new Gallina();
        // Asigna valores a los atributos del objeto
        gallina1.setIdGallina("Turuleca 1");
        gallina1.setEdad(2);
        gallina1.setHuevosPuestos(0);
  
        Gallina gallina2 = new Gallina();
        // Asigna valores a los atributos del objeto
        gallina2.setIdGallina("Turuleca 2");
        gallina2.setEdad(1);
        gallina2.setHuevosPuestos(3);
    
     
        System.out.println("------ESTADO INICIAL DE LAS GALLINAS-----");
        gallina1.mostarEstado();
        gallina2.mostarEstado();

        //llamamos varais veces a los metodos envejecer y poner_Huevo

        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();

        gallina1.envejecer();
        gallina1.envejecer();
        gallina2.envejecer();
        gallina2.envejecer();

         System.out.println("------ESTADO FINAL DE LAS GALLINAS-----");
        gallina1.mostarEstado();
        gallina2.mostarEstado();

        }

         public static void ejecutarEjercicio5() {
        System.out.println("------------------------------------------------------");   
        System.out.println("EJERCICIO 5 – NAVE ESPACIAL");
        System.out.println("------------------------------------------------------");   
        System.out.println("");

        // Creamos objetos de la clase NaveEspacial
        NaveEspacial nave = new NaveEspacial();
        nave.setNombre("Galactica 2.0");
        nave.setCombustible(50);

          System.out.println("--------ESTADO INICIAL DE LA NAVE-------");
          nave.mostrarEstado();
          nave.despegar();
          System.out.println("----------------------------------");
          nave.mostrarEstado();
          System.out.println("----------------------------------");
          System.out.println("");

    // intenamos que la nave avance

         System.out.println("---SE INTENTARA AVANZAR 35 KM-----");
          nave.avanzar(35);
          System.out.println("----------------------------------");
          nave.mostrarEstado();

          System.out.println("---RECARGANDO COMBUSTIBLE---------");
          nave.recargarCombustible(80);
          nave.mostrarEstado();
          System.out.println("---------------------------------");      

          System.out.println("---RECARGANDO COMBUSTIBLE");
          nave.recargarCombustible(40);
          nave.mostrarEstado();
          System.out.println("---------------------------------");      

          System.out.println("---SE INTENTARA AVANZAR 15 KM");
          nave.avanzar(15);
          System.out.println("----------------------------------");
          nave.mostrarEstado();
     }
}