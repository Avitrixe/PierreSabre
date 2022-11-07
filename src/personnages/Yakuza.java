package personnages;

public class Yakuza extends Humain{
	
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		this.parler("Tient, tient, ne serait-ce pas un faible marchand qui passe par la ?");
		this.parler(victime.getNom() + ", si tu tient a la vie donne moi ta bourse !");
		int argentVole = victime.seFaireExtorquer();
		this.gagnerArgent(argentVole);
		this.parler("J'ai pique les " + argentVole + " sous de " + victime.getNom() + ", ce qui me fait " + this.getArgent() + " sous dans ma poche. Hi ! Hi !");
		reputation ++;
	}
	
	public int perdre() {
		int argentPerdu = this.getArgent();
		this.perdreArgent(argentPerdu);
		reputation --;
		this.parler("J'ai perdu mon duel et mes " + argentPerdu + " sous, snif... J'ai deshonore le clan de "+ clan);
		return argentPerdu;
	}
	
	public void gagner(int gain) {
		this.gagnerArgent(gain);
		reputation ++;
		this.parler("Ce ronin pensait vraiment battre " + this.getNom() + " du clan " + clan + " ? Je l'ai depouille de ses " + gain + " sous.");
	}
	
	
	
}
