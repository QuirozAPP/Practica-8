class Microprocesador extends ComponenteElectronico {
    private final int cacheRAM;
    private final long velocidadHz;

    public Microprocesador(int cacheRAM, long velocidadHz) {
        super();
        this.cacheRAM = cacheRAM;
        this.velocidadHz = velocidadHz;
    }

    @Override
    public String toString() {
        return "Microprocesador{" +
                "cacheRAM=" + cacheRAM +
                ", velocidadHz=" + velocidadHz +
                '}';
    }
}