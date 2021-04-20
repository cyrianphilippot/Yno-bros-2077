package ynobros2077.game.level1.com.yno.jeu;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;

import ynobros2077.mapChoice;

public class Main {
	
	protected Object frame;

	public static Scene scene;
	
	public static void launchLevel1() {			
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						// Creation de la fenetre de l'application
						JFrame fenetre = new JFrame("Yno-bros-2077");
						fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						fenetre.setSize(700, 360);
						fenetre.setLocationRelativeTo(null);
						fenetre.setResizable(false);
						fenetre.setAlwaysOnTop(true);
						
						// Instanciation de l'objet scene
						scene = new Scene();
								
						fenetre.setContentPane(scene); 
						fenetre.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});		
	}
}
