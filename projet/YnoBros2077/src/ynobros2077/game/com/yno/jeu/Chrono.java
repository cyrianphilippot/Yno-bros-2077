package ynobros2077.game.com.yno.jeu;

public class Chrono implements Runnable{

	private final int PAUSE = 3; // temps d'attente entre 2 tours de boucle
	
	@Override
    public void run(){        
        while(true){ // boucle infinie                        
            // Instruction repetee a chaque tour de boucle            
            Main.scene.repaint();            
            try{Thread.sleep(PAUSE);} // on arrete le flux principal pendant le temps egal a PAUSE en ms
            catch (InterruptedException e){}
        }        
    }
}