import java.util.Scanner;

public class LeerMultipliNum {
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        var numero = sc.nextInt();

        System.out.println("El doble del numero digitado es: "+ dupli);
    }

    public static int numeroDoblado(int numero){
        var dupli = 0;

        while (numero != 0){
            numero *=2;
            //cifras++;
        }
        return dupli;
        
    }
    }

