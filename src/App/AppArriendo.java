package App;


import Dominio.Agencia;
import Dominio.Apartamento;
import Dominio.Casa;
import Dominio.Lote;

import java.util.List;

public class AppArriendo {
    public static void main(String[] args) {
        Casa casa = new Casa();
        Apartamento apartamento = new Apartamento();
        Lote lote = new Lote();

        Agencia agencia = new Agencia("♠La Agencia♠", List.of(casa, apartamento, lote));

        agencia.agregarInmueble(casa);
        agencia.agregarInmueble(apartamento);
        agencia.agregarInmueble(lote);

        agencia.hipotecarInmueble("1");
        agencia.hipotecarInmueble("codigoCasa");
        agencia.hipotecarInmueble("codigoApartamento");

        agencia.arrendar(casa);
        agencia.arrendar(lote);

        agencia.agregarInmueble(apartamento);

        System.out.println(agencia.getArrendablesDisponibles());
    }
}