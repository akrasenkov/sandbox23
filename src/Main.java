public class Main {

    public static Calculator calc;

    public static void main(String[] args) {
        calc = new Calculator(
                new Amplifier(),
                new Summator(),
                new Divider(),
                new Contracter()
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
                new FInteger(36),
                new FInteger(9)
        ).getValue());
        System.out.println(calc.con(
                new FInteger(40),
                new FInteger(12)
        ).getValue());
    }

}
