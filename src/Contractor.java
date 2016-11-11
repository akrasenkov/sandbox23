package www.shooone;

public class Contractor extends Processor{

    public Contractor() {
        this.name = "Constractor";
    }

    @Override
    public FInteger process(FInteger a, FInteger b){
        return a.contract(b);
    }
}