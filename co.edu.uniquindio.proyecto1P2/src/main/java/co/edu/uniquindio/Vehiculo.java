package co.edu.uniquindio;

/**
 * Clase abstracta que representa un Vehículo
 */
public abstract class Vehiculo {
    private String placa;
    private String modelo;
    private String marca;
    private String color;
    private Propietario propietarioAsociado;

    /**
     * Método Constructor de la clase Vehículo
     *
     * @param placa del vehículo
     * @param modelo del vehículo
     * @param marca del vehículo
     * @param color del vehículo
     */
    public Vehiculo(String placa, String modelo, String marca, String color) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        assert placa != null && !placa.isBlank() : "Placa no puede ser nulo";
        assert modelo != null && !modelo.isBlank() : "Modelo no puede ser nulo";
        assert marca != null && !marca.isBlank() : "Marca no puede ser nulo";
        assert color != null && !color.isBlank() : "Color no puede ser nulo";
    }

    /**
     * Método para obtener la placa de un vehículo
     *
     * @return placa del vehículo
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Método para establecer la placa del vehículo
     *
     * @param placa nueva placa del vehículo
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Método para obtener el modelo de un vehículo
     *
     * @return modelo del vehículo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Método para establecer el modelo de un vehículo
     *
     * @param modelo nuevo modelo del vehículo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Método para obtener la marca de un vehículo
     *
     * @return marca del vehículo
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Método para establecer la marca de un vehículo
     *
     * @param marca nueva marca del vehículo
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Método para obtener el color de un vehículo
     *
     * @return color del vehículo
     */
    public String getColor() {
        return color;
    }

    /**
     * Método para establecer el color del vehículo
     *
     * @param color nuevo color del vehículo
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Método toString para obtener una representación en cadena del vehículo
     *
     * @return representación en cadena del vehículo, debe ser implementado en sus respectivas clases
     */
    @Override
    public abstract String toString();
}

