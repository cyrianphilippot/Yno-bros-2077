package ynobros2077;

import server.clientConnexion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;

import org.omg.CORBA.INITIALIZE;

import com.sun.java.swing.plaf.windows.WindowsOptionPaneUI;
import com.sun.java.swing.plaf.windows.resources.windows;

import server.clientConnexion;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class pageMenu {

	private static JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void launchPageMenu() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pageMenu window = new pageMenu();
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
	public pageMenu() {
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

		textField = new JTextField();
		textField.setBounds(174, 80, 86, 20);
		panel.add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Valider");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String userName = textField.getText();
				mapChoice.launchMapChoice(userName);;

			}
		});
		btnNewButton.setBounds(174, 123, 86, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Quitter");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            System.exit(0);
			}
		});
		btnNewButton_1.setBounds(345, 238, 89, 23);
		panel.add(btnNewButton_1);
	}
}