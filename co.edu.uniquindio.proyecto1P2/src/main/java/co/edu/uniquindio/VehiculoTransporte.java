package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Clase que representa un vehículo de transporte
 */
public class VehiculoTransporte extends Vehiculo {
    private int maxPasajeros;
    private Collection<Usuario> listUsuariosAsociados;

    /**
     * Método Constructor de la clase Vehículo de Transporte
     *
     * @param placa del vehículo de transporte
     * @param modelo del vehículo de transporte
     * @param marca del vehículo de transporte
     * @param color del vehículo de transporte
     * @param maxPasajeros del vehículo de transporte
     */
    public VehiculoTransporte(String placa, String modelo, String marca, String color, int maxPasajeros) {
        super(placa, modelo, marca, color);
        this.maxPasajeros = maxPasajeros;
        listUsuariosAsociados = new ArrayList<Usuario>();
        assert maxPasajeros > 0 :  "La capacidad máxima de pasajeros debe ser mayor que 0";
    }

    /**
     * Método para obtener la capacidad máxima de pasajeros del vehículo
     *
     * @return capacidad máxima de pasajeros
     */
    public int getMaxPasajeros() {
        return maxPasajeros;
    }

    /**
     * Método para establecer la capacidad maxima de pasajeros de un vehículo
     *
     * @param maxPasajeros nueva capacidad máxima de pasajeros
     */
    public void setMaxPasajeros(int maxPasajeros) {
        this.maxPasajeros = maxPasajeros;
    }

    /**
     * Método para obtener la colección de usuarios asociados del vehículo
     *
     * @return colección de usuarios asociados
     */
    public Collection<Usuario> getListUsuariosAsociados() {
        return listUsuariosAsociados;
    }

    /**
     * Método para establecer la colección de usuarios asociados del vehiculo
     *
     * @param listUsuariosAsociados nueva colección de usuarios asociados
     */
    public void setListUsuariosAsociados(Collection<Usuario> listUsuariosAsociados) {
        this.listUsuariosAsociados = listUsuariosAsociados;
    }

    /**
     * Método para añadir usuarios a la colección de usuarios asociados
     *
     * @param usuario a añadir
     */
    public void añadirUsuarios(Usuario usuario) {
        listUsuariosAsociados.add(usuario);
    }

    /**
     * Método para contar la cantidad de usuarios transportados por el véhiculo
     *
     * @return cantidad de usuarios transportados
     */
    public int contarUsuariosTransportados (){
        return listUsuariosAsociados.size();
    }

    /**
     * Método para obtener la colección de usuarios cuyo peso es mayor a un valor especificado
     *
     * @param peso minimo para filtrar usuarios
     * @return colección de usuarios cuyo peso es mayor a un vallor especificado
     */
    public Collection<Usuario> listPesoUsuarios (double peso){
        Collection<Usuario> buscarPesoUsuarios = new ArrayList<>();
        for (Usuario usuario : listUsuariosAsociados){
            if (usuario.getPeso() > peso){
                buscarPesoUsuarios.add(usuario);
            }
        }
        return buscarPesoUsuarios;
    }

    /**
     * Método para obtener la representación en cadena de la clase Vehículo de Transporte
     *
     * @return representación en cadena del vehículo de transporte
     */
    @Override
    public String toString() {
        return " VehiculoTransporte \n " +
                " maxPasajeros: " + maxPasajeros + "\n" +
                "listUsuariosAsociados=" + listUsuariosAsociados  + "\n" ;
    }
}

