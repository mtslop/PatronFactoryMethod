package model.Asadero;

public abstract class Comanda {
    protected String cabecera;
    protected String detalle;
    protected String pie;
    protected String cliente;
    protected double subtotal;

    public Comanda(String cabecera, String detalle, String pie, String cliente, double subtotal) {
        this.cabecera = cabecera;
        this.detalle = detalle;
        this.pie = pie;
        this.cliente = cliente;
        this.subtotal = subtotal;
    }

    public abstract double calcularTotal();
}