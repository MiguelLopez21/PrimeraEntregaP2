package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Clase Empresa Transporte que gestiona propietarios, vehiculos de carga, vehículos de transporte y usuarios
 */
public class EmpresaTransporte {
    private Collection<Propietario> listPropietarios;
    private Collection<VehiculoCarga> listVehiculosCarga;
    private Collection<VehiculoTransporte> listVehiculosTransporte;
    private Collection<Usuario> listUsuarios;

    /**
     * Método Constructor de la clase Empresa Transporte
     *
     * Permite crear una nueva instancia con listas vacías
     */
    public EmpresaTransporte() {
        listPropietarios = new ArrayList<>();
        listVehiculosCarga = new ArrayList<>();
        listVehiculosTransporte = new ArrayList<>();
        listUsuarios = new ArrayList<>();
    }

    /**
     *  Método para obtener la colección de propietarios
     *
     * @return coleccion de propietarios
     */
    public Collection<Propietario> getListPropietarios() {
        return listPropietarios;
    }

    /**
     *  Método para estaablecer la colección de propietarios
     *
     * @param listPropietarios nueva colección de propietarios
     */
    public void setListPropietarios(Collection<Propietario> listPropietarios) {
        this.listPropietarios = listPropietarios;
    }

    /**
     * Método para obtener la colección de vehículos de carga
     *
     * @return colección de vehículos de carga
     */
    public Collection<VehiculoCarga> getListVehiculosCarga() {
        return listVehiculosCarga;
    }

    /**
     * Método para establecer la colección de vehículos de carga
     *
     * @param listVehiculosCarga nueva colección de vehículos de carga
     */
    public void setListVehiculosCarga(Collection<VehiculoCarga> listVehiculosCarga) {
        this.listVehiculosCarga = listVehiculosCarga;
    }

    /**
     * Método para obtener la colección de vehículos de transporte
     *
     * @return colección de vehículos de transporte
     */
    public Collection<VehiculoTransporte> getListVehiculosTransporte() {
        return listVehiculosTransporte;
    }

    /**
     * Método para establecer la colección de vehículos de transporte
     *
     * @param listVehiculosTransporte nueva colección de vehículos de transporte
     */
    public void setListVehiculosTransporte(Collection<VehiculoTransporte> listVehiculosTransporte) {
        this.listVehiculosTransporte = listVehiculosTransporte;
    }

    /**
     * Método para obtener la colección de usuarios
     *
     *  @return colección de usuarios
     */
    public Collection<Usuario> getListUsuarios() {
        return listUsuarios;
    }

    /**
     * Método para establecer la colección de usuarios
     *
     * @param listUsuarios nueva colección de usuarios
     */
    public void setListUsuarios(Collection<Usuario> listUsuarios) {
        this.listUsuarios = listUsuarios;
    }

    /**
     * Método para añadir propietario a la colección de propietarios
     *
     * @param propietario a añadir
     */
    public void añadirPropietarios (Propietario propietario) {
        listPropietarios.add(propietario);
    }

    /**
     * Método para añadir un vehículo de carga a la colección de vehículos de carga
     *
     * @param vehiculoCarga a añadir
     */
    public void añadirVehiculoCarga(VehiculoCarga vehiculoCarga) {
        listVehiculosCarga.add(vehiculoCarga);
    }

    /**
     * Método para añadir un vehículo de transporte a la colección de vehículos de transporte
     *
     * @param vehiculoTransporte a añadir
     */
    public void añadirVehiculoTransporte(VehiculoTransporte vehiculoTransporte) {
        listVehiculosTransporte.add(vehiculoTransporte);
    }

    /**
     * Método para añadir un usuario a la colección de usuarios
     *
     * @param usuario a añadir
     */
    public void añadirUsuario (Usuario usuario) {
        listUsuarios.add(usuario);
    }

    /**
     * Método para imprimir el número de usuarios transportados por un vehículo de transporte
     *
     * @param placa placa con la que se identifica el vehículo
     */
    public void usuariosTransportados (String placa){
        for (VehiculoTransporte vehiculoTransporte : listVehiculosTransporte) {
            if (vehiculoTransporte.getPlaca().equals(placa)) {
                int numUsuariosTransportados = vehiculoTransporte.contarUsuariosTransportados();
                System.out.println("El vehículo con placa  " + placa + "  transportó "+ numUsuariosTransportados +" usuario(s)");
            }
        }
        System.out.println("No se encontrró un vehículo registrado con la placa " + placa);
    }

    /**
     * Método para imprimir el número de propietarios de un vehículo mayores a 40 años
     */
    public void propietariosMayores (){
        int cantidad = 0;
        for (Propietario propietario : listPropietarios) {
            if (propietario.getEdad() > 40){
                cantidad++;
            }
        }
        System.out.println("Hay un total de " + cantidad + " propietario(s) mayores a 40 años");
    }

    /**
     * Método para imprimir el número total de usuarios que están en un rango de edad específico
     *
     * @param edadMinima la edad minina del rango
     * @param edadMaxima la edad máxima del rango
     */
    public void  rangoEdadUsuarios (int edadMinima, int edadMaxima){
        int cantidad = 0;
        for (Usuario usuario : listUsuarios) {
            if (usuario.getEdad() >= edadMinima && usuario.getEdad() <= edadMaxima){
                cantidad++;
            }
        }
        System.out.println("Hay un total de " + cantidad + " usuario(s) con un rango de edad entre" + edadMinima + " y " + edadMaxima);
    }

    /**
     * Método para ubicar un véhiculo por su placa en las colecciones de vehículos de carga y transporte
     *
     * @param placa del vehículo a buscar
     * @return devuelve el vehículo encontrado
     */
    public Vehiculo buscarVehiculo (String placa){
        for (VehiculoCarga vehiculoCarga : listVehiculosCarga) {
            if (vehiculoCarga.getPlaca().equals(placa)) {
                return vehiculoCarga;
            }
        }
        for (VehiculoTransporte vehiculoTransporte : listVehiculosTransporte) {
            if (vehiculoTransporte.getPlaca().equals(placa)) {
                return vehiculoTransporte;
            }
        }
        return null;
    }

    /**
     * Método toString que devuelve una representación en cadena de la instancia de "Empresa Transporte"
     *
     * @return cadena de representación de la instancia
     */
    @Override
    public String toString() {
        return "EmpresaTransporte \n" +
                "Lista de Propietarios: " + listPropietarios + "\n" +
                "lLista de Vehiculos de Carga: " + listVehiculosCarga + "\n" +
                "Lista de Vehículos de Transporte: " + listVehiculosTransporte + "\n" +
                "Lista de Usuarios " + listUsuarios ;
    }
}
