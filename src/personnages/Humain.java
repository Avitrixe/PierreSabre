package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	private void parler(String texte) {
		System.out.println(texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if(prix <= argent)
		{
			parler("Je me suis acheter un " + bien + ", cela m'a co�t� " + prix);
			perdreArgent(prix);
		}
		else
		{
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux m�me pas m'offrir un " + bien + " � " + prix + " sous.");
		}
	}
	
	private void perdreArgent(int prix) {
		argent -= prix;
	}
	
	private void gagnerArgent(int prix) {
		argent += prix;
	}

}
