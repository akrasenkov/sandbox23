/**
 * Created by Lodven on 15.11.2016.
 */
public class Diveder extends Processor{
    public Diveder(){this.name="Diveder";}

    @Override
    public FInteger process(FInteger a, FInteger b) {
        return a.divide(b);
    }
}
