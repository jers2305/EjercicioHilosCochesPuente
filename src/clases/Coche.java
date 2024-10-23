package clases;

public class Coche extends Thread {
    private final String nombre;

    public Coche(String nombre) {
        this.nombre = nombre;
    }

    public void cruzar() {
        try {
            System.out.println(nombre + " está cruzando el puente...");
            Thread.sleep(2000); // Simula el tiempo que tarda en cruzar
            System.out.println(nombre + " ha cruzado el puente.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void run() {
        cruzar();
    }
}
