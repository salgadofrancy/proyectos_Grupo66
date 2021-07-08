public class Cliente  extends Persona implements Tickete{

    private int id;

    @Override
    public float calcularCosto(float costoBase) { 
        float costoReal = costoBase - 1000;
        return costoReal;

    }
}
