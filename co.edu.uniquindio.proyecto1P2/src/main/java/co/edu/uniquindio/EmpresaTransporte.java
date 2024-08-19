package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.Collection;

public class EmpresaTransporte {
    private Collection<Propietario> listPropietarios;
    private Collection<VehiculoCarga> listVehiculosCarga;
    private Collection<VehiculoTransporte> listVehiculosTransporte;
    private Collection<Usuario> listUsuarios;

    public EmpresaTransporte() {
        listPropietarios = new ArrayList<Propietario>();
        listVehiculosCarga = new ArrayList<VehiculoCarga>();
        listVehiculosTransporte = new ArrayList<>();
        listUsuarios = new ArrayList<>();
    }

    public Collection<Propietario> getListPropietarios() {
        return listPropietarios;
    }

    public void setListPropietarios(Collection<Propietario> listPropietarios) {
        this.listPropietarios = listPropietarios;
    }

    public Collection<VehiculoCarga> getListVehiculosCarga() {
        return listVehiculosCarga;
    }

    public void setListVehiculosCarga(Collection<VehiculoCarga> listVehiculosCarga) {
        this.listVehiculosCarga = listVehiculosCarga;
    }

    public Collection<VehiculoTransporte> getListVehiculosTransporte() {
        return listVehiculosTransporte;
    }

    public void setListVehiculosTransporte(Collection<VehiculoTransporte> listVehiculosTransporte) {
        this.listVehiculosTransporte = listVehiculosTransporte;
    }

    public Collection<Usuario> getListUsuarios() {
        return listUsuarios;
    }

    public void setListUsuarios(Collection<Usuario> listUsuarios) {
        this.listUsuarios = listUsuarios;
    }

    public void usuariosTransportados (String placa){
        for (VehiculoTransporte vehiculoTransporte : listVehiculosTransporte) {
            if (vehiculoTransporte.getPlaca().equals(placa)) {
                int numUsuariosTransportados = vehiculoTransporte.contarUsuariosTransportados();
                System.out.println("El vehiculo con placa  " + placa + "  transporto "+ numUsuariosTransportados +" usuario(s)");
            }
        }
        System.out.println("Este vehiculo no fue encontrado");
    }


}
