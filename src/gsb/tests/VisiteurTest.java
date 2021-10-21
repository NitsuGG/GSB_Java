package gsb.tests;

import gsb.modele.Visiteur;
import gsb.utils.AffichageModele;
import gsb.modele.Localite;

public class VisiteurTest {
		
	public static void main(String[] args) {
		
		Localite unLocalite = new Localite("56100", "Lorient");
		
		Visiteur unVisiteur = new Visiteur("1", "Quintin", "Yves", "YvesQ", "password"
				,"Rue des Ormes", unLocalite, "20-05-2021", "SW", "SWISS");
		
		AffichageModele.afficherVisiteur(unVisiteur);
	}
	
}
