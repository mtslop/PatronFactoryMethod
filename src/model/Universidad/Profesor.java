package model.Universidad;

public class Profesor extends Persona {
    private String identificadorProfesor;

    public Profesor(String nombre, String id, String telefono, String email, String identificadorProfesor) {
        super(nombre, id, telefono, email);
        this.identificadorProfesor = identificadorProfesor;
    }
}