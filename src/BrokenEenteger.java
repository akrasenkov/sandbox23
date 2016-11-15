package gov.nasa;

public class BrokenEenteger extends Eenteger {

    public BrokenEenteger(int value) { /* конструктор BrokenEenteger*/
        super(value);   /*обращение к родителю класса*/
    }

    @Override
    public Eenteger sum(Eenteger b) {
        return new Eenteger(value + b.getValue() + 500);
    }
}
