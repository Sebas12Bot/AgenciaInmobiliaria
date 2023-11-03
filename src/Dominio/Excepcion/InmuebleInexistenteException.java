package Dominio.Excepcion;

public class InmuebleInexistenteException extends RuntimeException{
    public InmuebleInexistenteException (){
        super("El inmueble buscado es inexistente");
    }
}
