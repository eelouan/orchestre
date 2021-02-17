package fr.orchestre.elouan;

public class Partition {
	
	private String nom;
	
	public Partition(String nom){
		if(!nom.matches("^(A-G)$")) {
			System.out.println("error");
		}
			
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
