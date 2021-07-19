public class Saludo {
    public static void main(String[] args){
        var nombre = "Francy Stella";
        var resultado = Saludo(nombre);
        System.out.println(resultado);
    }
    public static String Saludo(String nombre){
        return "Hola " + nombre + "! Bienvenida";
    }
}
