package gsb.modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

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
				uneVisite = new Visite(ref, date, comm, leVisiteur, leMedecin);
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from VISITE where REFERENCE='"+reference+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return uneVisite;
	}
	
	public static int creer(String ref, String date, String comm, String matVisiteur, String codeMed ) {
	/*	String ref = uneVisite.getReference();
		String date = uneVisite.getDateVisite();
		String comm = uneVisite.getCommentaire();
		Visiteur leVisiteur = uneVisite.getLeVisiteur();
		String matVisiteur = leVisiteur.getMatricule();
		Medecin leMedecin = uneVisite.getLeMedecin();
		String codeMed = leMedecin.getCodeMed();
	**/	
		String reqInsertion = "insert into VISITE values('"+ref+"','"+date+"','"+comm+"','"+matVisiteur+"','"+codeMed+"')";
		int result = ConnexionMySql.execReqMaj(reqInsertion);
		ConnexionMySql.fermerConnexionBd();
		return result;
		}
	
	public static HashMap<String,Visite> retournerDictionnaireDesVisitesRecherchees(String matricule, String date){
		HashMap<String,Visite> diccoDesVisites = new HashMap<String,Visite>();
		String matRq;
		String dateRq;
		if(matricule==null) {
			 matRq="%";
		}
		else {
			 matRq="%"+matricule+"%";
			
		}
		
		if(date==null) {
			 dateRq="%";
		}
		else {
			 dateRq="%"+date+"%";
		}
		
		ResultSet reqSelection = ConnexionMySql.execReqSelection(
				"select REFERENCE from VISITE where MATRICULE like'"+matRq+"' and DATEVISITE like'"+dateRq+"'");
		try {
			while(reqSelection.next()) {
				String reference=reqSelection.getString(1);
				diccoDesVisites.put(reference, VisiteDao.rechercher(reference));
				
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerDiccoDesVisitesRecherchees");
		}
		return diccoDesVisites;
		
		
	}
	
	/**public static HashMap<String,Visite> retournerDictionnaireDesVisites(){
		HashMap<String,Visite> diccoDesVisites = new HashMap<String,Visite>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select REFERENCE from VISITE ");
		try {
			while(reqSelection.next()) {
				String reference=reqSelection.getString(1);
				diccoDesVisites.put(reference, VisiteDao.rechercher(reference));
				
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerDiccoDesVisites");
		}
		return diccoDesVisites;
		
		
	} */
}
