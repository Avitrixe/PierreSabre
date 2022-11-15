package personnages;

import java.util.*;

public class Traitre extends Samourai{
	private int niveauTraitrise = 0;
	
	public Traitre(String nomSeigneur, String nom, String boisson, int argent)
	{
		super(nomSeigneur, nom, boisson, argent);
	}
	
	@Override
	public void direBonjour()
	{
		super.direBonjour();
		this.parler("Niveau de traitrise : " + niveauTraitrise);
	}
	
	public void ranconner(Commercant commercant)
	{
		if(niveauTraitrise == 3)
		{
			this.parler("Mince je ne peux plus ranconner personne sinon un samourai risque de me démasquer !");
		}
		else
		{
			int argentRanconner = commercant.getArgent()*(2/10);
			commercant.perdreArgent(argentRanconner);
			this.gagnerArgent(argentRanconner);
			niveauTraitrise++;
			this.parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne moi " + argentRanconner + " sous ou gare à toi !");
			commercant.parler("Tout de suite grand " + getNom() + ".");
		}
	}
	
	public void faireLeGentil()
	{
		if(nbConnaissance < 1)
		{
			this.parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
		}
		else
		{
			Random random = new Random();
			int indice = random.nextInt(nbConnaissance);
			
			int don = this.getArgent() * (1/20);
			String nomAmi = memoire[indice].getNom();
			this.parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + nomAmi + ".");
			memoire[indice].gagnerArgent(don);
			this.perdreArgent(don);
			String nom = this.getNom();
			memoire[indice].parler("Merci " + nom + ". Vous êtes quelqu'un de bien.");
			
			if(niveauTraitrise >1)
			{
				niveauTraitrise--;
			}
		}
	}

}
