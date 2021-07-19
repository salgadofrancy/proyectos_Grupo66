public class Carro {
        String marca;
        String color;
        Integer modelo;
        
        void establecerAtributos(String marca, String color, Integer modelo){
            this.marca = marca; //this. se refiere a otros constructores de la clase
            this.color = color;
            this.modelo = modelo;
        }
        
        void acelerar(){//los nombres de los metodos son verbos e inician  en minuscula 
            System.out.println("El carro esta acelerado");
        }
        void frenar(){
            System.out.println("El carro se esta deteniendo");
        }
    
    
}
