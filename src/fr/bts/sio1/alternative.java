package fr.bts.sio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class alternative {

	static Scanner monScanner = new Scanner(System.in);
	static int attraction;
	static int attractionDeux;
	static int attractionTrois;

	public static void main(String[] args) {

		choixUn();
		choixDeux();
		choixTrois();

		// Récupération des choix de l'utilisateur

		String un = attractionUn();
		String deux = attractionDeux();
		String trois = attractionTrois();

		// Affiche les attractions choisies par l'utilisateur
		System.out.println("Vous avez choisi de faire les" + un + ",puis de faire" + deux + "et d’acheter du" + trois);

		// Calcul du total des attractions
		int total = attraction + attractionDeux + attractionTrois;

		// Affiche la somme à payer
		System.out.println("Vous devez payer la somme de " + total + " €");

	}

	public static int choixUn() {
		// Boucle tant que l'utilisateur n'entre pas un nombre entier valide
		while (true) {
			try {
				// Affiche les options disponibles pour la première attraction
				System.out.println("Bienvenue");
				System.out.println("Entre un nombre Entier pour choisir votre premiere attraction ");
				List<String> valeurs;
				valeurs = new ArrayList<String>();
				valeurs.add("0 -> Montagnes russes (5 €)");
				valeurs.add("1 -> Grande roue (3 €)");
				valeurs.add("2 -> Maison hantée (4 €)");
				valeurs.add("3 -> Carrousel (2 €)");
				valeurs.forEach(valeur -> System.out.println(valeur));

				// Demande à l'utilisateur d'entrer une valeur entière
				attraction = monScanner.nextInt();

				// Sort de la boucle si l'entrée de l'utilisateur est valide
				break;

			} catch (Exception erreur) {

				// Capture et gestion d'une exception si l'utilisateur n'entre pas un nombre
				// entier

				monScanner.nextLine(); // Nettoie la ligne actuelle pour éviter une boucle infinie

			}
		}

		return attraction;
	}

	public static String attractionUn() {
		// Liste pour choisir attraction 
		List<String> valeurs;
		valeurs = new ArrayList<String>();
		valeurs.add("  Montagnes russes ");
		valeurs.add(" Grande roue  ");
		valeurs.add(" Maison hantée  ");
		valeurs.add("  Carrousel  ");

		List<Integer> prix;
		prix = new ArrayList<Integer>();
		prix.add(5);
		prix.add(3);
		prix.add(4);
		prix.add(2);

		// Obtient le résultat de la liste grâce à la saisie de l'utilisateur
		String valeur = valeurs.get(attraction);
		int nombre = prix.get(attraction);
		attraction = nombre; // Mise à jour de la variable attraction avec le prix

		return valeur;

	}

	public static int choixDeux() {

		// Boucle tant que l'utilisateur n'entre pas un nombre entier valide
		while (true) {
			try {
				// Affiche les options disponibles pour la première attraction
				System.out.println("Entre un nombre Entier pour choisir votre deuxième attraction ");
				List<String> valeurs;
				valeurs = new ArrayList<String>();
				valeurs.add("0 -> Palais des glaces (3€)");
				valeurs.add("1 -> Splash Mountain   (6€)");
				valeurs.add("2 -> Space Mountain    (7€)");

				valeurs.forEach(valeur -> System.out.println(valeur));

				// Demande à l'utilisateur d'entrer une valeur entière
				attractionDeux = monScanner.nextInt();

				// Sort de la boucle si l'entrée de l'utilisateur est valide
				break;

			} catch (Exception erreur) {

				// Capture et gestion d'une exception si l'utilisateur n'entre pas un nombre
				// entier

				monScanner.nextLine(); // Nettoie la ligne actuelle pour éviter une boucle infinie

			}
		}

		return attractionDeux;
	}

	public static String attractionDeux() {
		// Liste pour choisir attraction
		List<String> valeurs;
		valeurs = new ArrayList<String>();
		valeurs.add("  Palais des glaces ");
		valeurs.add(" Splash Mountain  ");
		valeurs.add(" Space Mountain  ");

		List<Integer> prix;
		prix = new ArrayList<Integer>();
		prix.add(3);
		prix.add(6);
		prix.add(7);

		// Obtient le résultat de la liste grâce à la saisie de l'utilisateur
		String valeur = valeurs.get(attractionDeux);
		int nombre = prix.get(attractionDeux);
		attractionDeux = nombre; // Mise à jour de la variable attraction avec le prix

		return valeur;

	}

	public static int choixTrois() {

		// Boucle tant que l'utilisateur n'entre pas un nombre entier valide
		while (true) {
			try {
				// Affiche les options disponibles pour la première attraction
				System.out.println("Entre un nombre Entier pour choisir votre collations ");
				List<String> valeurs;
				valeurs = new ArrayList<String>();
				valeurs.add("0 -> Barbe à papa (1 €)");
				valeurs.add("1 -> Pop-corn (2 €)");
				valeurs.add("2 -> Glace (3 €)");
				valeurs.add("3 -> Aucune collation");
				valeurs.forEach(valeur -> System.out.println(valeur));

				// Demande à l'utilisateur d'entrer une valeur entière
				attractionTrois = monScanner.nextInt();

				// Sort de la boucle si l'entrée de l'utilisateur est valide
				break;

			} catch (Exception erreur) {

				// Capture et gestion d'une exception si l'utilisateur n'entre pas un nombre
				// entier

				monScanner.nextLine(); // Nettoie la ligne actuelle pour éviter une boucle infinie

			}
		}

		return attractionTrois;
	}

	public static String attractionTrois() {
		// Liste pour choisir attraction
		List<String> valeurs;
		valeurs = new ArrayList<String>();
		valeurs.add("  Barbe à papa ");
		valeurs.add(" Pop-corn  ");
		valeurs.add(" Glace  ");
		valeurs.add("  Aucune collation ");

		List<Integer> prix;
		prix = new ArrayList<Integer>();
		prix.add(1);
		prix.add(2);
		prix.add(3);
		prix.add(0);

		// Obtient le résultat de la liste grâce à la saisie de l'utilisateur
		String valeur = valeurs.get(attractionTrois);
		int nombre = prix.get(attractionTrois);
		attractionTrois = nombre; // Mise à jour de la variable attraction avec le prix

		return valeur;

	}

}