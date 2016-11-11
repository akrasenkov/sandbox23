/**
 * Created by 12ё221 on 11.11.2016.
 */
public class Contractor extends Processor{

    public Contractor() {
        this.name = "Constractor"; // Конструктор
    }

    @Override
    public FInteger process(FInteger y, FInteger z){
        return y.contract(z);
    }
}
