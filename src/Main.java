/**
 * Created by Admin on 09.11.2016.
 */
public class Main {
    public static Calculator calc;

    public static void main(String[] args) {
        Main main = new Main();
    }

    public Main(){
        calc = new Calculator(
                new Amplifier(),
                new Summator(),
                new Contractor(),
                new Divider()
        );
         System.out.println(calc.sum(new FInteger(3), new FInteger(4)).getValue());
         System.out.println(calc.amp(new FInteger(2), new FInteger(8)).getValue());
         System.out.println(calc.div(new FInteger(31), new FInteger(11)).getValue());
         System.out.println(calc.con(new FInteger(40), new FInteger(4)).getValue());
            }
}
/*
public static Calculator calc;

public static void main(String[] args) {
Main main = new Main();
}

public Main(){
calc = new Calculator(
new Amplifier(),
new Summator(),
new Contractor(),
new Divider()
);
 */