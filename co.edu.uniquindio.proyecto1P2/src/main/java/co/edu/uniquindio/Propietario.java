package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Clase que representa a un propietario con un vehículo asociado
 */
public class Propietario {
    private String nombre;
    private String cedula;
    private String email;
    private String celular;
    private int edad;
    private Collection<Vehiculo> listVehiculosAsociados;

    /**
     * Método Constructor de la clase Propietario
     * @param nombre del propietario
     * @param cedula del propietario
     * @param email del propietario
     * @param celular del propietario
     * @param edad del propietario
     */
    public Propietario(String nombre, String cedula, String email, String celular, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.celular = celular;
        this.edad = edad;
        this.listVehiculosAsociados = new ArrayList<Vehiculo>();
        assert nombre != null && !nombre.isBlank() : "El nombre no puede ser nulo";
        assert cedula != null && !cedula.isBlank() : "La cedula no puede ser nula";
        assert email == null || email.isBlank() : "El email no puede ser nulo";
        assert edad >= 0  : "La edad no puede ser negativa";
    }

    /**
     * Método para obtener el nombre del propietario
     *
     * @return nombre del propietario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del propietario
     *
     * @param nombre nuevo nombre del propietario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener la cédula del propietario
     *
     * @return cédula del propietario
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Método para establecer la cédula del propietario
     *
     * @param cedula nueva cédula del propietario
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Método para obtener el email del propietario
     *
     * @return email del propietario
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método para establecer el email del propietario
     *
     * @param email nuevo email del propietario
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Método para obtener el celular del propietario
     *
     * @return celular del propietario
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Método para establecer el celular del propietario
     *
     * @param celular nuevo ceular del propietario
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * Método para obtener la edad del propietario
     *
     * @return edad del propietario
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método para establecer la edad del propietario
     *
     * @param edad nueva edad del propietario
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método para obtener la lista de vehículos asociados
     *
     * @return lista de vehículos asociados
     */
    public Collection<Vehiculo> getListVehiculosAsociados() {
        return listVehiculosAsociados;
    }

    /**
     * Método para establecer la lista de asociados
     *
     * @param listVehiculosAsociados nueva lista de asociados
     */
    public void setListVehiculosAsociados(Collection<Vehiculo> listVehiculosAsociados) {
        this.listVehiculosAsociados = listVehiculosAsociados;
    }

    /**
     * Método para añadir un vehiculo a la lista de vehículos asociados
     *
     * @param vehiculo a añadir
     */
    public void añadirVehiculo(Vehiculo vehiculo) {
        this.listVehiculosAsociados.add(vehiculo);
    }

    /**
     * Método toString que dvuelve una representación en cadena del propietario
     *
     * @return representación en cadena del propietario
     */
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
