public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola! creación de un objeto, -carro1- con sus atributos y metodos, se debe ejecutar desde el principal que es APP.java");
        //instancia
        Carro carro1 = new Carro();
        //carro1.color ="Rojo";
        //carro1.marca = "Nissan";
        //carro1.modelo = "2020";
        carro1.establecerAtributos("Nissan", "Rojo", 2020);
        System.out.println("La marca del carro es " + carro1.marca);
        System.out.println("El color del carro es " + carro1.color);
        System.out.println("El modelo del carro es " + carro1.modelo);
        carro1.acelerar();
        carro1.frenar();

        //instancia a la clase circulo
        Circulo circulo1 = new Circulo(); 
        circulo1.radio = 5;
        System.out.println("El área del círculo es: " + circulo1.area());
        //System.out.println(circulo1.PI);

        //instancia class login
        Login Francy = new Login();
        Francy.setNombreUsuario("FrancySD");
        Francy.setClave("123");
        Francy.saludar();
        System.out.println("Su nombre de usuario es "+ Francy.getNombreUsuario());
        System.out.println("Su clave es "+ Francy.getClave());
        
    }
    
}
/*

class Carro{//los nombres de las clases comienzan por mayusculas
//Estos son los atributos
//los nombres de los aributos inician con minusculas
String marca;
String color;
Integer modelo;

void establecerAtributos(String marca, String color, Integer modelo){
    this.marca = marca; //this. se refiere a otros constructores de la clase
    this.color = color;
    this.modelo = modelo;
}

void acelerar(){//los nombres de los metodos son verbos e inician  en minuscula 
    System.out.println("El carro esta acelerado");
}
void frenar(){
    System.out.println("El carro se esta deteniendo");
}


}
*/
