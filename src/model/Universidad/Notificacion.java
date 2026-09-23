package model.Universidad;

import java.time.LocalDate;

public abstract class Notificacion {
    protected String contenido;
    protected String destinatario;
    protected LocalDate fechaEntrega;

    public Notificacion(String contenido, String destinatario, LocalDate fechaEntrega) {
        this.contenido = contenido;
        this.destinatario = destinatario;
        this.fechaEntrega = fechaEntrega;
    }

    public abstract void enviar();
}