public class Main {

    public static Calculator calc;

    public static void main(String[] args) {
        calc = new Calculator(
                new Summator(),
                new Amplifier()
        );
        System.out.println(calc.amp(
                new FInteger(3),
                new FInteger(4)
        ).getValue());
        System.out.println(calc.sum(
                new FInteger(4),
                new FInteger(12)
        ).getValue());
    }

}
