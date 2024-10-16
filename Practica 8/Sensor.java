class Sensor extends ComponenteElectronico {
    private final String tipo;
    private final String unidadDeMedida;
    private final int valor;

    public Sensor(String tipo, String unidadDeMedida, int valor) {
        super();
        this.tipo = tipo;
        this.unidadDeMedida = unidadDeMedida;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "tipo='" + tipo + '\'' +
                ", unidadDeMedida='" + unidadDeMedida + '\'' +
                ", valor=" + valor +
                '}';
    }
}