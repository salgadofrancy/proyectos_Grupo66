//realizar un ejercicio que reciba un numero entero por consola
// y cuente cuantas cifras tiene el numero e imprima la cantidad
//de cifras que tiene el numero
import java.util.Scanner; // esto es para capturar pon consola un numero o letra

public class Ejercicio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un número entero");
        int numero = sc.nextInt();
        int digitos = numcifras(numero);// creamos funcion que al mandar el numero ella me retorne la cantidad
        System.out.println("El numero tiene: " + digitos+ " Cifras");
                
    }
    public static int numcifras(int numero){
        int cifras = 0;
        while(numero != 0){
            numero /=10;
            cifras++;
        }
    return cifras;
    }
    
}
