package fr.unilim.iut.spaceinvaders.models;

public class Envahisseur extends Sprite {
	
	 public Direction sens;

	public Envahisseur(Dimension dimension, Position positionOrigine,int vitesse) {
		    this.dimension = dimension;
		    this.origine = positionOrigine;
		    this.vitesse=vitesse;
	    }

}

