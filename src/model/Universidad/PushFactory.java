package model.Universidad;

import java.time.LocalDate;

public class PushFactory extends NotificacionFactory {
    private prioridadPush prioridad;

    public PushFactory(prioridadPush prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public Notificacion crearNotificacion(String contenido, String destinatario, LocalDate fechaEntrega) {
        return new Push(contenido, destinatario, fechaEntrega, prioridad);
    }
}