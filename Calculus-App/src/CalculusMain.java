import java.util.Scanner; //

public class CalculusMain { 	
	public CalculusMain() {
		String output="";
		Scanner s = new Scanner(System.in);

		int numberOfTerms = 0;
		System.out.println("Derivatives");
		System.out.print("How many terms = ");
		// make a class foreach term
	    numberOfTerms = s.nextInt();
	    
	    System.out.println("Please Input the values (Put zero for all values if the term is Constant");
	    System.out.println();
	    term[] terms = new term[numberOfTerms];
	    for(int i = 0; i<numberOfTerms; i++) {
	    	int termNumber = i+1;
	    	System.out.println("Term " +termNumber+" "); 
	    	terms[i] = new term();
	    	term tempTerm = terms[i];
	    	System.out.print("Enter Sign (+/-): ");
	    	tempTerm.sign = s.next();
	    	
	    	String currentSign = tempTerm.sign;
	    	
	    	if(currentSign.equals("+") && i == 0) {
	    		tempTerm.sign ="";
	    	}
	    	
	    	System.out.println(currentSign);
	    	
	    	
	    	System.out.print("Enter Coefficient: ");
	    	
	    	tempTerm.coefficient = s.nextInt();

	    	System.out.print("Enter Exponent: ");

	    	tempTerm.exponent = s.nextInt();
	    	
	    	output +=tempTerm.addResult();
		    System.out.println();

	    }
	    
		System.out.println(output);
	}

	public static void main(String[] args) {
		System.out.println("Running...");

		
		new CalculusMain();

	}

}
