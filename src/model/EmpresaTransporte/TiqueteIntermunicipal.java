package model.EmpresaTransporte;

public class TiqueteIntermunicipal extends Tiquete {
    private Double kilometros;
    private Double precioKilometro;

    public TiqueteIntermunicipal(String origen, String destino, Double kilometros, Double precioKilometro) {
        super(origen, destino);
        this.kilometros = kilometros;
        this.precioKilometro = precioKilometro;
    }

    @Override
    public double calcularTarifa() {
        return kilometros * precioKilometro;
    }
}