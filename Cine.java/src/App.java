public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido al Cine");

        //cliente Uno

        Cliente clienteUno = new Cliente();
        clienteUno.setCedula("19358163");
        clienteUno.setNombre("Maria");
        clienteUno.setId(1);
        clienteUno.calcularCosto(8000);
        clienteUno.generarSaludo();
        clienteUno.generarSaludo("Buenos dias");
        clienteUno.mostrarDatos();
        float costo = clienteUno.calcularCosto(8000);

        System.out.println("Cédula: " + clienteUno.getCedula()+ "\nNombre: "
                            + clienteUno.getNombre() + "\nID: " + clienteUno.getId()
                            + "\nCosto tiquete: " + costo);
        
        // cliente Dos
        ClientePremium clienteDos = new ClientePremium();
        clienteDos.setCedula("12345765");
        clienteDos.setNombre("José");
        clienteDos.setNumeroTarjeta(100);
        clienteDos.mostrarDatos();
        float costoDos = clienteDos.calcularCosto(8000);

        System.out.println();
        System.out.println("Cédula:  " + clienteDos.getCedula() + "\nNombre: "
        + clienteDos.getNombre() + "\nNúmero tarjeta: " + clienteDos.getNumeroTarjeta()
        + "\nCosto tiquete: " + costoDos);




    }
}
