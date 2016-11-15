public class Contractor extends Processor{

    public Contractor() { this.name = "Contractor"; }

    @Override
    public FInteger process(FInteger e, FInteger f) {return e.contract(f);}

}
