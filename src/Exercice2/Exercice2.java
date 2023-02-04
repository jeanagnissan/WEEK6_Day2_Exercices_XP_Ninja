package Exercice2;

import java.util.Scanner;
import java.lang.Math;

public class Exercice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Entrée la valeur de a ");
		Scanner scanner1 = new Scanner(System.in);
		int a = scanner1.nextInt();

		System.out.print("Entrée la valeur de b ");
		Scanner scanner2 = new Scanner(System.in);
		int b = scanner2.nextInt();

		System.out.print("Entrée la valeur de c ");
		Scanner scanner3 = new Scanner(System.in);
		int c = scanner3.nextInt();

		if (b == 0 && c == -1) {
			if (a <= 0 ) {
				a = 1;
			}
			System.out.println("solutions (" + a + ", " + b + ", " + c + ")" + " -> " + "2" );
			System.out.println("x2 " + c + " =" + " 0" + " has two solutions " + "(x = " + c + " and x = " + -c + ").");
		}
		
		else if (b == 0 && c == 0) {
			if (a <= 0 ) {
				a = 1;
			}
			System.out.println("solutions (" + a + ", " + b + ", " + c + ")" + " -> " + "1" );
			System.out.println("x2 " + c + " =" + " 0" + " has one solutions " + "(x = 0)." );
		}

		else if (b == 0 && c == 1) {
			if (a <= 0 ) {
				a = 1;
			}
			System.out.println("solutions (" + a + ", " + b + ", " + c + ")" + " -> " + "0" );
			System.out.println("x2 " + c + " =" + " 0" + " has no real solutions.");
		}
		else {
			System.out.println("Vellez entré une valeur correct");
			
		}
		

	}

} 
