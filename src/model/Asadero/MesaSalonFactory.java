package model.Asadero;

public class MesaSalonFactory implements ComandaFactory {
    private String cabecera;
    private String detalle;
    private String pie;
    private String cliente;
    private double subtotal;
    private int numeroMesa;

    public MesaSalonFactory(String cabecera, String detalle, String pie, String cliente, double subtotal, int numeroMesa) {
        this.cabecera = cabecera;
        this.detalle = detalle;
        this.pie = pie;
        this.cliente = cliente;
        this.subtotal = subtotal;
        this.numeroMesa = numeroMesa;
    }

    @Override
    public Comanda crearComanda() {
        return new ComandaMesaSalon(cabecera, detalle, pie, cliente, subtotal, numeroMesa);
    }
}