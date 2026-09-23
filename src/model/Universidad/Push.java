package model.Universidad;

import java.time.LocalDate;

public class Push extends Notificacion {
    private prioridadPush prioridad;

    public Push(String contenido, String destinatario, LocalDate fechaEntrega, prioridadPush prioridad) {
        super(contenido, destinatario, fechaEntrega);
        this.prioridad = prioridad;
    }

    public boolean validarPush() {
        return prioridad != null;
    }

    @Override
    public void enviar() {
        if (validarPush()) {
            System.out.println("Enviando notificación Push (Prioridad: " + prioridad + ") a " + destinatario + " con contenido: " + contenido);
        } else {
            System.out.println("Fallo al enviar Push: Se requiere una prioridad válida.");
        }
    }
}