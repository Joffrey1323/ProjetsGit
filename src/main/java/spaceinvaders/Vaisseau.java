package spaceinvaders;

public class Vaisseau extends Sprite {
    
    public Vaisseau(Dimension dimension, Position positionOrigine,int vitesse) {
	    this.dimension = dimension;
	    this.origine = positionOrigine;
	    this.vitesse=vitesse;
    }

}
