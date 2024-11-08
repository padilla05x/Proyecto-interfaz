package co.edu.uniquindio.poo.model;

import java.util.Collection;
import java.util.LinkedList;

public class Empresa {
    private String nombre;
    private Collection<Vehiculo> vehiculos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        vehiculos = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setvehiculos(Collection<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public boolean agregarVehiculo(Vehiculo vehiculo) {
        boolean centinela = false;
        if (!verificarVehiculo(vehiculo.getMatricula())) {
            vehiculos.add(vehiculo);
            centinela = true;
        }
        return centinela;
    }

    public boolean eliminarVehiculo(String matricula) {
        boolean centinela = false;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                vehiculos.remove(vehiculo);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean actualizarVehiculo(String matricula, Vehiculo actualizado) {
        boolean centinela = false;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                vehiculo.setMatricula(actualizado.getMatricula());
                vehiculo.setMarca(actualizado.getMarca());
                vehiculo.setModelo(actualizado.getModelo());
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean verificarVehiculo(String matricula) {
        boolean centinela = false;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                centinela = true;
            }
        }
        return centinela;
    }
}
