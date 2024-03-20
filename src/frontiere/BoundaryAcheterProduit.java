package frontiere;

import java.util.Scanner;

import controleur.ControlAcheterProduit;

public class BoundaryAcheterProduit {
	private Scanner scan = new Scanner(System.in);
	private ControlAcheterProduit controlAcheterProduit;

	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}

	public void acheterProduit(String nomAcheteur) {
		System.out.println("1 - je veux acheter un produit.");
		System.out.println("2 - je veux avoir une vue d'ensemble du marché.");
		System.out.println("3 - Quitter l'application.");
		int selectionMenu = Clavier.entrerEntier("");
		switch(selectionMenu) {
			case 1:
				System.out.println("Quel produit voulez-vous acheter ?");
				String nomProduit = scan.next();
				System.out.println("Chez quel commerçant voulez-vous acheter des " + nomProduit);
				break;
			case 2:
				
				break;
				
			case 3:
				
				break;
		}
		controlAcheterProduit.acheterProduit();
	}
}
