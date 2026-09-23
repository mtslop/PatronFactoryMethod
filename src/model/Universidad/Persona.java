package model.Universidad;

public abstract class Persona {
    protected String nombre;
    protected String id;
    protected String telefono;
    protected String email;

    public Persona(String nombre, String id, String telefono, String email) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
        this.email = email;
    }
}