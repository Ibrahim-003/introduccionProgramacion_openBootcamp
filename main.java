/**
 * main
 */
public class main {

    public static void main(String[] args) {
        // PRIMERA PARTE - usando la funcion suma
        int resultado = suma(10, 25, 32);
        System.out.println(resultado);

        // SEGUNDA PARTE - creando objetos
        Coche miCoche = new Coche();
        miCoche.aumentarPuerta();
        System.out.println(miCoche.numPuertas);
    }

    public static int suma(int x, int y, int z) {
        return x + y + z;
    }
}

class Coche {
    public int numPuertas = 4;

    public void aumentarPuerta() {
        this.numPuertas++;
    }
}