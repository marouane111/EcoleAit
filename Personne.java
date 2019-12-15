package Ecole;

public abstract class Personne {
	private String Nom;
	private String Email;
	private static int nb=0;
	public Personne(String nom, String email) {
		++nb;
		Nom = nom;
		Email = email;
	}
	public String getNom() {
		return Nom;
	}
	public String getEmail() {
		return Email;
	}
	public static int calculMembre() {
		return nb;
	}
	
}
