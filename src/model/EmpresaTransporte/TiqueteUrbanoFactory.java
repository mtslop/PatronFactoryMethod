package model.EmpresaTransporte;

public class TiqueteUrbanoFactory implements TiqueteFactory {
    private String origen;
    private String destino;
    private double tarifaEstandar;

    public TiqueteUrbanoFactory(String origen, String destino, double tarifaEstandar) {
        this.origen = origen;
        this.destino = destino;
        this.tarifaEstandar = tarifaEstandar;
    }

    @Override
    public Tiquete crearTiquete() {
        return new TiqueteUrbano(origen, destino, tarifaEstandar);
    }
}