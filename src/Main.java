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
		System.out.println("Give me a number");
		int 'num1' = in.nextLine();
		System.out.println("Give me a sport");
		String sport = in.nextLine();
		System.out.print("Give me a name");
		String name =in.nextLine();
		System.out.print("Give me a place:");
		//flush
		in.nextInt();
		String place =in.nextLine();
		System.out.println("One day"+name+" "+num1+"  had so much fun "+place+"!");

		
		
		
	}

}
