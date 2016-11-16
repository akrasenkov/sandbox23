public class Main {

    public static Calculator calc;

    public static void main(String[] args) {
        Main main = new Main();
    }

    public Main(){
        init();
    }
    public void init(){
        calc = new Calculator(
                new Amplifier(),
                new Summator(),
                new Contractor(),
                new Divider()
        );

        System.out.println("5 * 10 = " + calc.amp(
                new FInteger(5),
                new FInteger(10)
        ).getValue());

        System.out.println("45 + 5 = " + calc.sum(
                new FInteger(45),
                new FInteger(5)
        ).getValue());

        System.out.println("64 - 14 = " + calc.cont(
                new FInteger(64),
                new FInteger(14)
        ).getValue());

        System.out.println("100 / 2 = " + calc.div(
                new FInteger(100),
                new FInteger(2)
        ).getValue());
    }

}
