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
		this.leMedecin= leMedecin;
		
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

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getCodemed() {
		return codemed;
	}

	public void setCodemed(String codemed) {
		this.codemed = codemed;
	}
	
	

}
