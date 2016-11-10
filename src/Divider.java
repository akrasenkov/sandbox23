/**
 * Created by Владислав on 10.11.2016.
 */
public class Divider extends Processor {


    @Override
    public FInteger process(FInteger a,FInteger b){return a.divide(b);}
}
