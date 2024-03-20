package controleur;

import villagegaulois.Etal;
import villagegaulois.Village;

public class ControlAcheterProduit {
	private Village village;
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	private ControlVerifierIdentite controlVerifierIdentite;

	public ControlAcheterProduit(ControlVerifierIdentite controlVerifierIdentite,
			ControlTrouverEtalVendeur controlTrouverEtalVendeur,
			Village village) {
		this.village = village;
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}

	//TODO a completer
	public void acheterProduit(String nomAcheteur, String nomVendeur, String nomProduit, int nbProduitAcheter) {
		Etal etal = controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur);
		
		if (!controlVerifierIdentite.verifierIdentite(nomVendeur)) {
			System.out.println("Je suis désolée " + nomVendeur + " mais il faut être un habitant de notre village pour commercer ici.");
		}
		
		if (village.rechercherVendeursProduit(nomProduit) == null) {
			System.out.println("Désolé, personne ne vend ce produit au marché.");
		}
		
		if (!etal.contientProduit(nomProduit)) {
			System.out.println(nomAcheteur + " veut acheter " + nbProduitAcheter + " " + nomProduit + ", malheureusement il n'y en a plus !");
		}
		else if (etal.getQuantite() < nbProduitAcheter) {
			System.out.println(nomAcheteur + " veut acheter " + nbProduitAcheter + " " + nomProduit + ", malheureusement " + nomVendeur + " n'en a plus que " + etal[2] + ". " + nomAcheteur + " achète tout le stock de " + nomVendeur);
		}
		else {
			System.out.println(nomAcheteur + " achète " + nbProduitAcheter + " " + nomProduit + " à " + nomVendeur);
		}
	}
	
	public Etal[] trouverEtalVendeur(String nomVendeur) {
		for (int i = 0; i < ; i++) {
			
		}
		return controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur);
	}
}
