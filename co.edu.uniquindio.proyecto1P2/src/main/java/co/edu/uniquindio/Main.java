package co.edu.uniquindio;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var empresaTransporte = new EmpresaTransporte();
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del propietario: ");
        String cedula = JOptionPane.showInputDialog("Ingrese la cedula del propietario: ");
        String email = JOptionPane.showInputDialog("Ingrese el email del propietario: ");
        String celular = JOptionPane.showInputDialog("Ingrese el celular: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Inguese la edad del propietario: "));
        var propietario0 = new Propietario(nombre, cedula, email, celular, edad);
        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehiculo: ");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehiculo: ");
        String marca = JOptionPane.showInputDialog("Ingrese la marca del vehiculo: ");
        String color = JOptionPane.showInputDialog("Ingrese el color del vehiculo: ");
        double capacidadCarga = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de carga del vehiculo: "));
        int numeroEjes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ejes del vehiculo: "));
        var vehiculoCarga1 = new VehiculoCarga(placa, modelo, marca, color, capacidadCarga, numeroEjes);
        propietario0.añadirVehiculo(vehiculoCarga1);
        JOptionPane.showMessageDialog(null, propietario0);
        var propietario1 = new Propietario("Beta", "123456789", "beta@gmail.com", "31264589", 25);
        var propietario2 = new Propietario("Henao", "124797769", "henao@gmail.com", "31289", 50);
        var propietario3 = new Propietario("El bebe", "83759303", "elbebe@gmail.com", "31287689769", 42);
        String placa1 = JOptionPane.showInputDialog("Ingrese la placa del vehiculo1: ");
        String modelo1 = JOptionPane.showInputDialog("Ingrese el modelo del vehiculo1: ");
        String marca1 = JOptionPane.showInputDialog("Ingrese la marca del vehiculo1: ");
        String color1 = JOptionPane.showInputDialog("Ingrese el color del vehiculo1: ");
        int maxPasajeros1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el max pasajeros del vehiculo1: "));
        var vehiculoTransporte1 = new VehiculoTransporte(placa1, modelo1, marca1, color1, maxPasajeros1);
        String placa2 = JOptionPane.showInputDialog("Ingrese la placa del vehiculo2: ");
        String modelo2 = JOptionPane.showInputDialog("Ingrese el modelo del vehiculo2: ");
        String marca2 = JOptionPane.showInputDialog("Ingrese la marca del vehiculo2: ");
        String color2 = JOptionPane.showInputDialog("Ingrese el color del vehiculo2: ");
        int maxPasajeros2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el max pasajeros del vehiculo2: "));
        var vehiculoTransporte2 = new VehiculoTransporte(placa2, modelo2, marca2, color2, maxPasajeros2);
        String placa3 = JOptionPane.showInputDialog("Ingrese la placa del vehiculo3: ");
        String modelo3 = JOptionPane.showInputDialog("Ingrese el modelo del vehiculo3: ");
        String marca3 = JOptionPane.showInputDialog("Ingrese la marca del vehiculo3: ");
        String color3 = JOptionPane.showInputDialog("Ingrese el color del vehiculo3: ");
        int maxPasajeros3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el max pasajeros del vehiculo3: "));
        var vehiculoTransporte3 = new VehiculoTransporte(placa3, modelo3, marca3, color3, maxPasajeros3);
        String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre del usuario1: ");
        int edad1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del usuario1: "));
        double peso1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del usuario1: "));
        var usuario1 = new Usuario(nombre1, edad1, peso1);
        String nombre2 = JOptionPane.showInputDialog("Ingrese el nombre del usuario2: ");
        int edad2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del usuario2: "));
        double peso2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del usuario2: "));
        var usuario2 = new Usuario(nombre2, edad2, peso2);
        String nombre3 = JOptionPane.showInputDialog("Ingrese el nombre del usuario3: ");
        int edad3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del usuario3: "));
        double peso3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del usuario3: "));
        var usuario3 = new Usuario(nombre3, edad3, peso3);
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
        double requisitoPeso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el requisito de peso: "));
        empresaTransporte.UsuariosEnElPeso(requisitoPeso);
        JOptionPane.showMessageDialog(null, empresaTransporte.getListUsuariosPeso());
        String placaBuscar = JOptionPane.showInputDialog("Ingrese la placa por la cual se buscara el vehiculo de transporte: ");
        JOptionPane.showMessageDialog(null, "El numero de usuarios asociados al vehiculo con la respectiva placa es: " + empresaTransporte.buscarVehiculo(placaBuscar));
        JOptionPane.showMessageDialog(null, "El numero de propietarios mayores a 40 años es: " + empresaTransporte.propietariosMayores());
        int edadMinima = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el edad minima de usuarios: "));
        int edadMaxima = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el edad maxima de usuarios: "));
        JOptionPane.showMessageDialog(null, "El numero de usuarios entre el rango de edad es: " + empresaTransporte.rangoEdadUsuarios(edadMinima, edadMaxima));
    }
}