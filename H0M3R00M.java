java import java.util.Scanner;  
public class H0M3R00M {
//The code is still in progress
public static void main(String[] args) {         
	Scanner scanner = new Scanner(System.in);                 
	System.out.println("Hi! Welcome to the H0M3R00M virtual assistant! I am at your command, Let's start by telling me your name.");         
		String name1 = scanner.nextLine();                 
		System.out.println("Well its nice to meet you " + name1 + "! How may I assist you?");         
			String userInput;         
			do {             
			System.out.println("You: ");        
			userInput = scanner.nextLine();             
				String response1 = getResponse(userInput);             
				System.out.println("H0M3R00M: " + response1);         
            	} 
	while (!userInput.equalsIgnoreCase("goodbye"));         
	System.out.println("H0M3ROOM: Adios! " + name1 + "! Have a good one man!");         		scanner.close();     
		}   
    
public static String getResponse(String input) {

	if (input.contains("solve")) {             
	return solveLinearEquation(input);         
    } 
    
    else if (input.contains("hello")) {             
	return ("Hey! How may I assist you my friend?");         
    } 
    
    else {             
	return ("I'm sorry, I don't understand your question or request plz try again.");         
	}     
}

public static String solveLinearEquation(String input) {
// This is where we get the Linear equation from the student         
	String equation1 = input.substring(input.indexOf("solve") + 5).trim();         
	String[] sides = equation.split(" = ");         
	String leftSide = sides[0].trim();         
	String rightSide = sides[1].trim();              
	String[] leftValues = leftSide.split(" x ");         
		int leftCoefficient = Integer.parseInt(leftValues[0].trim());         
		int leftConstant = Integer.parseInt(leftValues[1].trim());         
		int rightConstant = Integer.parseInt(rightSide);         
		int result1 = (rightConstant - leftConstant) / leftCoefficient;               
	return "The solution to your lInEaR eQuAtIoN " + equation1 + " is " + result1;
  }
}
