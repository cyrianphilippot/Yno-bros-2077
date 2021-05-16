package ynobros2077.game.com.yno.jeu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import ynobros2077.game.com.yno.audio.Audio;

public class Clavier implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		if (Main.scene.mario.isVivant() == true) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) { // fleche droite
				if (Main.scene.getxPos() == -1) {
					Main.scene.setxPos(0); // Reinitialisation de setxPos
					Main.scene.setxFond1(-50); // Reinitialisation de xFond1
					Main.scene.setxFond2(750); // Reinitialisation de xFond2
				}
				Main.scene.mario.setMarche(true);
				Main.scene.mario.setVersDroite(true);
				Main.scene.setDx(1); // Deplacement du fond vers la gauche lors de l'appui sur la touche "fl�che droite"
			} else if (e.getKeyCode() == KeyEvent.VK_LEFT) { // fleche gauche
				if (Main.scene.getxPos() == 4431) {
					Main.scene.setxPos(4430);
					Main.scene.setxFond1(-50);
					Main.scene.setxFond2(750);
				}
				Main.scene.mario.setMarche(true);
				Main.scene.mario.setVersDroite(false);
				Main.scene.setDx(-1); // D�placement du fond vers la droite lors de l'appui sur la touche "fleche gauche"
			}
			// mario saute
			if (e.getKeyCode() == KeyEvent.VK_SPACE) {
				Main.scene.mario.setSaut(true);
				Audio.playSound("/audio/saut.wav");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		Main.scene.mario.setMarche(false);
		Main.scene.setDx(0);
		}

	@Override
	public void keyTyped(KeyEvent e) {}

}
