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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("🪙: ");
		lblNewLabel.setBounds(175, 19, 75, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ability Cards for Purchase:");
		lblNewLabel_1.setBounds(127, 8, 186, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_13 = new JLabel("Need more coins? \n"
				);
		//"Kill Enemy Cards !!"
		lblNewLabel_13.setBounds(325, 16, 125, 29);
		frame.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Kill Enemy Cards!");
		lblNewLabel_14.setBounds(325, 43, 125, 16);
		frame.getContentPane().add(lblNewLabel_14);
		
		JButton btnNewButton = new JButton("Match History");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(327, 70, 117, 185);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Card info ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(6, 47, 117, 110);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Battle Arena");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(6, 169, 117, 29);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Forfeit ;(");
		btnNewButton_3.setBounds(6, 199, 117, 29);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("Time Left");
		lblNewLabel_2.setBounds(17, 22, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_4 = new JButton("Buy Card");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(6, 226, 117, 29);
		frame.getContentPane().add(btnNewButton_4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Sock Puppetry");
		rdbtnNewRadioButton.setBounds(127, 48, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Inverted Reflection\n"
				+ "");
		rdbtnNewRadioButton_1.setBounds(127, 67, 164, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Holographic Hideaway");
		rdbtnNewRadioButton_2.setBounds(127, 89, 186, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Malicious Mend");
		rdbtnNewRadioButton_3.setBounds(127, 112, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Reprehensive Rejuvenation");
		rdbtnNewRadioButton_4.setBounds(127, 135, 243, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Sinister Health\n"
				+ "");
		rdbtnNewRadioButton_5.setBounds(127, 158, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Nefarious Nibbles");
		rdbtnNewRadioButton_6.setBounds(127, 181, 145, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Sneaky Smooch");
		rdbtnNewRadioButton_7.setBounds(127, 200, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Quantum Quake");
		rdbtnNewRadioButton_8.setBounds(127, 219, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_8);
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("Subatomic Swap\n"
				+ "");
		rdbtnNewRadioButton_9.setBounds(127, 240, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9);
	}
}
