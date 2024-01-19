import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Label;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class ShopScreen {
	
	static JFrame frame;
	
	static JButton closeInfo;
	
	static JButton purchase1;
	static JButton purchase2;
	static JButton purchase3;
	static JButton purchase4;
	static JButton purchase5;
	static JButton purchase6;
	static JButton purchase7;
	static JButton purchase8;
	static JButton purchase9;
	static JButton purchase10;
	static JLabel userCoinsLabel;
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
	
	static String ac1PurchasedCheck = "";
	static String ac2PurchasedCheck = "";
	static String ac3PurchasedCheck = "";
	static String ac4PurchasedCheck = "";
	static String ac5PurchasedCheck = "";
	static String ac6PurchasedCheck = "";
	static String ac7PurchasedCheck = "";
	static String ac8PurchasedCheck = "";
	static String ac9PurchasedCheck = "";
	static String ac10PurchasedCheck = "";
	static String ac1Purchased = "";
	static String ac2Purchased = "";
	static String ac3Purchased = "";
	static String ac4Purchased = "";
	static String ac5Purchased = "";
	static String ac6Purchased = "";
	static String ac7Purchased = "";
	static String ac8Purchased = "";
	static String ac9Purchased = "";
	static String ac10Purchased = "";
	static String card1 = "";
	static String newCard1 = "";
	static String card2 = "";
	static String newCard2 = "";
	static String card3 = "";
	static String newCard3 = "";
	static String card4 = "";
	static String newCard4 = "";
	static String card5 = "";
	static String newCard5 = "";
	static String card6 = "";
	static String newCard6 = "";
	static String card7 = "";
	static String newCard7 = "";
	static String card8 = "";
	static String newCard8 = "";
	static String card9 = "";
	static String newCard9 = "";
	static String card10 = "";
	static String newCard10 = "";
	static String card11 = "";
	static String newCard11 = "";
	static String card12 = "";
	static String newCard12 = "";
	static String card13 = "";
	static String newCard13 = "";
	static String card14 = "";
	static String newCard14 = "";
	static String card15 = "";
	static String newCard15 = "";
	static String card16 = "";
	static String newCard16 = "";
	static String cardsDrawn;
	static String cardsDrawnCheck;
	static Timer timer; // Timer as a class member
    static int secondsRemaining;
    static JLabel timerLabel; // Assuming you have a JLabel for displaying the timer
    static Timer countdownTimer;
    static int readUserCoins = 0;
	static int readAiCoins = 0;
	static int totalUserCoins;
	static int totalAiCoins;
	static int updateTime = 30;
	
	static int coins = 0; // variable to hold amount of coins
	static int abilityCard = 0; // variable to track what ability card is selected (0 is none)
	// need to replace this data with data from read and write
	
	public static void write()
	{
		try // Try is necessary for PrintWriter as exceptions can be generated without it
	    {
	      PrintWriter output; // Object to connect to file for write command
	      output = new PrintWriter (new FileWriter("save_screen.txt")); // Instantiate the object and create text file "student_data.txt" 
	      
	      output.println(card1);
	      output.println(card2);
	      output.println(card3);
	      output.println(card4);
	      output.println(card5);
	      output.println(card6);
	      output.println(card7);
	      output.println(card8);
	      output.println(card9);
	      output.println(card10);
	      output.println(card11);
	      output.println(card12);
	      output.println(card13);
	      output.println(card14);
	      output.println(card15);
	      output.println(card16);
	      output.println(cardsDrawn);
	      output.println(secondsRemaining);
	      output.println(totalUserCoins);
	      output.println(totalAiCoins);
	      output.close(); // Close the file
	    }
	    catch (Exception e) // Catch is necessary for try/catch block due to exceptions
	    {
	      System.out.println(e); // Show error if there is one
	    }
	}
	
	public static void write2()
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
	
	public static void read()
	{
		try // Try is necessary for BufferedReader as exceptions can be generated without it
	    {
	      BufferedReader input = new BufferedReader (new FileReader("save_screen.txt")); // Instantiate the object and connect it to text file "student_data.txt"
	      String line = input.readLine(); // read new line and assign it to line
	      if (line != null) 
	      { // If there is data within the text file (even blank strings), code below will run 
	    	 newCard1 = line;
	    	 newCard2 = input.readLine();
	    	 newCard3 = input.readLine();
	    	 newCard4 = input.readLine();
	    	 newCard5 = input.readLine();
	    	 newCard6 = input.readLine();
	    	 newCard7 = input.readLine();
	    	 newCard8 = input.readLine();
	    	 newCard9 = input.readLine();
	    	 newCard10 = input.readLine();
	    	 newCard11 = input.readLine();
	    	 newCard12 = input.readLine();
	    	 newCard13 = input.readLine();
	    	 newCard14 = input.readLine();
	    	 newCard15 = input.readLine();
	    	 newCard16 = input.readLine();
	    	 cardsDrawnCheck = input.readLine();
	    	 updateTime = Integer.parseInt(input.readLine());
	    	 readUserCoins = Integer.parseInt(input.readLine());
	    	 readAiCoins = Integer.parseInt(input.readLine());
	      }
	        input.close(); // Close the file
	    }
	    catch (Exception e) // Catch is necessary for try/catch block due to exceptions
	    {
	      System.out.println(e); // Show error if there is one
	    }
	}
	
	public static void read2()
	{
		try // Try is necessary for BufferedReader as exceptions can be generated without it
	    {
	      BufferedReader input = new BufferedReader (new FileReader("shop.txt")); // Instantiate the object and connect it to text file "student_data.txt"
	      String line = input.readLine(); // read new line and assign it to line
	      if (line != null) 
	      { // If there is data within the text file (even blank strings), code below will run 
	    	 ac1PurchasedCheck = line;
	    	 ac2PurchasedCheck = input.readLine();
	    	 ac3PurchasedCheck = input.readLine();
	    	 ac4PurchasedCheck = input.readLine();
	    	 ac5PurchasedCheck = input.readLine();
	    	 ac6PurchasedCheck = input.readLine();
	    	 ac7PurchasedCheck = input.readLine();
	    	 ac8PurchasedCheck = input.readLine();
	    	 ac9PurchasedCheck = input.readLine();
	    	 ac10PurchasedCheck = input.readLine();
	      }
	        input.close(); // Close the file
	    }
	    catch (Exception e) // Catch is necessary for try/catch block due to exceptions
	    {
	      System.out.println(e); // Show error if there is one
	    }
	}
	
	public static void userCountdown()
	{
		timerLabel = new JLabel("Time remaining: ");
		timerLabel.setHorizontalAlignment(SwingConstants.LEFT);
		timerLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		timerLabel.setBounds(940, 225, 251, 77);
	    frame.getContentPane().add(timerLabel);
	    
        timerLabel.setText("Time remaining: " + secondsRemaining + " seconds");

        // Initialize the timer
        timer = new Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run() {
                secondsRemaining--;
                timerLabel.setText("Time remaining: " + secondsRemaining + " seconds");
                if (secondsRemaining <= 0) {
                    timer.cancel();
                    secondsRemaining = 30;
                }
            }   
        }, 0, 1000);
    }

	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void showShopScreen()
	{
		read();
		read2();
		
		secondsRemaining = updateTime;
		userCountdown();
		totalUserCoins = readUserCoins;
		totalAiCoins = readAiCoins;
		ac1Purchased = ac1PurchasedCheck;
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(247, 186, 232));
		frame.setBackground(new Color(184, 235, 169));
		frame.setBounds(100, 100, 1400,800);
		frame.getContentPane().setLayout(null);
		
		ImageIcon userCoin1 = new ImageIcon("resources/images/coin.png");
		Image userCoin2 = userCoin1.getImage();
        Image userCoin3 = userCoin2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon userCoin4 = new ImageIcon(userCoin3);
        
        JButton userCoin = new JButton(userCoin4);
		userCoin.setBounds(620, 28, 30, 30);
		frame.getContentPane().add(userCoin);
		
		userCoinsLabel = new JLabel("0");
		userCoinsLabel.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		userCoinsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		userCoinsLabel.setBounds(655, 28, 75, 36);
		frame.getContentPane().add(userCoinsLabel);
		
		JLabel shopTitle = new JLabel("SHOP");
		shopTitle.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 20));
		shopTitle.setHorizontalAlignment(SwingConstants.CENTER);
		shopTitle.setBounds(600, 6, 186, 16);
		frame.getContentPane().add(shopTitle);
		
		JButton battleArenaButton = new JButton("Battle Arena");
		battleArenaButton.setBounds(6, 631, 212, 49);
		frame.getContentPane().add(battleArenaButton);
		battleArenaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				write();
				write2();
				frame.setVisible(false);
				GameplayScreen gs = new GameplayScreen();
				gs.showGameplayScreen();
			}
		});
		
		JTextArea shopCardInfo = new JTextArea();
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
	 
		JLabel lblNewLabel_2 = new JLabel("Time Left");
		lblNewLabel_2.setBounds(17, 22, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(1132, 100, 212, 604);
		frame.getContentPane().add(textArea);
		
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
				shopCardInfo.setVisible(true);
				shopCardInfo.setEnabled(false);
				
				Image cardInfo_1 = abilityCard1_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				shopCardInfo.append("Sock Puppetry allows you to control one of your opponent's creature cards in the battle arena for one turn and make it attack its own side. "
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
				shopCardInfo.setEnabled(false);
				
				Image cardInfo_1 = abilityCard2_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				shopCardInfo.append("Inverted Reflection reflects all damage from your opponent's previous turn back to the source for one turn. "
						+ "Whatever damage was done to your card by the opponent is reversed, meaning your opponent’s card will lose health and your card will gain the same amount of health. "
						+ "Cost: 9 coins");
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
				shopCardInfo.setVisible(true);
				shopCardInfo.setEnabled(false);
				
				Image cardInfo_1 = abilityCard3_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				shopCardInfo.append("Holographic Hideaway allows one of your creature cards in the battle arena to become 'invisible' for one turn, becoming immune to attacks and abilities. "
						+ "Cost: 4 coins");
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
				shopCardInfo.setVisible(true);
				shopCardInfo.setEnabled(false);
				
				Image cardInfo_1 = abilityCard4_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				shopCardInfo.append("Malicious Mend heals one of your creature cards in the battle arena by 3 health."
						+ "Cost: 6 coins");
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
				shopCardInfo.setVisible(true);
				shopCardInfo.setEnabled(false);
				
				Image cardInfo_1 = abilityCard5_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				shopCardInfo.append("Reprehensive Rejuvenation heals all of your creatures in the battle arena by 2 health levels. "
						+ "Cost: 11 coins");
				frame.getContentPane().add(cardInfo);
			}
		});
		
		abilityCard6_1 = new ImageIcon("resources/images/sinister serenity.jpg");
		Image abilityCard6_2 = abilityCard6_1.getImage();
        Image abilityCard6_3 = abilityCard6_2.getScaledInstance(140, 249, Image.SCALE_SMOOTH);
        ImageIcon abilityCard6_4 = new ImageIcon(abilityCard6_3);
        
        abilityCard6 = new JButton(abilityCard6_4);
		abilityCard6.setBounds(324, 349, 140, 249);
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
				shopCardInfo.setEnabled(false);
				
				Image cardInfo_1 = abilityCard6_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				shopCardInfo.append("Sinister Serenity heals one of your creature cards in the battle arena by 1 health for the next 2 turns.\n"
						+ "Cost: 3 coins");
				frame.getContentPane().add(cardInfo);
			}
		});
		
		abilityCard7_1 = new ImageIcon("resources/images/nefarious nibbles.jpg");
		Image abilityCard7_2 = abilityCard7_1.getImage();
        Image abilityCard7_3 = abilityCard7_2.getScaledInstance(140, 249, Image.SCALE_SMOOTH);
        ImageIcon abilityCard7_4 = new ImageIcon(abilityCard7_3);
        
        abilityCard7 = new JButton(abilityCard7_4);
		abilityCard7.setBounds(469, 349, 140, 249);
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
				shopCardInfo.setEnabled(false);
				
				Image cardInfo_1 = abilityCard7_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				shopCardInfo.append("Nefarious Nibbles instantly takes 4 health from one of your opponent’s creatures in the battle arena. "
						+ "Cost: 8 coins");
				frame.getContentPane().add(cardInfo);
			}
		});
		
		abilityCard8_1 = new ImageIcon("resources/images/sneaky smooch.jpg");
		Image abilityCard8_2 = abilityCard8_1.getImage();
        Image abilityCard8_3 = abilityCard8_2.getScaledInstance(140, 249, Image.SCALE_SMOOTH);
        ImageIcon abilityCard8_4 = new ImageIcon(abilityCard8_3);
        
        abilityCard8 = new JButton(abilityCard8_4);
		abilityCard8.setBounds(612, 349, 140, 249);
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
				shopCardInfo.setEnabled(false);
				
				Image cardInfo_1 = abilityCard8_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				shopCardInfo.append("Sneaky Smooch an opponent's creature in the battle arena drop 2 more coins if they are killed."
						+ "Cost: 9 coins");
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
				shopCardInfo.setVisible(true);
				shopCardInfo.setEnabled(false);
				
				Image cardInfo_1 = abilityCard9_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				shopCardInfo.append("Quantum Quake deals 3 damage to every creature card in the battle arena (both players)."
						+ "Cost: 12 coins");
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
				shopCardInfo.setVisible(true);
				shopCardInfo.setEnabled(false);
				
				Image cardInfo_1 = abilityCard10_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				shopCardInfo.append("Subatomic Swap allows you to swap one of your battle arena cards for a card from the original deck of 20"
						+ "Cost 8 coins");
				frame.getContentPane().add(cardInfo);
			}
		});
		
		JLabel lblNewLabel_3 = new JLabel("Need more cards?");
		lblNewLabel_3.setBounds(1192, 32, 152, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Defeat enemy cards!!");
		lblNewLabel_4.setBounds(1192, 72, 140, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		closeInfo = new JButton("CLOSE INFO");
		closeInfo.setBounds(91, 598, 127, 21);
		frame.getContentPane().add(closeInfo);
		
		purchase1 = new JButton("PURCHASE");
		purchase1.setBounds(324, 318, 140, 21);
		frame.getContentPane().add(purchase1);
		purchase1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (totalUserCoins < 6) {
					JOptionPane.showMessageDialog(null, "You do not have enough coins to purchase Sock Puppetry.");
				}
				else if (abilityCard != 0) {
					JOptionPane.showMessageDialog(null, "You cannot purchase a new ability card because you currently have an unused ability card.");
				}
				else {
					totalUserCoins -= 6;
					abilityCard = 1;
					userCoinsLabel.setText("" + totalUserCoins);
					ac1Purchased = "Yes";
					timer.cancel();
					abilityCard1.setEnabled(false);
					purchase1.setEnabled(false);
					purchase2.setEnabled(false);
					purchase3.setEnabled(false);
					purchase4.setEnabled(false);
					purchase5.setEnabled(false);
					purchase6.setEnabled(false);
					purchase7.setEnabled(false);
					purchase8.setEnabled(false);
					purchase9.setEnabled(false);
					purchase10.setEnabled(false);
				}
			}
		});
		
		purchase2 = new JButton("PURCHASE");
		purchase2.setBounds(469, 318, 140, 21);
		frame.getContentPane().add(purchase2);
		purchase2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (totalUserCoins < 9) {
					JOptionPane.showMessageDialog(null, "You do not have enough coins to purchase Inverted Reflection.");
				}
				else if (abilityCard != 0) {
					JOptionPane.showMessageDialog(null, "You cannot purchase a new ability card because you currently have an unused ability card.");
				}
				else {
					totalUserCoins -= 9;
					abilityCard = 2;
					userCoinsLabel.setText("" + totalUserCoins);
					ac2Purchased = "Yes";
					timer.cancel();
					abilityCard2.setEnabled(false);
					purchase1.setEnabled(false);
					purchase2.setEnabled(false);
					purchase3.setEnabled(false);
					purchase4.setEnabled(false);
					purchase5.setEnabled(false);
					purchase6.setEnabled(false);
					purchase7.setEnabled(false);
					purchase8.setEnabled(false);
					purchase9.setEnabled(false);
					purchase10.setEnabled(false);
				}
			}
		});
		
		purchase3 = new JButton("PURCHASE");
		purchase3.setBounds(612, 318, 140, 21);
		frame.getContentPane().add(purchase3);
		purchase3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (totalUserCoins < 4) {
					JOptionPane.showMessageDialog(null, "You do not have enough coins to purchase Holographic Hideaway.");
				}
				else if (abilityCard != 0) {
					JOptionPane.showMessageDialog(null, "You cannot purchase a new ability card because you currently have an unused ability card.");
				}
				else {
					totalUserCoins -= 4;
					abilityCard = 3;
					userCoinsLabel.setText("" + totalUserCoins);
					ac3Purchased = "Yes";
					timer.cancel();
					abilityCard3.setEnabled(false);
					purchase1.setEnabled(false);
					purchase2.setEnabled(false);
					purchase3.setEnabled(false);
					purchase4.setEnabled(false);
					purchase5.setEnabled(false);
					purchase6.setEnabled(false);
					purchase7.setEnabled(false);
					purchase8.setEnabled(false);
					purchase9.setEnabled(false);
					purchase10.setEnabled(false);
				}
			}
		});
		
		purchase4 = new JButton("PURCHASE");
		purchase4.setBounds(755, 318, 140, 21);
		frame.getContentPane().add(purchase4);
		purchase4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (totalUserCoins < 6) {
					JOptionPane.showMessageDialog(null, "You do not have enough coins to purchase Malicious Mend.");
				}
				else if (abilityCard != 0) {
					JOptionPane.showMessageDialog(null, "You cannot purchase a new ability card because you currently have an unused ability card.");
				}
				else {
					totalUserCoins -= 6;
					abilityCard = 4;
					userCoinsLabel.setText("" + totalUserCoins);
					ac4Purchased = "Yes";
					timer.cancel();
					abilityCard4.setEnabled(false);
					purchase1.setEnabled(false);
					purchase2.setEnabled(false);
					purchase3.setEnabled(false);
					purchase4.setEnabled(false);
					purchase5.setEnabled(false);
					purchase6.setEnabled(false);
					purchase7.setEnabled(false);
					purchase8.setEnabled(false);
					purchase9.setEnabled(false);
					purchase10.setEnabled(false);
				}
			}
		});
		
		purchase5 = new JButton("PURCHASE");
		purchase5.setBounds(900, 318, 140, 21);
		frame.getContentPane().add(purchase5);
		purchase5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (totalUserCoins < 11) {
					JOptionPane.showMessageDialog(null, "You do not have enough coins to purchase Reprehensive Rejuvenation.");
				}
				else if (abilityCard != 0) {
					JOptionPane.showMessageDialog(null, "You cannot purchase a new ability card because you currently have an unused ability card.");
				}
				else {
					totalUserCoins -= 11;
					abilityCard = 5;
					userCoinsLabel.setText("" + totalUserCoins);
					ac5Purchased = "Yes";
					timer.cancel();
					abilityCard5.setEnabled(false);
					purchase1.setEnabled(false);
					purchase2.setEnabled(false);
					purchase3.setEnabled(false);
					purchase4.setEnabled(false);
					purchase5.setEnabled(false);
					purchase6.setEnabled(false);
					purchase7.setEnabled(false);
					purchase8.setEnabled(false);
					purchase9.setEnabled(false);
					purchase10.setEnabled(false);
				}
			}
		});
		
		purchase6 = new JButton("PURCHASE");
		purchase5.setBounds(900, 318, 140, 21);
		frame.getContentPane().add(purchase5);
		purchase6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (totalUserCoins < 3) {
					JOptionPane.showMessageDialog(null, "You do not have enough coins to purchase Sinister Serenity.");
				}
				else if (abilityCard != 0) {
					JOptionPane.showMessageDialog(null, "You cannot purchase a new ability card because you currently have an unused ability card.");
				}
				else {
					totalUserCoins -= 3;
					abilityCard = 6;
					userCoinsLabel.setText("" + totalUserCoins);
					ac6Purchased = "Yes";
					timer.cancel();
					abilityCard6.setEnabled(false);
					purchase1.setEnabled(false);
					purchase2.setEnabled(false);
					purchase3.setEnabled(false);
					purchase4.setEnabled(false);
					purchase5.setEnabled(false);
					purchase6.setEnabled(false);
					purchase7.setEnabled(false);
					purchase8.setEnabled(false);
					purchase9.setEnabled(false);
					purchase10.setEnabled(false);
				}
			}
		});
		
		purchase7 = new JButton("PURCHASE");
		purchase7.setBounds(469, 598, 140, 21);
		frame.getContentPane().add(purchase7);
		purchase7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (totalUserCoins < 8) {
					JOptionPane.showMessageDialog(null, "You do not have enough coins to purchase Nefarious Nibbles.");
				}
				else if (abilityCard != 0) {
					JOptionPane.showMessageDialog(null, "You cannot purchase a new ability card because you currently have an unused ability card.");
				}
				else {
					totalUserCoins -= 8;
					abilityCard = 7;
					userCoinsLabel.setText("" + totalUserCoins);
					ac7Purchased = "Yes";
					timer.cancel();
					abilityCard7.setEnabled(false);
					purchase1.setEnabled(false);
					purchase2.setEnabled(false);
					purchase3.setEnabled(false);
					purchase4.setEnabled(false);
					purchase5.setEnabled(false);
					purchase6.setEnabled(false);
					purchase7.setEnabled(false);
					purchase8.setEnabled(false);
					purchase9.setEnabled(false);
					purchase10.setEnabled(false);
				}
			}
		});
		
		purchase8 = new JButton("PURCHASE");
		purchase8.setBounds(612, 598, 140, 21);
		frame.getContentPane().add(purchase8);
		purchase8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (totalUserCoins < 9) {
					JOptionPane.showMessageDialog(null, "You do not have enough coins to purchase Sneaky Smooch.");
				}
				else if (abilityCard != 0) {
					JOptionPane.showMessageDialog(null, "You cannot purchase a new ability card because you currently have an unused ability card.");
				}
				else {
					totalUserCoins -= 9;
					abilityCard = 8;
					userCoinsLabel.setText("" + totalUserCoins);
					ac8Purchased = "Yes";
					timer.cancel();
					abilityCard8.setEnabled(false);
					purchase1.setEnabled(false);
					purchase2.setEnabled(false);
					purchase3.setEnabled(false);
					purchase4.setEnabled(false);
					purchase5.setEnabled(false);
					purchase6.setEnabled(false);
					purchase7.setEnabled(false);
					purchase8.setEnabled(false);
					purchase9.setEnabled(false);
					purchase10.setEnabled(false);
				}
			}
		});
		
		purchase9 = new JButton("PURCHASE");
		purchase9.setBounds(755, 598, 140, 21);
		frame.getContentPane().add(purchase9);
		purchase9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (totalUserCoins < 12) {
					JOptionPane.showMessageDialog(null, "You do not have enough coins to purchase Quantum Quake.");
				}
				else if (abilityCard != 0) {
					JOptionPane.showMessageDialog(null, "You cannot purchase a new ability card because you currently have an unused ability card.");
				}
				else {
					totalUserCoins -= 12;
					abilityCard = 9;
					userCoinsLabel.setText("" + totalUserCoins);
					ac9Purchased = "Yes";
					timer.cancel();
					abilityCard9.setEnabled(false);
					purchase1.setEnabled(false);
					purchase2.setEnabled(false);
					purchase3.setEnabled(false);
					purchase4.setEnabled(false);
					purchase5.setEnabled(false);
					purchase6.setEnabled(false);
					purchase7.setEnabled(false);
					purchase8.setEnabled(false);
					purchase9.setEnabled(false);
					purchase10.setEnabled(false);
				}
			}
		});
		
		purchase10 = new JButton("PURCHASE");
		purchase10.setBounds(900, 598, 140, 21);
		frame.getContentPane().add(purchase10);
		purchase10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (totalUserCoins < 8) {
					JOptionPane.showMessageDialog(null, "You do not have enough coins to purchase Subatomic Swap.");
				}
				else if (abilityCard != 0) {
					JOptionPane.showMessageDialog(null, "You cannot purchase a new ability card because you currently have an unused ability card.");
				}
				else {
					totalUserCoins -= 8;
					abilityCard = 10;
					userCoinsLabel.setText("" + totalUserCoins);
					ac10Purchased = "Yes";
					timer.cancel();
					abilityCard10.setEnabled(false);
					purchase1.setEnabled(false);
					purchase2.setEnabled(false);
					purchase3.setEnabled(false);
					purchase4.setEnabled(false);
					purchase5.setEnabled(false);
					purchase6.setEnabled(false);
					purchase7.setEnabled(false);
					purchase8.setEnabled(false);
					purchase9.setEnabled(false);
					purchase10.setEnabled(false);
				}
			}
		});
		
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
