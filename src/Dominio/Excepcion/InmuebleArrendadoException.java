package Dominio.Excepcion;

public class InmuebleArrendadoException extends RuntimeException{
    public InmuebleArrendadoException () {
        super("Inmueble arrendado");
    }
}
