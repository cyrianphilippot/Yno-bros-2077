package ynobros2077;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.Button;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class options {
	
	public JFrame frame;
	
	public static void launchOptions() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					options window = new options();
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
	public options() {
		initialize();
	}

	private void initialize() {
		// TODO Auto-generated method stub
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Options : Volume");
		lblNewLabel.setBounds(0, 11, 150, 14);
		panel.add(lblNewLabel);

		
		JButton btnNewButton_2 = new JButton("1");
		btnNewButton_2.setBounds(0, 60, 89, 23);
		btnNewButton_2.setBackground(Color.cyan);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("2");
		btnNewButton_3.setBounds(90, 60, 89, 23);
		btnNewButton_3.setBackground(Color.green);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("3");
		btnNewButton_4.setBounds(180, 60, 89, 23);
		btnNewButton_4.setBackground(Color.yellow);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("4");
		btnNewButton_5.setBounds(270, 60, 89, 23);
		btnNewButton_5.setBackground(Color.orange);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("5");
		btnNewButton_6.setBounds(360, 60, 89, 23);
		btnNewButton_6.setBackground(Color.red);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton = new JButton("Quitter");
		btnNewButton.addActionListener(e -> {
			   frame.dispose();
		});
		btnNewButton.setBounds(345, 238, 89, 23);
		panel.add(btnNewButton);
	}

}
