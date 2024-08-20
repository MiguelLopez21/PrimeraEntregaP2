package co.edu.uniquindio;

/**
 * Clase que representa un vehículo de carga
 */
public class VehiculoCarga extends Vehiculo {
    private double capacidadCarga;
    private int numeroEjes;

    /**
     * Método Constructor de la clase Vehículo de Carga
     *
     * @param placa del vehículo de carga
     * @param modelo del vehículo de carga
     * @param marca del vehículo de carga
     * @param color del vehículo de carga
     * @param capacidadCarga del vehículo de carga
     * @param numeroEjes del vehículo de carga
     */
    public VehiculoCarga(String placa, String modelo, String marca, String color,double capacidadCarga, int numeroEjes) {
        super(placa, modelo, marca, color);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
        assert capacidadCarga > 0 : "La capacidad no puede ser negativa";
        assert numeroEjes > 0 : "El número de ejes no puede ser negativo";
    }

    /**
     * Método para obtener la capacidad de un vehículo de carga
     *
     * @return capacidad del vehículo de carga
     */
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    /**
     * Método para establecer la capacidad de un vehículo de carga
     *
     * @param capacidadCarga nueva capacidad de carga
     */
    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    /**
     * Método para obtener el número de ejes de un vehículo de carga
     *
     * @return numero de ejes del vehículo de carga
     */
    public int getNumeroEjes() {
        return numeroEjes;
    }

    /**
     * Método para establecer el número de ejes de un vehículo de carga
     *
     * @param numeroEjes nuevo número de Ejes del vehículo
     */
    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    /**
     * Método toString para obtener la representación en cadena del vehículo de carga
     *
     * @return representación en cadena del vehículo de carga
     */
    @Override
    public String toString() {
        return "Vehiculo Carga \n " +
                "Placa: "  + getPlaca() + "\n" +
                "Modelo: " + getModelo() + "\n" +
                "Marca: " + getMarca() + "\n" +
                "Color: " + getColor() + "\n" +
                "Capacidad Carga: " + getCapacidadCarga() + "\n" +
                "Numero Ejes: " + getNumeroEjes() + "\n";
    }
}
