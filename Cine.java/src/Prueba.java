import java.util.ArrayList;
import java.util.Scanner;

public class Prueba {
    //try { // termina el bloque con excepciones 

    private ArrayList<Cliente> listaClientes; //aqui se declara y se crea aparte con metodos o constructor

    //agregamos un constructor, sin  void
    public Prueba(){
        listaClientes = new ArrayList<>();
    }
//agregamos metodo, 
public void agregarCliente(Cliente pCliente){// dentro del parentesis va un objeto ya construido, para diferenciarlo agrega una p como parametro 
    listaClientes.add(pCliente);
    
}

public void mostrarNombreClientes(){
    System.out.println("Nombre de Clientes");
    for (int i = 0; i< listaClientes.size(); i++){
        System.out.println(listaClientes.get(i).getNombre());

    }
}
public void mostrarDatosClientes() {
    String cadenaClientes = "";
    System.out.println("Datos de clientes");
    for (int i = 0; i < listaClientes.size(); i++){
        String datos = "\nCédula: " + listaClientes.get(i).getCedula()
                        + "\nNombre: " + listaClientes.get(i).getNombre()
                        + "\nID: " + listaClientes.get(i).getId();
        cadenaClientes = cadenaClientes.concat(datos);
    }
    System.out.println(cadenaClientes);
}  

    public void generarLista(){
        //System.out.println("Ingreso al metodo prueba"); // aqui se prueba si esta funcionando el metodo
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        Scanner sca = new Scanner(System.in);
        int numero = 0;
        while (numero >=0){
        System.out.println("Ingrese un número, y para salir digite un (Número negativo para salir)");
        numero = sca.nextInt();
        if(numero >=0){
            listaNumeros.add(numero);
            }
        }
        System.out.println();

        //ciclo for
        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.println(listaNumeros.get(i));
        }

        System.out.println("_____");

        //ciclo for each
        listaNumeros.forEach((elemento) -> {
            System.out.println(elemento);
            //elemento = elemento *2;
        });

        //catch(Excepcion e){
        //    System.out.println("Solo se permite el ingreso de números"); //en la mlinea 5 va el try
        //finally{
            System.out.print("Finalizo metodo: ");// lo inhabito para ver todo lo que hace el programa
        }
    }
    

