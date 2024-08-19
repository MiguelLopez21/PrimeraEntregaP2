package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.Collection;

public class VehiculoTransporte extends Vehiculo {
    private int maxPasajeros;
    private Collection<Usuario> listUsuariosAsociados;

    public VehiculoTransporte(String placa, String modelo, String marca, String color, int maxPasajeros) {
        super(placa, modelo, marca, color);
        this.maxPasajeros = maxPasajeros;
        listUsuariosAsociados = new ArrayList<Usuario>();
    }

    public int getMaxPasajeros() {
        return maxPasajeros;
    }

    public void setMaxPasajeros(int maxPasajeros) {
        this.maxPasajeros = maxPasajeros;
    }

    public Collection<Usuario> getListUsuariosAsociados() {
        return listUsuariosAsociados;
    }

    public void setListUsuariosAsociados(Collection<Usuario> listUsuariosAsociados) {
        this.listUsuariosAsociados = listUsuariosAsociados;
    }

    public void añadirUsuarios(Usuario usuario) {
        listUsuariosAsociados.add(usuario);
    }

    public int contarUsuariosTransportados (){
        return listUsuariosAsociados.size();
    }

    public Collection<Usuario>listPesoUsuarios (double peso){
        Collection<Usuario> obtenerPesoUsuarios = new ArrayList<>();
        for (Usuario usuario : listUsuariosAsociados){
            if (usuario.getPeso() > peso){
                obtenerPesoUsuarios.add(usuario);
            }
        }
        return obtenerPesoUsuarios;
    }

}

