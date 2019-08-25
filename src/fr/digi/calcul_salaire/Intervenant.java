package fr.digi.calcul_salaire;

public abstract class Intervenant {

	String nom, prenom;

	public abstract double getSalaire();

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void afficherDonnees() {
		System.out.println("nom : " + nom + "  pr�nom : " + prenom + " salaire : " + getSalaire() + "�");
	}

}
