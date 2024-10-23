package clases;

public class Main {
    public static void main(String[] args) {
        Coche coche1sur = new Coche("Coche 1 Sur");
        Coche coche2sur = new Coche("Coche 2 Sur");
        Coche coche1norte = new Coche("Coche 1 Norte");
        Coche coche2norte = new Coche("Coche 2 Norte");

        // Iniciar todos los coches
        coche1sur.start();
        try {
            coche1sur.join(); // Esperar a que coche 1 sur termine
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        coche2sur.start();
        try {
            coche2sur.join(); // Esperar a que coche 2 sur termine
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        coche1norte.start();
        try {
            coche1norte.join(); // Esperar a que coche 1 norte termine
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        coche2norte.start();
        try {
            coche2norte.join(); // Esperar a que coche 2 norte termine
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
