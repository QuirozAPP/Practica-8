import java.util.ArrayList;

public class DispositivoElectronico {

    private final String fabricante;
    private final String numeroSerie;
    private final String marca;
    private final String nombre;
    private float costo;
    private ArrayList<ComponenteElectronico> componentes;

    public DispositivoElectronico(String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        this.fabricante = fabricante;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.nombre = nombre;
        this.costo = costo;
        this.componentes = new ArrayList<>();
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public void agregarComponente(ComponenteElectronico componente) {
        componentes.add(componente);
        componente.setEsParteDe(this);
    }

    public void quitarComponente(ComponenteElectronico componente) {
        componentes.remove(componente);
        componente.setEsParteDe(null);
    }

    public String toString() {
        return "DispositivoElectronico{" +
                "fabricante='" + fabricante + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", marca='" + marca + '\'' +
                ", nombre='" + nombre + '\'' +
                ", costo=" + costo +
                ", componentes=" + componentes +
                '}';
    }
}

