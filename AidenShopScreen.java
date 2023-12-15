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
import java.io.FileWriter;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ShopScreen {
	
	static JFrame frame;
	
	static JButton closeInfo;
	static JLabel ac1Label;
	static JLabel ac2Label;
	static JLabel ac3Label;
	static JLabel ac4Label;
	static JLabel ac5Label;
	static JLabel ac6Label;
	static JLabel ac7Label;
	static JLabel ac8Label;
	static JLabel ac9Label;
	static JLabel ac10Label;
	
	static String ac1Purchased = "No";
	static String ac2Purchased = "No";
	static String ac3Purchased = "No";
	static String ac4Purchased = "No";
	static String ac5Purchased = "No";
	static String ac6Purchased = "No";
	static String ac7Purchased = "No";
	static String ac8Purchased = "No";
	static String ac9Purchased = "No";
	static String ac10Purchased = "No";
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
	
	
	public static void write()
	{
		try // Try is necessary for PrintWriter as exceptions can be generated without it
	    {
	      PrintWriter output; // Object to connect to file for write command
	      output = new PrintWriter (new FileWriter("shop.txt")); // Instantiate the object and create text file "student_data.txt" 
	      output.println(ac1Purchased);
	      output.println(ac2Purchased);
	      output.println(ac3Purchased);
	      output.println(ac4Purchased);
	      output.println(ac5Purchased);
	      output.println(ac6Purchased);
	      output.println(ac7Purchased);
	      output.println(ac8Purchased);
	      output.println(ac9Purchased);
	      output.println(ac10Purchased);
	      output.close(); // Close the file
	    }
	    catch (Exception e) // Catch is necessary for try/catch block due to exceptions
	    {
	      System.out.println(e); // Show error if there is one
	    }
	}
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
		
		JLabel shopScreenTitle = new JLabel("SHOP");
		shopScreenTitle.setHorizontalAlignment(SwingConstants.CENTER);
		shopScreenTitle.setFont(new Font("Stencil", Font.BOLD, 16));
		shopScreenTitle.setBounds(576, 10, 234, 32);
		frame.getContentPane().add(shopScreenTitle);
		
		JButton battleArenaButton = new JButton("Battle Arena");
		battleArenaButton.setBounds(6, 631, 212, 49);
		frame.getContentPane().add(battleArenaButton);
		battleArenaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				GameplayScreen gs = new GameplayScreen();
				gs.showGameplayScreen();
			}
		});
		
		JTextArea shopCardInfo = new JTextArea();
		shopCardInfo.setEditable(false);
		shopCardInfo.setBounds(6, 456, 305, 137);
		shopCardInfo.setLineWrap(true);
		shopCardInfo.setWrapStyleWord(true);
		shopCardInfo.setVisible(false);
		frame.getContentPane().add(shopCardInfo);
		
		JButton forfeitButton = new JButton("Forfeit");
		forfeitButton.setBounds(6, 683, 212, 49);
		frame.getContentPane().add(forfeitButton);
		forfeitButton.addActionListener(new ActionListener() { // adding action listen
	           public void actionPerformed(ActionEvent e) { 
	        	   JOptionPane.showMessageDialog(forfeitButton, "","Press OK to return to Main Menu", 0);
	        	   frame.setVisible(false);
	        	   MainMenuScreen ms = new MainMenuScreen();
	        	   ms.showMainMenuScreen();
	           }
	       });
		
		abilityCard1_1 = new ImageIcon("resources/images/sock puppetry.jpg");
		Image abilityCard1_2 = abilityCard1_1.getImage();
        Image abilityCard1_3 = abilityCard1_2.getScaledInstance(140, 249, Image.SCALE_SMOOTH);
        ImageIcon abilityCard1_4 = new ImageIcon(abilityCard1_3);
        
        abilityCard1 = new JButton(abilityCard1_4);
		abilityCard1.setBounds(321, 70, 140, 249);
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
				shopCardInfo.setVisible(true);
				
				Image cardInfo_1 = abilityCard1_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				shopCardInfo.append("Can control an opponent's creature for one turn and make it attack its own side. "
						+ "Choose an opponent's creature card to apply this ability, that creature will attack another of its own creatures already in the “battle arena”, lowering its health based on the attack stats). \n"
						+ "Cost: 6 coins");
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
				shopCardInfo.setVisible(true);
				
				Image cardInfo_1 = abilityCard2_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				shopCardInfo.append("Reflects all damage from the previous turn back to the source for one turn. "
						+ "Whatever damage was done to the card by the opponent is reversed, meaning the opponent’s card will lose health and the player’s card will gain the same amount of health. "
						+ "The selected card must still be alive to use this ability card.\n"
						+ "Cost: 9 coins");
				frame.getContentPane().add(cardInfo);
			}
		});
		
		abilityCard3_1 = new ImageIcon("resources/images/holographic hideaway.jpg");
		Image abilityCard3_2 = abilityCard3_1.getImage();
        Image abilityCard3_3 = abilityCard3_2.getScaledInstance(140, 249, Image.SCALE_SMOOTH);
        ImageIcon abilityCard3_4 = new ImageIcon(abilityCard3_3);
        
        abilityCard3 = new JButton(abilityCard3_4);
		abilityCard3.setBounds(623, 70, 140, 249);
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
				shopCardInfo.setVisible(true);
				
				Image cardInfo_1 = abilityCard3_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				shopCardInfo.append("Turns completely invisible for one turn, becoming immune to attacks and abilities. "
						+ "The user or AI’s selected card after deploying this ability will not be able to be attacked by the opponent for one turn.\n"
						+ "Cost: 4 coins");
				frame.getContentPane().add(cardInfo);
			}
		});
		
		abilityCard4_1 = new ImageIcon("resources/images/malicious mend.jpg");
		Image abilityCard4_2 = abilityCard4_1.getImage();
        Image abilityCard4_3 = abilityCard4_2.getScaledInstance(140, 249, Image.SCALE_SMOOTH);
        ImageIcon abilityCard4_4 = new ImageIcon(abilityCard4_3);
        
        abilityCard4 = new JButton(abilityCard4_4);
		abilityCard4.setBounds(777, 70, 140, 249);
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
				shopCardInfo.setVisible(true);
				
				Image cardInfo_1 = abilityCard4_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				shopCardInfo.append("Heals selected creature in play by 3 health or until full health depending on creature stats. "
						+ "This ability card will have a certain health stat associated with it, meaning it basically will just heal the selected card’s health for either the user or AI.\n"
						+ "Cost: 6 coins");
				frame.getContentPane().add(cardInfo);
			}
		});
		
		abilityCard5_1 = new ImageIcon("resources/images/reprehensive rejuvenation.jpg");
		Image abilityCard5_2 = abilityCard5_1.getImage();
        Image abilityCard5_3 = abilityCard5_2.getScaledInstance(140, 249, Image.SCALE_SMOOTH);
        ImageIcon abilityCard5_4 = new ImageIcon(abilityCard5_3);
        
        abilityCard5 = new JButton(abilityCard5_4);
		abilityCard5.setBounds(927, 70, 140, 249);
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
				shopCardInfo.setVisible(true);
				
				Image cardInfo_1 = abilityCard5_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				shopCardInfo.append("Heals all creatures in play by 2 health levels. "
						+ "This ability card will heal every creature in the “battle arena” for that player by 2 health.\n"
						+ "Cost: 11 coins");
				frame.getContentPane().add(cardInfo);
			}
		});
		
		abilityCard6_1 = new ImageIcon("resources/images/sinister serenity.jpg");
		Image abilityCard6_2 = abilityCard6_1.getImage();
        Image abilityCard6_3 = abilityCard6_2.getScaledInstance(140, 249, Image.SCALE_SMOOTH);
        ImageIcon abilityCard6_4 = new ImageIcon(abilityCard6_3);
        
        abilityCard6 = new JButton(abilityCard6_4);
		abilityCard6.setBounds(321, 398, 140, 249);
		shopCardInfo.append("");
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
				shopCardInfo.setVisible(true);
				
				Image cardInfo_1 = abilityCard6_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				shopCardInfo.append("Heals one of the player’s selected creature cards by 1 health for the next 2 turns.\n"
						+ "Cost: 3 coins");
				frame.getContentPane().add(cardInfo);
			}
		});
		
		abilityCard7_1 = new ImageIcon("resources/images/nefarious nibbles.jpg");
		Image abilityCard7_2 = abilityCard7_1.getImage();
        Image abilityCard7_3 = abilityCard7_2.getScaledInstance(140, 249, Image.SCALE_SMOOTH);
        ImageIcon abilityCard7_4 = new ImageIcon(abilityCard7_3);
        
        abilityCard7 = new JButton(abilityCard7_4);
		abilityCard7.setBounds(469, 398, 140, 249);
		shopCardInfo.append("");
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
				shopCardInfo.setVisible(true);
				
				Image cardInfo_1 = abilityCard7_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				shopCardInfo.append("Instantly takes 4 health from one of the opponent’s creatures in play. "
						+ "User or AI will select an opponent’s card to apply this ability to. It will automatically decrease that card’s health by 4 (this will be helpful if the user has cards in the “battle arena” that do not do much damage).\n"
						+ "Cost: 8 coins");
				frame.getContentPane().add(cardInfo);
			}
		});
		
		abilityCard8_1 = new ImageIcon("resources/images/sneaky smooch.jpg");
		Image abilityCard8_2 = abilityCard8_1.getImage();
        Image abilityCard8_3 = abilityCard8_2.getScaledInstance(140, 249, Image.SCALE_SMOOTH);
        ImageIcon abilityCard8_4 = new ImageIcon(abilityCard8_3);
        
        abilityCard8 = new JButton(abilityCard8_4);
		abilityCard8.setBounds(623, 398, 140, 249);
		shopCardInfo.append("");
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
				shopCardInfo.setVisible(true);
				
				Image cardInfo_1 = abilityCard8_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				shopCardInfo.append("Makes one of the opponent's creatures drop 2 more coins if they are killed. "
						+ "The user or AI will select an opponent’s creature to apply this ability, and they will have 1 more turn to capitalize on this ability before it is put into the graveyard.\n"
						+ "Cost: 9 coins");
				frame.getContentPane().add(cardInfo);
			}
		});
		
		abilityCard9_1 = new ImageIcon("resources/images/quantum quake.jpg");
		Image abilityCard9_2 = abilityCard9_1.getImage();
        Image abilityCard9_3 = abilityCard9_2.getScaledInstance(140, 249, Image.SCALE_SMOOTH);
        ImageIcon abilityCard9_4 = new ImageIcon(abilityCard9_3);
        
        abilityCard9 = new JButton(abilityCard9_4);
		abilityCard9.setBounds(777, 398, 140, 249);
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
				shopCardInfo.setVisible(true);
				
				Image cardInfo_1 = abilityCard9_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				shopCardInfo.append("Deals 3 damage to every creature in play (both user and AI). *Unable to use when there are 6 or less total cards among both players (in “battle arena” and backup hand). "
						+ "The user or AI can easily use this ability to wipe out the opponent’s remaining cards before the next turn.\n"
						+ "Cost: 12 coins");
				frame.getContentPane().add(cardInfo);
			}
		});
		
		abilityCard10_1 = new ImageIcon("resources/images/subatomic swap.jpg");
		Image abilityCard10_2 = abilityCard10_1.getImage();
        Image abilityCard10_3 = abilityCard10_2.getScaledInstance(140, 249, Image.SCALE_SMOOTH);
        ImageIcon abilityCard10_4 = new ImageIcon(abilityCard10_3);
        
        abilityCard10 = new JButton(abilityCard10_4);
		abilityCard10.setBounds(927, 398, 140, 249);
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
				shopCardInfo.setVisible(true);
				
				Image cardInfo_1 = abilityCard10_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				shopCardInfo.append("User or AI has an option to choose one of their creature cards (in deck) to swap with a random new creature from the creature deck (not from the graveyard). "
						+ "The AI would choose their worst ranked card in hopes that they get a higher ranked card (not guaranteed).\n"
						+ "Cost 8 coins");
				frame.getContentPane().add(cardInfo);
			}
		});
		
		closeInfo = new JButton("CLOSE INFO");
		closeInfo.setBounds(91, 598, 127, 21);
		frame.getContentPane().add(closeInfo);
		
		JButton purchase1 = new JButton("PURCHASE");
		purchase1.setBounds(321, 318, 140, 21);
		frame.getContentPane().add(purchase1);
		
		purchase1.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				purchase1.setEnabled(false);
				abilityCard1.setEnabled(false);
				ac1Purchased = "Yes";
				ac1Label.setVisible(true);
				write();
			}
		});
		
		JButton purchase2 = new JButton("PURCHASE");
		purchase2.setBounds(469, 318, 140, 21);
		frame.getContentPane().add(purchase2);
		
		purchase2.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				purchase2.setEnabled(false);
				abilityCard2.setEnabled(false);
				ac2Purchased = "Yes";
				ac2Label.setVisible(true);
				write();
			}
		});
		
		JButton purchase3 = new JButton("PURCHASE");
		purchase3.setBounds(623, 318, 140, 21);
		frame.getContentPane().add(purchase3);
		
		purchase3.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				purchase3.setEnabled(false);
				abilityCard3.setEnabled(false);
				ac3Purchased = "Yes";
				ac3Label.setVisible(true);
				write();
			}
		});
		
		JButton purchase4 = new JButton("PURCHASE");
		purchase4.setBounds(777, 318, 140, 21);
		frame.getContentPane().add(purchase4);
		
		purchase4.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				purchase4.setEnabled(false);
				abilityCard4.setEnabled(false);
				ac4Purchased = "Yes";
				ac4Label.setVisible(true);
				write();
			}
		});
		
		JButton purchase5 = new JButton("PURCHASE");
		purchase5.setBounds(927, 318, 140, 21);
		frame.getContentPane().add(purchase5);
		
		purchase5.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				purchase5.setEnabled(false);
				abilityCard5.setEnabled(false);
				ac5Purchased = "Yes";
				ac5Label.setVisible(true);
				write();
			}
		});
		
		JButton purchase6 = new JButton("PURCHASE");
		purchase6.setBounds(321, 645, 140, 21);
		frame.getContentPane().add(purchase6);
		
		purchase6.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				purchase6.setEnabled(false);
				abilityCard6.setEnabled(false);
				ac6Purchased = "Yes";
				ac6Label.setVisible(true);
				write();
			}
		});
		
		JButton purchase7 = new JButton("PURCHASE");
		purchase7.setBounds(469, 645, 140, 21);
		frame.getContentPane().add(purchase7);
		
		purchase7.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				purchase7.setEnabled(false);
				abilityCard7.setEnabled(false);
				ac7Purchased = "Yes";
				ac7Label.setVisible(true);
				write();
			}
		});
		
		JButton purchase8 = new JButton("PURCHASE");
		purchase8.setBounds(623, 645, 140, 21);
		frame.getContentPane().add(purchase8);
		
		purchase8.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				purchase8.setEnabled(false);
				abilityCard8.setEnabled(false);
				ac8Purchased = "Yes";
				ac8Label.setVisible(true);
				write();
			}
		});
		
		JButton purchase9 = new JButton("PURCHASE");
		purchase9.setBounds(777, 645, 140, 21);
		frame.getContentPane().add(purchase9);
		
		purchase9.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				purchase9.setEnabled(false);
				abilityCard9.setEnabled(false);
				ac9Purchased = "Yes";
				ac9Label.setVisible(true);
				write();
			}
		});
		
		JButton purchase10 = new JButton("PURCHASE");
		purchase10.setBounds(927, 645, 140, 21);
		frame.getContentPane().add(purchase10);
		
		purchase10.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				purchase10.setEnabled(false);
				abilityCard10.setEnabled(false);
				ac10Purchased = "Yes";
				ac10Label.setVisible(true);
				write();
			}
		});
		
		ac1Label = new JLabel("Purchase complete!");
		ac1Label.setFont(new Font("Tahoma", Font.BOLD, 10));
		ac1Label.setHorizontalAlignment(SwingConstants.CENTER);
		ac1Label.setBounds(321, 353, 140, 13);
		frame.getContentPane().add(ac1Label);
		ac1Label.setVisible(false);
		
		ac2Label = new JLabel("Purchase complete!");
		ac2Label.setHorizontalAlignment(SwingConstants.CENTER);
		ac2Label.setFont(new Font("Tahoma", Font.BOLD, 10));
		ac2Label.setBounds(469, 352, 140, 13);
		frame.getContentPane().add(ac2Label);
		ac2Label.setVisible(false);
		
		ac3Label = new JLabel("Purchase complete!");
		ac3Label.setHorizontalAlignment(SwingConstants.CENTER);
		ac3Label.setFont(new Font("Tahoma", Font.BOLD, 10));
		ac3Label.setBounds(623, 353, 140, 13);
		frame.getContentPane().add(ac3Label);
		ac3Label.setVisible(false);
		
		ac4Label = new JLabel("Purchase complete!");
		ac4Label.setHorizontalAlignment(SwingConstants.CENTER);
		ac4Label.setFont(new Font("Tahoma", Font.BOLD, 10));
		ac4Label.setBounds(777, 352, 140, 13);
		frame.getContentPane().add(ac4Label);
		ac4Label.setVisible(false);
		
		ac5Label = new JLabel("Purchase complete!");
		ac5Label.setHorizontalAlignment(SwingConstants.CENTER);
		ac5Label.setFont(new Font("Tahoma", Font.BOLD, 10));
		ac5Label.setBounds(927, 352, 140, 13);
		frame.getContentPane().add(ac5Label);
		ac5Label.setVisible(false);
		
		ac6Label = new JLabel("Purchase complete!");
		ac6Label.setHorizontalAlignment(SwingConstants.CENTER);
		ac6Label.setFont(new Font("Tahoma", Font.BOLD, 10));
		ac6Label.setBounds(321, 683, 140, 13);
		frame.getContentPane().add(ac6Label);
		ac6Label.setVisible(false);
		
		ac7Label = new JLabel("Purchase complete!");
		ac7Label.setHorizontalAlignment(SwingConstants.CENTER);
		ac7Label.setFont(new Font("Tahoma", Font.BOLD, 10));
		ac7Label.setBounds(469, 683, 140, 13);
		frame.getContentPane().add(ac7Label);
		ac7Label.setVisible(false);
		
		ac8Label = new JLabel("Purchase complete!");
		ac8Label.setHorizontalAlignment(SwingConstants.CENTER);
		ac8Label.setFont(new Font("Tahoma", Font.BOLD, 10));
		ac8Label.setBounds(623, 683, 140, 13);
		frame.getContentPane().add(ac8Label);
		ac8Label.setVisible(false);
		
		ac9Label = new JLabel("Purchase complete!");
		ac9Label.setHorizontalAlignment(SwingConstants.CENTER);
		ac9Label.setFont(new Font("Tahoma", Font.BOLD, 10));
		ac9Label.setBounds(777, 683, 140, 13);
		frame.getContentPane().add(ac9Label);
		ac9Label.setVisible(false);
		
		ac10Label = new JLabel("Purchase complete!");
		ac10Label.setHorizontalAlignment(SwingConstants.CENTER);
		ac10Label.setFont(new Font("Tahoma", Font.BOLD, 10));
		ac10Label.setBounds(927, 683, 140, 13);
		frame.getContentPane().add(ac10Label);
		ac10Label.setVisible(false);
		
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
				shopCardInfo.setVisible(false);
				shopCardInfo.setText("");
			}
		});
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
