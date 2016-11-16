/**
 * Created by Nik Up on 16.11.2016.
 */
public class Divider extends Processor
{
    public Divider() {
        this.name = "Divider";
    }

    @Override
    public FInteger process(FInteger e, FInteger q) {
        return e.divide(q);
    }
}
