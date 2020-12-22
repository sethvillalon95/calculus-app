import java.util.Scanner; //

public class CalculusMain { 	
	public CalculusMain() {
		Scanner s = new Scanner(System.in);

		int numberOfTerms = 0;
		System.out.println("Derivatives");
		System.out.print("How many terms = ");
	    numberOfTerms = s.nextInt();

		System.out.println("Prining valu of numberOfTerms "+numberOfTerms);
		
		// make a for loop that asks contiuously for the values 
		
	}
		
	

	public static void main(String[] args) {
		System.out.println("Running...");
		new CalculusMain();

	}

}
