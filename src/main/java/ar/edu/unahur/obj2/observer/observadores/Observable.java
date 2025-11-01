package ar.edu.unahur.obj2.observer.observadores;
import ar.edu.unahur.obj2.observer.entidades.*;

public interface Observable {
    void agregarObservador(Observador o);
    void quitarObservador(Observador o);
    void notificar(Alerta alerta);
}