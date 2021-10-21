package gsb.modele.dao;

import java.sql.ResultSet;

import gsb.modele.Localite;
import gsb.modele.Medecin;
import gsb.modele.Visite;
import gsb.modele.Visiteur;

public class VisiteDao {
	
	public static Visite rechercher(String reference) {
		Visite uneVisite =null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from VISITE where REFERENCE='"+reference+"'");
		try {
			if (reqSelection.next()) {
				String ref = reqSelection.getString(1);
				String date = reqSelection.getString(2);
				String comm = reqSelection.getString(3);
				String visiteur = reqSelection.getString(4);
				String medecin = reqSelection.getString(5);
				Visiteur leVisiteur = VisiteurDao.rechercher(visiteur);
				Medecin leMedecin = MedecinDao.rechercher(medecin);
				uneVisite = new Visite(reqSelection.getString(1), reqSelection.getString(2), reqSelection.getString(3), leVisiteur, leMedecin);
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from VISITE where REFERENCE='"+reference+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return uneVisite;
	}
	
	public static int creer(Visite uneVisite) {
		String ref = uneVisite.getReference();
		String date = uneVisite.getDateVisite();
		String comm = uneVisite.getCommentaire();
		Visiteur leVisiteur = uneVisite.getLeVisiteur();
		String matVisiteur = leVisiteur.getMatricule();
		Medecin leMedecin = uneVisite.getLeMedecin();
		String codeMed = leMedecin.getCodeMed();
		
		String reqInsertion = "insert into VISITE values('"+ref+"','"+date+"','"+comm+"','"+matVisiteur+"','"+codeMed+"')";
		int result = ConnexionMySql.execReqMaj(reqInsertion);
		ConnexionMySql.fermerConnexionBd();
		return result;
		}
	
}
