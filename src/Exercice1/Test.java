package Exercice1;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Map<String, String> langues = new HashMap<>(); 

	       langues.put("FR", "Français");
	       langues.put("EN", "Anglais");
	       langues.put("ES", "Espagnol");
	       
	       langues.putAll(langues);

	       // Affiche les clés du map
	       System.out.println("Clés: " + langues.keySet());

	       // Affiche les valeurs du map
	       System.out.println("Values: " + langues.values());

	       // Affiche les entrées du map
	       System.out.println("Entrées: " + langues.entrySet());

	}

}
