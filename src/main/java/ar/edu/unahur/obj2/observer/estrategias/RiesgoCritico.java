package ar.edu.unahur.obj2.observer.estrategias;

import java.util.List;

import ar.edu.unahur.obj2.observer.entidades.Alerta;

public class RiesgoCritico implements Riesgo {
    @Override
    public Integer calcularRiesgo(List<Alerta> alertas) {
        return (alertas.get(alertas.size() - 1).esCritica()) ? 10 : (alertas.get(alertas.size() - 1)).getNivel();
    }
}
