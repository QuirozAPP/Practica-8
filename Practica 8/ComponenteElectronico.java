public class ComponenteElectronico extends DispositivoElectronico
{
    public ComponenteElectronico(String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        super(fabricante, numeroSerie, marca, nombre, costo);
    }

    protected DispositivoElectronico esParteDe;

    public DispositivoElectronico getEsParteDe() {
        return esParteDe;
    }

    public void setEsParteDe(DispositivoElectronico esParteDe) {
        this.esParteDe = esParteDe;
    }
}

