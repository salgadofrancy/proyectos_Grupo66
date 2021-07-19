public class Cadena {
    public static void main(String[] args){
        String mensaje = "    Esto es un ejemplo  " ;
        System.out.println(mensaje.toUpperCase()); //muestra el mensaje con los espacios en blanco que contenga
        System.out.println(mensaje.trim().length());//imprime la cantidad de caracteres, sin los espacios en blanco iniciales y los finales
        System.out.println(mensaje.length());// .length cuenta la cantidad de caracteres incluidos los espacios

        int numero1 = 2546;
        String cadena = String.valueOf(numero1);
        int cifras = cadena.length();
        System.out.println(cifras);
        
    }
}
