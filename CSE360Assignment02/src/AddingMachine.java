
public class AddingMachine {
	 private int total;
	 private String str;
	 
	  public AddingMachine () {
	    total = 0; // not needed - included for clarity
	    str = "0";  
	  }

	  public int getTotal () {
	    return total;
	  }

	  public void add (int value) {
		  total = total + value;
		  str += " + " + value;
	  }

	  public void subtract (int value) {
		  total = total - value;
		  str += " - " + value;
	  }

	  public String toString () {
	    return str;
	  }

	  public void clear() {
		total = 0;
		System.out.println(total);
	  }
}
