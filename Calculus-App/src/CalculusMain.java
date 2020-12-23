import java.util.Scanner; //

public class CalculusMain { 	
	public CalculusMain() {
		String output=" ";
		Scanner s = new Scanner(System.in);

		int numberOfTerms = 0;
		System.out.println("Derivatives");
		System.out.print("How many terms = ");
		// make a class foreach term
	    numberOfTerms = s.nextInt();
	    
	    
	    term[] terms = new term[numberOfTerms];
	    for(int i = 0; i<numberOfTerms; i++) {
	    	System.out.println("Term " + i +" "); 
	    	terms[i] = new term();
	    	term tempTerm = terms[i];
	    	System.out.print("Enter Coefficient: ");
	    	
	    	tempTerm.coefficient = s.nextInt();
	    	int currentCoefficient = tempTerm.coefficient;

	    	System.out.print("Enter Exponent: ");

	    	tempTerm.exponent = s.nextInt();
	    	int currentExponent = tempTerm.exponent;
	    	
	    	int resultCoeficient = (currentExponent-1)*currentCoefficient;
	    	
	    	
	    	
	    }
	    
	    // ask for the user inputs 
	    

		System.out.println("Prining valu of numberOfTerms "+numberOfTerms);
		
		// make a for loop that asks contiuously for the values 
		
	}
		
	

	public static void main(String[] args) {
		System.out.println("Running...");
		new CalculusMain();

	}

}
