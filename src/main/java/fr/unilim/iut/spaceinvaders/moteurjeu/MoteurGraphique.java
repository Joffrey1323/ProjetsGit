package fr.unilim.iut.spaceinvaders.moteurjeu;

import fr.unilim.iut.spaceinvaders.models.SpaceInvaders;

/**
 * classe MoteurGraphique represente un moteur de jeu generique.
 * 
 * On lui passe un jeu et un afficheur et il permet d'executer un jeu.
 */
public class MoteurGraphique {

	/**
	 * le jeu a executer
	 */
	private Jeu jeu;

	/**
	 * l'interface graphique
	 */
	private InterfaceGraphique gui;

	/**
	 * l'afficheur a utiliser pour le rendu
	 */
	private DessinJeu dessin;

	/**
	 * construit un moteur
	 * 
	 * @param jeu2
	 *            jeu a lancer
	 * @param pAffiche
	 *            afficheur a utiliser
	 */
	public MoteurGraphique(SpaceInvaders jeu2, DessinJeu pAffiche) {
		// creation du jeu
		this.jeu = jeu2;
		this.dessin = pAffiche;
	}

	/**
	 * permet de lancer le jeu
	 */
	public void lancerJeu(int width, int height) throws InterruptedException {

		// creation de l'interface graphique
		this.gui = new InterfaceGraphique(this.dessin,width,height);
		Controleur controle = this.gui.getControleur();

		// boucle de jeu
		while (!this.jeu.etreFini()) {
			// demande controle utilisateur
			Commande c = controle.getCommande();
			// fait evoluer le jeu
			this.jeu.evoluer(c);
			// affiche le jeu
			this.gui.dessiner();
			// met en attente
			Thread.sleep(100);
		}
	}

}
