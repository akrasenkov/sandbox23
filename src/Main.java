public class Main {

    public static Calculator calc;

    public static void main(String[] args) {
        Main main = new Main();
    }
    public Main()
    {
        init();
    }

    public static void init() {
        calc = new Calculator(
                new Summator(),
                new Amplifier(),
                new Contractor(),
                new Divider()
        );
        System.out.println(calc.amp(
                new FInteger(3),
                new FInteger(4)
        ).getValue());
        System.out.println(calc.sum(
                new FInteger(4),
                new FInteger(12)
        ).getValue());
        System.out.println(calc.cont(
                new FInteger(50),
                new FInteger(15)
        ).getValue());
        System.out.println(calc.div(
                new FInteger(8),
                new FInteger(2)
        ).getValue());
    }
}
