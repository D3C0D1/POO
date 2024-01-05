import java.util.Random;
import java.util.Scanner;

class Personaje {
    String nombre;
    int salud;
    int ataque;

    public Personaje(String nombre, int salud, int ataque) {
        this.nombre = nombre;
        this.salud = salud;
        this.ataque = ataque;
    }

    public void atacar(Enemigo enemigo) {
        System.out.println(nombre + " ataca a " + enemigo.nombre + "!");
        enemigo.recibirAtaque(ataque);
    }

    public void recibirAtaque(int cantidad) {
        salud -= cantidad;
        if (salud <= 0) {
            System.out.println(nombre + " ha sido derrotado.");
        } else {
            System.out.println(nombre + " tiene " + salud + " puntos de salud restantes.");
        }
    }
}

class Enemigo {
    String nombre;
    int salud;
    int ataque;

    public Enemigo(String nombre, int salud, int ataque) {
        this.nombre = nombre;
        this.salud = salud;
        this.ataque = ataque;
    }

    public void atacar(Personaje personaje) {
        System.out.println(nombre + " ataca a " + personaje.nombre + "!");
        personaje.recibirAtaque(ataque);
    }

    public void recibirAtaque(int cantidad) {
        salud -= cantidad;
        if (salud <= 0) {
            System.out.println(nombre + " ha sido derrotado.");
        } else {
            System.out.println(nombre + " tiene " + salud + " puntos de salud restantes.");
        }
    }
}

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("¡Bienvenido al juego de rol!");

        // Crear personaje
        System.out.println("Ingresa el nombre de tu personaje:");
        String nombrePersonaje = scanner.nextLine();
        Personaje jugador = new Personaje(nombrePersonaje, 100, 20);

        // Crear enemigo
        Enemigo enemigo = new Enemigo("El cachón", 50, 15);

        // Comienza la batalla
        System.out.println("Te encuentras frente a un " + enemigo.nombre + ". ¡Prepárate para la batalla!");

        while (jugador.salud > 0 && enemigo.salud > 0) {
            System.out.println("\n¿Qué deseas hacer?");
            System.out.println("1. Atacar");
            System.out.println("2. Huir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    jugador.atacar(enemigo);
                    enemigo.atacar(jugador);
                    break;
                case 2:
                    System.out.println("Has decidido huir. ¡Hasta la próxima!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige 1 o 2.");
            }
        }

        scanner.close();
    }
}