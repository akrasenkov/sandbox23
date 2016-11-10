/**
 * Created by Владислав Султаняров on 10.11.2016.
 */
public class Contractor extends Processor{

    public Contractor(){this.name = "Contractor";}

    @Override
    public FInteger process(FInteger a,FInteger b){return a.contract(b);   }

}
