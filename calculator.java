import java.util.Scanner;
public class calculator{
	public static void main(String[] args){
		System.out.printf("Please enter your first number: ");
		Scanner UserInput = new Scanner (System.in); //creating user input scanner
		float x=0; //first number
		float y=0; //second number 
		float z=0; //answer
		char c; //operator
		x=UserInput.nextFloat();
		System.out.printf("Please choose your operator: ");
		c=UserInput.next().charAt(0);
		System.out.printf("Please complete your equation: %.2f %c ",x,c);
		y=UserInput.nextFloat();
		switch(c){
			case '+':
				z=x+y;
				break;
			case '-':
				z=x-y;
				break;
			case '*':
				z=x*y;
				break;
			case '/':
				z=x/y;
				break;
			default:
				System.out.print("Error. Please try again. \n");
				break;
		}
		System.out.printf("Your answer is %.2f. \n",z);
	}
}
