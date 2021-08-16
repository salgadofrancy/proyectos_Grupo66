import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Scanner sca = new Scanner(System.in);
        System.out.println("¿Como te llamas?");
        String nombre = sca.nextLine();
        System.out.println("Hola, " + nombre);
        sca.close();*/
        /*Scanner sca = new Scanner(System.in);
        System.out.println("¿Cuál es el número?");
        int numero = sca.nextInt();

        if (numero > 0) {
            System.out.println("El número es mayor");
        } else {
            System.out.println("El número no es mayor");
        }*/

        /*Scanner sca = new Scanner(System.in);
        System.out.println("¿Cuál es la opción?");
        int opcion = Integer.parseInt(sca.nextLine());

        switch (opcion) {
            case 1:
                System.out.println("Es la opción 1");
                break;
            case 2:
                System.out.println("Es la opción 2");
                break;
            case 3:
                System.out.println("Es la opción 3");
                break;
            default:
                System.out.println("Opción no válida");
        }*/

        /*String saludo;
        saludo = "hola";
        char letra = 'a';
        System.out.println(saludo);
        System.out.println(letra);*/

        /*for (int i = 0; i < 10; i+=2) {
            System.out.println(i);
        }*/

        /*int numero = 0;
        while(numero < 10) {
            System.out.println(numero);
            numero = numero + 2;
        }*/

        /*int numero = 0;
        do {
            System.out.println(numero);
            numero++;
        } while (numero != 0);*/

        Operacion objetoOperacion = new Operacion();
        int numero = objetoOperacion.sumar(8, 7);
        System.out.println(numero);

        // Crear
        int valores[];
        valores = new int[3];

        // Asignar valores
        valores[0] = 10;
        valores[1] = 20;
        valores[2] = 30;

        // Recorres arreglo
        for(int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }

    }
}

