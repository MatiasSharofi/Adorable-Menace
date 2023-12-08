import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Label;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class ShopScreen {
	
	static JFrame frame;
	
	static JButton closeInfo;
	
	static ImageIcon abilityCard1_1;
	static ImageIcon abilityCard2_1;
	static ImageIcon abilityCard3_1;
	static ImageIcon abilityCard4_1;
	static ImageIcon abilityCard5_1;
	static ImageIcon abilityCard6_1;
	static ImageIcon abilityCard7_1;
	static ImageIcon abilityCard8_1;
	static ImageIcon abilityCard9_1;
	static ImageIcon abilityCard10_1;
	static JButton abilityCard1;
	static JButton abilityCard2;
	static JButton abilityCard3;
	static JButton abilityCard4;
	static JButton abilityCard5;
	static JButton abilityCard6;
	static JButton abilityCard7;
	static JButton abilityCard8;
	static JButton abilityCard9;
	static JButton abilityCard10;
	static JButton cardInfo;
	
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void showShopScreen()
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(247, 186, 232));
		frame.setBackground(new Color(184, 235, 169));
		frame.setBounds(100, 100, 1400,800);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("🪙: ");
		lblNewLabel.setBounds(677, 22, 75, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ability Cards for Purchase:");
		lblNewLabel_1.setBounds(610, 6, 186, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton battleArenaButton = new JButton("Battle Arena");
		battleArenaButton.setBounds(6, 632, 212, 49);
		frame.getContentPane().add(battleArenaButton);
		battleArenaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				GameplayScreen gs = new GameplayScreen();
				gs.showGameplayScreen();
			}
		});
		
		JButton forfeitButton = new JButton("Forfeit");
		forfeitButton.setBounds(6, 691, 212, 49);
		frame.getContentPane().add(forfeitButton);
		forfeitButton.addActionListener(new ActionListener() { // adding action listen
	           public void actionPerformed(ActionEvent e) { 
	        	   JOptionPane.showMessageDialog(forfeitButton, "","Press OK to return to Main Menu", 0);
	        	   frame.setVisible(false);
	        	   MainMenuScreen ms = new MainMenuScreen();
	        	   ms.showMainMenuScreen();
	           }
	       });
	 
		JLabel lblNewLabel_2 = new JLabel("Time Left");
		lblNewLabel_2.setBounds(17, 22, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		abilityCard1_1 = new ImageIcon("resources/images/sock puppetry.jpg");
		Image abilityCard1_2 = abilityCard1_1.getImage();
        Image abilityCard1_3 = abilityCard1_2.getScaledInstance(140, 249, Image.SCALE_SMOOTH);
        ImageIcon abilityCard1_4 = new ImageIcon(abilityCard1_3);
        
        abilityCard1 = new JButton(abilityCard1_4);
		abilityCard1.setBounds(324, 70, 140, 249);
		frame.getContentPane().add(abilityCard1);
		
		abilityCard1.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				closeInfo.setVisible(true);
				abilityCard1.setEnabled(false);
				abilityCard2.setEnabled(false);
				abilityCard3.setEnabled(false);
				abilityCard4.setEnabled(false);
				abilityCard5.setEnabled(false);
				abilityCard6.setEnabled(false);
				abilityCard7.setEnabled(false);
				abilityCard8.setEnabled(false);
				abilityCard9.setEnabled(false);
				abilityCard10.setEnabled(false);
				
				Image cardInfo_1 = abilityCard1_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				frame.getContentPane().add(cardInfo);
			}
		});
		
		abilityCard2_1 = new ImageIcon("resources/images/inverted reflection.jpg");
		Image abilityCard2_2 = abilityCard2_1.getImage();
        Image abilityCard2_3 = abilityCard2_2.getScaledInstance(140, 249, Image.SCALE_SMOOTH);
        ImageIcon abilityCard2_4 = new ImageIcon(abilityCard2_3);
        
        abilityCard2 = new JButton(abilityCard2_4);
		abilityCard2.setBounds(469, 70, 140, 249);
		frame.getContentPane().add(abilityCard2);
		
		abilityCard2.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				closeInfo.setVisible(true);
				abilityCard1.setEnabled(false);
				abilityCard2.setEnabled(false);
				abilityCard3.setEnabled(false);
				abilityCard4.setEnabled(false);
				abilityCard5.setEnabled(false);
				abilityCard6.setEnabled(false);
				abilityCard7.setEnabled(false);
				abilityCard8.setEnabled(false);
				abilityCard9.setEnabled(false);
				abilityCard10.setEnabled(false);
				
				Image cardInfo_1 = abilityCard2_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				frame.getContentPane().add(cardInfo);
			}
		});
		
		abilityCard3_1 = new ImageIcon("resources/images/holographic hideaway.jpg");
		Image abilityCard3_2 = abilityCard3_1.getImage();
        Image abilityCard3_3 = abilityCard3_2.getScaledInstance(140, 249, Image.SCALE_SMOOTH);
        ImageIcon abilityCard3_4 = new ImageIcon(abilityCard3_3);
        
        abilityCard3 = new JButton(abilityCard3_4);
		abilityCard3.setBounds(612, 70, 140, 249);
		frame.getContentPane().add(abilityCard3);
		
		abilityCard3.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				closeInfo.setVisible(true);
				abilityCard1.setEnabled(false);
				abilityCard2.setEnabled(false);
				abilityCard3.setEnabled(false);
				abilityCard4.setEnabled(false);
				abilityCard5.setEnabled(false);
				abilityCard6.setEnabled(false);
				abilityCard7.setEnabled(false);
				abilityCard8.setEnabled(false);
				abilityCard9.setEnabled(false);
				abilityCard10.setEnabled(false);
				
				Image cardInfo_1 = abilityCard3_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				frame.getContentPane().add(cardInfo);
			}
		});
		
		abilityCard4_1 = new ImageIcon("resources/images/malicious mend.jpg");
		Image abilityCard4_2 = abilityCard4_1.getImage();
        Image abilityCard4_3 = abilityCard4_2.getScaledInstance(140, 249, Image.SCALE_SMOOTH);
        ImageIcon abilityCard4_4 = new ImageIcon(abilityCard4_3);
        
        abilityCard4 = new JButton(abilityCard4_4);
		abilityCard4.setBounds(755, 70, 140, 249);
		frame.getContentPane().add(abilityCard4);
		
		abilityCard4.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				closeInfo.setVisible(true);
				abilityCard1.setEnabled(false);
				abilityCard2.setEnabled(false);
				abilityCard3.setEnabled(false);
				abilityCard4.setEnabled(false);
				abilityCard5.setEnabled(false);
				abilityCard6.setEnabled(false);
				abilityCard7.setEnabled(false);
				abilityCard8.setEnabled(false);
				abilityCard9.setEnabled(false);
				abilityCard10.setEnabled(false);
				
				Image cardInfo_1 = abilityCard4_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				frame.getContentPane().add(cardInfo);
			}
		});
		
		abilityCard5_1 = new ImageIcon("resources/images/reprehensive rejuvenation.jpg");
		Image abilityCard5_2 = abilityCard5_1.getImage();
        Image abilityCard5_3 = abilityCard5_2.getScaledInstance(140, 249, Image.SCALE_SMOOTH);
        ImageIcon abilityCard5_4 = new ImageIcon(abilityCard5_3);
        
        abilityCard5 = new JButton(abilityCard5_4);
		abilityCard5.setBounds(900, 70, 140, 249);
		frame.getContentPane().add(abilityCard5);
		
		abilityCard5.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				closeInfo.setVisible(true);
				abilityCard1.setEnabled(false);
				abilityCard2.setEnabled(false);
				abilityCard3.setEnabled(false);
				abilityCard4.setEnabled(false);
				abilityCard5.setEnabled(false);
				abilityCard6.setEnabled(false);
				abilityCard7.setEnabled(false);
				abilityCard8.setEnabled(false);
				abilityCard9.setEnabled(false);
				abilityCard10.setEnabled(false);
				
				Image cardInfo_1 = abilityCard5_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				frame.getContentPane().add(cardInfo);
			}
		});
		
		abilityCard6_1 = new ImageIcon("resources/images/sinister serenity.jpg");
		Image abilityCard6_2 = abilityCard6_1.getImage();
        Image abilityCard6_3 = abilityCard6_2.getScaledInstance(140, 249, Image.SCALE_SMOOTH);
        ImageIcon abilityCard6_4 = new ImageIcon(abilityCard6_3);
        
        abilityCard6 = new JButton(abilityCard6_4);
		abilityCard6.setBounds(324, 349, 140, 249);
		frame.getContentPane().add(abilityCard6);
		
		abilityCard6.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				closeInfo.setVisible(true);
				abilityCard1.setEnabled(false);
				abilityCard2.setEnabled(false);
				abilityCard3.setEnabled(false);
				abilityCard4.setEnabled(false);
				abilityCard5.setEnabled(false);
				abilityCard6.setEnabled(false);
				abilityCard7.setEnabled(false);
				abilityCard8.setEnabled(false);
				abilityCard9.setEnabled(false);
				abilityCard10.setEnabled(false);
				
				Image cardInfo_1 = abilityCard6_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				frame.getContentPane().add(cardInfo);
			}
		});
		
		abilityCard7_1 = new ImageIcon("resources/images/nefarious nibbles.jpg");
		Image abilityCard7_2 = abilityCard7_1.getImage();
        Image abilityCard7_3 = abilityCard7_2.getScaledInstance(140, 249, Image.SCALE_SMOOTH);
        ImageIcon abilityCard7_4 = new ImageIcon(abilityCard7_3);
        
        abilityCard7 = new JButton(abilityCard7_4);
		abilityCard7.setBounds(469, 349, 140, 249);
		frame.getContentPane().add(abilityCard7);
		
		abilityCard7.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				closeInfo.setVisible(true);
				abilityCard1.setEnabled(false);
				abilityCard2.setEnabled(false);
				abilityCard3.setEnabled(false);
				abilityCard4.setEnabled(false);
				abilityCard5.setEnabled(false);
				abilityCard6.setEnabled(false);
				abilityCard7.setEnabled(false);
				abilityCard8.setEnabled(false);
				abilityCard9.setEnabled(false);
				abilityCard10.setEnabled(false);
				
				Image cardInfo_1 = abilityCard7_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				frame.getContentPane().add(cardInfo);
			}
		});
		
		abilityCard8_1 = new ImageIcon("resources/images/sneaky smooch.jpg");
		Image abilityCard8_2 = abilityCard8_1.getImage();
        Image abilityCard8_3 = abilityCard8_2.getScaledInstance(140, 249, Image.SCALE_SMOOTH);
        ImageIcon abilityCard8_4 = new ImageIcon(abilityCard8_3);
        
        abilityCard8 = new JButton(abilityCard8_4);
		abilityCard8.setBounds(612, 349, 140, 249);
		frame.getContentPane().add(abilityCard8);
		
		abilityCard8.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				closeInfo.setVisible(true);
				abilityCard1.setEnabled(false);
				abilityCard2.setEnabled(false);
				abilityCard3.setEnabled(false);
				abilityCard4.setEnabled(false);
				abilityCard5.setEnabled(false);
				abilityCard6.setEnabled(false);
				abilityCard7.setEnabled(false);
				abilityCard8.setEnabled(false);
				abilityCard9.setEnabled(false);
				abilityCard10.setEnabled(false);
				
				Image cardInfo_1 = abilityCard8_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				frame.getContentPane().add(cardInfo);
			}
		});
		
		abilityCard9_1 = new ImageIcon("resources/images/quantum quake.jpg");
		Image abilityCard9_2 = abilityCard9_1.getImage();
        Image abilityCard9_3 = abilityCard9_2.getScaledInstance(140, 249, Image.SCALE_SMOOTH);
        ImageIcon abilityCard9_4 = new ImageIcon(abilityCard9_3);
        
        abilityCard9 = new JButton(abilityCard9_4);
		abilityCard9.setBounds(755, 349, 140, 249);
		frame.getContentPane().add(abilityCard9);
		
		abilityCard9.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				closeInfo.setVisible(true);
				abilityCard1.setEnabled(false);
				abilityCard2.setEnabled(false);
				abilityCard3.setEnabled(false);
				abilityCard4.setEnabled(false);
				abilityCard5.setEnabled(false);
				abilityCard6.setEnabled(false);
				abilityCard7.setEnabled(false);
				abilityCard8.setEnabled(false);
				abilityCard9.setEnabled(false);
				abilityCard10.setEnabled(false);
				
				Image cardInfo_1 = abilityCard9_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				frame.getContentPane().add(cardInfo);
			}
		});
		
		abilityCard10_1 = new ImageIcon("resources/images/subatomic swap.jpg");
		Image abilityCard10_2 = abilityCard10_1.getImage();
        Image abilityCard10_3 = abilityCard10_2.getScaledInstance(140, 249, Image.SCALE_SMOOTH);
        ImageIcon abilityCard10_4 = new ImageIcon(abilityCard10_3);
        
        abilityCard10 = new JButton(abilityCard10_4);
		abilityCard10.setBounds(900, 349, 140, 249);
		frame.getContentPane().add(abilityCard10);
		
		abilityCard10.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				closeInfo.setVisible(true);
				abilityCard1.setEnabled(false);
				abilityCard2.setEnabled(false);
				abilityCard3.setEnabled(false);
				abilityCard4.setEnabled(false);
				abilityCard5.setEnabled(false);
				abilityCard6.setEnabled(false);
				abilityCard7.setEnabled(false);
				abilityCard8.setEnabled(false);
				abilityCard9.setEnabled(false);
				abilityCard10.setEnabled(false);
				
				Image cardInfo_1 = abilityCard10_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				frame.getContentPane().add(cardInfo);
			}
		});
		
		JLabel lblNewLabel_3 = new JLabel("Need more cards?");
		lblNewLabel_3.setBounds(1192, 32, 152, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Defeat enemy cards!!");
		lblNewLabel_4.setBounds(1192, 72, 140, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(1132, 100, 212, 604);
		frame.getContentPane().add(textArea);
		
		closeInfo = new JButton("CLOSE INFO");
		closeInfo.setBounds(54, 458, 127, 21);
		frame.getContentPane().add(closeInfo);
		
		JButton purchase1 = new JButton("PURCHASE");
		purchase1.setBounds(324, 318, 140, 21);
		frame.getContentPane().add(purchase1);
		
		JButton purchase2 = new JButton("PURCHASE");
		purchase2.setBounds(469, 318, 140, 21);
		frame.getContentPane().add(purchase2);
		
		JButton purchase3 = new JButton("PURCHASE");
		purchase3.setBounds(612, 318, 140, 21);
		frame.getContentPane().add(purchase3);
		
		JButton purchase4 = new JButton("PURCHASE");
		purchase4.setBounds(755, 318, 140, 21);
		frame.getContentPane().add(purchase4);
		
		JButton purchase5 = new JButton("PURCHASE");
		purchase5.setBounds(900, 318, 140, 21);
		frame.getContentPane().add(purchase5);
		
		JButton purchase6 = new JButton("PURCHASE");
		purchase6.setBounds(324, 598, 140, 21);
		frame.getContentPane().add(purchase6);
		
		JButton purchase7 = new JButton("PURCHASE");
		purchase7.setBounds(469, 598, 140, 21);
		frame.getContentPane().add(purchase7);
		
		JButton purchase8 = new JButton("PURCHASE");
		purchase8.setBounds(612, 598, 140, 21);
		frame.getContentPane().add(purchase8);
		
		JButton purchase9 = new JButton("PURCHASE");
		purchase9.setBounds(755, 598, 140, 21);
		frame.getContentPane().add(purchase9);
		
		JButton purchase10 = new JButton("PURCHASE");
		purchase10.setBounds(900, 598, 140, 21);
		frame.getContentPane().add(purchase10);
		closeInfo.setVisible(false);
		
		closeInfo.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				cardInfo.setVisible(false);
				closeInfo.setVisible(false);
				abilityCard1.setEnabled(true);
				abilityCard2.setEnabled(true);
				abilityCard3.setEnabled(true);
				abilityCard4.setEnabled(true);
				abilityCard5.setEnabled(true);
				abilityCard6.setEnabled(true);
				abilityCard7.setEnabled(true);
				abilityCard8.setEnabled(true);
				abilityCard9.setEnabled(true);
				abilityCard10.setEnabled(true);
			}
		});
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
