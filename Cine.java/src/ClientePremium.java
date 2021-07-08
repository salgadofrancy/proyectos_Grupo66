public class ClientePremium extends Persona implements tickete {

    private int numeroTarjeta;
    @Overraide
    public float calcularCosto(float costoBase){
        float costoReal = (float)(costoBase - (costoBase * 0.5));

    }
    
}
