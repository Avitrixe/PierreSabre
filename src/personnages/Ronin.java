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
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur * 2;
		this.parler("Je t'ai retrouve vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		if(force >= adversaire.getReputation()) {
			this.parler("Je t'ai eu petit yakuza !");
			this.gagnerArgent(adversaire.perdre());
			honneur ++;
		}
		else {
			honneur --;
			this.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(this.getArgent());
			this.perdreArgent(this.getArgent());
		}
	}

	

}
