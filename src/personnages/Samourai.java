package personnages;

public class Samourai extends Ronin{
	private String nomSeigneur;
	
	public Samourai(String nomSeigneur, String nom, String boisson, int argent)
	{
		super(nom, boisson, argent);
		this.nomSeigneur = nomSeigneur;
	}
	
	@Override
	public void direBonjour()
	{
		super.direBonjour();
		System.out.println("Je suis fier de servir le seigneur " + this.nomSeigneur);
	}
	
	public void boire(String boisson)
	{
		this.parler("Qu'est ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boisson);
	}

}
