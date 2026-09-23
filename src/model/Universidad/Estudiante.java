package model.Universidad;

public class Estudiante extends Persona {
    private String identificadorEstudiante;

    public Estudiante(String nombre, String id, String telefono, String email, String identificadorEstudiante) {
        super(nombre, id, telefono, email);
        this.identificadorEstudiante = identificadorEstudiante;
    }
}