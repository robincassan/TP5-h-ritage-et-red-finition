package fr.digi.calcul_salaire;

public class Pigiste extends Intervenant {
	double nbJourTravailMois, montantJournalierRenum;

	public Pigiste(String prenom, String nom, double nbJourTravailMois, double montantJournalierRenum) {
		super.nom = nom;
		super.prenom = prenom;
		this.nbJourTravailMois = nbJourTravailMois;
		this.montantJournalierRenum = montantJournalierRenum;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return (nbJourTravailMois * montantJournalierRenum);

	}

	public double getNbJourTravailMois() {
		return nbJourTravailMois;
	}

	public void setNbJourTravailMois(double nbJourTravailMois) {
		this.nbJourTravailMois = nbJourTravailMois;
	}

	public double getMontantJournalierRenum() {
		return montantJournalierRenum;
	}

	public void setMontantJournalierRenum(double montantJournalierRenum) {
		this.montantJournalierRenum = montantJournalierRenum;
	}

	@Override
	public void afficherDonnees() {
		// TODO Auto-generated method stub
		super.afficherDonnees();
		System.out.println("statut : pigiste");

	}

}
