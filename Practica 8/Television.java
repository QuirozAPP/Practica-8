class Television extends DispositivoElectronicoDeConsumo {
    private final Pantalla pantalla;

    public Television(String fabricante, String numeroSerie, String marca, String nombre, float costo, Pantalla pantalla) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.pantalla = pantalla;
    }

    @Override
    public String toString() {
        return super.toString() + ", Television{" +
                "pantalla=" + pantalla +
                '}';
    }
}
