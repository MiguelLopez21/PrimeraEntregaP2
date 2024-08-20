package co.edu.uniquindio;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var empresaTransporte = new EmpresaTransporte();
        var propietario1 = new Propietario("Beta", "123456789", "beta@gmail.com", "31264589", 25);
        var propietario2 = new Propietario("Henao", "124797769", "henao@gmail.com", "31289", 50);
        var propietario3 = new Propietario("El bebe", "83759303", "elbebe@gmail.com", "31287689769", 42);
        var vehiculoTransporte1 = new VehiculoTransporte("TLQ222", "2024", "Mercedez", "Blanco", 30);
        var vehiculoTransporte2 = new VehiculoTransporte("PRQ123", "2015", "Bolbo", "Azul", 25);
        var vehiculoTransporte3 = new VehiculoTransporte("PQR444", "2022", "Nissan", "Amarillo", 20);
        var usuario1 = new Usuario("Sergio", 22, 78.5);
        var usuario2 = new Usuario("Miguel", 19, 60.5);
        var usuario3 = new Usuario("Juan", 29, 80.5);
        empresaTransporte.añadirPropietarios(propietario1);
        empresaTransporte.añadirPropietarios(propietario2);
        empresaTransporte.añadirPropietarios(propietario3);
        empresaTransporte.añadirVehiculoTransporte(vehiculoTransporte1);
        empresaTransporte.añadirVehiculoTransporte(vehiculoTransporte2);
        empresaTransporte.añadirVehiculoTransporte(vehiculoTransporte3);
        vehiculoTransporte2.añadirUsuarios(usuario1);
        vehiculoTransporte2.añadirUsuarios(usuario2);
        vehiculoTransporte2.añadirUsuarios(usuario3);
        empresaTransporte.añadirUsuario(usuario1);
        empresaTransporte.añadirUsuario(usuario2);
        empresaTransporte.añadirUsuario(usuario3);
        empresaTransporte.UsuariosEnElPeso(70.0);
        JOptionPane.showMessageDialog(null, empresaTransporte.getListUsuariosPeso());
        JOptionPane.showMessageDialog(null, "El numero de usuarios asociados al vehiculo con la respectiva placa es: " + empresaTransporte.buscarVehiculo("PRQ123"));
        JOptionPane.showMessageDialog(null, "El numero de propietarios mayores a 40 años es: " + empresaTransporte.propietariosMayores());
        JOptionPane.showMessageDialog(null, "El numero de usuarios entre el rango de edad es: " + empresaTransporte.rangoEdadUsuarios(20, 30));
    }
}