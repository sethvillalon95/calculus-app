
public class term {
	int coefficient = 1;
	int exponent = 1;
	String sign="+";

	
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
		if(coefficient != 0 && exponent != 0) {
			// convert int to string 
			String tempCoef = Integer.toString(coefficient);
			String tempExp = Integer.toString(exponent);
			
			if(exponent == 1) {
				finalResult += tempCoef+"x"+" ";
			}else {
				finalResult += tempCoef+"x"+"^"+tempExp+ " ";
			}
			

			

			
			return finalResult;

		}
		return finalResult;
		
	}
	
	
	
	
}
