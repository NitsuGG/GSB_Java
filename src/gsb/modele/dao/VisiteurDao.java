package gsb.modele.dao;

import java.sql.ResultSet;

import gsb.modele.Localite;
import gsb.modele.Visiteur;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class VisiteurDao {
	
	public static Visiteur rechercher(String matricule){
		Visiteur unVisiteur=null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from VISITEUR where MATRICULE ='"+matricule+"'");
		try {
			if (reqSelection.next()) {
				String mat = reqSelection.getString(1);
				String nom = reqSelection.getString(2);
				String prenom = reqSelection.getString(3);
				String login = reqSelection.getString(4);
				String mdp = reqSelection.getString(5);
				String adresse = reqSelection.getString(6);
				String cp = reqSelection.getString(7);
				String dateEnt = reqSelection.getString(8);
				String matUnit = reqSelection.getString(9);
				String nomUnit = reqSelection.getString(10);
				Localite leCp = LocaliteDao.rechercher(cp);
				unVisiteur = new Visiteur(mat, nom, prenom, login, mdp, adresse, leCp, dateEnt, matUnit, nomUnit);};
		}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from VISITEUR where MATRICULE ='"+matricule+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return unVisiteur;
	}
	
	public static int creer(String matricule, String nom, String prenom, String login, String mdp,String adresse, String codeLoc, String dateEntree, String codeUnit, String nomUnit) {
		/* String matricule = unVisiteur.getMatricule();
		String nom = unVisiteur.getNom();
		String prenom = unVisiteur.getPrenom();
		String login = unVisiteur.getLogin();
		String mdp = unVisiteur.getMdp();
		String adresse = unVisiteur.getAdresse();
		Localite codePostal = unVisiteur.getCodePostal();
		String codeLoc = codePostal.getCodePostal();
		String dateEntree = unVisiteur.getDateEntree();
		String codeUnit = unVisiteur.getCodeUnit();
		String nomUnit = unVisiteur.getNomUnit();
		*/
		String reqInsertion ="insert into VISITEUR values('"+matricule+"','"+nom+"','"+prenom+"','"+login+"','"
				+mdp+"','"+adresse+"','"+codeLoc+"','"+dateEntree+"','"+codeUnit+"','"+nomUnit+"')";
		int result = ConnexionMySql.execReqMaj(reqInsertion);
		ConnexionMySql.fermerConnexionBd();
		return result;
	}
	
	public static HashMap<String,Visiteur> retournerDictionnaireDesVisiteursRecherchees(){
		HashMap<String,Visiteur> collectionDesVisiteurs = new HashMap<String, Visiteur>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select MATRICULE from VISITEUR");
		try {
			while (reqSelection.next()) {
				String matricule = reqSelection.getString(1);
				collectionDesVisiteurs.put(matricule, VisiteurDao.rechercher(matricule));
			}
				}
			catch (SQLException e) {
				e.printStackTrace();
				System.out.println("erreur retournerCollectionsDesVisiteurs()");
			}
			return collectionDesVisiteurs;	
	}
		
	public static ArrayList<Visiteur> retournerCollectionDesVisiteurs(){
		ArrayList<Visiteur> collectionDesVisiteurs = new ArrayList<Visiteur>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select MATRICULE from VISITEUR");
		try {
			while (reqSelection.next()) {
				String matricule = reqSelection.getString(1);
				collectionDesVisiteurs.add(VisiteurDao.rechercher(matricule));
			}
				}
			catch (SQLException e) {
				e.printStackTrace();
				System.out.println("erreur retournerCollectionsDesVisiteurs()");
			}
			return collectionDesVisiteurs;	
	}
	}
			
