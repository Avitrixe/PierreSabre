package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Commercant marco = new Commercant("marco", 20);
		Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "whisky", 30);
		Ronin roro = new Ronin("Roro", "shochu", 60);
		
		roro.direBonjour();
		roro.donner(marco);
	}

}
