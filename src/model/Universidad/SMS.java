package model.Universidad;

import java.time.LocalDate;

public class SMS extends Notificacion {

    public SMS(String contenido, String destinatario, LocalDate fechaEntrega) {
        super(contenido, destinatario, fechaEntrega);
    }

    public boolean validarSms() {
        return destinatario != null && destinatario.startsWith("+57") &&
                contenido != null && contenido.length() <= 160;
    }

    @Override
    public void enviar() {
        if (validarSms()) {
            System.out.println("Enviando SMS a " + destinatario + " con contenido: " + contenido);
        } else {
            System.out.println("Fallo al enviar SMS: El destinatario debe empezar con +57 y el contenido no superar los 160 caracteres.");
        }
    }
}