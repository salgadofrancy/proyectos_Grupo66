public class Aleatorio {
    
    public static void main(String[] args){
        int numero;
        for (int i = 0; i<50; i++){
            numero = (int)Math.floor(Math.random()*100);//".floor " es un metodo que devuelve un valor entero redondeado mas bajo de la variable x
            System.out.println(numero); //Math.random genera redondeo. 
        }
    }
}
