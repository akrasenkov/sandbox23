public class Main {

    public static Calculator calc;

    public static void main(String[] args) {
       Main main = new Main();
    }
    public Main() {
        init();
    }
    private void init() {
        calc = new Calculator(
                new Amplifier(),
                new Summator(),
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
        System.out.println(calc.contract(
                new FInteger(6),
                new FInteger(3)
        ).getValue());
        System.out.println(calc.divide(
                new FInteger(63),
                new FInteger(7)
        ).getValue());
    }

}
