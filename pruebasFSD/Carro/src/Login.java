public class Login {
    private String nombreUsuario;
    private String clave;

    public void saludar(){
        System.out.println("Hola, tu nombre de usuario es "+ nombreUsuario);

    }
    //Setter, se utiliza para ajustar el valor de un atributo privado
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    /*
    //los setter regresan un valor, es un metodo
    public void setnombreUsuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;

    }
    //getter, se utiliza para obtener el valor de un atributo privado
    public String getnombreUsuario(){
        return this.nombreUsuario;
        }
        */ 
}
