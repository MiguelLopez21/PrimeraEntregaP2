package co.edu.uniquindio;

import org.junit.Test;

import java.util.logging.Logger;


public class EmpresaTransporteTest {
    public static final Logger LOGGER = Logger.getLogger(EmpresaTransporteTest.class.getName());

    @Test
    public void crearPropietario (){
        LOGGER.info("Iniciando propietario");
        var propietario = new Propietario("Val", "123456", "val@gmail.com", "123456");
        var vehiculo = new VehiculoCarga("12442", "nincdiocn", "sncuoe", "jasbc", 12, 2);
        propietario.añadirVehiculo(vehiculo);
        System.out.println(propietario);
    }

}