package Ecole;

public class GestionCours {
	public static void main(String[] args) {
		Cours c1=new Cours("Reseau");
		Cours c2=new Cours("UML");
		Cours c3=new Cours("RO");
		Cours c4=new Cours("BD");
		Cours c5=new Cours("COMP");
		Cours c6=new Cours("C++");
		Professeurs p1=new Professeurs("Boulouz","boulouza@yahoo.com");
		Etudiants e1=new Etudiants("Marouane","soussi@gmail.com");
		c1.AssignerEnseignant(p1);
		
		c1.AjouterEtudiant(e1);
		
		
		//affichage du professeurs
		p1.addCours(c1);
		p1.addCours(c2);
		p1.affiche();
		
		//affichage des etudiants
		e1.addCours(c1, 14);
		e1.addCours(c2, 15);
		e1.addCours(c3, 18);
		e1.addCours(c4, 9);
		e1.addCours(c5, 16);
		e1.addCours(c6, 8);
		
		e1.Affichee();
		e1.AssisteEtudiant();
		
		//System.out.println("nbre est : " +Personne.calculMembre());
		
		
	}

}
