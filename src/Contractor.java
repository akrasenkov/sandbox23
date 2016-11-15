/**
 * Created by Lodven on 15.11.2016.
 */

public class Contractor extends Processor {
    public Contractor() {this.name="Contractor";}

    @Override
    public FInteger process(FInteger a, FInteger b) {
        return a.contract(b);
    }
}
