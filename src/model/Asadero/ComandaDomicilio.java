package model.Asadero;

public class ComandaDomicilio extends Comanda {
    private String direccion;
    private Double costoEnvio;

    public ComandaDomicilio(String cabecera, String detalle, String pie, String cliente, double subtotal, String direccion, Double costoEnvio) {
        super(cabecera, detalle, pie, cliente, subtotal);
        this.direccion = direccion;
        this.costoEnvio = costoEnvio;
    }

    @Override
    public double calcularTotal() {
        return subtotal + costoEnvio;
    }
}
