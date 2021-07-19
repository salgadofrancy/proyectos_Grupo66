public class ciclowhile {
    public static void main(String[] args) throws Exception { // asi como en python definiamos una funcion "def" aqui se hace con "void" solo que ella no retorna ningun dato
    // Ciclo while
    // conteo del 0 al 20
    // tambien puedo colocar var en lugar de escribir int y el resultado es el mismo    
    //var permite qu el tipo de dato sea definido por la asignacion de dato
    int conta = 0;
    while (conta <=20){
        System.out.println(conta);
        conta++;
    }
    System.out.println("------------------------Con Do While");
    //do while, deja entrar al ciclo por que la condicion esta a la salida 
    // mientras que en el while la condicion esta a la  entrada. Revisa empezando
    conta = 0; // se inicia la variable
    do{
        System.out.println(conta);
        conta++;
    }while(conta <=20);


}

}
