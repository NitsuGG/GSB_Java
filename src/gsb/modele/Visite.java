package gsb.modele;

public class Visite {
	protected String reference;
	protected String datevisite;
	protected String commentaire;
	protected Visiteur leVisiteur;
	protected Medecin leMedecin;
	
	public Visite(String reference, String datevisite, String commentaire, Visiteur leVisiteur, Medecin leMedecin){
		this.reference = reference;
		this.datevisite = datevisite;
		this.commentaire = commentaire;
		this.leVisiteur= leVisiteur;
		this.leMedecin=leMedecin;
		
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getDatevisite() {
		return datevisite;
	}

	public void setDatevisite(String datevisite) {
		this.datevisite = datevisite;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Visiteur getLeVisiteur() {
		return leVisiteur;
	}

	public void setleVisiteur(Visiteur leVisiteur) {
		this.leVisiteur=leVisiteur;
	}

	public Medecin getLeMedecin() {
		return leMedecin;
	}

	public void setLeMedecin(Medecin leMedecin) {
		this.leMedecin=leMedecin;
	}
	
	

}
