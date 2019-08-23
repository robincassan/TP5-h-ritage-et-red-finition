package fr.digi.projet_approche_objet;

public class AffichageForme {

	public void afficher(Forme f) {
		System.out.println("Perimetre : " + f.calculerPerimetre());
		System.out.println("Surface : " + f.calculerSurface());

	}

}
