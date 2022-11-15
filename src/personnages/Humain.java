package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	protected int nbConnaissance = 0;
	protected Humain[] memoire;
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
		this.memoire = new Humain[30];
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	public void parler(String texte) {
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
			parler("Je me suis acheter un " + bien + ", cela m'a coute " + prix);
			perdreArgent(prix);
		}
		else
		{
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux meme pas m'offrir un " + bien + " � " + prix + " sous.");
		}
	}
	
	protected void perdreArgent(int prix) {
		argent -= prix;
	}
	
	protected void gagnerArgent(int prix) {
		argent += prix;
	}
	
	public void listerConnaissance()
	{
		System.out.println("Je connais beaucoup de monde dont : ");
		for(int i=0; i<nbConnaissance; i++)
		{
			System.out.println(memoire[i].getNom());
		}
	}
	
	private void repondre(Humain humain)
	{
		this.direBonjour();
		memoriser(humain);
	}
	
	private void memoriser(Humain humain)
	{
		if(nbConnaissance == 30)
		{
			for(int i=0; i<nbConnaissance-1; i++)
			{
				memoire[i] = memoire[i+1];
			}
			memoire[nbConnaissance-1]= humain;
		}
		else
		{
			memoire[nbConnaissance] = humain;
			nbConnaissance ++;
		}
	}
	
	public void faireConnaissanceAvec(Humain autreHumain)
	{
		this.direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}

}
