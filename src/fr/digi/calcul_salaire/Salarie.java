package fr.digi.calcul_salaire;

public class Salarie extends Intervenant {
	double salaire;

	public Salarie(String prenom, String nom, double salaire) {
		super.nom = nom;
		super.prenom = prenom;
		this.salaire = salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return salaire;
	}

	@Override
	public void afficherDonnees() {
		// TODO Auto-generated method stub
		super.afficherDonnees();
		System.out.println("statut : salarié");
	}

}
