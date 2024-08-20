package co.edu.uniquindio;

import java.util.Collection;

/**
 * Clase que presenta a un usuario
 */
public class Usuario {
    private String nombre;
    private int edad;
    private double peso;
    private Collection<VehiculoTransporte> vehiculosAsociados;

    /**
     * Método Constructor de la clase Usuario
     *
     * @param nombre del usuario
     * @param edad del usuario
     * @param peso del usuario
     */
    public Usuario(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        assert nombre != null && !nombre.isBlank() : "El nombre no puede ser nulo";
        assert edad >= 0 : "La edad no puede ser nula o negativa";
        assert peso >= 0 : "La peso no puede ser nula o  negativa";
    }

    /**
     * Método para obtener el nombre de un Usuario
     *
     * @return nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre de un Usuario
     *
     * @param nombre nuevo nombre del usuario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener la edad de un Usuario
     *
     * @return edad del usuario
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método para establecer la edad de un Usuario
     *
     * @param edad nueva edad del usuario
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método para obtener el peso de un Usuario
     *
     * @return peso del usuario
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Método para establecer el peso de un Usuario
     *
     * @param peso nuevo peso del usuario
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Método que asocia un vehículo de transporte a un Usuario
     *
     * @param vehiculo que se asocia al usuario
     */
    public  void asociarVehiculo (VehiculoTransporte vehiculo){
        vehiculosAsociados.add(vehiculo);
    }

    /**
     * Método toString para obtener una representación en cadena del usuario
     *
     * @return representación en cadena del usuario
     */
    @Override
    public String toString() {
        return "Usuario del transporte \n" +
                "Nombre: " + getNombre() + "\n" +
                "Edad: " + getEdad() + "\n" +
                "Peso: " + String.format("%.2f", peso)+ "\n";
    }
}
