class Computadora extends DispositivoElectronicoDeConsumo {
    private Microprocesador cpu;
    private long ramMB;

    public Computadora(String fabricante, String numeroSerie, String marca, String nombre, float costo, Microprocesador cpu, long ramMB) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.cpu = cpu;
        this.ramMB = ramMB;
    }

    public Microprocesador getCpu() {
        return cpu;
    }

    public void setCpu(Microprocesador cpu) {
        this.cpu = cpu;
    }

    public long getRamMB() {
        return ramMB;
    }

    public void setRamMB(long ramMB) {
        this.ramMB = ramMB;
    }

    public String toString() {
        return super.toString() + ", Computadora{" +
                "cpu=" + cpu +
                ", ramMB=" + ramMB +
                '}';
    }
}
