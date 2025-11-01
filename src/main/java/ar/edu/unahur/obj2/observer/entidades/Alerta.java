package ar.edu.unahur.obj2.observer.entidades;

public class Alerta {
    private String tipo;
    private Integer nivel;

    Alerta(String tipo, Integer nivel) {
        this.tipo = tipo;
        this.nivel = nivel;
    }

    public Boolean esCritica() {
        return Boolean.valueOf(nivel >= 8);
    } // O Boolean.ValueOf dentro del constructor, con una variable Boolean esCritica, pero es mejor así.

    public Integer getNivel() {
        return nivel;
    }
}