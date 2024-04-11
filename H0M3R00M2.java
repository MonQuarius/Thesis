package questions;
import java.util.Scanner;

public class Questions {
    
    static String AskQuestion(String[] QnA, String key) {
        String question = QnA[0];
        String[] choiceList = {"a", "b", "c", "d", "e"};
        int answer = 0;

        System.out.println(question);

// Listing answer choices
        for (int i = 1; i < QnA.length; i++) {
            String choice = choiceList[i - 1];
            String item = QnA[i];
            System.out.println(choice + ") " + item);

// Getting the correct answer choice index
            if (choice.equals(key)) {
                answer = i;
            }
        }
        System.out.println("");

        return QnA[answer];
    } 

    public static void main(String[] args) {
        String[][] quiz = {
        		
//---------------------------------------------------------------------------Easy Questions-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------        		
            {"Solve the linear equation for (x): [3x + 5 = 17]", "x = 4", "x = 6"},
            {"Find the slope of the line passing through the points (2, 4) and (6, 10).", "2", "1.5", "2.5"},
            {"Write the equation of a line in slope-intercept form passing through the point (3, 5) with a slope of 2.", "y = 2x - 1", "y = 2x + 4", "y = 5x + 3"},
            {"If the equation of a line is y = 2x - 1, what is the y-intercept?", "1", "-1", "2"},
            {"Determine the x-intercept of the equation 4x + 2y = 8.", "(2,0)", "(0,2)", "(0,4)"},
//--------------------------------------------------------------------------Medium Questions-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------             
            {"Find the point of intersection for the system of equations y = 2x - 1 and y = x + 1", "(x = 3, y = 5)", "(x = 2, y = 3)", "(x = 4, y = 7)"},
            {"Write the equation of a line parallel to y = 3x - 2 passing through the point (1, 4)", "y = 3x + 4", "y = 3x - 1", "y = 3x + 1"},
            {"Determine the solution set for the system of inequalities x + y < 3 and y < 1.", "x < 3 , y < 1", "x < 1 , y < 3", "x > 3 , y < 1"},
            {"Find the sum of the solutions to the system of equations: 2x + y = 5 and x - y = 2.", "2", "3", "4"},
            {"Write the equation of a plane in standard form with the normal vector <1, -3, 2> passing through the point (2, -1, 3)", "x - 3y + 2z = 7", "x - 3y + 2z = 9", "x - 3y + 2z = 11"},
//---------------------------------------------------------------------------Hard Questions-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------            
            {"Find the eigenvalues of the matrix [2, -1], [4, -3]", "λ = 1, 2", "λ = -3, -4", "λ = -1, -2"},
            {"Calculate the determinant of the matrix [3, -1, 2], [4, 1, 0], [2, -3, 1]", "2", "-1", "-2"},
            {"Find the inverse of the matrix [1, 2], [3, 4]", "[4, -2], [-3, 1]", "[3, -2], [-1, 1]", "[-2, 1], [1.5, -0.5]"},
            {"Solve the differential equation dy/dx = 2x - 3", "y = x^2 - 3", "y = x^2 - 3x + C", "y = 2x - 3"},
            {"Find the global maximum or minimum of the function f(x) = x^3 - 3x^2 + 4 on the interval [-2, 4]", "Global minimum at x = 3, Global maximum at x = -2", "Global minimum at x = -2, Global maximum at x = 2", "Global minimum at x = 1, Global maximum at x = -1"},
        };
        
        String[] answerKey = {"a", "a", "a", "b", "a", "a", "c", "a", "b", "c", "c", "b", "c", "b", "a"};
        int score = 0;

// Introduction between user and H0M3R00M
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hi! Welcome to the H0M3R00M virtual assistant! I am at your command, Let's start by telling me your name: ");         
        String name1 = scanner.nextLine();
        System.out.println("Hmmm lets see... Ah I know that name " + name1 + "! The task that needs to be completed for you today is your Linear Equations Test provided by your professor.");
        System.out.print("Are you ready? Y/n: ");
        String response = scanner.nextLine();
        
        if (!(response.toLowerCase().equals("y"))) {
            scanner.close();
            return;
        }
        
        System.out.println("Ok lets Begin!");

        for (int i = 0; i < quiz.length; i++) {
            String correctAnswer = answerKey[i];
            String[] currentQuestion = quiz[i];
            String answerText = AskQuestion(currentQuestion, correctAnswer);

            System.out.print("Answer: ");
            String myAnswer = scanner.next().toLowerCase().charAt(0) + "";

            if (myAnswer.equals(correctAnswer)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Sorry, but this is incorrect. The correct answer is " + answerText + ".\n");
            }
        }

        scanner.close();
        System.out.println("Your final score is: " + score + "/" + quiz.length);
        System.out.println("Come back whenever im literally open 24/7, 365.");
    }
}