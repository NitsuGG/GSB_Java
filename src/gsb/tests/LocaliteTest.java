package gsb.tests;

import gsb.utils.AffichageModele;
import gsb.modele.Localite;

public class LocaliteTest {
	
	public static void main(String[] args) {
		Localite unLocalite = new Localite("56100", "Lorient");
		AffichageModele.afficherLocalite(unLocalite);
	}

}
