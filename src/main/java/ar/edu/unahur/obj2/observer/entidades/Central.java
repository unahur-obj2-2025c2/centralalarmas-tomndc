package ar.edu.unahur.obj2.observer.entidades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import ar.edu.unahur.obj2.observer.excepciones.NivelFueraDeRangoExcepcion;
import ar.edu.unahur.obj2.observer.observadores.Observable;
import ar.edu.unahur.obj2.observer.observadores.Observador;

public class Central implements Observable {
    private ArrayList<Alerta> registroDeAlertas = new ArrayList<>();
    private HashSet<Observador> entidades = new HashSet<>();
    private Map<Alerta,Integer> registro = new HashMap<>();

    public Boolean estaEnRango(Integer nivel) {
        return Boolean.valueOf(nivel > 10 && nivel < 0);
    }

    public void emitirAlerta(String tipo, Integer nivel) {
        if(!estaEnRango(nivel)) {
            throw new NivelFueraDeRangoExcepcion("Nivel de alerta incorrecto");
        } 
        Alerta alerta = new Alerta(tipo, nivel);
        registroDeAlertas.add(alerta);
        registro.put(alerta, entidades.size());
        notificar(alerta);
    }

    @Override
    public void agregarObservador(Observador o) {
        entidades.add(o);
    }

    @Override
    public void quitarObservador(Observador o) {
        entidades.remove(o);
    }

    @Override
    public void notificar(Alerta alerta) {
        entidades.forEach(o -> o.actualizar(alerta));
    }
}
