/** This program calculated Pi up to the sixth digit 
*/

public class r118 {

	public static void main(String[] args) {
		
		double pi = 0;
		
		for (int i = 1000000; i > 0; i--) {
		      pi += Math.pow(-1, i + 1) / (2 * i - 1); // Calculate series in parenthesis
		      if (i == 1) { // When at last number in series, multiply by 4
		        pi *= 4;    
		        System.out.println(pi); // Print result
		      }  
		}
		
		// 2nd solution
		      double pi2 = 0;
		      double sum = 0;
		      double sum2 = 0;
		      
		      for(double j=1; j<10000000; j+=4) {
		    	 sum += 1 / j;  
		    	 }
		    	 for(double k=3; k<10000000; k+=4) {
		    		  sum2 += 1 / k;
		    	  }
		    	 pi2 = 4 * (sum - sum2);
		    	 System.out.println(pi2); 
		      
		// double pi = 4 * (1 - 1/3 + 1/5 -1/7 + 1/9 -....);
		

	}

}
