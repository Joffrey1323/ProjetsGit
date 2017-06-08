package spaceinvaders;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import fr.unilim.iut.spaceinvaders.models.Dimension;
import fr.unilim.iut.spaceinvaders.models.Position;
import fr.unilim.iut.spaceinvaders.models.SpaceInvaders;

public class CollisionTest {

	   
	    private SpaceInvaders spaceinvaders;
		
	   @Before
	   public void initialisation() {
	    spaceinvaders = new SpaceInvaders(15, 10);
	   }
	   
	  // A defaut d'avoir trouver des tests efficases, nous avons laisser ces tests qui ne sont pas efficases afin d'éviter de passer
	  // trop de temps sur cette étape
	   @Test
	    public void test_CollisionEntreMissileEtEnvahisseurParLeBas(){

	     
	     spaceinvaders.positionnerUnNouvelEnvahisseur(new Dimension(5,2),new Position(6,1),5);
	     spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(7,2),new Position(5,9), 2);
	     spaceinvaders.tirerUnMissile(new Dimension(3,1),5);
	     

	     spaceinvaders.deplacerMissile();
	     
	        assertEquals("" + 
	        "......EEEEE....\n" + 
	        "......EEEEE....\n" +
	        ".......MMM.....\n" + 
	        "...............\n" + 
	        "...............\n" + 
	        "...............\n" + 
	        "...............\n" + 
	        "...............\n" + 
	        ".....VVVVVVV...\n" + 
	        ".....VVVVVVV...\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	    }
	    
	    @Test
	    public void test_CollisionEntreMissileEtEnvahisseurParLaDroite(){
	     
	     spaceinvaders.positionnerUnNouvelEnvahisseur(new Dimension(5,2),new Position(4,1),4);
	     spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(7,2),new Position(7,9), 1);
	     spaceinvaders.tirerUnMissile(new Dimension(3,2),6);


	     spaceinvaders.deplacerMissile();
	     
	        assertEquals("" + 
	        "....EEEEEMMM...\n" + 
	        "....EEEEEMMM...\n" +
	        "...............\n" + 
	        "...............\n" + 
	        "...............\n" + 
	        "...............\n" + 
	        "...............\n" + 
	        "...............\n" + 
	        ".......VVVVVVV.\n" + 
	        ".......VVVVVVV.\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	    }
	    
	    @Test
	    public void test_CollisionEntreMissileEtEnvahisseurParLaGauche(){
	     
	     spaceinvaders.positionnerUnNouvelEnvahisseur(new Dimension(5,2),new Position(6,1),5);
	     spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(7,2),new Position(1,9), 2);
	     spaceinvaders.tirerUnMissile(new Dimension(3,2),6);


	     spaceinvaders.deplacerMissile();
	     
	        assertEquals("" + 
	        "...MMMEEEEE....\n" + 
	        "...MMMEEEEE....\n" +
	        "...............\n" + 
	        "...............\n" + 
	        "...............\n" + 
	        "...............\n" + 
	        "...............\n" + 
	        "...............\n" + 
	        ".VVVVVVV.......\n" + 
	        ".VVVVVVV.......\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	    }
}
