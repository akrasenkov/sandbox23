public class Main {

    public static Calculator calc;

    public void init() {
        calc = new Calculator(
                new Amplifier(),
                new Summator(),
                new Division(),
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
                new FInteger(3),
                new FInteger(4)
        ).getValue());
        System.out.println(calc.con(
                new FInteger(4),
                new FInteger(12)
        ).getValue());
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.init();
    }

}
