package ynobros2077;

import ynobros2077.pageMenu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Desktop;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class mapChoice {

	public JFrame frame;
	public static String userName;

	/**
	 * Launch the application.
	 */
	public static void launchMapChoice(String _userName) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mapChoice window = new mapChoice(_userName);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mapChoice(String _userName) {
		userName = _userName;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenue " + userName + " !");
		lblNewLabel.setBounds(0, 11, 150, 14);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Quitter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(345, 238, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Jouer");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Desktop.getDesktop().open(new File("D://projet/b2/Yno-bros-2077/projet/YnoBros2077/src/ynobros2077/game/YnoBros2077.jar"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}});
		btnNewButton_1.setBounds(10, 60, 89, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Choose a level");
		lblNewLabel_1.setBounds(178, 11, 150, 14);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("Options");
		btnNewButton_2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				options.launchOptions();
			}
		});
		btnNewButton_2.setBounds(345, 213, 89, 23);
		panel.add(btnNewButton_2);
	}
}
