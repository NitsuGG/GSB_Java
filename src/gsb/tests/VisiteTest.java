package gsb.tests;

import gsb.modele.Localite;
import gsb.modele.Medecin;
import gsb.modele.Visite;
import gsb.modele.Visiteur;
import gsb.utils.AffichageModele;

public class VisiteTest {

	public static void main(String[] args) {
		
		Localite guidel = new Localite("56520", "guidel");
		Medecin leMedecin = new Medecin("codemed", "NOMMED", "PrenomMed", "rue", guidel, "06-65-14-17-39", "", "la spécialité");
		Visiteur leVisiteur = new Visiteur("Le mat","Nom visit","prenom visit","login","password","adresse",guidel,"2018-10-20","SW","Swiss");
		Visite uneVisite = new Visite("codevisite", "2021-10-14", "", leVisiteur, leMedecin);
		
		AffichageModele.afficherVisite(uneVisite);
		
		

	}

}
