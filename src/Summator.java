/**
 * Created by 12ё221 on 09.11.2016.
 */
public class Summator extends Processor {

    public Summator() {
        this.name = "Summator";
    }

    @Override
    public FInteger process(FInteger c, FInteger d){
        return c.sum(d);
    }

}
