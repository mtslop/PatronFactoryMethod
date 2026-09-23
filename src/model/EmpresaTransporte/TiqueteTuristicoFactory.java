package model.EmpresaTransporte;

public class TiqueteTuristicoFactory implements TiqueteFactory {
    private String origen;
    private String destino;
    private Double precioPaquete;
    private Double impuesto;

    public TiqueteTuristicoFactory(String origen, String destino, Double precioPaquete, Double impuesto) {
        this.origen = origen;
        this.destino = destino;
        this.precioPaquete = precioPaquete;
        this.impuesto = impuesto;
    }

    @Override
    public Tiquete crearTiquete() {
        return new TiqueteTuristico(origen, destino, precioPaquete, impuesto);
    }
}