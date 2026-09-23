package model.EmpresaTransporte;

public class TiqueteIntermunicipalFactory implements TiqueteFactory {
    private String origen;
    private String destino;
    private Double kilometros;
    private Double precioKilometro;

    public TiqueteIntermunicipalFactory(String origen, String destino, Double kilometros, Double precioKilometro) {
        this.origen = origen;
        this.destino = destino;
        this.kilometros = kilometros;
        this.precioKilometro = precioKilometro;
    }

    @Override
    public Tiquete crearTiquete() {
        return new TiqueteIntermunicipal(origen, destino, kilometros, precioKilometro);
    }
}