package spaceinvaders;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.unilim.iut.spaceinvaders.models.Collision;
import fr.unilim.iut.spaceinvaders.models.Dimension;
import fr.unilim.iut.spaceinvaders.models.Envahisseur;
import fr.unilim.iut.spaceinvaders.models.Missile;
import fr.unilim.iut.spaceinvaders.models.Position;
import fr.unilim.iut.spaceinvaders.models.SpaceInvaders;
import fr.unilim.iut.spaceinvaders.models.Sprite;

public class CollisionTest {

	   
	    private SpaceInvaders spaceinvaders;
		private Missile sprite1;
		private Envahisseur sprite2;
		
		
	   public void initialisation() {
	    spaceinvaders = new SpaceInvaders(15, 10);
	   }

	   
	  

	   @Test
	   public void test_UnMissileToucheUnEnvahisseurAuCentre_MissileDetruit_EnvahisseurDetruit() {
	    spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(5, 2), new Position(7, 9), 1);
	    spaceinvaders.positionnerUnNouvelEnvahisseur(new Dimension(3, 3), new Position(7, 2), 1);
	    spaceinvaders.tirerUnMissile(new Dimension(3,2), 1);
	    
	    for (int i = 1; i < 7; i++)
	     spaceinvaders.deplacerMissile();
	    spaceinvaders.deplacerMissile();
	     assertEquals("" + 
	          "...............\n" + 
	          "...............\n" +
	          "...............\n" + 
	          "...............\n" + 
	          "...............\n" + 
	          "...............\n" + 
	          "...............\n" + 
	          "...............\n" + 
	          "......VVVVV...\n" + 
	          "......VVVVV....\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	   }
	   
	   @Test
	   public void test_UnMissileToucheUnEnvahisseurSurLaDroite_MissileDetruit_EnvahisseurDetruit() {
	    spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(5, 2), new Position(7, 9), 1);
	    spaceinvaders.positionnerUnNouvelEnvahisseur(new Dimension(3, 3), new Position(5, 2), 1);
	    spaceinvaders.tirerUnMissile(new Dimension(3, 2), 1);
	    
	    for (int i = 0; i < 4; i++)
	     spaceinvaders.deplacerMissile();
	    spaceinvaders.deplacerMissile();
	    
	    assertEquals("" + 
	      "...............\n" + 
	      "...............\n" +
	      "...............\n" + 
	      "...............\n" + 
	      "...............\n" + 
	      "...............\n" + 
	      "...............\n" + 
	      "...............\n" + 
	      "......VVVVV....\n" + 
	      "......VVVVV....\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	   }
	   
	   @Test
	   public void test_UnMissileToucheUnEnvahisseurSurLaGauche_MissileDetruit_EnvahisseurDetruit() {
	    spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(5, 2), new Position(5, 9), 1);
	    spaceinvaders.positionnerUnNouvelEnvahisseur(new Dimension(3, 3), new Position(7, 2), 1);
	    spaceinvaders.tirerUnMissile(new Dimension(3, 2), 1);
	    
	    for (int i = 0; i < 4; i++)
	     spaceinvaders.deplacerMissile();
	    spaceinvaders.deplacerMissile();
	    
	    assertEquals("" + 
	      "...............\n" + 
	      "...............\n" +
	      "...............\n" + 
	      "...............\n" + 
	      "...............\n" + 
	      "...............\n" + 
	      "...............\n" + 
	      "...............\n" + 
	      ".....VVVVV.....\n" + 
	      ".....VVVVV.....\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	   }
}
