package Dominio;

public class Apartamento extends Inmueble implements Arrendable, Hipotecable {

    private boolean hipotecado;

    @Override
    public void arrendar() {
        this.arrendado = true;
    }

    @Override
    public void devolver() {
        this.arrendado = false;
    }

    @Override
    public void hipotecar() {
        if (!this.arrendado) {
            this.hipotecado = true;
            System.out.println("El apartamento se ha hipotecado.");
        } else {
            System.out.println("No se puede hipotecar un inmueble arrendado.");
        }
    }

    @Override
    public boolean estaHipotecado() {
        return hipotecado;
    }

    @Override
    public String toString() {
        System.out.println("Apartamento");
        return super.toString();
    }
}
