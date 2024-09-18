import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: Esther
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Give me a number: ");
		String num1 = in.nextLine();
		System.out.println("Give me a sport: ");
		String sport =in.nextLine();
		System.out.print("Give me a place: ");
		String place =in.nextLine();
		System.out.print("Give me a name: ");
		
		System.out.print("Give me another name: ");
		String name =in.nextLine();
		
		
		int score =in.nextInt();
		
		
		
		
		String person2;
		String person1;
		String points;
		System.out.println("One day"+person1+"  and "+person2+"  had so much fun while playing"+sport+" at "+place+" and scored "+num1+"+points+"!");

		
		
		
	}

}
