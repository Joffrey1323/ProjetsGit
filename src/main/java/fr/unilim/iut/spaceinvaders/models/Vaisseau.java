package fr.unilim.iut.spaceinvaders.models;

public class Vaisseau extends Sprite {
    
    public Vaisseau(Dimension dimension, Position positionOrigine,int vitesse) {
	    this.dimension = dimension;
	    this.origine = positionOrigine;
	    this.vitesse=vitesse;
    }

	public Missile tirerUnMissile(Dimension dimensionMissile, int vitesseMissile) {
		
		Position positionOrigineMissile = calculerLaPositionDeTirDuMissile(dimensionMissile);

		return new Missile(dimensionMissile, positionOrigineMissile, vitesseMissile);
	}

	public Position calculerLaPositionDeTirDuMissile(Dimension dimensionMissile) {
		int abscisseMilieuVaisseau = this.abscisseLaPlusAGauche() + (this.longueur() / 2);
		int abscisseOrigineMissile = abscisseMilieuVaisseau - (dimensionMissile.longueur() / 2);

		int ordonneeeOrigineMissile = this.ordonneeLaPlusBasse() - 1;
		Position positionOrigineMissile = new Position(abscisseOrigineMissile, ordonneeeOrigineMissile);
		return positionOrigineMissile;
	}

}
