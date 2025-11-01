package ar.edu.unahur.obj2.observer.estrategias;

import java.util.List;

import ar.edu.unahur.obj2.observer.entidades.Alerta;

public interface Riesgo {
    public Integer calcularRiesgo(List<Alerta> alertas);
}
