package fr.digi.calcul_salaire;

public class TestIntervenant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salarie robin = new Salarie("robin", "csn", 9548.70);
		System.out.println(robin.getSalaire());

		Pigiste natasha = new Pigiste("natascha", "trigalez", 4.7, 105.7);
		System.out.println(natasha.getSalaire());

		robin.afficherDonnees();
		natasha.afficherDonnees();
	}

}
