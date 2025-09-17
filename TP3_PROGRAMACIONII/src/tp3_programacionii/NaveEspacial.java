package tp3_programacionii;

public class NaveEspacial {

    private String nombre;
    private int combustible;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

     public void despegar() {
        if (combustible >= 30) { //Para despegar necesita tener 10 unidades de combustible, aqui verifico eso
            combustible -= 30;
            System.out.println("3..2..1 Despegue!!");
        }else{
            System.out.println("El combustible es insuficiente para despegar");
        }
    }
     
     public void avanzar(int distancia) {
         if ((distancia * 2) > this.combustible) {
             System.out.println("No hay suficiente combustible para avanzar, debe recargar");
             
         }else {
             System.out.println("Nuestra nave avanzo " + distancia + " Kilometros");
             this.combustible -= (distancia * 2); 
         }
     }    

     public void recargarCombustible(int cantidad) {
     //recargaremos como maximo 100 unidades
        if (combustible + cantidad <= 100){
            combustible += cantidad; 
        }else {
            System.out.println("No se pudo recargar, ingrese una cantidad menor");
        }
     }    
     public void mostrarEstado(){
         System.out.println("La nave " + nombre + " tiene "  + combustible + " unidades de combustible");
}
     
}