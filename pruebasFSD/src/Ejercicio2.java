//Realiza una aplicacion que nos pida un numero de ventas a introducir
//despues nos pedira tantas ventas por teclado como numero de ventas se hayan indicado
//Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no

import java.util.Scanner;
public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite cuantas ventas realizó ");
        int cantVentas = sc.nextInt();
        int sumaVentas = 0;
        for (int i= 1; i<=cantVentas; i++){
            System.out.println("Ingrese el valor de la venta N° " + i);
            int ventas = sc.nextInt();
            sumaVentas +=ventas; // sumaVentas = sumaVentas + ventas
            
        }
        //String ventas = String.format("%,d", (int)sumaVentas); //esta linea da formato al valor para separar los miles
        System.out.println("Las ventas totales fueron: $ "+ sumaVentas);

    }
}
