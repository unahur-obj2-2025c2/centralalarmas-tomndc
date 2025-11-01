package ar.edu.unahur.obj2.observer.estrategias;

import java.util.List;

import ar.edu.unahur.obj2.observer.entidades.Alerta;

public class RiesgoPromedio implements Riesgo {

    @Override
    public Integer calcularRiesgo(List<Alerta> alertas) {
        return Integer.valueOf(alertas.stream().mapToInt(Alerta::getNivel).sum() / alertas.size()); 
    }

    
}
