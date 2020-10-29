public class FizzBuzz {

	public static void main(String[] args) {
            final int FIZZ = 3;
            final int BUZZ = 5;

	//Loop from 1 through 100
            for (int i = 1; i <= 100; i++) {
                // since 3 and 5 are both prime, their GCD is 1, and their LCM is 5 * 3
                // and all of their common multiples are multiples of 5 * 3
                if (i % (FIZZ * BUZZ) == 0)
                    System.out.print("FizzBuzz ");
                else if(i % FIZZ == 0)
                    System.out.print("Fizz ");
                else if(i % BUZZ == 0)
                    System.out.print("Buzz ");
                else
                    System.out.print(i + " ");

            // Give us a new line after every 10 print statements
                switch(i % 10) {
                    case(0) : System.out.println();
                }
	    }
    }
}
