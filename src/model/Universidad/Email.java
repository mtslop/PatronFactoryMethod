package model.Universidad;

import java.time.LocalDate;

public class Email extends Notificacion {

    public Email(String contenido, String destinatario, LocalDate fechaEntrega) {
        super(contenido, destinatario, fechaEntrega);
    }

    public boolean validarEmail() {
        return destinatario != null && destinatario.contains("@") && destinatario.contains(".");
    }

    @Override
    public void enviar() {
        if (validarEmail()) {
            System.out.println("Enviando Email a " + destinatario + " con contenido: " + contenido);
        } else {
            System.out.println("Fallo al enviar Email: El destinatario no tiene un formato válido (requiere '@' y dominio).");
        }
    }
}