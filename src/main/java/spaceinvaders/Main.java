package spaceinvaders;

import fr.unilim.iut.spaceinvaders.models.Constante;
import fr.unilim.iut.spaceinvaders.models.DessinSpaceInvaders;
import fr.unilim.iut.spaceinvaders.models.SpaceInvaders;
import fr.unilim.iut.spaceinvaders.moteurjeu.MoteurGraphique;

public class Main {
	 public static void main(String[] args) throws InterruptedException {

		    SpaceInvaders jeu = new SpaceInvaders(Constante.ESPACEJEU_LONGUEUR, Constante.ESPACEJEU_HAUTEUR);
		    jeu.initialiserJeu();
		    DessinSpaceInvaders afficheur = new DessinSpaceInvaders(jeu);

		    MoteurGraphique moteur = new MoteurGraphique(jeu, afficheur);
		    moteur.lancerJeu(Constante.ESPACEJEU_LONGUEUR, Constante.ESPACEJEU_HAUTEUR);
	    }
}
