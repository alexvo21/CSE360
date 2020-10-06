
public class AMTest {

	private static AddingMachine myCalculator;

	public static void main(String[] args) {
		myCalculator = new AddingMachine();
		String input;
		int total;
		
		
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		myCalculator.getTotal();
		
		input = myCalculator.toString();
		System.out.println(input);
		total = myCalculator.getTotal();
		System.out.println(total);
	
		myCalculator.clear();


		
	}

}
