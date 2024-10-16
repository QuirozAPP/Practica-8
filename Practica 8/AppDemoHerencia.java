import java.util.ArrayList;

public class AppDemoHerencia {
    public static void main(String[] args) {
        // Inicializando listas
        ArrayList<Smartphone> listaDeSmartphones = new ArrayList<>();
        ArrayList<Television> listaDeTVs = new ArrayList<>();

        // Creando objetos Smartphone
        Microprocesador cpuSmartphone = new Microprocesador(4, 2800);
        Pantalla pantallaSmartphone = new Pantalla(1080, 2400);
        Sensor sensorHuella = new Sensor("Óptico", "cm", 0);
        Smartphone smartphone1 = new Smartphone("Samsung", "S12345", "Samsung", "Galaxy S", 999.99f, cpuSmartphone, 8, sensorHuella, pantallaSmartphone);
        Smartphone smartphone2 = new Smartphone("Apple", "A98765", "Apple", "iPhone 14", 1099.99f, cpuSmartphone, 6, sensorHuella, pantallaSmartphone);

        // Agregando a la lista de smartphones
        listaDeSmartphones.add(smartphone1);
        listaDeSmartphones.add(smartphone2);

        // Creando objetos Television
        Pantalla pantallaTV = new Pantalla(1920, 1080);
        Television television1 = new Television("LG", "T12345", "LG", "Ultra HD TV", 499.99f, pantallaTV);
        Television television2 = new Television("Sony", "T67890", "Sony", "Bravia 4K", 799.99f, pantallaTV);

        // Agregando a la lista de televisores
        listaDeTVs.add(television1);
        listaDeTVs.add(television2);

        // Desplegando información de smartphones
        System.out.println("Lista de Smartphones:");
        for (Smartphone smartphone : listaDeSmartphones) {
            System.out.println(smartphone);
        }

        // Desplegando información de televisores
        System.out.println("\nLista de Televisores:");
        for (Television television : listaDeTVs) {
            System.out.println(television);
        }
    }
}