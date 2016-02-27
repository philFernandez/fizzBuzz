
public class FizzBuzz {

	public static void main(String[] args) {
		
		//Loop from 1 through 100
		for (int i = 1; i <= 100; i++) {
			
			if (i % 3 == 0 && i % 5 == 0) {		     //Checks for numbers that are both multiples of 5 and 3
				if (i % 10 != 0) {		             //Control flow allows 10 values printer per line
					System.out.print("FizzBuzz ");					
				}
				else
					System.out.println("FizzBuzz "); //Starts new line after 10th value
			}
			
			else if (i % 3 == 0) {		             //Checks for numbers that are multiples of 3
				if (i % 10 != 0) {		             //Control flow allows 10 values printer per line
					System.out.print("Fizz ");
				}
				else
					System.out.println("Fizz ");	 //Starts new line after 10th value
			}
			
			else if (i % 5 == 0) {		             //Checks for numbers that are multiples of 5
				if (i % 10 != 0) {		             //Control flow allows 10 values printer per line
					System.out.print("Buzz ");
				}
				else
					System.out.println("Buzz ");	 //Starts new line after 10th value
			}
			
			else {		                             //Prints numbers that are not multiples of 3 or 5
				if (i % 10 != 0) {		             //Control flow allows 10 values printer per line
					System.out.printf(i+" ");
				}
				else
					System.out.println(i);		     //Starts new line after 10th value
			}		
			
		}	
	
	}

}
