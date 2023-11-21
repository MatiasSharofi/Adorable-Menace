import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Gameplay_Screen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gameplay_Screen frame = new Gameplay_Screen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Gameplay_Screen() {
		setBackground(new Color(156, 246, 232));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(198, 242, 248));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("User Card 1");
		btnNewButton.setBounds(370, 536, 94, 150);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("User Card 2");
		btnNewButton_1.setBounds(476, 536, 94, 150);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("User Card 3");
		btnNewButton_2.setBounds(582, 536, 94, 150);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("User Card 4");
		btnNewButton_3.setBounds(688, 536, 94, 150);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("User Card 5");
		btnNewButton_4.setBounds(794, 536, 94, 150);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("User Card 6");
		btnNewButton_5.setBounds(900, 536, 94, 150);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("User Card 7");
		btnNewButton_6.setBounds(1006, 536, 94, 150);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Ability");
		btnNewButton_7.setBounds(264, 536, 94, 150);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Shop");
		btnNewButton_8.setBounds(18, 575, 117, 29);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Forfeit");
		btnNewButton_9.setBounds(18, 607, 117, 29);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("User Card 8");
		btnNewButton_10.setBounds(1112, 536, 94, 150);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_10_1 = new JButton("User Card 8");
		btnNewButton_10_1.setBounds(1112, 44, 94, 150);
		contentPane.add(btnNewButton_10_1);
		
		JButton btnNewButton_6_1 = new JButton("User Card 7");
		btnNewButton_6_1.setBounds(1006, 44, 94, 150);
		contentPane.add(btnNewButton_6_1);
		
		JButton btnNewButton_5_1 = new JButton("User Card 6");
		btnNewButton_5_1.setBounds(900, 44, 94, 150);
		contentPane.add(btnNewButton_5_1);
		
		JButton btnNewButton_4_1 = new JButton("User Card 5");
		btnNewButton_4_1.setBounds(794, 44, 94, 150);
		contentPane.add(btnNewButton_4_1);
		
		JButton btnNewButton_3_1 = new JButton("User Card 4");
		btnNewButton_3_1.setBounds(688, 44, 94, 150);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_2_1 = new JButton("User Card 3");
		btnNewButton_2_1.setBounds(582, 44, 94, 150);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_1_1 = new JButton("User Card 2");
		btnNewButton_1_1.setBounds(476, 44, 94, 150);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_11 = new JButton("User Card 1");
		btnNewButton_11.setBounds(370, 44, 94, 150);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_7_1 = new JButton("Ability");
		btnNewButton_7_1.setBounds(264, 44, 94, 150);
		contentPane.add(btnNewButton_7_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(1222, 427, 159, 303);
		contentPane.add(textArea);
		
		JButton btnNewButton_12 = new JButton("Card Info");
		btnNewButton_12.setBounds(6, 44, 250, 400);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_11_1 = new JButton("User Card 1");
		btnNewButton_11_1.setBounds(528, 206, 94, 150);
		contentPane.add(btnNewButton_11_1);
		
		JButton btnNewButton_1_1_1 = new JButton("User Card 2");
		btnNewButton_1_1_1.setBounds(634, 206, 94, 150);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2_1_1 = new JButton("User Card 3");
		btnNewButton_2_1_1.setBounds(740, 206, 94, 150);
		contentPane.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_11_2 = new JButton("User Card 1");
		btnNewButton_11_2.setBounds(528, 368, 94, 150);
		contentPane.add(btnNewButton_11_2);
		
		JButton btnNewButton_1_1_2 = new JButton("User Card 2");
		btnNewButton_1_1_2.setBounds(634, 368, 94, 150);
		contentPane.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_2_1_2 = new JButton("User Card 3");
		btnNewButton_2_1_2.setBounds(740, 368, 94, 150);
		contentPane.add(btnNewButton_2_1_2);
	}
}
