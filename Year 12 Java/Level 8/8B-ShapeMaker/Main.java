import java.util.*;
import java.io.*;

class Main {
	static Scanner input = new Scanner(System.in); 
	
	public static void main(String[] args) {
		
		System.out.println("Enter 1 for a triangle\nEnter 2 for a square\nEnter 3 for a rectangle\nEnter X to stop");
		String choice = input.nextLine();  
		if (choice.equals("1")){
			
		}
		else if (choice.equals("2")){
			makeSquare();
		}
		else if (choice.equals("3")){
			
		}
		else {
			System.out.println("Invalid");
		} 
	}
	public static void makeTriangle() {
		System.out.print("Enter the base of the triangle");
		int base = Integer.parseInt(input.nextLine());
	}
	
	public static void makeSquare() {
		System.out.print("Enter the size of the square: ");
		int size = Integer.parseInt(input.nextLine());
		
		for (int loop = 0; loop != size; loop++) {
			System.out.println("");
			for (int loop2 = 0; loop2 != size; loop2++) {
				System.out.print("*");	
			}
		}
	}

	public static void makeRectangle() {
		System.out.print("Enter the length of the rectangle");
		int size = Integer.parseInt(input.nextLine());		
		int length = Integer.parseInt(input.nextLine());

		for (int loop = 0; loop != size; loop++){
			System.out.print("No");
		}
	}	 
}