/**
 * Created by Nik Up on 16.11.2016.
 */
public class Contractor extends Processor
{
    public Contractor() {
        this.name = "Contractor";
    }

    @Override
    public FInteger process(FInteger z, FInteger x) {
        return z.contract(x);
    }
}
