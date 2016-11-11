public class Main {

    public static Calculator calc;

    public static void main(String[] args) {
		Main main = new Main();
		main.init();
		main.start();
    }
	
	public void init() {
		calc = new Calculator(
                new Summator(),
                new Amplifier(),
                new Divider(),
                new Contractor()
        );
	}
	
	public void start() {
		System.out.println(calc.amp(
			new FInteger(3),
			new FInteger(4)
			).getValue());
		
        System.out.println(calc.sum(
			new FInteger(4),
			new FInteger(12)
        ).getValue());
        
		System.out.println(calc.div(
			new FInteger(1212),
			new FInteger(2)
        ).getValue());
        
		System.out.println(calc.con(
                new FInteger(1234),
                new FInteger(4321)
        ).getValue());
	}

}