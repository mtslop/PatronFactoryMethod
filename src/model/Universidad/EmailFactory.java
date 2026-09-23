package model.Universidad;

import java.time.LocalDate;

public class EmailFactory extends NotificacionFactory {
    @Override
    public Notificacion crearNotificacion(String contenido, String destinatario, LocalDate fechaEntrega) {
        return new Email(contenido, destinatario, fechaEntrega);
    }
}