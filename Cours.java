package Ecole;
import java.util.*;

public class Cours {
	private String Nom;
	private LinkedList<Etudiants> Etudiantss;
	private Professeurs Enseigner;
	
	public Cours(String nom) {
		Nom=nom;
		Etudiantss=new LinkedList<Etudiants>();
	}
	
	public void AjouterEtudiant(Etudiants e) {
		Etudiantss.add(e);
	}
	
	public void RemoveEtudiant(int i) {
		Etudiantss.remove(i);
	}
	
	public void AssignerEnseignant(Professeurs p) {
		Enseigner=p;
	}
	
	public void getNombreEtudiant() {
		System.out.println("le nombre des étudiants est : "+Etudiantss.size());
	}

	public String getNom() {
		return Nom;
	}
	
		
}
