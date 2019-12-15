package Ecole;
import java.util.*;

public class Professeurs extends Personne {
	private LinkedList<Cours> CourEnseignes;
	private static int nb=0;

	public Professeurs(String nom, String email) {
		super(nom, email);
		++nb;
		CourEnseignes=new LinkedList<Cours>();
	}
	
	public void addCours(Cours c) {
		CourEnseignes.add(c);
	}

	public LinkedList<Cours> getCourEnseignes() {
		return CourEnseignes;
	}
	
	

	
	public static int getNb() {
		return nb;
	}

	public void affiche() {
		System.out.println("Professeur [NOM : "+getNom()+" EMAIL : "+getEmail()+"]");
		System.out.println("Les cours enseignés par le professeur : ");
		for(int i=0;i<CourEnseignes.size();i++) {
			System.out.println("Cour "+(i+1)+" : "+CourEnseignes.get(i).getNom());
		}
	}
	
	

}
