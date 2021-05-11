package ynobros2077.game.objets;

import java.awt.Image;

import javax.swing.ImageIcon;

public class TuyauRouge extends Objet{
	
	//**** VARIABLES ****//
	
	
	//**** CONSTRUCTEUR	****//	
	public TuyauRouge(int x, int y) {

		super(x, y, 43, 65);		
		super.icoObjet = new ImageIcon(getClass().getResource("/images/tuyauRouge.png"));
		super.imgObjet = this.icoObjet.getImage();
	}
	
	
	//**** GETTERS ****//		
		
		
	//**** SETTERS ****//
		

	//**** METHODES ****//

}