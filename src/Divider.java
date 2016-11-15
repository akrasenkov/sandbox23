/**
 * Created by Павел on 16.11.2016.
 */
public class Divider extends Processor {

    public  Divider() {
        this.name = "Divider";
    }

    @Override
    public FInteger process(FInteger a, FInteger b) {
        return a.divide(b);
    }
}
