public class Main {

    public static Calculator calc;

    public static void main(String[] args)
    {
       Main main = new Main();
       main.init();

    }
    public void init()
    {
        calc = new Calculator(
                new Summator(),
                new Amplifier(),
                new Divider(),
                new Contractor()
        );
        System.out.println(calc.amp(
                new FInteger(3),
                new FInteger(4)
        ).getValue());
        System.out.println(calc.sum(
                new FInteger(4),
                new FInteger(12)
        ).getValue());
        System.out.println(calc.div(
                new FInteger(5),
                new FInteger(4)
        ).getValue());
        System.out.println(calc.con(
                new FInteger(20),
                new FInteger(2)
        ).getValue());
    }

}
