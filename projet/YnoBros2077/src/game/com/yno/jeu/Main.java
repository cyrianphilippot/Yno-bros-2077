package game.com.yno.jeu;

import javax.swing.JFrame;

public class Main {

	public static Scene scene;
	
	public static void main(String[] args) {
		
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
	}
}
