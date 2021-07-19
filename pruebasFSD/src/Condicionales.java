import java.util.Scanner;
public class Condicionales {
    public static void main(String[] args) {
        //if (condicion){} else if (condicion) {} else {}
        Scanner sc = new Scanner(System.in);//Scanner es una clase
        System.out.println("Digite el color  de su tarjeta");
        String color = sc.nextLine(); //indica que lo que voy a leer es una cadena de texto
/*
        if (color == "Rojo") {
            System.out.println("PARE");
        }else if(color == "Verde"){
            System.out.println("SIGA");
        }else if(color == "Amarillo"){
            System.out.println("PREVENCION");
        }else{
            System.out.println("OPCION NO VALIDA");
            */
        switch(color){
            case"Rojo":
            System.out.println("PARE");
            break;

            case "Amarillo":
            System.out.println("PREVENCION");
            break;

            case "Verde":
            System.out.println("SIGA");
            break;

            default:
            System.out.println("OPCION NO VALIDA");
            break;


        }
        
    }

    }