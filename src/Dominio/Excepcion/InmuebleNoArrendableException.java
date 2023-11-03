package Dominio.Excepcion;

public class InmuebleNoArrendableException extends RuntimeException {
    public InmuebleNoArrendableException (){
        super("El inmueble aun no esta arrendado");
    }
}
