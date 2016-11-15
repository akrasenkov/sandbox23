/**
 * Created by Павел on 16.11.2016.
 */
public class Contracter extends Processor {

    public  Contracter() {
        this.name = "Contracter";
    }
    @Override
    public FInteger process(FInteger a, FInteger b) {
        return a.contract(b);
    }
}
