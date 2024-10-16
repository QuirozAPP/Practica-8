class Pantalla extends ComponenteElectronico {
    private final int resolucionX;
    private final int resolucionY;

    public Pantalla(int resolucionX, int resolucionY) {
        super(); 
        this.resolucionX = resolucionX;
        this.resolucionY = resolucionY;
    }

    @Override
    public String toString() {
        return "Pantalla{" +
                "resolucionX=" + resolucionX +
                ", resolucionY=" + resolucionY +
                '}';
    }
}
