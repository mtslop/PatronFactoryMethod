package model.EmpresaTransporte;

public abstract class Tiquete {
    protected String origen;
    protected String destino;

    public Tiquete(String origen, String destino) {
        this.origen = origen;
        this.destino = destino;
    }

    public abstract double calcularTarifa();

    public double calcularPrecio() {
        return calcularTarifa();
    }
}