package model.Universidad;


public enum prioridadPush {
    ALTA(1),
    NORMAL(2);

    private final int valor;

    prioridadPush(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}