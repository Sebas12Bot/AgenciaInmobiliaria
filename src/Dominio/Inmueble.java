package Dominio;

public abstract class Inmueble {
    protected String codigo;
    protected String direccion;
    protected long valorVenta;
    protected long valorArriendo;
    protected boolean arrendado;

    @Override
    public String toString() {
        return "{" +
                "codigo=" + codigo +
                "direccion='" + direccion + '\'' +
                ", valorVenta=" + valorVenta +
                ", valorArriendo=" + valorArriendo +
                ", arrendado=" + arrendado +
                '}';
    }

    public String getCodigo() {
        return codigo;
    }
}
