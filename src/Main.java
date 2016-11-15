public class Main {

    public static Calculator calc;

public void work(){
    calc = new Calculator(
            new Amplifier(),
            new Summator(),
            new Divider(),
            new Contractor()
    );
    System.out.print("результат умножения - ");
    System.out.println(calc.amp(
            new FInteger(3),
            new FInteger(4)
    ).getValue());
    System.out.print("результат сложения - ");
    System.out.println(calc.sum(
            new FInteger(4),
            new FInteger(12)
    ).value);
    System.out.print("результат деления - ");
    System.out.println(calc.div(
            new FInteger(7),
            new FInteger(3)
    ).getValue());
    System.out.print("результат вычитания - ");
    System.out.println(calc.con(
            new FInteger(20),
            new FInteger(10)
    ).getValue());
}
    public static void main(String[] args) {
     Main main = new Main();
             main.work();

    }

}
