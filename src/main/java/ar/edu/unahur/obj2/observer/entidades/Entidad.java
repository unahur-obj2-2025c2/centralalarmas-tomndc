package ar.edu.unahur.obj2.observer.entidades;

import java.util.ArrayList;

import ar.edu.unahur.obj2.observer.estrategias.Riesgo;
import ar.edu.unahur.obj2.observer.observadores.Observador;

public class Entidad implements Observador {
    private final String NOMBRE;
    private ArrayList<Alerta> alertasRecibidas;
    private RiesgoCritico riesgo = new RiesgoCritico();

    Entidad(String nombre) {
        this.NOMBRE = nombre;
    }

    @Override
    public void actualizar(Alerta alerta) {
        alertasRecibidas.add(alerta);
    }


}
