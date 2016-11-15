package gov.nasa;

public class Contractor extends Processor {

    public Contractor() {
        this.name = "Contractor";
    }

    @Override
    public Eenteger process(Eenteger a, Eenteger b) {return a.contract(b);}

}
