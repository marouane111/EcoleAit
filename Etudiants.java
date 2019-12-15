package Ecole;
import java.util.*;

public class Etudiants extends Personne {
	private static int nbCours=0;
	private LinkedList<Cours> Cours;
	private float []note;
	public Etudiants(String nom, String email) {
		super(nom, email);
		Cours=new LinkedList<Cours>();
		note=new float[6];
	}
	
	public void addCours(Cours c,float x) {
		Cours.add(c);
		++nbCours;
		note[nbCours-1]=x;	
	}
	
	
	public float getNote(int i) {
		return note[i];
	}
	
	
	public LinkedList<Cours> getCours() {
		return Cours;
	}
	
	public void AssisteEtudiant() {
		double moyenne;
		double somme=0;
		for(int i=0;i<note.length;i++) {
			somme=somme+note[i];
		}
		moyenne=somme/nbCours;
		if(moyenne>12) System.out.println("admis pour avoir la bourse");
		else System.out.println("non admis pour avoir une bourse");
	}
	
	public void Affichee() {
		System.out.println("Etudiant [NOM : "+getNom()+" EMAIL : "+getEmail());
		for(int i=0;i<Cours.size();i++) {
			System.out.println("Cour "+(i+1)+" : ("+Cours.get(i).getNom()+","+getNote(i)+")");
		}
	}
}
