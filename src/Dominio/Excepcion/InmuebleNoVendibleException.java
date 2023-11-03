package Dominio.Excepcion;

public class InmuebleNoVendibleException extends RuntimeException {
    public InmuebleNoVendibleException () {
        super("No se puede vender por que esta arrendado");
    }
}
