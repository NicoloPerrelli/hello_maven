package nep;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App 
{
	public static void main(String[] args) throws Exception { 
		boolean leaveTicket = false;

		//input 
		Scanner myObj = new Scanner(System.in); 

		do {
			System.out.print("\n\nEnter n'th fib sequence: ");

			String userInput = myObj.nextLine();  //user input
			
			boolean onlyNumbers = numbersOnlyRegEX(userInput);
			
			if(onlyNumbers) {
				int count = Integer.parseInt(userInput);
					switch (userInput) {
						case "1":
							System.out.println("\n" + "\033[1;32m" + "The " + userInput + "st term of the Fibonacci sequence is " + fibRecursive(count) + "\033[0m");
							break;
						case "2":
							System.out.println("\n" + "\033[1;32m" + "The " + userInput + "nd term of the Fibonacci sequence is " + fibRecursive(count) + "\033[0m");
							break;
						case "3":
							System.out.println("\n" + "\033[1;32m" + "The " + userInput + "rd term of the Fibonacci sequence is " + fibRecursive(count) + "\033[0m");
							break;
						default://need to refine to handle later numbers like 21st probably with a regex
							System.out.println("\n" + "\033[1;32m" + "The " + userInput + "th term of the Fibonacci sequence is " + fibRecursive(count) + "\033[0m");
							break;
					}
				
				leaveTicket = true;
			} else {
				System.out.println("\n" + "\033[4;31m" + "Please Enter a Whole Number." + "\033[0m" + "\n");
			}
		} while (!leaveTicket);//only leaves when we output the nth term

		myObj.close();

	}
	
	/**
	 * Checks if the String going in only contains whole numbers.
	 * @param userInput (String) String the user types in for nth position
	 * @return Boolian true if the string represents a whole number or false if not
	 * @author Nicolo Perrelli
	 */
	public static boolean numbersOnlyRegEX(String userInput){

		Pattern pattern = Pattern.compile("^\\d+$");
		Matcher matcher = pattern.matcher(userInput);

		return matcher.find();
	}


	/**
	 * Allows one to enter a whole number and get returned a position from the Fibonacci sequence using a recursive method.
	 * @param count (int) as a dynamic selection for position
	 * @return The nth position in the Fibonacci sequence as a long
	 * @author Nicolo Perrelli
	 */
	public static long fibRecursive(int count){
		if (count <= 1) {return count;}
		return fibRecursive(count - 1) + fibRecursive(count - 2);
	}
}

