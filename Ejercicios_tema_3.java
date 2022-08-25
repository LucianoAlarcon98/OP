public class Funciones {

    public static void main (String[] args)
    {
        numeros( 1, 2,3);

        Coche miCoche = new Coche();
        System.out.println(miCoche.puertas);

        miCoche.Incrementarpuertas();
        System.out.println(miCoche.puertas);

        miCoche.Incrementarpuertas();
        System.out.println(miCoche.puertas);


    }

    private static void numeros(int a, int b, int c  ) {
        int suma = a + b + c;
        System.out.println(suma);
    }
}


    class Coche {
        public int puertas = 0;

        public void Incrementarpuertas() {
            this.puertas++;

        }
    }

