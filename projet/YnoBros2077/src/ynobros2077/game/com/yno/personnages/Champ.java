package ynobros2077.game.com.yno.personnages;

import java.awt.Image;

import javax.swing.ImageIcon;

import  ynobros2077.game.com.yno.objets.Objet;

public class Champ extends Personnage implements Runnable{
	
	private Image imgChamp;
	private ImageIcon icoChamp;
	
	private final int PAUSE = 15; // temps d'attente en ms entre 2 tours de boucle
	private int dxChamp; // pas de deplacement du champignon
	
	
	//**** CONSTRUCTEUR	****//
	public Champ(int x, int y) {
		
		super(x, y, 27, 30);
		super.setVersDroite(true);
		super.setMarche(true);
		this.dxChamp = 1;
		
		this.icoChamp = new ImageIcon(getClass().getResource("/images/champArretDroite.png"));
		this.imgChamp = this.icoChamp.getImage();
		
		Thread chronoChamp = new Thread(this);
		chronoChamp.start();
	}

	
	//**** GETTERS ****//		
	public Image getImgChamp() {return imgChamp;}

		
	//**** SETTERS ****//
		
		
	//**** METHODES ****//	
	public void bouge(){ // deplacement du champignon
    	if(super.isVersDroite() == true){this.dxChamp = 1;}
    	else{this.dxChamp = -1;}
        super.setX(super.getX() + this.dxChamp);  	
    }
	
	@Override
	public void run() {
		try{Thread.sleep(20);} // on attend 20 ms avant d'appeler bouge pour que tous les objets soient completement crees
		catch (InterruptedException e){}		
		
		while(true){ // boucle infinie											
		    this.bouge();
		    try{Thread.sleep(PAUSE);}
			catch (InterruptedException e){}
		}
	}
	
	public void contact(Objet objet) {			
		if(super.contactAvant(objet) == true && this.isVersDroite() == true){					
            super.setVersDroite(false);
	    	this.dxChamp = -1; 
	    }else if(super.contactArriere(objet) == true && this.isVersDroite() == false){
	    	super.setVersDroite(true);
	    	this.dxChamp = 1;     
	    }	
	}
}