package org.uniquindio.edu.co.poo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Batallon {
    private String idBatallon;
    private List<Vehiculo> listaVehiculos;
    private List<Mision> listaMisiones;

    public Batallon() {
        this.idBatallon = idBatallon;
        this.listaVehiculos = new ArrayList<Vehiculo>();
        this.listaMisiones = new ArrayList<>();
    }


    public String registrarVehiculo(Vehiculo nuevoVehiculo) {
        String mensaje = "";
        Optional<Vehiculo> optionalVehiculo = buscarVehiculo1(nuevoVehiculo.getId());
        if(optionalVehiculo.isPresent()) {
            mensaje = "Vehiculo ya existe en la lista de vehiculos";
        }else{
            listaVehiculos.add(nuevoVehiculo);
            mensaje = "Vehiculo registrado con exito";
        }
        return mensaje;
    }

    public Vehiculo vehiculoMasMisiones(){
        Vehiculo vehiculoMasMisiones = null;
        int mayor= -1;
        for(Vehiculo v : listaVehiculos){
            if(v.getMisionesCompletadas()>mayor){
                mayor= v.getMisionesCompletadas();
            }
        }

        return vehiculoMasMisiones;
    }


    private Optional<Vehiculo> buscarVehiculo1(String id) {

        return listaVehiculos.stream().filter(vehiculo -> vehiculo.getId().equals(id)).findFirst();
    }

    private Vehiculo buscarVehiculo(String id) {
        Vehiculo vehiculoEncontrado = null;
        for(Vehiculo vehiculoAux : listaVehiculos) {
            if(vehiculoAux.getId().equals(id)) {
                vehiculoEncontrado= vehiculoAux;
            }
        }
        return vehiculoEncontrado;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        listaVehiculos.add(vehiculo);
    }

    public void registrarMision(Mision mision) {
        listaMisiones.add(mision);
    }

    public List<Vehiculo> obtenerVehiculosParaReemplazo() {
        List<Vehiculo> reemplazo = new ArrayList<>();
        for (Vehiculo v : listaVehiculos) {
            if (v.getMisionesCompletadas() > 50) {
                reemplazo.add(v);
            }
        }
        return reemplazo;
    }
}
