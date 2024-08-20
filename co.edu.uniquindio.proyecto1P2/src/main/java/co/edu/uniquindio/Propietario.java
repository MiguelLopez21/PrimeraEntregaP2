package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.Collection;

public class Propietario {
    private String nombre;
    private String cedula;
    private String email;
    private String celular;
    private int edad;
    private Collection<Vehiculo> listVehiculosAsociados;

    public Propietario(String nombre, String cedula, String email, String celular, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.celular = celular;
        this.edad = edad;
        this.listVehiculosAsociados = new ArrayList<Vehiculo>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Collection<Vehiculo> getListVehiculosAsociados() {
        return listVehiculosAsociados;
    }

    public void setListVehiculosAsociados(Collection<Vehiculo> listVehiculosAsociados) {
        this.listVehiculosAsociados = listVehiculosAsociados;
    }

    public void añadirVehiculo(Vehiculo vehiculo) {
        this.listVehiculosAsociados.add(vehiculo);
    }

    @Override
    public String toString() {
        return "Propietario \n " +
                "Nombre: " + nombre + "\n " +
                "Cedula: " + cedula + "\n " +
                "Email: " + email + "\n " +
                "Celular: " + celular + "\n " +
                "Edad: " + edad + "\n " +
                "listVehiculosAsociados: " + listVehiculosAsociados + "\n";
    }
}
