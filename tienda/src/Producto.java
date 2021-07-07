public class Producto {
    
    private String nombre = "";
    private float precio = 0;

    public Producto() {

    }

    public void mostrar() {
        String precioTexto = String.format("%,d", (int)precio); //esta linea da formato al valor para separar los miles
        System.out.println(nombre + ": " + precioTexto);
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre; // this es un señalador, hace referencia que le pertenece asi mismo
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }
    public float getPrecio() {
        return this.precio;
    }
}
