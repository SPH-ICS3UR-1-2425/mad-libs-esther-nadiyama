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
		int num1 = in.nextInt();
		System.out.println("Give me a sport: ");
		//flush
		in.nextLine();
		String sport =in.nextLine();
		System.out.print("Give me a place: ");
		String place =in.nextLine();
		System.out.print("Give me a name: ");
		String person1 =in.nextLine();
		System.out.print("Give me another name: ");
		String person2=in.nextLine();
		//flush
		System.out.print("Give me a decimal number");
		int decnumber =in.nextInt();
		
		System.out.println("One day"+person1+"  and "+person2+"  had so much fun while playing"+sport+" at "+place+" and scored "+num1+ " goals with "+decnumber+ "!");

		
		System.out.print("Give me a place");
		String place2 =in.nextLine();
		
	}

} 
