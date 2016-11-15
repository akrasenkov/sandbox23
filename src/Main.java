package gov.nasa;

public class Main
{

    //public static Application app, app2;

    public static Calculator calc;

    public Main() {
        calc = new Calculator(
                new Amplifier(),
                new Summator(),
                new Contractor(),
                new Divider()
        );
        CalcOut();
    }

    public void CalcOut(){
        System.out.println(calc.mult(
                new Eenteger(3),
                new Eenteger(4)
        ).getValue());
        System.out.println(calc.sum(
                new Eenteger(1),
                new Eenteger(5)
        ).getValue());
        System.out.println(calc.divd(
                new Eenteger(6),
                new Eenteger(3)
        ).getValue());
        System.out.println(calc.contr(
                new Eenteger(15),
                new Eenteger(14)
        ).getValue());
    }


    public static void main(String[] args)
    {
        Main main = new Main();
    }

}