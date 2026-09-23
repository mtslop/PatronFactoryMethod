package model.Asadero;

public class DomicilioFactory implements ComandaFactory {
    private String cabecera;
    private String detalle;
    private String pie;
    private String cliente;
    private double subtotal;
    private String direccion;
    private Double costoEnvio;

    public DomicilioFactory(String cabecera, String detalle, String pie, String cliente, double subtotal, String direccion, Double costoEnvio) {
        this.cabecera = cabecera;
        this.detalle = detalle;
        this.pie = pie;
        this.cliente = cliente;
        this.subtotal = subtotal;
        this.direccion = direccion;
        this.costoEnvio = costoEnvio;
    }

    @Override
    public Comanda crearComanda() {
        return new ComandaDomicilio(cabecera, detalle, pie, cliente, subtotal, direccion, costoEnvio);
    }
}