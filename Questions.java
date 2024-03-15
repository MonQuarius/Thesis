package questions;
import java.util.Scanner;
public class Questions {
//The code is early stages.

	//Introduction between user and H0M3R00M
	public static void main(String [] args) {         
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Hi! Welcome to the H0M3R00M virtual assistant! I am at your command, Let's start by telling me your name.");         
				String name1 = scanner.nextLine();
				System.out.println("Hmmm lets see... Ah I know that name " + name1 + "! The task that needs to be completed for you today is your Linear Equations Test provided by your professor.");
				System.out.println("If you are ready to begin say Yes");
				String yes = scanner.nextLine();
				System.out.println("Ok lets Begin!");
				}
		try (Scanner scan = new Scanner(System.in)) {
			
			//Strings for answer key and user input sections
			String[] answers = {"a", "a", "b", "b", "a", "a", "c", "a", "b", "c", "c", "b", "c", "b", "a"};
			String[] responses = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Easy Question 1			
			//Starting set of the easier questions on the test
			System.out.println("Number 1: Solve the linear equation for (x): [3x + 5 = 17]");
			System.out.println("a)(x = 4)");
			System.out.println("b)(x = 6)");
				responses [0] = scan.next();
				if(answers.equals("a")) 
				{
		            System.out.println("Correct good job!");
				}
				else
				{
					System.out.println("Sorry but this is incorrect. The correct solution is x = 4, not x = 6. Solving the equation step by step would lead to x = 4.");
				}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Easy Question 2				
			//Starting set of the easier questions on the test
			System.out.println("Number 2: Find the slope of the line passing through the points (2, 4) and (6, 10).");
			System.out.println("a)(2)");
			System.out.println("b)(1.5)");
			System.out.println("c)(2.5)");
				responses [1] = scan.next();
				if(answers.equals("a")) 
				{
		            System.out.println("Correct good job!");
				}
				else if(answers.equals("a"))
				{
					System.out.println("Sorry but this is incorrect. The slope between the given points is not 1.5 it is 2. It is important to calculate the slope correctly using the formula.");
				}
				else
				{
					System.out.println("Sorry but this is incorrect. The slope should be 2, not 2.5. Slope is calculated as (change in y) / (change in x).");
				}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Easy Question 3				
			//Starting set of the easier questions on the test
			System.out.println("Number 3: Write the equation of a line in slope-intercept form passing through the point (3, 5) with a slope of 2.");
			System.out.println("a) y = 2x + 1");
			System.out.println("b) y = 2x + 4");
			System.out.println("c) y = 5x + 3");
				responses [2] = scan.next();
				if(answers.equals("a")) 
				{
		            System.out.println("Correct good job!");
				}
				else if(answers.equals("b"))
				{
					System.out.println("Sorry but this is incorrect. The y-intercept should be 1, not 4. The equation is y = mx + b, where b is the y-intercept.");
				}
				else
				{
					System.out.println("Sorry but this is incorrect. The correct slope-intercept form is y = 2x + 1, not y = 5x + 3. The slope of 2 is given in the question.");
				}
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Easy Question 4				
			//Starting set of the easier questions on the test
			System.out.println("Number 4: If the equation of a line is y = 2x - 1, what is the y-intercept?");
			System.out.println("a) 1");
			System.out.println("b) -1");
			System.out.println("c) 2");
				responses [3] = scan.next();
				if(answers.equals("b")) 
				{
		            System.out.println("Correct good job!");
				}
				else if(answers.equals("a"))
				{
					System.out.println("Sorry but this is incorrect. The y-intercept is -1, not 1. The y-intercept is the constant term in the equation when x = 0.");
				}
				else 
				{
					System.out.println("Sorry but this is incorrect. The y-intercept in the given equation y = 2x - 1 is -1, not 2. The y-intercept is the value of y when x = 0.");
				}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Easy Question 5				
			//Starting set of the easier questions on the test
			System.out.println("Number 5: Determine the x-intercept of the equation 4x + 2y = 8.");
			System.out.println("a) (2,0)");
			System.out.println("b) (0,2)");
			System.out.println("c) (0,4)");
				responses [4] = scan.next();
				if(answers.equals("a")) {
		            System.out.println("Correct good job!");
				}
				else if(answers.equals("b"))
				{
					System.out.println("Sorry but this is incorrect. The x-intercept is not at (0, 2) in the given equation. The x-intercept occurs when y = 0.");
				}
				else 
				{
					System.out.println("Sorry but this is incorrect. The x-intercept is (2, 0) in the equation 4x + 2y = 8. The x-intercept is the point where the line crosses the x-axis (y = 0).");
				}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Medium Question 1			
				//Starting set of the more medium questions on the test
				System.out.println("Number 6: Find the point of intersection for the system of equations y = 2x - 1 and y = x + 1");
				System.out.println("a) (x = 3, y = 5)");
				System.out.println("b) (x = 2, y = 3)");
				System.out.println("c) (x = 4, y = 7)");
					responses [5] = scan.next();
					if(answers.equals("a")) 
					{
			            System.out.println("Correct good job!");
					}
					else if(answers.equals("b"))
					{
						System.out.println("Sorry but this is incorrect. The correct point of intersection is (x = 3, y = 5), not (x = 2, y = 3).");
					}
					else
					{
						System.out.println("Sorry but this is incorrect. The correct solution is not (x = 4, y = 7). The point of intersection needs to satisfy both equations simultaneously.");
					}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Medium Question 2				
				//Starting set of the more medium questions on the test
				System.out.println("Number 7: Write the equation of a line parallel to y = 3x - 2 passing through the point (1, 4)");
				System.out.println("a) y = 3x + 4");
				System.out.println("b) y = 3x - 1");
				System.out.println("c) y = 3x + 1");
					responses [6] = scan.next();
					if(answers.equals("c")) 
					{
			            System.out.println("Correct good job!");
					}
					else if(answers.equals("a"))
					{
						System.out.println("Sorry but this is incorrect. The correct equation should pass through the point (1, 4), not have y-intercept at 4. Parallel lines have the same slope.");
					}
					else
					{
						System.out.println("Sorry but this is incorrect. This equation does not pass through the point (1, 4) as required. The equation of the line must satisfy the given conditions.");
					}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Medium Question 3				
				//Starting set of the more medium questions on the test
				System.out.println("Number 8:  Determine the solution set for the system of inequalities x + y < 3 and y < 1");
				System.out.println("a) x < 3 , y < 1");
				System.out.println("b) x < 1 , y < 3");
				System.out.println("c) x > 3 , y < 1");
					responses [7] = scan.next();
					if(answers.equals("a")) 
					{
			            System.out.println("Correct good job!");
					}
					else if(answers.equals("b"))
					{
						System.out.println("Sorry but this is incorrect. The correct solution set is not (x < 1, y < 3). Each inequality condition must be considered to determine the solution set.");
					}
					else
					{
						System.out.println("Sorry but this is incorrect. The solution set does not include x > 3. It is important to consider both inequalities together to find the correct solution.");
					}
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Medium Question 4				
				//Starting set of the more medium questions on the test
				System.out.println("Number 9: Find the sum of the solutions to the system of equations: 2x + y = 5 and x - y = 2");
				System.out.println("a) 2");
				System.out.println("b) 3");
				System.out.println("c) 4");
					responses [8] = scan.next();
					if(answers.equals("b")) 
					{
			            System.out.println("Correct good job!");
					}
					else if(answers.equals("a"))
					{
						System.out.println("Sorry but this is incorrect. The sum of solutions is not 2. Adding the solutions of both equations correctly will lead to the sum of 3.");
					}
					else 
					{
						System.out.println("Sorry but this is incorrect. The sum of solutions is not 4.");
					}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Medium Question 5			
				//Starting set of the more medium questions on the test
				System.out.println("Number 10: Write the equation of a plane in standard form with the normal vector <1, -3, 2> passing through the point (2, -1, 3)");
				System.out.println("a) x - 3y + 2z = 7");
				System.out.println("b) x - 3y + 2z = 9");
				System.out.println("c) x - 3y + 2z = 11");
					responses [9] = scan.next();
					if(answers.equals("c")) {
			            System.out.println("Correct good job!");
					}
					else if(answers.equals("a"))
					{
						System.out.println("Sorry but this is incorrect. The correct standard form equation should pass through the point (2, -1, 3) with the given normal vector.");
					}
					else 
					{
						System.out.println("Sorry but this is incorrect. The equation provided does not satisfy the conditions of the normal vector and the given point.");
					}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Hard Question 1
					//Starting set of the harder questions on the test
					System.out.println("Number 11: Find the eigenvalues of the matrix [2, -1], [4, -3]");
					System.out.println("a) λ = 1, 2");
					System.out.println("b) λ = -3, -4");
					System.out.println("c) λ = -1, -2");
						responses [10] = scan.next();
						if(answers.equals("c")) 
						{
				            System.out.println("Correct good job!");
						}
						else if(answers.equals("a"))
						{
							System.out.println("Sorry but this is incorrect. The eigenvalues of the matrix are -1 and -2, not 1 and 2. Eigenvalues are the values of λ that satisfy det(A - λI) = 0.");
						}
						else 
						{
							System.out.println("Sorry but this is incorrect. The eigenvalues of the matrix are not -3 and -4. It is important to correctly calculate the eigenvalues using the determinant equation.");
						}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Hard Question 2				
					//Starting set of the harder questions on the test
					System.out.println("Number 12: Calculate the determinant of the matrix [3, -1, 2], [4, 1, 0], [2, -3, 1]");
					System.out.println("a) 2");
					System.out.println("b) -1");
					System.out.println("c) -2");
						responses [11] = scan.next();
						if(answers.equals("b")) 
						{
				            System.out.println("Correct good job!");
						}
						else if(answers.equals("a"))
						{
							System.out.println("Sorry but this is incorrect. The determinant of the matrix is -1, not 2. Determinants are calculated using a specific formula for the given matrix.");
						}
						else
						{
							System.out.println("Sorry but this is incorrect. The determinant of the matrix is not -2. It is crucial to accurately perform the determinant calculation for the given matrix.");
						}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Hard Question 3				
					//Starting set of the harder questions on the test
					System.out.println("Number 13: Find the inverse of the matrix [1, 2], [3, 4]");
					System.out.println("a) [4 , -2], [-3, 1]");
					System.out.println("b) [3, -2], [-1, 1]");
					System.out.println("c) [-2, 1], [1.5, -0.5]");
						responses [12] = scan.next();
						if(answers.equals("c")) 
						{
				            System.out.println("Correct good job!");
						}
						else if(answers.equals("a"))
						{
							System.out.println("Sorry but this is incorrect. The inverse of the matrix is not [4, -2], [-3, 1].");
						}
						else
						{
							System.out.println("Sorry but this is incorrect. This is not the correct inverse of the matrix [1, 2], [3, 4]. The inverse matrix must satisfy specific conditions.");
						}
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Hard Question 4				
					//Starting set of the harder questions on the test
					System.out.println("Number 14: Solve the differential equation dy/dx = 2x - 3");
					System.out.println("a) y = x^2 - 3");
					System.out.println("b) y = x^2 - 3x + C");
					System.out.println("c) y = 2x - 3");
						responses [13] = scan.next();
						if(answers.equals("b")) 
						{
				            System.out.println("Correct good job!");
						}
						else if(answers.equals("a"))
						{
							System.out.println("Sorry but this is incorrect. The solution is not y = x^2 - 3. It is necessary to include the constant of integration C when solving differential equations.");
						}
						else 
						{
							System.out.println("Sorry but this is incorrect. This is the integrated form of the differential equation, but it is missing the constant term C in the solution.");
						}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Hard Question 5				
					//Starting set of the harder questions on the test
					System.out.println("Number 15: Find the global maximum or minimum of the function f(x) = x^3 - 3x^2 + 4 on the interval [-2, 4]");
					System.out.println("a) Global minimum at x = 3, Global maximum at x = -2");
					System.out.println("b) Global minimum at x = -2, Global maximum at x = 2");
					System.out.println("c) Global minimum at x = 1, Global maximum at x = -1");
						responses [14] = scan.next();
						if(answers.equals("a")) {
				            System.out.println("Correct good job!");
						}
						else if(answers.equals("b"))
						{
							System.out.println("Sorry but this is incorrect. The correct points for global minimum and maximum are x = 3 and x = -2, respectively.");
						}
						else 
						{
							System.out.println("Sorry but this is incorrect. These points are not the global minimum and maximum of the function on the given interval.");
						}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
			//Final score on the test
			int score = 0;
			for(int i = 0; i <15; i++) {
				if(responses[i].equalsIgnoreCase(answers[i])) {
					score++;
				}
			}
			
			System.out.println("Your final score is: " + score + "/15");
			System.out.println("Come back whenever im literally open 24/7, 365.");
		}
		
		}
}