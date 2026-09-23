package model.EmpresaTransporte;

public class TiqueteUrbano extends Tiquete {
    private double tarifaEstandar;

    public TiqueteUrbano(String origen, String destino, double tarifaEstandar) {
        super(origen, destino);
        this.tarifaEstandar = tarifaEstandar;
    }

    @Override
    public double calcularTarifa() {
        return tarifaEstandar;
    }
}