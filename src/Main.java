public class Main {

    public Main(){
        Calculator calc;

        calc = new Calculator(new Summator(), new Contractor(), new Amplifier(), new Divider());
        System.out.println(calc.sum(new FInteger(21),new FInteger(2)).getValue());
        System.out.println(calc.cont(new FInteger(100),new FInteger(5)).getValue());
        System.out.println(calc.amp(new FInteger(4),new FInteger(7)).getValue());
        System.out.println(calc.div(new FInteger(400),new FInteger(4)).getValue());
    }
    public static void main(String[] args) {
        Main main = new Main();
    }
}
