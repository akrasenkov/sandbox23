public class Main {

    public void init() {
        Calculator calc = new Calculator(
                new Summator(),
                new Contractor(),
                new Amplifier(),
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
        System.out.println(calc.con(
                new FInteger(10),
                new FInteger(3)
        ).getValue());
        System.out.println(calc.div(
                new FInteger(20),
                new FInteger(5)
        ).getValue());
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.init();
    }

}
