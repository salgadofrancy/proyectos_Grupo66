public class Circulo {
    float radio;
private final float PI = 3.14159f; // los nombres de las constantes deben escribirse en mayuscula sostenida
// creamos el metodo, retornara un valor, no puede iniciar por void. Inicia por el tipo de dato
    float area(){
        float area1 = (float)(PI*Math.pow(this.radio, 2));//casting de java para pasarlo a float
        return area1;


    }
}
