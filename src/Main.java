public class Main {

    public Main(){
        calc = new Calculator(
                new Summator(),
                new Amplifier(),
                new Contractor(),
                new Diveder()
        );

        System.out.println(calc.amp(
                new FInteger(3),
                new FInteger(4)
        ).getValue());
        System.out.println(calc.sum(
                new FInteger(4),
                new FInteger(12)
        ).getValue());
        System.out.println(calc.cot(
                new FInteger(2),
                new FInteger(5)
        ).getValue());
        System.out.println(calc.div(
                new FInteger(8),
                new FInteger(2)
        ).getValue());
    }

    public static Calculator calc;

    public static void main(String[] args) {
        Main main = new Main();
    }
}
