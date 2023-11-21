import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Panel;
import javax.swing.JLabel;
import java.awt.Label;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class shop {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					shop window = new shop();
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
	public shop() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(247, 186, 232));
		frame.setBackground(new Color(184, 235, 169));
		frame.setBounds(100, 100, 1400,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("🪙: ");
		lblNewLabel.setBounds(677, 22, 75, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ability Cards for Purchase:");
		lblNewLabel_1.setBounds(610, 6, 186, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
	
		//"Kill Enemy Cards !!"
		
		JButton btnNewButton_1 = new JButton("Card info ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(6, 47, 221, 499);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Battle Arena");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(6, 575, 221, 55);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Forfeit ;(");
		btnNewButton_3.setBounds(6, 634, 221, 55);
		frame.getContentPane().add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() { // adding action listen
	           public void actionPerformed(ActionEvent e) { 
	               System.exit(0);
	           }
	       });
	 
		JLabel lblNewLabel_2 = new JLabel("Time Left");
		lblNewLabel_2.setBounds(17, 22, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_5_1_5 = new JButton("Sock Puppetry");
		btnNewButton_5_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5_1_5.setBounds(324, 70, 140, 249);
		frame.getContentPane().add(btnNewButton_5_1_5);
		
		JButton btnNewButton_5_1_1_1 = new JButton("Inverted Reflection");
		btnNewButton_5_1_1_1.setBounds(469, 70, 140, 249);
		frame.getContentPane().add(btnNewButton_5_1_1_1);
		
		JButton btnNewButton_5_1_2_1 = new JButton("Holographic Hideaway");
		btnNewButton_5_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5_1_2_1.setBounds(612, 70, 140, 249);
		frame.getContentPane().add(btnNewButton_5_1_2_1);
		
		JButton btnNewButton_5_1_3_1 = new JButton("Malicious Mend");
		btnNewButton_5_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5_1_3_1.setBounds(755, 70, 140, 249);
		frame.getContentPane().add(btnNewButton_5_1_3_1);
		
		JButton btnNewButton_5_1_4_1 = new JButton("Reprehensive Rejuvenation");
		btnNewButton_5_1_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5_1_4_1.setBounds(900, 70, 140, 249);
		frame.getContentPane().add(btnNewButton_5_1_4_1);
		
		JLabel lblNewLabel_3 = new JLabel("Need more cards?");
		lblNewLabel_3.setBounds(1192, 32, 152, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Defeat enemy cards!!");
		lblNewLabel_4.setBounds(1192, 72, 140, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(1164, 100, 212, 604);
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton_5_1_5_1 = new JButton(" Sinister Serenity");
		btnNewButton_5_1_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5_1_5_1.setBounds(324, 349, 140, 249);
		frame.getContentPane().add(btnNewButton_5_1_5_1);
		
		JButton btnNewButton_5_1_1_1_1 = new JButton("Inverted Reflection");
		btnNewButton_5_1_1_1_1.setBounds(469, 349, 140, 249);
		frame.getContentPane().add(btnNewButton_5_1_1_1_1);
		
		JButton btnNewButton_5_1_2_1_1 = new JButton("Nefarious Nibbles");
		btnNewButton_5_1_2_1_1.setBounds(612, 349, 140, 249);
		frame.getContentPane().add(btnNewButton_5_1_2_1_1);
		
		JButton btnNewButton_5_1_3_1_1 = new JButton("Sneaky Smooch");
		btnNewButton_5_1_3_1_1.setBounds(755, 349, 140, 249);
		frame.getContentPane().add(btnNewButton_5_1_3_1_1);
		
		JButton btnNewButton_5_1_4_1_1 = new JButton("Quantum Quake");
		btnNewButton_5_1_4_1_1.setBounds(900, 349, 140, 249);
		frame.getContentPane().add(btnNewButton_5_1_4_1_1);
		
		JButton btnNewButton_3_1 = new JButton("Buy Card");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3_1.setBounds(6, 695, 221, 55);
		frame.getContentPane().add(btnNewButton_3_1);
		//using JRadioButtons so user can select card + view stats when selected
		
	}
}
