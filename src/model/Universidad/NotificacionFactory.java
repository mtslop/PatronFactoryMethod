package model.Universidad;

import java.time.LocalDate;

public abstract class NotificacionFactory {

    public abstract Notificacion crearNotificacion(String contenido, String destinatario, LocalDate fechaEntrega);

    public void enviarNotificacion(String contenido, String destinatario, LocalDate fechaEntrega) {
        Notificacion notificacion = crearNotificacion(contenido, destinatario, fechaEntrega);
        notificacion.enviar();
    }
}