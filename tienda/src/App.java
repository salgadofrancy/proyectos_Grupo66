public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("La Tienda de Ropa");

        Producto productoUno = new Producto(); //igual al nombre del constructor que se creo en prducto.java
//puedo crear varios productos
        productoUno.setNombre("Falda");
        productoUno.setPrecio(70000);
        productoUno.mostrar(); // es la instruccion de la linea 11 de producto.java

        
    }
}
