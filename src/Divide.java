/**
 * Created by Lodven on 15.11.2016.
 */
public class Divide extends Processor{
    public Divide(){this.name="Divide";}

    @Override
    public FInteger process(FInteger a, FInteger b) {
        return a.divide(b);
    }
}
