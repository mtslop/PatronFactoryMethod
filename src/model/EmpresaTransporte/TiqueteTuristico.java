package model.EmpresaTransporte;

public class TiqueteTuristico extends Tiquete {
    private Double precioPaquete;
    private Double impuesto;

    public TiqueteTuristico(String origen, String destino, Double precioPaquete, Double impuesto) {
        super(origen, destino);
        this.precioPaquete = precioPaquete;
        this.impuesto = impuesto;
    }

    @Override
    public double calcularTarifa() {
        return precioPaquete + (precioPaquete * impuesto);
    }
}