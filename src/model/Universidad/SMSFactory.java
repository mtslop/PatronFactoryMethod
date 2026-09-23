package model.Universidad;

import java.time.LocalDate;

public class SMSFactory extends NotificacionFactory {
    @Override
    public Notificacion crearNotificacion(String contenido, String destinatario, LocalDate fechaEntrega) {
        return new SMS(contenido, destinatario, fechaEntrega);
    }
}