package personnages;

public class Ronin extends Humain{
	
	private int honneur = 1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int argentDonnee = this.getArgent() / 10;
		this.parler(beneficiaire.getNom() + " prend ces " + argentDonnee + " sous.");
		this.perdreArgent(argentDonnee);
		beneficiaire.recevoir(argentDonnee);;
	}

	

}
