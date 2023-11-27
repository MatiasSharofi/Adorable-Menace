import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Label;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class ShopScreen {
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void showShopScreen()
	{
		JFrame frame = new JFrame();
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
		
		JButton cardInfo = new JButton("Card Info");
		cardInfo.setBounds(6, 47, 221, 499);
		frame.getContentPane().add(cardInfo);
		cardInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton battleArenaButton = new JButton("Battle Arena");
		battleArenaButton.setBounds(6, 575, 221, 55);
		frame.getContentPane().add(battleArenaButton);
		battleArenaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				GameplayScreen gs = new GameplayScreen();
				gs.showGameplayScreen();
			}
		});
		
		JButton forfeitButton = new JButton("Forfeit");
		forfeitButton.setBounds(6, 634, 221, 55);
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
		
		JButton sockPuppetry = new JButton("Sock Puppetry");
		sockPuppetry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sockPuppetry.setBounds(324, 70, 140, 249);
		frame.getContentPane().add(sockPuppetry);
		
		JButton invertedReflection = new JButton("Inverted Reflection");
		invertedReflection.setBounds(469, 70, 140, 249);
		frame.getContentPane().add(invertedReflection);
		
		JButton holographicHideaway = new JButton("Holographic Hideaway");
		holographicHideaway.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		holographicHideaway.setBounds(612, 70, 140, 249);
		frame.getContentPane().add(holographicHideaway);
		
		JButton maliciousMend = new JButton("Malicious Mend");
		maliciousMend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		maliciousMend.setBounds(755, 70, 140, 249);
		frame.getContentPane().add(maliciousMend);
		
		JButton reprehensiveRejuvenation = new JButton("Reprehensive \r\nRejuvenation");
		reprehensiveRejuvenation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		reprehensiveRejuvenation.setBounds(900, 70, 140, 249);
		frame.getContentPane().add(reprehensiveRejuvenation);
		
		JLabel lblNewLabel_3 = new JLabel("Need more cards?");
		lblNewLabel_3.setBounds(1192, 32, 152, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Defeat enemy cards!!");
		lblNewLabel_4.setBounds(1192, 72, 140, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(1132, 100, 212, 604);
		frame.getContentPane().add(textArea);
		
		JButton sinisterSerenity = new JButton(" Sinister Serenity");
		sinisterSerenity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sinisterSerenity.setBounds(324, 349, 140, 249);
		frame.getContentPane().add(sinisterSerenity);
		
		JButton nefariousNibbles = new JButton("Nefarious Nibbles");
		nefariousNibbles.setBounds(469, 349, 140, 249);
		frame.getContentPane().add(nefariousNibbles);
		
		JButton sneakySmooch = new JButton("Sneaky Smooch");
		sneakySmooch.setBounds(612, 349, 140, 249);
		frame.getContentPane().add(sneakySmooch);
		
		JButton quantumQuake = new JButton("Quantum Quake");
		quantumQuake.setBounds(755, 349, 140, 249);
		frame.getContentPane().add(quantumQuake);
		
		JButton subatomicSwap = new JButton("Subatomic Swap");
		subatomicSwap.setBounds(900, 349, 140, 249);
		frame.getContentPane().add(subatomicSwap);
		
		JButton purchaseButton = new JButton("Buy Card");
		purchaseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		purchaseButton.setBounds(6, 695, 221, 55);
		frame.getContentPane().add(purchaseButton);
		//using JRadioButtons so user can select card + view stats when selected
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
		
}