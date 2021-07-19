import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

public class datos {
   public static void main(String[] args) {
    // definir una variable   
    byte num1;
    num1 = 10;
    byte num2 = 20;
    int resultado;
    resultado = num1 + num2;
    System.out.println(resultado);
    /*
    Scanner sca = new Scanner(System.in);
    System.out.println("¿Como te llamas?");
    String nombre = sca.nextLine();
    System.out.println("Hola! Bienvend@, " + nombre);
    


    int n1 = 30, n2 = 50, n3 = 25;
    int resultado2;
    resultado2 = n1 + n2 + n3;
    System.out.println(resultado2);
    char letra1 = 'a';
    char letra2 = 90; // me imprime la letra que le corresponde el 90 con el codigo ascci
    float num3 = 4.5f;
    System.out.println(num3); // ojo si le doy el print aqui solo imprime 4.5, aun no esta la operacion definida
    num3 = n1 + n2;

    String  saludo;
    saludo = "Bendecido dia";
    String mensaje = "Hola estamos ensayando variables";

    System.out.println(letra1);
    System.out.println(letra2);
    System.out.println(num3);
    System.out.println(saludo);
    System.out.println(mensaje);
    
    
    // operadores aritmeticos los de siempre
    // puedo definir diferentes variables en una misma linea pero deben ser de la misma especie
    
    n1 = n1 + 1;
    n1++; //incremento, actuan como contadores
    n2 --; // decremento
    n1 += 10; // cada vez que haga un incremento sume 10
    System.out.println(n1);
    System.out.println(n2);

    //operadores relacionales <> <= >= /=

    boolean resultado3;
    resultado3 = n1>n2;
    System.out.println(resultado3);
/*
    Scanner sc = new Scanner(System.in);
    System.out.println("¿Cual es el numero?");
    int numero = sc.nextInt();

    if (numero > 0) {
       System.out.println("El numero es mayor");
    } else {
       System.out.println("El numero No es menor");
    }
*/
/*
    Scanner sca1 = new Scanner(System.in);
    System.out.println("¿Cual es la opcion?");
    int opcion = Integer.parseInt(sca1.nextLine());

    switch (opcion){
       case 1:
         System.out.println("Es la opcion 1");
         break;
      case 2:
      System.out.println("Es la opcion 2");
         break;
      case 3:
         System.out.println("Es la opcion 3");
         break;
      default:
         System.out.println("Opcion no valida");

    }
*/
/*
    for (int i = 0; i < 10; i+=2) {
       System.out.println(i);
    }

*/

    //Operadores logicos: and:&& or:// not: !
    // operador ternario, estructura parecida al if, (IFTTT) propio de java
    // expresion 1? pregunta, expresion2: va con los dos puntos y  expresion3: si es falsa

    /*
    mensaje = n1 == n2 ? "son iguales": "No son iguales";
    System.out.println(mensaje);
    */
/*
    int numero = 0;
    while(numero < 10) {
         System.out.println(numero);
         numero = numero + 2;

    }*/
 /*
    int numero = 0;
        while(numero < 10) {
            System.out.println(numero);
            numero = numero + 2;
        }

int numero = 0;
        do {
            System.out.println(numero);
            numero++;
        } while (numero != 0);
|
&
||
&&

  
int resultado = a + b;
double pi = Math.PI;
System.out.println(pi);
return resultado;


Operacion  objetoOperacion = new Operacion();
int numero = objetoOperacion.sumar(8, 9);
System.out.println(numero);

*/

        //crear arreglo
        int valores[];
        valores = new int[3];
        
        //asignar valores al arreglo
        
        valores[0] = 10;
        valores[1] = 20;
        valores[2] = 30;

        //recorrer arreglo

        for(int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
        }



   } 
}