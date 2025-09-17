
package tp3_programacionii;

public class Gallina {
    private String idGallina;
    private int edad;
    private int huevosPuestos;

//getters y setters

    public String getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(String idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
   public void ponerHuevo() {
       huevosPuestos += 1;
   }
   
   public void envejecer() {
       edad += 1;
       
   }
   
   public void mostarEstado(){
       System.out.println("La gallina con ID: " + idGallina + " tiene " + edad + " años y puso " + huevosPuestos + " huevos");
   }
   
}
