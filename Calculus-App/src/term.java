
public class term {
	int coefficient = 1;
	int exponent = 1;
	
	
	// do the calculations here for better encapsulation 
	public term() {
		
	}
	
	public term(int c, int e) {
		coefficient =c;
		exponent = e; 
	}
	
	public term(int c) {
		coefficient =c;
	}
	
	public void compute() {
		int resultCoefficient = coefficient*exponent;
		int resultExponent = exponent-1;
		
		coefficient = resultCoefficient;
		exponent = resultExponent;
		
	}
	
	public String addResult() {
		compute();
		String finalResult ="";
		if(coefficient != 0) {
			// convert int to string 
			String tempCoef = Integer.toString(coefficient);
			String tempExp = Integer.toString(exponent);
			
//			System.out.println("The Coefficient is "+ tempCoef + "The exponent is "+ tempExp);
			
			
			
			if(exponent == 1) {
				finalResult += tempCoef+"x";
			}else {
				finalResult += tempCoef+"x"+"^"+tempExp;
			}
			
			// return the coefficient with just x 
//			if(coefficient ==1) {
//				finalResult+= temp
//			}
			
			

			
			// return 
			return finalResult;

		}
		return finalResult;
		
	}
	
	
	
	
}
