package Exercice1;

import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {

		Boolean isStope = false;

		do {

			System.out.print("Entrez le temps pris par le travailleur");
			Scanner scanner = new Scanner(System.in);
			int tempPris = scanner.nextInt();

			if (tempPris >= 2 && tempPris <= 3) {
				System.out.println("Travailleur : vous etre très efficace");
				new Exercice1().vericationLoop(isStope);

			} else if (tempPris > 3 && tempPris <= 4) {
				System.out.println("travailleur : vous devez améliorer votre vitesse");
				new Exercice1().vericationLoop(isStope);

			} else if (tempPris > 4 && tempPris <= 5) {
				System.out.println("travailleur : vous allez reçevois une formation pour améliorer sa vitesse");
				new Exercice1().vericationLoop(isStope);

			} else if (tempPris > 5) {
				System.out.println("travailleur : vous devez quitter l'entreprise");
				new Exercice1().vericationLoop(isStope);

			} else {
				System.out.println("Vous devez saisir un chiffre valide");
				new Exercice1().vericationLoop(isStope);

			}

		} while (isStope == true);

	}

	private void vericationLoop(Boolean isStope) {
		System.out.print("Voulez vous arreté ? taper \"true\" pour arreter et \"false\" pour continuer");
		Scanner scannerStope = new Scanner(System.in);
		isStope = scannerStope.nextBoolean();

		if (isStope == false) {
			System.out.print("Travalleur merci d'avoir utilise notre service");

		}
	}

}
