package fr.digi.projet_approche_objet;

public class TestForme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Cr�er une variable de type cercle, une de type rectangle et une de type carr� et tester la m�thode afficher avec ces diverses variables. 

		Cercle cercle = new Cercle(10);
		Carre carre = new Carre(2);
		Rectangle rectangle = new Rectangle(3, 6);

		AffichageForme aff = new AffichageForme();

		aff.afficher(cercle);
		aff.afficher(carre);
		aff.afficher(rectangle);

	

	}

}
