import java.util.Scanner; //

public class CalculusMain { 	
	public CalculusMain() {
		Scanner s = new Scanner(System.in);

		int numberOfTerms = 0;
		System.out.println("Derivatives");
		System.out.print("How many terms = ");
		// make a class foreach term
	    numberOfTerms = s.nextInt();
	    
	    //int terms[numberOfTerms];
	    
	    term[] terms = new term[numberOfTerms];
	    for(int i = 0; i<numberOfTerms; i++) {
	    	System.out.println("Term " + i +" "); 
	    	terms[i] = new term();
	    	term tempTerm = terms[i];
	    	tempTerm.coefficient = s.nextInt();
	    	tempTerm.exponent = s.nextInt();
	    	
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
