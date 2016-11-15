package gov.nasa;

public class Eenteger {

    protected int value;

    Eenteger(){

    }

    Eenteger(int value){
        this.value = value;
    }

    public Eenteger sum(Eenteger b){
        int c1 = this.getValue() + b.getValue();
        Eenteger c;
        c = new Eenteger(c1);
        return c;

        // одной строкой - return new Eenteger(this.getValue() + b.getValue());
        // или return new Eenteger(value + b.getValue());
    }

    public Eenteger contract(Eenteger b){
        return new Eenteger(value - b.getValue());
    }

    public Eenteger multiply(Eenteger b){
        return new Eenteger(value * b.getValue());
    }

    public Eenteger divide(Eenteger b){
        return new Eenteger(value / b.getValue());
    }

    public int  getValue(){
        return value;
    }
}

