/**
 * Created by Lodven on 15.11.2016.
 */

public class Contract extends Processor {
    public Contract() {this.name="Contract";}

    @Override
    public FInteger process(FInteger a, FInteger b) {
        return a.contract(b);
    }
}
