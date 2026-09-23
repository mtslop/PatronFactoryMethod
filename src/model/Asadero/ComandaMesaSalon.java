package model.Asadero;

public class ComandaMesaSalon extends Comanda {
    private int numeroMesa;

    public ComandaMesaSalon(String cabecera, String detalle, String pie, String cliente, double subtotal, int numeroMesa) {
        super(cabecera, detalle, pie, cliente, subtotal);
        this.numeroMesa = numeroMesa;
    }

    @Override
    public double calcularTotal() {
        return subtotal;
    }
}