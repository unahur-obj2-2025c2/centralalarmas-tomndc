package ar.edu.unahur.obj2.observer.entidades;

public class Alerta {
    private String tipo;
    private Integer nivel;

    Alerta(String tipo, Integer nivel) {
        this.tipo = tipo;
        this.nivel = nivel;
    }

    public Boolean esCritica() {
        return nivel >= 8;
    }
}