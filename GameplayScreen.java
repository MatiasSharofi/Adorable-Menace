import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class GameplayScreen{
	
	static JLabel timerLabel;
    static Timer countdownTimer;
    static int secondsRemaining;

	static JFrame frame;
	
	static String cardsDrawn;
	static String cardsDrawnCheck;
	
	static int user1Attack;
	static int user1Health;
	static int user1CoinsDropped;
	static int user2Attack;
	static int user2Health;
	static int user2CoinsDropped;
	static int user3Attack;
	static int user3Health;
	static int user3CoinsDropped;
	static int user4Attack;
	static int user4Health;
	static int user4CoinsDropped;
	static int user5Attack;
	static int user5Health;
	static int user5CoinsDropped;
	static int user6Attack;
	static int user6Health;
	static int user6CoinsDropped;
	static int user7Attack;
	static int user7Health;
	static int user7CoinsDropped;
	static int user8Attack;
	static int user8Health;
	static int user8CoinsDropped;
	static int ai1Attack;
	static int ai1Health;
	static int ai1CoinsDropped;
	static int ai2Attack;
	static int ai2Health;
	static int ai2CoinsDropped;
	static int ai3Attack;
	static int ai3Health;
	static int ai3CoinsDropped;
	static int ai4Attack;
	static int ai4Health;
	static int ai4CoinsDropped;
	static int ai5Attack;
	static int ai5Health;
	static int ai5CoinsDropped;
	static int ai6Attack;
	static int ai6Health;
	static int ai6CoinsDropped;
	static int ai7Attack;
	static int ai7Health;
	static int ai7CoinsDropped;
	static int ai8Attack;
	static int ai8Health;
	static int ai8CoinsDropped;
	
	static ImageIcon userCard1_1;
	static ImageIcon userCard2_1;
	static ImageIcon userCard3_1;
	static ImageIcon userCard4_1;
	static ImageIcon userCard5_1;
	static ImageIcon userCard6_1;
	static ImageIcon userCard7_1;
	static ImageIcon userCard8_1;
	static ImageIcon aiCard1_1;
	static ImageIcon aiCard2_1;
	static ImageIcon aiCard3_1;
	static ImageIcon aiCard4_1;
	static ImageIcon aiCard5_1;
	static ImageIcon aiCard6_1;
	static ImageIcon aiCard7_1;
	static ImageIcon aiCard8_1;
	static JButton userCard1;
	static Image userCard1_2;
	static Image userCard1_3;
	static ImageIcon userCard1_4;
	static JButton userCard2;
	static JButton userCard3;
	static JButton userCard4;
	static JButton userCard5;
	static JButton userCard6;
	static JButton userCard7;
	static JButton userCard8;
	static JButton aiCard1;
	static JButton aiCard2;
	static JButton aiCard3;
	static JButton aiCard4;
	static JButton aiCard5;
	static JButton aiCard6;
	static JButton aiCard7;
	static JButton aiCard8;
	static JButton userArenaCard1;
	static JButton userArenaCard2;
	static JButton userArenaCard3;
	static JButton aiArenaCard1;
	static JButton aiArenaCard2;
	static JButton aiArenaCard3;
	
	static JButton cardInfo;
	static JTextArea cardInfo2;
	static JButton closeInfo;
	static int battleArenaCards;
	
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
	
	static int userCards[] = new int [8];
	static int aiCards[] = new int [8];
	static int totalCards[] = new int [16];
	static String drawableCards[] = {"Razor Rabbit", "Spike the Squirrel", "Toxic Turtle", "Fangtail Fox", "Raging Raccoon", "Killer Koala", "Chainsaw Chinchilla", 
	"Slaughter Seahorse", "Mauler Meerkat", "Venomous Vulture", "Bloodthirsty Badger", "Capybara of Carnage", "Homicide Hamster", "Deathbeak Duckling",
	"Razorback Rottweiler", "Grievous Gorilla", "Pernicuous Porcupine", "Malevolent Mongoose", "Baleful Bald Eagle", "Murderous Mecha-Monkey"};
	
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
	    
	    secondsRemaining = 30;
	
	    // Initialize the timer with 1000ms (1 second) delay and an ActionListener
	    countdownTimer = new Timer(1000, new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            // Update the timer label
	            timerLabel.setText("Time remaining: " + secondsRemaining + " seconds");
	
	            // Check if time has run out
	            if (secondsRemaining == 0) {
	                // Perform actions when the timer reaches zero (e.g., end the game)
	                countdownTimer.stop(); // Stop the timer
	                // Your game-over logic here
	
	            } else {
	                // Decrement the remaining time
	                secondsRemaining--;
	            }
	        }
	    });
	    
	    countdownTimer.start();
    }
	
	public static void showCard1()
	{
		userCard1_2 = userCard1_1.getImage();
        userCard1_3 = userCard1_2.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
        userCard1_4 = new ImageIcon(userCard1_3);
        
        userCard1 = new JButton(userCard1_4);
		userCard1.setBounds(370, 536, 94, 150);
		frame.getContentPane().add(userCard1);
		
		userCard1.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				userCard1.setEnabled(false);
				userCard2.setEnabled(false);
				userCard3.setEnabled(false);
				userCard4.setEnabled(false);
				userCard5.setEnabled(false);
				userCard6.setEnabled(false);
				userCard7.setEnabled(false);
				userCard8.setEnabled(false);
				aiCard1.setEnabled(false);
				aiCard2.setEnabled(false);
				aiCard3.setEnabled(false);
				aiCard4.setEnabled(false);
				aiCard5.setEnabled(false);
				aiCard6.setEnabled(false);
				aiCard7.setEnabled(false);
				aiCard8.setEnabled(false);
				
				Image cardInfo_1 = userCard1_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				frame.getContentPane().add(cardInfo);
				
				cardInfo2.append("Attack: " + user1Attack);
				cardInfo2.append("\n");
				cardInfo2.append("Health: " + user1Health);
				cardInfo2.append("\n");
				cardInfo2.append("Coins Dropped: " + user1CoinsDropped);
				
				cardInfo2.setVisible(true);
				closeInfo.setVisible(true);
			}
		});
	}
	
	public static void showCard2()
	{
		Image userCard2_2 = userCard2_1.getImage();
        Image userCard2_3 = userCard2_2.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
        ImageIcon userCard2_4 = new ImageIcon(userCard2_3);
        
        userCard2 = new JButton(userCard2_4);
		userCard2.setBounds(476, 536, 94, 150);
		frame.getContentPane().add(userCard2);
		
		userCard2.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				userCard1.setEnabled(false);
				userCard2.setEnabled(false);
				userCard3.setEnabled(false);
				userCard4.setEnabled(false);
				userCard5.setEnabled(false);
				userCard6.setEnabled(false);
				userCard7.setEnabled(false);
				userCard8.setEnabled(false);
				aiCard1.setEnabled(false);
				aiCard2.setEnabled(false);
				aiCard3.setEnabled(false);
				aiCard4.setEnabled(false);
				aiCard5.setEnabled(false);
				aiCard6.setEnabled(false);
				aiCard7.setEnabled(false);
				aiCard8.setEnabled(false);
				
				Image cardInfo_1 = userCard2_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				frame.getContentPane().add(cardInfo);
				
				cardInfo2.append("Attack: " + user2Attack);
				cardInfo2.append("\n");
				cardInfo2.append("Health: " + user2Health);
				cardInfo2.append("\n");
				cardInfo2.append("Coins Dropped: " + user2CoinsDropped);
				
				cardInfo2.setVisible(true);
				closeInfo.setVisible(true);
			}
		});
	}
	
	public static void showCard3()
	{
		Image userCard3_2 = userCard3_1.getImage();
        Image userCard3_3 = userCard3_2.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
        ImageIcon userCard3_4 = new ImageIcon(userCard3_3);
        
        userCard3 = new JButton(userCard3_4);
		userCard3.setBounds(584, 536, 94, 150);
		frame.getContentPane().add(userCard3);
		
		userCard3.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				userCard1.setEnabled(false);
				userCard2.setEnabled(false);
				userCard3.setEnabled(false);
				userCard4.setEnabled(false);
				userCard5.setEnabled(false);
				userCard6.setEnabled(false);
				userCard7.setEnabled(false);
				userCard8.setEnabled(false);
				aiCard1.setEnabled(false);
				aiCard2.setEnabled(false);
				aiCard3.setEnabled(false);
				aiCard4.setEnabled(false);
				aiCard5.setEnabled(false);
				aiCard6.setEnabled(false);
				aiCard7.setEnabled(false);
				aiCard8.setEnabled(false);
				
				Image cardInfo_1 = userCard3_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				frame.getContentPane().add(cardInfo);
				
				cardInfo2.append("Attack: " + user3Attack);
				cardInfo2.append("\n");
				cardInfo2.append("Health: " + user3Health);
				cardInfo2.append("\n");
				cardInfo2.append("Coins Dropped: " + user3CoinsDropped);
				
				cardInfo2.setVisible(true);
				closeInfo.setVisible(true);
			}
		});
	}
	
	public static void showCard4()
	{
		Image userCard4_2 = userCard4_1.getImage();
        Image userCard4_3 = userCard4_2.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
        ImageIcon userCard4_4 = new ImageIcon(userCard4_3);
        
        userCard4 = new JButton(userCard4_4);
		userCard4.setBounds(688, 536, 94, 150);
		frame.getContentPane().add(userCard4);
		
		userCard4.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				userCard1.setEnabled(false);
				userCard2.setEnabled(false);
				userCard3.setEnabled(false);
				userCard4.setEnabled(false);
				userCard5.setEnabled(false);
				userCard6.setEnabled(false);
				userCard7.setEnabled(false);
				userCard8.setEnabled(false);
				aiCard1.setEnabled(false);
				aiCard2.setEnabled(false);
				aiCard3.setEnabled(false);
				aiCard4.setEnabled(false);
				aiCard5.setEnabled(false);
				aiCard6.setEnabled(false);
				aiCard7.setEnabled(false);
				aiCard8.setEnabled(false);
				
				Image cardInfo_1 = userCard4_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				frame.getContentPane().add(cardInfo);
				
				cardInfo2.append("Attack: " + user4Attack);
				cardInfo2.append("\n");
				cardInfo2.append("Health: " + user4Health);
				cardInfo2.append("\n");
				cardInfo2.append("Coins Dropped: " + user4CoinsDropped);
				
				cardInfo2.setVisible(true);
				closeInfo.setVisible(true);
			}
		});
	}
	
	public static void showCard5()
	{
		Image userCard5_2 = userCard5_1.getImage();
        Image userCard5_3 = userCard5_2.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
        ImageIcon userCard5_4 = new ImageIcon(userCard5_3);
        
        userCard5 = new JButton(userCard5_4);
		userCard5.setBounds(794, 536, 94, 150);
		frame.getContentPane().add(userCard5);
		
		userCard5.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				userCard1.setEnabled(false);
				userCard2.setEnabled(false);
				userCard3.setEnabled(false);
				userCard4.setEnabled(false);
				userCard5.setEnabled(false);
				userCard6.setEnabled(false);
				userCard7.setEnabled(false);
				userCard8.setEnabled(false);
				aiCard1.setEnabled(false);
				aiCard2.setEnabled(false);
				aiCard3.setEnabled(false);
				aiCard4.setEnabled(false);
				aiCard5.setEnabled(false);
				aiCard6.setEnabled(false);
				aiCard7.setEnabled(false);
				aiCard8.setEnabled(false);
				
				Image cardInfo_1 = userCard5_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				frame.getContentPane().add(cardInfo);
				
				cardInfo2.append("Attack: " + user5Attack);
				cardInfo2.append("\n");
				cardInfo2.append("Health: " + user5Health);
				cardInfo2.append("\n");
				cardInfo2.append("Coins Dropped: " + user5CoinsDropped);
				
				cardInfo2.setVisible(true);
				closeInfo.setVisible(true);
			}
		});
	}
	
	public static void showCard6()
	{
		Image userCard6_2 = userCard6_1.getImage();
        Image userCard6_3 = userCard6_2.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
        ImageIcon userCard6_4 = new ImageIcon(userCard6_3);
        
        userCard6 = new JButton(userCard6_4);
		userCard6.setBounds(900, 536, 94, 150);
		frame.getContentPane().add(userCard6);
		
		userCard6.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				userCard1.setEnabled(false);
				userCard2.setEnabled(false);
				userCard3.setEnabled(false);
				userCard4.setEnabled(false);
				userCard5.setEnabled(false);
				userCard6.setEnabled(false);
				userCard7.setEnabled(false);
				userCard8.setEnabled(false);
				aiCard1.setEnabled(false);
				aiCard2.setEnabled(false);
				aiCard3.setEnabled(false);
				aiCard4.setEnabled(false);
				aiCard5.setEnabled(false);
				aiCard6.setEnabled(false);
				aiCard7.setEnabled(false);
				aiCard8.setEnabled(false);
				
				Image cardInfo_1 = userCard6_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				frame.getContentPane().add(cardInfo);
				
				cardInfo2.append("Attack: " + user6Attack);
				cardInfo2.append("\n");
				cardInfo2.append("Health: " + user6Health);
				cardInfo2.append("\n");
				cardInfo2.append("Coins Dropped: " + user6CoinsDropped);
				
				cardInfo2.setVisible(true);
				closeInfo.setVisible(true);
			}
		});
	}
	
	public static void showCard7()
	{
		Image userCard7_2 = userCard7_1.getImage();
        Image userCard7_3 = userCard7_2.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
        ImageIcon userCard7_4 = new ImageIcon(userCard7_3);
        
        userCard7 = new JButton(userCard7_4);
		userCard7.setBounds(1006, 536, 94, 150);
		frame.getContentPane().add(userCard7);
		
		userCard7.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				userCard1.setEnabled(false);
				userCard2.setEnabled(false);
				userCard3.setEnabled(false);
				userCard4.setEnabled(false);
				userCard5.setEnabled(false);
				userCard6.setEnabled(false);
				userCard7.setEnabled(false);
				userCard8.setEnabled(false);
				aiCard1.setEnabled(false);
				aiCard2.setEnabled(false);
				aiCard3.setEnabled(false);
				aiCard4.setEnabled(false);
				aiCard5.setEnabled(false);
				aiCard6.setEnabled(false);
				aiCard7.setEnabled(false);
				aiCard8.setEnabled(false);
				
				Image cardInfo_1 = userCard7_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				frame.getContentPane().add(cardInfo);
				
				cardInfo2.append("Attack: " + user7Attack);
				cardInfo2.append("\n");
				cardInfo2.append("Health: " + user7Health);
				cardInfo2.append("\n");
				cardInfo2.append("Coins Dropped: " + user7CoinsDropped);
				
				cardInfo2.setVisible(true);
				closeInfo.setVisible(true);
			}
		});
	}
	
	public static void showCard8()
	{
		Image userCard8_2 = userCard8_1.getImage();
        Image userCard8_3 = userCard8_2.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
        ImageIcon userCard8_4 = new ImageIcon(userCard8_3);
        
        userCard8 = new JButton(userCard8_4);
		userCard8.setBounds(1112, 536, 94, 150);
		frame.getContentPane().add(userCard8);
		
		userCard8.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				userCard1.setEnabled(false);
				userCard2.setEnabled(false);
				userCard3.setEnabled(false);
				userCard4.setEnabled(false);
				userCard5.setEnabled(false);
				userCard6.setEnabled(false);
				userCard7.setEnabled(false);
				userCard8.setEnabled(false);
				aiCard1.setEnabled(false);
				aiCard2.setEnabled(false);
				aiCard3.setEnabled(false);
				aiCard4.setEnabled(false);
				aiCard5.setEnabled(false);
				aiCard6.setEnabled(false);
				aiCard7.setEnabled(false);
				aiCard8.setEnabled(false);
				
				Image cardInfo_1 = userCard8_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				frame.getContentPane().add(cardInfo);
				
				cardInfo2.append("Attack: " + user8Attack);
				cardInfo2.append("\n");
				cardInfo2.append("Health: " + user8Health);
				cardInfo2.append("\n");
				cardInfo2.append("Coins Dropped: " + user8CoinsDropped);
				
				cardInfo2.setVisible(true);
				closeInfo.setVisible(true);
			}
		});
	}
	
	public static void showAiCard1()
	{
		Image aiCard1_2 = aiCard1_1.getImage();
        Image aiCard1_3 = aiCard1_2.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
        ImageIcon aiCard1_4 = new ImageIcon(aiCard1_3);
        
        aiCard1 = new JButton(aiCard1_4);
		aiCard1.setBounds(370, 44, 94, 150);
		frame.getContentPane().add(aiCard1);
		
		aiCard1.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				aiCard1.setEnabled(false);
				aiCard2.setEnabled(false);
				aiCard3.setEnabled(false);
				aiCard4.setEnabled(false);
				aiCard5.setEnabled(false);
				aiCard6.setEnabled(false);
				aiCard7.setEnabled(false);
				aiCard8.setEnabled(false);
				userCard1.setEnabled(false);
				userCard2.setEnabled(false);
				userCard3.setEnabled(false);
				userCard4.setEnabled(false);
				userCard5.setEnabled(false);
				userCard6.setEnabled(false);
				userCard7.setEnabled(false);
				userCard8.setEnabled(false);
				
				Image cardInfo_1 = aiCard1_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				frame.getContentPane().add(cardInfo);
				
				cardInfo2.append("Attack: " + ai1Attack);
				cardInfo2.append("\n");
				cardInfo2.append("Health: " + ai1Health);
				cardInfo2.append("\n");
				cardInfo2.append("Coins Dropped: " + ai1CoinsDropped);
				
				cardInfo2.setVisible(true);
				closeInfo.setVisible(true);
			}
		});
	}
	
	public static void showAiCard2()
	{
		Image aiCard2_2 = aiCard2_1.getImage();
        Image aiCard2_3 = aiCard2_2.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
        ImageIcon aiCard2_4 = new ImageIcon(aiCard2_3);
        
        aiCard2 = new JButton(aiCard2_4);
		aiCard2.setBounds(476, 44, 94, 150);
		frame.getContentPane().add(aiCard2);
		
		aiCard2.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				aiCard1.setEnabled(false);
				aiCard2.setEnabled(false);
				aiCard3.setEnabled(false);
				aiCard4.setEnabled(false);
				aiCard5.setEnabled(false);
				aiCard6.setEnabled(false);
				aiCard7.setEnabled(false);
				aiCard8.setEnabled(false);
				userCard1.setEnabled(false);
				userCard2.setEnabled(false);
				userCard3.setEnabled(false);
				userCard4.setEnabled(false);
				userCard5.setEnabled(false);
				userCard6.setEnabled(false);
				userCard7.setEnabled(false);
				userCard8.setEnabled(false);
				
				Image cardInfo_1 = aiCard2_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				frame.getContentPane().add(cardInfo);
				
				cardInfo2.append("Attack: " + ai2Attack);
				cardInfo2.append("\n");
				cardInfo2.append("Health: " + ai2Health);
				cardInfo2.append("\n");
				cardInfo2.append("Coins Dropped: " + ai2CoinsDropped);
				
				cardInfo2.setVisible(true);
				closeInfo.setVisible(true);
			}
		});
	}
	
	public static void showAiCard3()
	{
		Image aiCard3_2 = aiCard3_1.getImage();
        Image aiCard3_3 = aiCard3_2.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
        ImageIcon aiCard3_4 = new ImageIcon(aiCard3_3);
        
        aiCard3 = new JButton(aiCard3_4);
		aiCard3.setBounds(582, 44, 94, 150);
		frame.getContentPane().add(aiCard3);
		
		aiCard3.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				aiCard1.setEnabled(false);
				aiCard2.setEnabled(false);
				aiCard3.setEnabled(false);
				aiCard4.setEnabled(false);
				aiCard5.setEnabled(false);
				aiCard6.setEnabled(false);
				aiCard7.setEnabled(false);
				aiCard8.setEnabled(false);
				userCard1.setEnabled(false);
				userCard2.setEnabled(false);
				userCard3.setEnabled(false);
				userCard4.setEnabled(false);
				userCard5.setEnabled(false);
				userCard6.setEnabled(false);
				userCard7.setEnabled(false);
				userCard8.setEnabled(false);
				
				Image cardInfo_1 = aiCard3_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				frame.getContentPane().add(cardInfo);
				
				cardInfo2.append("Attack: " + ai3Attack);
				cardInfo2.append("\n");
				cardInfo2.append("Health: " + ai3Health);
				cardInfo2.append("\n");
				cardInfo2.append("Coins Dropped: " + ai3CoinsDropped);
				
				cardInfo2.setVisible(true);
				closeInfo.setVisible(true);
			}
		});
	}
	
	public static void showAiCard4()
	{
		Image aiCard4_2 = aiCard4_1.getImage();
        Image aiCard4_3 = aiCard4_2.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
        ImageIcon aiCard4_4 = new ImageIcon(aiCard4_3);
        
        aiCard4 = new JButton(aiCard4_4);
		aiCard4.setBounds(688, 44, 94, 150);
		frame.getContentPane().add(aiCard4);
		
		aiCard4.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				aiCard1.setEnabled(false);
				aiCard2.setEnabled(false);
				aiCard3.setEnabled(false);
				aiCard4.setEnabled(false);
				aiCard5.setEnabled(false);
				aiCard6.setEnabled(false);
				aiCard7.setEnabled(false);
				aiCard8.setEnabled(false);
				userCard1.setEnabled(false);
				userCard2.setEnabled(false);
				userCard3.setEnabled(false);
				userCard4.setEnabled(false);
				userCard5.setEnabled(false);
				userCard6.setEnabled(false);
				userCard7.setEnabled(false);
				userCard8.setEnabled(false);
				
				Image cardInfo_1 = aiCard4_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				frame.getContentPane().add(cardInfo);
				
				cardInfo2.append("Attack: " + ai4Attack);
				cardInfo2.append("\n");
				cardInfo2.append("Health: " + ai4Health);
				cardInfo2.append("\n");
				cardInfo2.append("Coins Dropped: " + ai4CoinsDropped);
				
				cardInfo2.setVisible(true);
				closeInfo.setVisible(true);
			}
		});
	}
	
	public static void showAiCard5()
	{
		Image aiCard5_2 = aiCard5_1.getImage();
        Image aiCard5_3 = aiCard5_2.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
        ImageIcon aiCard5_4 = new ImageIcon(aiCard5_3);
        
        aiCard5 = new JButton(aiCard5_4);
		aiCard5.setBounds(794, 44, 94, 150);
		frame.getContentPane().add(aiCard5);
		
		aiCard5.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				aiCard1.setEnabled(false);
				aiCard2.setEnabled(false);
				aiCard3.setEnabled(false);
				aiCard4.setEnabled(false);
				aiCard5.setEnabled(false);
				aiCard6.setEnabled(false);
				aiCard7.setEnabled(false);
				aiCard8.setEnabled(false);
				userCard1.setEnabled(false);
				userCard2.setEnabled(false);
				userCard3.setEnabled(false);
				userCard4.setEnabled(false);
				userCard5.setEnabled(false);
				userCard6.setEnabled(false);
				userCard7.setEnabled(false);
				userCard8.setEnabled(false);
				
				Image cardInfo_1 = aiCard5_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				frame.getContentPane().add(cardInfo);
				
				cardInfo2.append("Attack: " + ai5Attack);
				cardInfo2.append("\n");
				cardInfo2.append("Health: " + ai5Health);
				cardInfo2.append("\n");
				cardInfo2.append("Coins Dropped: " + ai5CoinsDropped);
				
				cardInfo2.setVisible(true);
				closeInfo.setVisible(true);
			}
		});
	}
	
	public static void showAiCard6()
	{
		Image aiCard6_2 = aiCard6_1.getImage();
        Image aiCard6_3 = aiCard6_2.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
        ImageIcon aiCard6_4 = new ImageIcon(aiCard6_3);
        
        aiCard6 = new JButton(aiCard6_4);
		aiCard6.setBounds(900, 44, 94, 150);
		frame.getContentPane().add(aiCard6);
		
		aiCard6.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				aiCard1.setEnabled(false);
				aiCard2.setEnabled(false);
				aiCard3.setEnabled(false);
				aiCard4.setEnabled(false);
				aiCard5.setEnabled(false);
				aiCard6.setEnabled(false);
				aiCard7.setEnabled(false);
				aiCard8.setEnabled(false);
				userCard1.setEnabled(false);
				userCard2.setEnabled(false);
				userCard3.setEnabled(false);
				userCard4.setEnabled(false);
				userCard5.setEnabled(false);
				userCard6.setEnabled(false);
				userCard7.setEnabled(false);
				userCard8.setEnabled(false);
				
				Image cardInfo_1 = aiCard6_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				frame.getContentPane().add(cardInfo);
				
				cardInfo2.append("Attack: " + ai6Attack);
				cardInfo2.append("\n");
				cardInfo2.append("Health: " + ai6Health);
				cardInfo2.append("\n");
				cardInfo2.append("Coins Dropped: " + ai6CoinsDropped);
				
				cardInfo2.setVisible(true);
				closeInfo.setVisible(true);
			}
		});
	}
	
	public static void showAiCard7()
	{
		Image aiCard7_2 = aiCard7_1.getImage();
        Image aiCard7_3 = aiCard7_2.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
        ImageIcon aiCard7_4 = new ImageIcon(aiCard7_3);
        
        aiCard7 = new JButton(aiCard7_4);
		aiCard7.setBounds(1006, 44, 94, 150);
		frame.getContentPane().add(aiCard7);
		
		aiCard7.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				aiCard1.setEnabled(false);
				aiCard2.setEnabled(false);
				aiCard3.setEnabled(false);
				aiCard4.setEnabled(false);
				aiCard5.setEnabled(false);
				aiCard6.setEnabled(false);
				aiCard7.setEnabled(false);
				aiCard8.setEnabled(false);
				userCard1.setEnabled(false);
				userCard2.setEnabled(false);
				userCard3.setEnabled(false);
				userCard4.setEnabled(false);
				userCard5.setEnabled(false);
				userCard6.setEnabled(false);
				userCard7.setEnabled(false);
				userCard8.setEnabled(false);
				
				Image cardInfo_1 = aiCard7_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				frame.getContentPane().add(cardInfo);
				
				cardInfo2.append("Attack: " + ai7Attack);
				cardInfo2.append("\n");
				cardInfo2.append("Health: " + ai7Health);
				cardInfo2.append("\n");
				cardInfo2.append("Coins Dropped: " + ai7CoinsDropped);
				
				cardInfo2.setVisible(true);
				closeInfo.setVisible(true);
			}
		});
	}
	
	public static void showAiCard8()
	{
		Image aiCard8_2 = aiCard8_1.getImage();
        Image aiCard8_3 = aiCard8_2.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
        ImageIcon aiCard8_4 = new ImageIcon(aiCard8_3);
        
        aiCard8 = new JButton(aiCard8_4);
		aiCard8.setBounds(1112, 44, 94, 150);
		frame.getContentPane().add(aiCard8);
		
		aiCard8.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				aiCard1.setEnabled(false);
				aiCard2.setEnabled(false);
				aiCard3.setEnabled(false);
				aiCard4.setEnabled(false);
				aiCard5.setEnabled(false);
				aiCard6.setEnabled(false);
				aiCard7.setEnabled(false);
				aiCard8.setEnabled(false);
				userCard1.setEnabled(false);
				userCard2.setEnabled(false);
				userCard3.setEnabled(false);
				userCard4.setEnabled(false);
				userCard5.setEnabled(false);
				userCard6.setEnabled(false);
				userCard7.setEnabled(false);
				userCard8.setEnabled(false);
				
				Image cardInfo_1 = aiCard8_1.getImage();
				Image cardInfo_2 = cardInfo_1.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
				ImageIcon cardInfo_3 = new ImageIcon(cardInfo_2);
				
				cardInfo = new JButton(cardInfo_3);
				cardInfo.setBounds(6, 44, 250, 400);
				frame.getContentPane().add(cardInfo);
				
				cardInfo2.append("Attack: " + ai8Attack);
				cardInfo2.append("\n");
				cardInfo2.append("Health: " + ai8Health);
				cardInfo2.append("\n");
				cardInfo2.append("Coins Dropped: " + ai8CoinsDropped);
				
				cardInfo2.setVisible(true);
				closeInfo.setVisible(true);
			}
		});
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void showGameplayScreen()
	{
		
		read();
		
		cardsDrawn = cardsDrawnCheck;
		
		battleArenaCards = 0;
		
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
        
		card1 = newCard1;
		if (card1.equals("Yes"))
		{
			showCard1();
		}
		card2 = newCard2;
		if (card2.equals("Yes"))
		{
			showCard2();
		}
		card3 = newCard3;
		if (card3.equals("Yes"))
		{
			showCard3();
		}
		card4 = newCard4;
		if (card4.equals("Yes"))
		{
			showCard4();
		}
		card5 = newCard5;
		if (card5.equals("Yes"))
		{
			showCard5();
		}
		card6 = newCard6;
		if (card6.equals("Yes"))
		{
			showCard6();
		}
		card7 = newCard7;
		if (card7.equals("Yes"))
		{
			showCard7();
		}
		card8 = newCard8;
		if (card8.equals("Yes"))
		{
			showCard8();
		}
		card9 = newCard9;
		if (card9.equals("Yes"))
		{
			showAiCard1();
		}
		card10 = newCard10;
		if (card10.equals("Yes"))
		{
			showAiCard2();
		}
		card11 = newCard11;
		if (card11.equals("Yes"))
		{
			showAiCard3();
		}
		card12 = newCard12;
		if (card12.equals("Yes"))
		{
			showAiCard4();
		}
		card13 = newCard13;
		if (card13.equals("Yes"))
		{
			showAiCard5();
		}
		card14 = newCard14;
		if (card14.equals("Yes"))
		{
			showAiCard6();
		}
		card15 = newCard15;
		if (card15.equals("Yes"))
		{
			showAiCard7();
		}
		card16 = newCard16;
		if (card16.equals("Yes"))
		{
			showAiCard8();
		}
		
		
		frame.getContentPane().setBackground(new Color(156, 246, 232));
		
		JButton userAbility = new JButton("Ability");
		userAbility.setBounds(264, 536, 94, 150);
		frame.getContentPane().add(userAbility);
		
		JButton shopButton = new JButton("Shop");
		shopButton.setBounds(18, 611, 149, 45);
		frame.getContentPane().add(shopButton);
		
		shopButton.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				frame.setVisible(false);
				write();
				ShopScreen ss = new ShopScreen();
				ss.showShopScreen();
			}
		});
	
		JButton forfeitButton = new JButton("Forfeit");
		forfeitButton.setBounds(18, 666, 149, 45);
		frame.getContentPane().add(forfeitButton);
		
		forfeitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				frame.setVisible(false);
				MainMenuScreen ms = new MainMenuScreen();
				ms.showMainMenuScreen();
			}
		});
		
		JButton aiAbility = new JButton("AI Ability");
		aiAbility.setBounds(264, 44, 94, 150);
		frame.getContentPane().add(aiAbility);
		
		JTextArea moveHistory = new JTextArea();
		moveHistory.setBounds(1222, 427, 159, 303);
		frame.getContentPane().add(moveHistory);
		
//		JButton cardInfo = new JButton("Card Info");
//		cardInfo.setBounds(6, 44, 250, 400);
//		frame.getContentPane().add(cardInfo);
		
		JButton aiArenaCard1 = new JButton("AI 1");
		aiArenaCard1.setBounds(528, 206, 94, 150);
		frame.getContentPane().add(aiArenaCard1);
		
		JButton aiArenaCard2 = new JButton("AI 2");
		aiArenaCard2.setBounds(634, 206, 94, 150);
		frame.getContentPane().add(aiArenaCard2);
		
		JButton aiArenaCard3 = new JButton("AI 3");
		aiArenaCard3.setBounds(740, 206, 94, 150);
		frame.getContentPane().add(aiArenaCard3);
		
		ImageIcon drawDeck1 = new ImageIcon("resources/images/Backofcard.png");
        Image drawDeck2 = drawDeck1.getImage();
        Image drawDeck3 = drawDeck2.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
        ImageIcon drawDeck4 = new ImageIcon(drawDeck3);
		
		JButton drawDeck = new JButton(drawDeck4);
		drawDeck.setBounds(1006, 294, 94, 150);
		frame.getContentPane().add(drawDeck);
		
		JButton userDraw = new JButton("Click to Draw 8 Cards");
		userDraw.setBounds(965, 454, 174, 21);
		frame.getContentPane().add(userDraw);
		
		JButton selectCard1 = new JButton("SELECT");
		selectCard1.setBounds(370, 690, 94, 21);
		frame.getContentPane().add(selectCard1);
		
		selectCard1.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				selectCard1.setEnabled(false);				
				Image arenaCard_1 = userCard1_1.getImage();
				Image arenaCard_2 = arenaCard_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
				ImageIcon arenaCard_3 = new ImageIcon(arenaCard_2);
				
				if (battleArenaCards == 0)
				{
					userArenaCard1 = new JButton(arenaCard_3);
					userArenaCard1.setBounds(528, 368, 94, 150);
					frame.getContentPane().add(userArenaCard1);
				}
				else if (battleArenaCards == 1)
				{
					userArenaCard2 = new JButton(arenaCard_3);
					userArenaCard2.setBounds(634, 368, 94, 150);
					frame.getContentPane().add(userArenaCard2);
				}
				else if (battleArenaCards == 2)
				{
					userArenaCard3 = new JButton(arenaCard_3);
					userArenaCard3.setBounds(740, 368, 94, 150);
					frame.getContentPane().add(userArenaCard3);
				}
				battleArenaCards++;
			}
		});
		
		JButton selectCard2 = new JButton("SELECT");
		selectCard2.setBounds(476, 690, 94, 21);
		frame.getContentPane().add(selectCard2);
		
		selectCard2.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				selectCard2.setEnabled(false);				
				Image arenaCard_1 = userCard2_1.getImage();
				Image arenaCard_2 = arenaCard_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
				ImageIcon arenaCard_3 = new ImageIcon(arenaCard_2);
				
				if (battleArenaCards == 0)
				{
					userArenaCard1 = new JButton(arenaCard_3);
					userArenaCard1.setBounds(528, 368, 94, 150);
					frame.getContentPane().add(userArenaCard1);
				}
				else if (battleArenaCards == 1)
				{
					userArenaCard2 = new JButton(arenaCard_3);
					userArenaCard2.setBounds(634, 368, 94, 150);
					frame.getContentPane().add(userArenaCard2);
				}
				else if (battleArenaCards == 2)
				{
					userArenaCard3 = new JButton(arenaCard_3);
					userArenaCard3.setBounds(740, 368, 94, 150);
					frame.getContentPane().add(userArenaCard3);
				}
				battleArenaCards++;
			}
		});
		
		JButton selectCard3 = new JButton("SELECT");
		selectCard3.setBounds(584, 690, 94, 21);
		frame.getContentPane().add(selectCard3);
		
		selectCard3.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				selectCard3.setEnabled(false);				
				Image arenaCard_1 = userCard3_1.getImage();
				Image arenaCard_2 = arenaCard_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
				ImageIcon arenaCard_3 = new ImageIcon(arenaCard_2);
				
				if (battleArenaCards == 0)
				{
					userArenaCard1 = new JButton(arenaCard_3);
					userArenaCard1.setBounds(528, 368, 94, 150);
					frame.getContentPane().add(userArenaCard1);
				}
				else if (battleArenaCards == 1)
				{
					userArenaCard2 = new JButton(arenaCard_3);
					userArenaCard2.setBounds(634, 368, 94, 150);
					frame.getContentPane().add(userArenaCard2);
				}
				else if (battleArenaCards == 2)
				{
					userArenaCard3 = new JButton(arenaCard_3);
					userArenaCard3.setBounds(740, 368, 94, 150);
					frame.getContentPane().add(userArenaCard3);
				}
				battleArenaCards++;
			}
		});
		
		JButton selectCard4 = new JButton("SELECT");
		selectCard4.setBounds(688, 690, 94, 21);
		frame.getContentPane().add(selectCard4);
		
		selectCard4.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				selectCard4.setEnabled(false);				
				Image arenaCard_1 = userCard4_1.getImage();
				Image arenaCard_2 = arenaCard_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
				ImageIcon arenaCard_3 = new ImageIcon(arenaCard_2);
				
				if (battleArenaCards == 0)
				{
					userArenaCard1 = new JButton(arenaCard_3);
					userArenaCard1.setBounds(528, 368, 94, 150);
					frame.getContentPane().add(userArenaCard1);
				}
				else if (battleArenaCards == 1)
				{
					userArenaCard2 = new JButton(arenaCard_3);
					userArenaCard2.setBounds(634, 368, 94, 150);
					frame.getContentPane().add(userArenaCard2);
				}
				else if (battleArenaCards == 2)
				{
					userArenaCard3 = new JButton(arenaCard_3);
					userArenaCard3.setBounds(740, 368, 94, 150);
					frame.getContentPane().add(userArenaCard3);
				}
				battleArenaCards++;
			}
		});
		
		JButton selectCard5 = new JButton("SELECT");
		selectCard5.setBounds(794, 690, 94, 21);
		frame.getContentPane().add(selectCard5);
		
		selectCard5.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				selectCard5.setEnabled(false);				
				Image arenaCard_1 = userCard5_1.getImage();
				Image arenaCard_2 = arenaCard_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
				ImageIcon arenaCard_3 = new ImageIcon(arenaCard_2);
				
				if (battleArenaCards == 0)
				{
					userArenaCard1 = new JButton(arenaCard_3);
					userArenaCard1.setBounds(528, 368, 94, 150);
					frame.getContentPane().add(userArenaCard1);
				}
				else if (battleArenaCards == 1)
				{
					userArenaCard2 = new JButton(arenaCard_3);
					userArenaCard2.setBounds(634, 368, 94, 150);
					frame.getContentPane().add(userArenaCard2);
				}
				else if (battleArenaCards == 2)
				{
					userArenaCard3 = new JButton(arenaCard_3);
					userArenaCard3.setBounds(740, 368, 94, 150);
					frame.getContentPane().add(userArenaCard3);
				}
				battleArenaCards++;
			}
		});
		
		JButton selectCard6 = new JButton("SELECT");
		selectCard6.setBounds(900, 690, 94, 21);
		frame.getContentPane().add(selectCard6);
		
		selectCard6.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				selectCard6.setEnabled(false);				
				Image arenaCard_1 = userCard6_1.getImage();
				Image arenaCard_2 = arenaCard_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
				ImageIcon arenaCard_3 = new ImageIcon(arenaCard_2);
				
				if (battleArenaCards == 0)
				{
					userArenaCard1 = new JButton(arenaCard_3);
					userArenaCard1.setBounds(528, 368, 94, 150);
					frame.getContentPane().add(userArenaCard1);
				}
				else if (battleArenaCards == 1)
				{
					userArenaCard2 = new JButton(arenaCard_3);
					userArenaCard2.setBounds(634, 368, 94, 150);
					frame.getContentPane().add(userArenaCard2);
				}
				else if (battleArenaCards == 2)
				{
					userArenaCard3 = new JButton(arenaCard_3);
					userArenaCard3.setBounds(740, 368, 94, 150);
					frame.getContentPane().add(userArenaCard3);
				}
				battleArenaCards++;
			}
		});
		
		JButton selectCard7 = new JButton("SELECT");
		selectCard7.setBounds(1006, 690, 94, 21);
		frame.getContentPane().add(selectCard7);
		
		selectCard7.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				selectCard7.setEnabled(false);				
				Image arenaCard_1 = userCard7_1.getImage();
				Image arenaCard_2 = arenaCard_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
				ImageIcon arenaCard_3 = new ImageIcon(arenaCard_2);
				
				if (battleArenaCards == 0)
				{
					userArenaCard1 = new JButton(arenaCard_3);
					userArenaCard1.setBounds(528, 368, 94, 150);
					frame.getContentPane().add(userArenaCard1);
				}
				else if (battleArenaCards == 1)
				{
					userArenaCard2 = new JButton(arenaCard_3);
					userArenaCard2.setBounds(634, 368, 94, 150);
					frame.getContentPane().add(userArenaCard2);
				}
				else if (battleArenaCards == 2)
				{
					userArenaCard3 = new JButton(arenaCard_3);
					userArenaCard3.setBounds(740, 368, 94, 150);
					frame.getContentPane().add(userArenaCard3);
				}
				battleArenaCards++;
			}
		});
		
		JButton selectCard8 = new JButton("SELECT");
		selectCard8.setBounds(1112, 690, 94, 21);
		frame.getContentPane().add(selectCard8);
		
		closeInfo = new JButton("CLOSE INFO");
		closeInfo.setBounds(76, 561, 118, 21);
		frame.getContentPane().add(closeInfo);
		closeInfo.setVisible(false);
		
		cardInfo2 = new JTextArea();
		cardInfo2.setFont(new Font("Monospaced", Font.BOLD, 16));
		cardInfo2.setBounds(6, 441, 250, 108);
		frame.getContentPane().add(cardInfo2);
		cardInfo2.setVisible(false);
		cardInfo2.setEnabled(false);
		
		closeInfo.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				userCard1.setEnabled(true);
				userCard2.setEnabled(true);
				userCard3.setEnabled(true);
				userCard4.setEnabled(true);
				userCard5.setEnabled(true);
				userCard6.setEnabled(true);
				userCard7.setEnabled(true);
				userCard8.setEnabled(true);
				aiCard1.setEnabled(true);
				aiCard2.setEnabled(true);
				aiCard3.setEnabled(true);
				aiCard4.setEnabled(true);
				aiCard5.setEnabled(true);
				aiCard6.setEnabled(true);
				aiCard7.setEnabled(true);
				aiCard8.setEnabled(true);
				cardInfo.setVisible(false);
				cardInfo2.setText("");
				cardInfo2.setVisible(false);				
				closeInfo.setVisible(false);
			}
		});
		
		selectCard8.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				selectCard8.setEnabled(false);				
				Image arenaCard_1 = userCard8_1.getImage();
				Image arenaCard_2 = arenaCard_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
				ImageIcon arenaCard_3 = new ImageIcon(arenaCard_2);
				
				if (battleArenaCards == 0)
				{
					userArenaCard1 = new JButton(arenaCard_3);
					userArenaCard1.setBounds(528, 368, 94, 150);
					frame.getContentPane().add(userArenaCard1);
				}
				else if (battleArenaCards == 1)
				{
					userArenaCard2 = new JButton(arenaCard_3);
					userArenaCard2.setBounds(634, 368, 94, 150);
					frame.getContentPane().add(userArenaCard2);
				}
				else if (battleArenaCards == 2)
				{
					userArenaCard3 = new JButton(arenaCard_3);
					userArenaCard3.setBounds(740, 368, 94, 150);
					frame.getContentPane().add(userArenaCard3);
				}
				battleArenaCards++;
			}
		});
		
		userDraw.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				userDraw.setEnabled(false);
				cardsDrawn = "No";
				userCountdown();
				
				ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
		        for (int count = 0; count < 20; count ++) 
		        {
		        	randomNumbers.add(count);
		        }
		        Collections.shuffle(randomNumbers);
		        for (int count = 0; count < 16; count++) 
		        {
		        	totalCards[count] = (randomNumbers.get(count));
		        }
		        for (int count2 = 0; count2 < 8; count2++)
		        {
		        	userCards[count2] = totalCards[count2];
		        }
		        int count3 = 8;
	        	for (int count4 = 0; count4 < 8; count4++)
	        	{
	        		aiCards[count4] = totalCards[count3];
	        		count3++;
	        	}
				      
//		        System.out.println(userCards[0]);
//		        System.out.println(userCards[1]);
//		        System.out.println(userCards[2]);
//		        System.out.println(userCards[3]);
//		        System.out.println(userCards[4]);
//		        System.out.println(userCards[5]);
//		        System.out.println(userCards[6]);
//		        System.out.println(userCards[7]);
//		        System.out.println(aiCards[0]);
//		        System.out.println(aiCards[1]);
//		        System.out.println(aiCards[2]); 
//		        System.out.println(aiCards[3]);
//		        System.out.println(aiCards[4]);
//		        System.out.println(aiCards[5]);
//		        System.out.println(aiCards[6]);
//		        System.out.println(aiCards[7]);
		        
				
				if (userCards[0] == 0)
				{
					userCard1_1 = new ImageIcon("resources/images/razer rabbit.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 2;
			        user1Health = 1;
			        user1CoinsDropped = 1;
				}
				else if (userCards[0] == 1)
				{
					userCard1_1 = new ImageIcon("resources/images/squirrel.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 1;
			        user1Health = 3;
			        user1CoinsDropped = 1;
				}
				else if (userCards[0] == 2)
				{
					userCard1_1 = new ImageIcon("resources/images/toxicturtle.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 1;
			        user1Health = 5;
			        user1CoinsDropped = 2;
				}
				else if (userCards[0] == 3)
				{
					userCard1_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 3;
			        user1Health = 3;
			        user1CoinsDropped = 3;
				}
				else if (userCards[0] == 4)
				{
					userCard1_1 = new ImageIcon("resources/images/raging raccoon.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 4;
			        user1Health = 3;
			        user1CoinsDropped = 4;
				}
				else if (userCards[0] == 5)
				{
					userCard1_1 = new ImageIcon("resources/images/killer koala.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 1;
			        user1Health = 3;
			        user1CoinsDropped = 2;
				}
				else if (userCards[0] == 6)
				{
					userCard1_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 1;
			        user1Health = 1;
			        user1CoinsDropped = 1;
				}
				else if (userCards[0] == 7)
				{
					userCard1_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 2;
			        user1Health = 3;
			        user1CoinsDropped = 2;
				}
				else if (userCards[0] == 8)
				{
					userCard1_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 2;
			        user1Health = 3;
			        user1CoinsDropped = 3;
				}
				else if (userCards[0] == 9)
				{
					userCard1_1 = new ImageIcon("resources/images/venemous vulture.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 3;
			        user1Health = 3;
			        user1CoinsDropped = 3;
				}
				else if (userCards[0] == 10)
				{
					userCard1_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 6;
			        user1Health = 2;
			        user1CoinsDropped = 5;
				}
				else if (userCards[0] == 11)
				{
					userCard1_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 7;
			        user1Health = 5;
			        user1CoinsDropped = 8;
				}
				else if (userCards[0] == 12)
				{
					userCard1_1 = new ImageIcon("resources/images/homicide hamster.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 1;
			        user1Health = 1;
			        user1CoinsDropped = 1;
				}
				else if (userCards[0] == 13)
				{
					userCard1_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 1;
			        user1Health = 3;
			        user1CoinsDropped = 2;
				}
				else if (userCards[0] == 14)
				{
					userCard1_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 2;
			        user1Health = 4;
			        user1CoinsDropped = 3;
				}
				else if (userCards[0] == 15)
				{
					userCard1_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 3;
			        user1Health = 4;
			        user1CoinsDropped = 4;
				}
				else if (userCards[0] == 16)
				{
					userCard1_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 5;
			        user1Health = 2;
			        user1CoinsDropped = 5;
				}
				else if (userCards[0] == 17)
				{
					userCard1_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 6;
			        user1Health = 6;
			        user1CoinsDropped = 8;
				}
				else if (userCards[0] == 18)
				{
					userCard1_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 5;
			        user1Health = 3;
			        user1CoinsDropped = 4;
				}
				else if (userCards[0] == 19)
				{
					userCard1_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
			        showCard1();
			        card1 = "Yes";
				}
				
				
				if (userCards[1] == 0)
				{
					userCard2_1 = new ImageIcon("resources/images/razer rabbit.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 2;
			        user2Health = 1;
			        user2CoinsDropped = 1;
				}
				else if (userCards[1] == 1)
				{
					userCard2_1 = new ImageIcon("resources/images/squirrel.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 1;
			        user2Health = 3;
			        user2CoinsDropped = 1;
				}
				else if (userCards[1] == 2)
				{
					userCard2_1 = new ImageIcon("resources/images/toxicturtle.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 1;
			        user2Health = 5;
			        user2CoinsDropped = 2;
				}
				else if (userCards[1] == 3)
				{
					userCard2_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 3;
			        user2Health = 3;
			        user2CoinsDropped = 3;
				}
				else if (userCards[1] == 4)
				{
					userCard2_1 = new ImageIcon("resources/images/raging raccoon.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 4;
			        user2Health = 3;
			        user2CoinsDropped = 4;
				}
				else if (userCards[1] == 5)
				{
					userCard2_1 = new ImageIcon("resources/images/killer koala.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 1;
			        user2Health = 3;
			        user2CoinsDropped = 2;
				}
				else if (userCards[1] == 6)
				{
					userCard2_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 1;
			        user2Health = 1;
			        user2CoinsDropped = 1;
				}
				else if (userCards[1] == 7)
				{
					userCard2_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 2;
			        user2Health = 3;
			        user2CoinsDropped = 2;
				}
				else if (userCards[1] == 8)
				{
					userCard2_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 2;
			        user2Health = 3;
			        user2CoinsDropped = 3;
				}
				else if (userCards[1] == 9)
				{
					userCard2_1 = new ImageIcon("resources/images/venemous vulture.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 3;
			        user2Health = 3;
			        user2CoinsDropped = 3;
				}
				else if (userCards[1] == 10)
				{
					userCard2_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 6;
			        user2Health = 2;
			        user2CoinsDropped = 5;
				}
				else if (userCards[1] == 11)
				{
					userCard2_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 7;
			        user2Health = 5;
			        user2CoinsDropped = 8;
				}
				else if (userCards[1] == 12)
				{
					userCard2_1 = new ImageIcon("resources/images/homicide hamster.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 1;
			        user2Health = 1;
			        user2CoinsDropped = 1;
				}
				else if (userCards[1] == 13)
				{
					userCard2_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 1;
			        user2Health = 3;
			        user2CoinsDropped = 2;
				}
				else if (userCards[1] == 14)
				{
					userCard2_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 2;
			        user2Health = 4;
			        user2CoinsDropped = 3;
				}
				else if (userCards[1] == 15)
				{
					userCard2_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 3;
			        user2Health = 4;
			        user2CoinsDropped = 4;
				}
				else if (userCards[1] == 16)
				{
					userCard2_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 5;
			        user2Health = 2;
			        user2CoinsDropped = 5;
				}
				else if (userCards[1] == 17)
				{
					userCard2_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 6;
			        user2Health = 6;
			        user2CoinsDropped = 8;
				}
				else if (userCards[1] == 18)
				{
					userCard2_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 5;
			        user2Health = 3;
			        user2CoinsDropped = 4;
				}
				else if (userCards[1] == 19)
				{
					userCard2_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 2;
			        user2Health = 5;
			        user2CoinsDropped = 3;
				}
				
				
				if (userCards[2] == 0)
				{
				    userCard3_1 = new ImageIcon("resources/images/razer rabbit.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 2;
				    user3Health = 1;
				    user3CoinsDropped = 1;
				}
				else if (userCards[2] == 1)
				{
				    userCard3_1 = new ImageIcon("resources/images/squirrel.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 1;
				    user3Health = 3;
				    user3CoinsDropped = 1;
				}
				else if (userCards[2] == 2)
				{
				    userCard3_1 = new ImageIcon("resources/images/toxicturtle.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 1;
				    user3Health = 5;
				    user3CoinsDropped = 2;
				}
				else if (userCards[2] == 3)
				{
				    userCard3_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 3;
				    user3Health = 3;
				    user3CoinsDropped = 3;
				}
				else if (userCards[2] == 4)
				{
				    userCard3_1 = new ImageIcon("resources/images/raging raccoon.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 4;
				    user3Health = 3;
				    user3CoinsDropped = 4;
				}
				else if (userCards[2] == 5)
				{
				    userCard3_1 = new ImageIcon("resources/images/killer koala.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 1;
				    user3Health = 3;
				    user3CoinsDropped = 2;
				}
				else if (userCards[2] == 6)
				{
				    userCard3_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 1;
				    user3Health = 1;
				    user3CoinsDropped = 1;
				}
				else if (userCards[2] == 7)
				{
				    userCard3_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 2;
				    user3Health = 3;
				    user3CoinsDropped = 2;
				}
				else if (userCards[2] == 8)
				{
				    userCard3_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 2;
				    user3Health = 3;
				    user3CoinsDropped = 3;
				}
				else if (userCards[2] == 9)
				{
				    userCard3_1 = new ImageIcon("resources/images/venemous vulture.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 3;
				    user3Health = 3;
				    user3CoinsDropped = 3;
				}
				else if (userCards[2] == 10)
				{
				    userCard3_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 6;
				    user3Health = 2;
				    user3CoinsDropped = 5;
				}
				else if (userCards[2] == 11)
				{
				    userCard3_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 7;
				    user3Health = 5;
				    user3CoinsDropped = 8;
				}
				else if (userCards[2] == 12)
				{
				    userCard3_1 = new ImageIcon("resources/images/homicide hamster.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 1;
				    user3Health = 1;
				    user3CoinsDropped = 1;
				}
				else if (userCards[2] == 13)
				{
				    userCard3_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 1;
				    user3Health = 3;
				    user3CoinsDropped = 2;
				}
				else if (userCards[2] == 14)
				{
				    userCard3_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 2;
				    user3Health = 4;
				    user3CoinsDropped = 3;
				}
				else if (userCards[2] == 15)
				{
				    userCard3_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 3;
				    user3Health = 4;
				    user3CoinsDropped = 4;
				}
				else if (userCards[2] == 16)
				{
				    userCard3_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 5;
				    user3Health = 2;
				    user3CoinsDropped = 5;
				}
				else if (userCards[2] == 17)
				{
				    userCard3_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 6;
				    user3Health = 6;
				    user3CoinsDropped = 8;
				}
				else if (userCards[2] == 18)
				{
				    userCard3_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 5;
				    user3Health = 3;
				    user3CoinsDropped = 4;
				}
				else if (userCards[2] == 19)
				{
				    userCard3_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 2;
				    user3Health = 5;
				    user3CoinsDropped = 3;
				}
				
				
				if (userCards[3] == 0)
				{
				    userCard4_1 = new ImageIcon("resources/images/razer rabbit.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 2;
				    user4Health = 1;
				    user4CoinsDropped = 1;
				}
				else if (userCards[3] == 1)
				{
				    userCard4_1 = new ImageIcon("resources/images/squirrel.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 1;
				    user4Health = 3;
				    user4CoinsDropped = 1;
				}
				else if (userCards[3] == 2)
				{
				    userCard4_1 = new ImageIcon("resources/images/toxicturtle.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 1;
				    user4Health = 5;
				    user4CoinsDropped = 2;
				}
				else if (userCards[3] == 3)
				{
				    userCard4_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 3;
				    user4Health = 3;
				    user4CoinsDropped = 3;
				}
				else if (userCards[3] == 4)
				{
				    userCard4_1 = new ImageIcon("resources/images/raging raccoon.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 4;
				    user4Health = 3;
				    user4CoinsDropped = 4;
				}
				else if (userCards[3] == 5)
				{
				    userCard4_1 = new ImageIcon("resources/images/killer koala.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 1;
				    user4Health = 3;
				    user4CoinsDropped = 2;
				}
				else if (userCards[3] == 6)
				{
				    userCard4_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 1;
				    user4Health = 1;
				    user4CoinsDropped = 1;
				}
				else if (userCards[3] == 7)
				{
				    userCard4_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 2;
				    user4Health = 3;
				    user4CoinsDropped = 2;
				}
				else if (userCards[3] == 8)
				{
				    userCard4_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 2;
				    user4Health = 3;
				    user4CoinsDropped = 3;
				}
				else if (userCards[3] == 9)
				{
				    userCard4_1 = new ImageIcon("resources/images/venemous vulture.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 3;
				    user4Health = 3;
				    user4CoinsDropped = 3;
				}
				else if (userCards[3] == 10)
				{
				    userCard4_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 6;
				    user4Health = 2;
				    user4CoinsDropped = 5;
				}
				else if (userCards[3] == 11)
				{
				    userCard4_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 7;
				    user4Health = 5;
				    user4CoinsDropped = 8;
				}
				else if (userCards[3] == 12)
				{
				    userCard4_1 = new ImageIcon("resources/images/homicide hamster.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 1;
				    user4Health = 1;
				    user4CoinsDropped = 1;
				}
				else if (userCards[3] == 13)
				{
				    userCard4_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 1;
				    user4Health = 3;
				    user4CoinsDropped = 2;
				}
				else if (userCards[3] == 14)
				{
				    userCard4_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 2;
				    user4Health = 4;
				    user4CoinsDropped = 3;
				}
				else if (userCards[3] == 15)
				{
				    userCard4_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 3;
				    user4Health = 4;
				    user4CoinsDropped = 4;
				}
				else if (userCards[3] == 16)
				{
				    userCard4_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 5;
				    user4Health = 2;
				    user4CoinsDropped = 5;
				}
				else if (userCards[3] == 17)
				{
				    userCard4_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 6;
				    user4Health = 6;
				    user4CoinsDropped = 8;
				}
				else if (userCards[3] == 18)
				{
				    userCard4_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 5;
				    user4Health = 3;
				    user4CoinsDropped = 4;
				}
				else if (userCards[3] == 19)
				{
				    userCard4_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 2;
				    user4Health = 5;
				    user4CoinsDropped = 3;
				}

				
				
				if (userCards[4] == 0)
				{
				    userCard5_1 = new ImageIcon("resources/images/razer rabbit.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 2;
			        user5Health = 1;
			        user5CoinsDropped = 1;
				}
				else if (userCards[4] == 1)
				{
				    userCard5_1 = new ImageIcon("resources/images/squirrel.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 1;
			        user5Health = 3;
			        user5CoinsDropped = 1;
				}
				else if (userCards[4] == 2)
				{
				    userCard5_1 = new ImageIcon("resources/images/toxicturtle.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 1;
			        user5Health = 5;
			        user5CoinsDropped = 2;
				}
				else if (userCards[4] == 3)
				{
				    userCard5_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 3;
			        user5Health = 3;
			        user5CoinsDropped = 3;
				}
				else if (userCards[4] == 4)
				{
				    userCard5_1 = new ImageIcon("resources/images/raging raccoon.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 4;
			        user5Health = 3;
			        user5CoinsDropped = 4;
				}
				else if (userCards[4] == 5)
				{
				    userCard5_1 = new ImageIcon("resources/images/killer koala.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 1;
			        user5Health = 3;
			        user5CoinsDropped = 2;
				}
				else if (userCards[4] == 6)
				{
				    userCard5_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 1;
			        user5Health = 1;
			        user5CoinsDropped = 1;
				}
				else if (userCards[4] == 7)
				{
				    userCard5_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 2;
			        user5Health = 3;
			        user5CoinsDropped = 2;
				}
				else if (userCards[4] == 8)
				{
				    userCard5_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 2;
			        user5Health = 3;
			        user5CoinsDropped = 3;
				}
				else if (userCards[4] == 9)
				{
				    userCard5_1 = new ImageIcon("resources/images/venemous vulture.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 3;
			        user5Health = 3;
			        user5CoinsDropped = 3;
				}
				else if (userCards[4] == 10)
				{
				    userCard5_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 6;
			        user5Health = 2;
			        user5CoinsDropped = 5;
				}
				else if (userCards[4] == 11)
				{
				    userCard5_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 7;
			        user5Health = 5;
			        user5CoinsDropped = 8;
				}
				else if (userCards[4] == 12)
				{
				    userCard5_1 = new ImageIcon("resources/images/homicide hamster.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 1;
			        user5Health = 1;
			        user5CoinsDropped = 1;
				}
				else if (userCards[4] == 13)
				{
				    userCard5_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 1;
			        user5Health = 3;
			        user5CoinsDropped = 2;
				}
				else if (userCards[4] == 14)
				{
				    userCard5_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 2;
			        user5Health = 4;
			        user5CoinsDropped = 3;
				}
				else if (userCards[4] == 15)
				{
				    userCard5_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 3;
			        user5Health = 4;
			        user5CoinsDropped = 4;
				}
				else if (userCards[4] == 16)
				{
				    userCard5_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 5;
			        user5Health = 2;
			        user5CoinsDropped = 5;
				}
				else if (userCards[4] == 17)
				{
				    userCard5_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 6;
			        user5Health = 6;
			        user5CoinsDropped = 8;
				}
				else if (userCards[4] == 18)
				{
				    userCard5_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 5;
			        user5Health = 3;
			        user5CoinsDropped = 4;
				}
				else if (userCards[4] == 19)
				{
				    userCard5_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 2;
			        user5Health = 5;
			        user5CoinsDropped = 3;
				}
				
				
				if (userCards[5] == 0)
				{
				    userCard6_1 = new ImageIcon("resources/images/razer rabbit.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 2;
			        user6Health = 1;
			        user6CoinsDropped = 1;
				}
				else if (userCards[5] == 1)
				{
				    userCard6_1 = new ImageIcon("resources/images/squirrel.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 1;
			        user6Health = 3;
			        user6CoinsDropped = 1;
				}
				else if (userCards[5] == 2)
				{
				    userCard6_1 = new ImageIcon("resources/images/toxicturtle.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 1;
			        user6Health = 5;
			        user6CoinsDropped = 2;
				}
				else if (userCards[5] == 3)
				{
				    userCard6_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 3;
			        user6Health = 3;
			        user6CoinsDropped = 3;
				}
				else if (userCards[5] == 4)
				{
				    userCard6_1 = new ImageIcon("resources/images/raging raccoon.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 4;
			        user6Health = 3;
			        user6CoinsDropped = 4;
				}
				else if (userCards[5] == 5)
				{
				    userCard6_1 = new ImageIcon("resources/images/killer koala.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 1;
			        user6Health = 3;
			        user6CoinsDropped = 2;
				}
				else if (userCards[5] == 6)
				{
				    userCard6_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 1;
			        user6Health = 1;
			        user6CoinsDropped = 1;
				}
				else if (userCards[5] == 7)
				{
				    userCard6_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 2;
			        user6Health = 3;
			        user6CoinsDropped = 2;
				}
				else if (userCards[5] == 8)
				{
				    userCard6_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 2;
			        user6Health = 3;
			        user6CoinsDropped = 3;
				}
				else if (userCards[5] == 9)
				{
				    userCard6_1 = new ImageIcon("resources/images/venemous vulture.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 3;
			        user6Health = 3;
			        user6CoinsDropped = 3;
				}
				else if (userCards[5] == 10)
				{
				    userCard6_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 6;
			        user6Health = 2;
			        user6CoinsDropped = 5;
				}
				else if (userCards[5] == 11)
				{
				    userCard6_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 7;
			        user6Health = 5;
			        user6CoinsDropped = 8;
				}
				else if (userCards[5] == 12)
				{
				    userCard6_1 = new ImageIcon("resources/images/homicide hamster.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 1;
			        user6Health = 1;
			        user6CoinsDropped = 1;
				}
				else if (userCards[5] == 13)
				{
				    userCard6_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 1;
			        user6Health = 3;
			        user6CoinsDropped = 2;
				}
				else if (userCards[5] == 14)
				{
				    userCard6_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 2;
			        user6Health = 4;
			        user6CoinsDropped = 3;
				}
				else if (userCards[5] == 15)
				{
				    userCard6_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 3;
			        user6Health = 4;
			        user6CoinsDropped = 4;
				}
				else if (userCards[5] == 16)
				{
				    userCard6_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 5;
			        user6Health = 2;
			        user6CoinsDropped = 5;
				}
				else if (userCards[5] == 17)
				{
				    userCard6_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 6;
			        user6Health = 6;
			        user6CoinsDropped = 8;
				}
				else if (userCards[5] == 18)
				{
				    userCard6_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 5;
			        user6Health = 3;
			        user6CoinsDropped = 4;
				}
				else if (userCards[5] == 19)
				{
				    userCard6_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 2;
			        user6Health = 5;
			        user6CoinsDropped = 3;
				}

				
				if (userCards[6] == 0)
				{
				    userCard7_1 = new ImageIcon("resources/images/razer rabbit.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 2;
			        user7Health = 1;
			        user7CoinsDropped = 1;
				}
				else if (userCards[6] == 1)
				{
				    userCard7_1 = new ImageIcon("resources/images/squirrel.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 1;
			        user7Health = 3;
			        user7CoinsDropped = 1;
				}
				else if (userCards[6] == 2)
				{
				    userCard7_1 = new ImageIcon("resources/images/toxicturtle.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 1;
			        user7Health = 5;
			        user7CoinsDropped = 2;
				}
				else if (userCards[6] == 3)
				{
				    userCard7_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 3;
			        user7Health = 3;
			        user7CoinsDropped = 3;
				}
				else if (userCards[6] == 4)
				{
				    userCard7_1 = new ImageIcon("resources/images/raging raccoon.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 4;
			        user7Health = 3;
			        user7CoinsDropped = 4;
				}
				else if (userCards[6] == 5)
				{
				    userCard7_1 = new ImageIcon("resources/images/killer koala.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 1;
			        user7Health = 3;
			        user7CoinsDropped = 2;
				}
				else if (userCards[6] == 6)
				{
				    userCard7_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 1;
			        user7Health = 1;
			        user7CoinsDropped = 1;
				}
				else if (userCards[6] == 7)
				{
				    userCard7_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 2;
			        user7Health = 3;
			        user7CoinsDropped = 2;
				}
				else if (userCards[6] == 8)
				{
				    userCard7_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 2;
			        user7Health = 3;
			        user7CoinsDropped = 3;
				}
				else if (userCards[6] == 9)
				{
				    userCard7_1 = new ImageIcon("resources/images/venemous vulture.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 3;
			        user7Health = 3;
			        user7CoinsDropped = 3;
				}
				else if (userCards[6] == 10)
				{
				    userCard7_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 6;
			        user7Health = 2;
			        user7CoinsDropped = 5;
				}
				else if (userCards[6] == 11)
				{
				    userCard7_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 7;
			        user7Health = 5;
			        user7CoinsDropped = 8;
				}
				else if (userCards[6] == 12)
				{
				    userCard7_1 = new ImageIcon("resources/images/homicide hamster.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 1;
			        user7Health = 1;
			        user7CoinsDropped = 1;
				}
				else if (userCards[6] == 13)
				{
				    userCard7_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 1;
			        user7Health = 3;
			        user7CoinsDropped = 2;
				}
				else if (userCards[6] == 14)
				{
				    userCard7_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 2;
			        user7Health = 4;
			        user7CoinsDropped = 3;
				}
				else if (userCards[6] == 15)
				{
				    userCard7_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 3;
			        user7Health = 4;
			        user7CoinsDropped = 4;
				}
				else if (userCards[6] == 16)
				{
				    userCard7_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 5;
			        user7Health = 2;
			        user7CoinsDropped = 5;
				}
				else if (userCards[6] == 17)
				{
				    userCard7_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 6;
			        user7Health = 6;
			        user7CoinsDropped = 8;
				}
				else if (userCards[6] == 18)
				{
				    userCard7_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 5;
			        user7Health = 3;
			        user7CoinsDropped = 4;
				}
				else if (userCards[6] == 19)
				{
				    userCard7_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 2;
			        user7Health = 5;
			        user7CoinsDropped = 3;
				}
				
				
				if (userCards[7] == 0)
				{
				    userCard8_1 = new ImageIcon("resources/images/razer rabbit.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 2;
			        user8Health = 1;
			        user8CoinsDropped = 1;
				}
				else if (userCards[7] == 1)
				{
				    userCard8_1 = new ImageIcon("resources/images/squirrel.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 1;
			        user8Health = 3;
			        user8CoinsDropped = 1;
				}
				else if (userCards[7] == 2)
				{
				    userCard8_1 = new ImageIcon("resources/images/toxicturtle.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 1;
			        user8Health = 5;
			        user8CoinsDropped = 2;
				}
				else if (userCards[7] == 3)
				{
				    userCard8_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 3;
			        user8Health = 3;
			        user8CoinsDropped = 3;
				}
				else if (userCards[7] == 4)
				{
				    userCard8_1 = new ImageIcon("resources/images/raging raccoon.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 4;
			        user8Health = 3;
			        user8CoinsDropped = 4;
				}
				else if (userCards[7] == 5)
				{
				    userCard8_1 = new ImageIcon("resources/images/killer koala.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 1;
			        user8Health = 3;
			        user8CoinsDropped = 2;
				}
				else if (userCards[7] == 6)
				{
				    userCard8_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 1;
			        user8Health = 1;
			        user8CoinsDropped = 1;
				}
				else if (userCards[7] == 7)
				{
				    userCard8_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 2;
			        user8Health = 3;
			        user8CoinsDropped = 2;
				}
				else if (userCards[7] == 8)
				{
				    userCard8_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 2;
			        user8Health = 3;
			        user8CoinsDropped = 3;
				}
				else if (userCards[7] == 9)
				{
				    userCard8_1 = new ImageIcon("resources/images/venemous vulture.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 3;
			        user8Health = 3;
			        user8CoinsDropped = 3;
				}
				else if (userCards[7] == 10)
				{
				    userCard8_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 6;
			        user8Health = 2;
			        user8CoinsDropped = 5;
				}
				else if (userCards[7] == 11)
				{
				    userCard8_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 7;
			        user8Health = 5;
			        user8CoinsDropped = 8;
				}
				else if (userCards[7] == 12)
				{
				    userCard8_1 = new ImageIcon("resources/images/homicide hamster.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 1;
			        user8Health = 1;
			        user8CoinsDropped = 1;
				}
				else if (userCards[7] == 13)
				{
				    userCard8_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 1;
			        user8Health = 3;
			        user8CoinsDropped = 2;
				}
				else if (userCards[7] == 14)
				{
				    userCard8_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 2;
			        user8Health = 4;
			        user8CoinsDropped = 3;
				}
				else if (userCards[7] == 15)
				{
				    userCard8_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 3;
			        user8Health = 4;
			        user8CoinsDropped = 4;
				}
				else if (userCards[7] == 16)
				{
				    userCard8_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 5;
			        user8Health = 2;
			        user8CoinsDropped = 5;
				}
				else if (userCards[7] == 17)
				{
				    userCard8_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 6;
			        user8Health = 6;
			        user8CoinsDropped = 8;
				}
				else if (userCards[7] == 18)
				{
				    userCard8_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 5;
			        user8Health = 3;
			        user8CoinsDropped = 4;
				}
				else if (userCards[7] == 19)
				{
				    userCard8_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 2;
			        user8Health = 5;
			        user8CoinsDropped = 3;
				}
				
				
				// AI Portion
				
				if (aiCards[0] == 0)
				{
				    aiCard1_1 = new ImageIcon("resources/images/razer rabbit.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 2;
				    ai1Health = 1;
				    ai1CoinsDropped = 1;
				}
				else if (aiCards[0] == 1)
				{
				    aiCard1_1 = new ImageIcon("resources/images/squirrel.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 1;
				    ai1Health = 3;
				    ai1CoinsDropped = 1;
				}
				else if (aiCards[0] == 2)
				{
				    aiCard1_1 = new ImageIcon("resources/images/toxicturtle.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 1;
				    ai1Health = 5;
				    ai1CoinsDropped = 2;
				}
				else if (aiCards[0] == 3)
				{
				    aiCard1_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 3;
				    ai1Health = 3;
				    ai1CoinsDropped = 3;
				}
				else if (aiCards[0] == 4)
				{
				    aiCard1_1 = new ImageIcon("resources/images/raging raccoon.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 4;
				    ai1Health = 3;
				    ai1CoinsDropped = 4;
				}
				else if (aiCards[0] == 5)
				{
				    aiCard1_1 = new ImageIcon("resources/images/killer koala.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 1;
				    ai1Health = 3;
				    ai1CoinsDropped = 2;
				}
				else if (aiCards[0] == 6)
				{
				    aiCard1_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 1;
				    ai1Health = 1;
				    ai1CoinsDropped = 1;
				}
				else if (aiCards[0] == 7)
				{
				    aiCard1_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 2;
				    ai1Health = 3;
				    ai1CoinsDropped = 2;
				}
				else if (aiCards[0] == 8)
				{
				    aiCard1_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 2;
				    ai1Health = 3;
				    ai1CoinsDropped = 3;
				}
				else if (aiCards[0] == 9)
				{
				    aiCard1_1 = new ImageIcon("resources/images/venemous vulture.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 3;
				    ai1Health = 3;
				    ai1CoinsDropped = 3;
				}
				else if (aiCards[0] == 10)
				{
				    aiCard1_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 6;
				    ai1Health = 2;
				    ai1CoinsDropped = 5;
				}
				else if (aiCards[0] == 11)
				{
				    aiCard1_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 7;
				    ai1Health = 5;
				    ai1CoinsDropped = 8;
				}
				else if (aiCards[0] == 12)
				{
				    aiCard1_1 = new ImageIcon("resources/images/homicide hamster.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 1;
				    ai1Health = 1;
				    ai1CoinsDropped = 1;
				}
				else if (aiCards[0] == 13)
				{
				    aiCard1_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 1;
				    ai1Health = 3;
				    ai1CoinsDropped = 2;
				}
				else if (aiCards[0] == 14)
				{
				    aiCard1_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 2;
				    ai1Health = 4;
				    ai1CoinsDropped = 3;
				}
				else if (aiCards[0] == 15)
				{
				    aiCard1_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 3;
				    ai1Health = 4;
				    ai1CoinsDropped = 4;
				}
				else if (aiCards[0] == 16)
				{
				    aiCard1_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 5;
				    ai1Health = 2;
				    ai1CoinsDropped = 5;
				}
				else if (aiCards[0] == 17)
				{
				    aiCard1_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 6;
				    ai1Health = 6;
				    ai1CoinsDropped = 8;
				}
				else if (aiCards[0] == 18)
				{
				    aiCard1_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 5;
				    ai1Health = 3;
				    ai1CoinsDropped = 4;
				}
				else if (aiCards[0] == 19)
				{
				    aiCard1_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 2;
				    ai1Health = 5;
				    ai1CoinsDropped = 3;
				}

				
				if (aiCards[1] == 0)
				{
				    aiCard2_1 = new ImageIcon("resources/images/razer rabbit.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 2;
				    ai2Health = 1;
				    ai2CoinsDropped = 1;
				}
				else if (aiCards[1] == 1)
				{
				    aiCard2_1 = new ImageIcon("resources/images/squirrel.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 1;
				    ai2Health = 3;
				    ai2CoinsDropped = 1;
				}
				else if (aiCards[1] == 2)
				{
				    aiCard2_1 = new ImageIcon("resources/images/toxicturtle.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 1;
				    ai2Health = 5;
				    ai2CoinsDropped = 2;
				}
				else if (aiCards[1] == 3)
				{
				    aiCard2_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 3;
				    ai2Health = 3;
				    ai2CoinsDropped = 3;
				}
				else if (aiCards[1] == 4)
				{
				    aiCard2_1 = new ImageIcon("resources/images/raging raccoon.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 4;
				    ai2Health = 3;
				    ai2CoinsDropped = 4;
				}
				else if (aiCards[1] == 5)
				{
				    aiCard2_1 = new ImageIcon("resources/images/killer koala.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 1;
				    ai2Health = 3;
				    ai2CoinsDropped = 2;
				}
				else if (aiCards[1] == 6)
				{
				    aiCard2_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 1;
				    ai2Health = 1;
				    ai2CoinsDropped = 1;
				}
				else if (aiCards[1] == 7)
				{
				    aiCard2_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 2;
				    ai2Health = 3;
				    ai2CoinsDropped = 2;
				}
				else if (aiCards[1] == 8)
				{
				    aiCard2_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 2;
				    ai2Health = 3;
				    ai2CoinsDropped = 3;
				}
				else if (aiCards[1] == 9)
				{
				    aiCard2_1 = new ImageIcon("resources/images/venemous vulture.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 3;
				    ai2Health = 3;
				    ai2CoinsDropped = 3;
				}
				else if (aiCards[1] == 10)
				{
				    aiCard2_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 6;
				    ai2Health = 2;
				    ai2CoinsDropped = 5;
				}
				else if (aiCards[1] == 11)
				{
				    aiCard2_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 7;
				    ai2Health = 5;
				    ai2CoinsDropped = 8;
				}
				else if (aiCards[1] == 12)
				{
				    aiCard2_1 = new ImageIcon("resources/images/homicide hamster.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 1;
				    ai2Health = 1;
				    ai2CoinsDropped = 1;
				}
				else if (aiCards[1] == 13)
				{
				    aiCard2_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 1;
				    ai2Health = 3;
				    ai2CoinsDropped = 2;
				}
				else if (aiCards[1] == 14)
				{
				    aiCard2_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 2;
				    ai2Health = 4;
				    ai2CoinsDropped = 3;
				}
				else if (aiCards[1] == 15)
				{
				    aiCard2_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 3;
				    ai2Health = 4;
				    ai2CoinsDropped = 4;
				}
				else if (aiCards[1] == 16)
				{
				    aiCard2_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 5;
				    ai2Health = 2;
				    ai2CoinsDropped = 5;
				}
				else if (aiCards[1] == 17)
				{
				    aiCard2_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 6;
				    ai2Health = 6;
				    ai2CoinsDropped = 8;
				}
				else if (aiCards[1] == 18)
				{
				    aiCard2_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 5;
				    ai2Health = 3;
				    ai2CoinsDropped = 4;
				}
				else if (aiCards[1] == 19)
				{
				    aiCard2_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 2;
				    ai2Health = 5;
				    ai2CoinsDropped = 3;
				}

				
				if (aiCards[2] == 0)
				{
				    aiCard3_1 = new ImageIcon("resources/images/razer rabbit.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 2;
				    ai3Health = 1;
				    ai3CoinsDropped = 1;
				}
				else if (aiCards[2] == 1)
				{
				    aiCard3_1 = new ImageIcon("resources/images/squirrel.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 1;
				    ai3Health = 3;
				    ai3CoinsDropped = 1;
				}
				else if (aiCards[2] == 2)
				{
				    aiCard3_1 = new ImageIcon("resources/images/toxicturtle.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 1;
				    ai3Health = 5;
				    ai3CoinsDropped = 2;
				}
				else if (aiCards[2] == 3)
				{
				    aiCard3_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 3;
				    ai3Health = 3;
				    ai3CoinsDropped = 3;
				}
				else if (aiCards[2] == 4)
				{
				    aiCard3_1 = new ImageIcon("resources/images/raging raccoon.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 4;
				    ai3Health = 3;
				    ai3CoinsDropped = 4;
				}
				else if (aiCards[2] == 5)
				{
				    aiCard3_1 = new ImageIcon("resources/images/killer koala.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 1;
				    ai3Health = 3;
				    ai3CoinsDropped = 2;
				}
				else if (aiCards[2] == 6)
				{
				    aiCard3_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 1;
				    ai3Health = 1;
				    ai3CoinsDropped = 1;
				}
				else if (aiCards[2] == 7)
				{
				    aiCard3_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 2;
				    ai3Health = 3;
				    ai3CoinsDropped = 2;
				}
				else if (aiCards[2] == 8)
				{
				    aiCard3_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 2;
				    ai3Health = 3;
				    ai3CoinsDropped = 3;
				}
				else if (aiCards[2] == 9)
				{
				    aiCard3_1 = new ImageIcon("resources/images/venemous vulture.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 3;
				    ai3Health = 3;
				    ai3CoinsDropped = 3;
				}
				else if (aiCards[2] == 10)
				{
				    aiCard3_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 6;
				    ai3Health = 2;
				    ai3CoinsDropped = 5;
				}
				else if (aiCards[2] == 11)
				{
				    aiCard3_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 7;
				    ai3Health = 5;
				    ai3CoinsDropped = 8;
				}
				else if (aiCards[2] == 12)
				{
				    aiCard3_1 = new ImageIcon("resources/images/homicide hamster.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 1;
				    ai3Health = 1;
				    ai3CoinsDropped = 1;
				}
				else if (aiCards[2] == 13)
				{
				    aiCard3_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 1;
				    ai3Health = 3;
				    ai3CoinsDropped = 2;
				}
				else if (aiCards[2] == 14)
				{
				    aiCard3_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 2;
				    ai3Health = 4;
				    ai3CoinsDropped = 3;
				}
				else if (aiCards[2] == 15)
				{
				    aiCard3_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 3;
				    ai3Health = 4;
				    ai3CoinsDropped = 4;
				}
				else if (aiCards[2] == 16)
				{
				    aiCard3_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 5;
				    ai3Health = 2;
				    ai3CoinsDropped = 5;
				}
				else if (aiCards[2] == 17)
				{
				    aiCard3_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 6;
				    ai3Health = 6;
				    ai3CoinsDropped = 8;
				}
				else if (aiCards[2] == 18)
				{
				    aiCard3_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 5;
				    ai3Health = 3;
				    ai3CoinsDropped = 4;
				}
				else if (aiCards[2] == 19)
				{
				    aiCard3_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 2;
				    ai3Health = 5;
				    ai3CoinsDropped = 3;
				}

				
				
				if (aiCards[3] == 0)
				{
				    aiCard4_1 = new ImageIcon("resources/images/razer rabbit.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 2;
				    ai4Health = 1;
				    ai4CoinsDropped = 1;
				}
				else if (aiCards[3] == 1)
				{
				    aiCard4_1 = new ImageIcon("resources/images/squirrel.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 1;
				    ai4Health = 3;
				    ai4CoinsDropped = 1;
				}
				else if (aiCards[3] == 2)
				{
				    aiCard4_1 = new ImageIcon("resources/images/toxicturtle.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 1;
				    ai4Health = 5;
				    ai4CoinsDropped = 2;
				}
				else if (aiCards[3] == 3)
				{
				    aiCard4_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 3;
				    ai4Health = 3;
				    ai4CoinsDropped = 3;
				}
				else if (aiCards[3] == 4)
				{
				    aiCard4_1 = new ImageIcon("resources/images/raging raccoon.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 4;
				    ai4Health = 3;
				    ai4CoinsDropped = 4;
				}
				else if (aiCards[3] == 5)
				{
				    aiCard4_1 = new ImageIcon("resources/images/killer koala.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 1;
				    ai4Health = 3;
				    ai4CoinsDropped = 2;
				}
				else if (aiCards[3] == 6)
				{
				    aiCard4_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 1;
				    ai4Health = 1;
				    ai4CoinsDropped = 1;
				}
				else if (aiCards[3] == 7)
				{
				    aiCard4_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 2;
				    ai4Health = 3;
				    ai4CoinsDropped = 2;
				}
				else if (aiCards[3] == 8)
				{
				    aiCard4_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 2;
				    ai4Health = 3;
				    ai4CoinsDropped = 3;
				}
				else if (aiCards[3] == 9)
				{
				    aiCard4_1 = new ImageIcon("resources/images/venemous vulture.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 3;
				    ai4Health = 3;
				    ai4CoinsDropped = 3;
				}
				else if (aiCards[3] == 10)
				{
				    aiCard4_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 6;
				    ai4Health = 2;
				    ai4CoinsDropped = 5;
				}
				else if (aiCards[3] == 11)
				{
				    aiCard4_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 7;
				    ai4Health = 5;
				    ai4CoinsDropped = 8;
				}
				else if (aiCards[3] == 12)
				{
				    aiCard4_1 = new ImageIcon("resources/images/homicide hamster.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 1;
				    ai4Health = 1;
				    ai4CoinsDropped = 1;
				}
				else if (aiCards[3] == 13)
				{
				    aiCard4_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 1;
				    ai4Health = 3;
				    ai4CoinsDropped = 2;
				}
				else if (aiCards[3] == 14)
				{
				    aiCard4_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 2;
				    ai4Health = 4;
				    ai4CoinsDropped = 3;
				}
				else if (aiCards[3] == 15)
				{
				    aiCard4_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 3;
				    ai4Health = 4;
				    ai4CoinsDropped = 4;
				}
				else if (aiCards[3] == 16)
				{
				    aiCard4_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 5;
				    ai4Health = 2;
				    ai4CoinsDropped = 5;
				}
				else if (aiCards[3] == 17)
				{
				    aiCard4_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 6;
				    ai4Health = 6;
				    ai4CoinsDropped = 8;
				}
				else if (aiCards[3] == 18)
				{
				    aiCard4_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 5;
				    ai4Health = 3;
				    ai4CoinsDropped = 4;
				}
				else if (aiCards[3] == 19)
				{
				    aiCard4_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 2;
				    ai4Health = 5;
				    ai4CoinsDropped = 3;
				}
				
				
				if (aiCards[4] == 0)
				{
				    aiCard5_1 = new ImageIcon("resources/images/razer rabbit.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 2;
				    ai5Health = 1;
				    ai5CoinsDropped = 1;
				}
				else if (aiCards[4] == 1)
				{
				    aiCard5_1 = new ImageIcon("resources/images/squirrel.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 1;
				    ai5Health = 3;
				    ai5CoinsDropped = 1;
				}
				else if (aiCards[4] == 2)
				{
				    aiCard5_1 = new ImageIcon("resources/images/toxicturtle.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 1;
				    ai5Health = 5;
				    ai5CoinsDropped = 2;
				}
				else if (aiCards[4] == 3)
				{
				    aiCard5_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 3;
				    ai5Health = 3;
				    ai5CoinsDropped = 3;
				}
				else if (aiCards[4] == 4)
				{
				    aiCard5_1 = new ImageIcon("resources/images/raging raccoon.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 4;
				    ai5Health = 3;
				    ai5CoinsDropped = 4;
				}
				else if (aiCards[4] == 5)
				{
				    aiCard5_1 = new ImageIcon("resources/images/killer koala.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 1;
				    ai5Health = 3;
				    ai5CoinsDropped = 2;
				}
				else if (aiCards[4] == 6)
				{
				    aiCard5_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 1;
				    ai5Health = 1;
				    ai5CoinsDropped = 1;
				}
				else if (aiCards[4] == 7)
				{
				    aiCard5_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 2;
				    ai5Health = 3;
				    ai5CoinsDropped = 2;
				}
				else if (aiCards[4] == 8)
				{
				    aiCard5_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 2;
				    ai5Health = 3;
				    ai5CoinsDropped = 3;
				}
				else if (aiCards[4] == 9)
				{
				    aiCard5_1 = new ImageIcon("resources/images/venemous vulture.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 3;
				    ai5Health = 3;
				    ai5CoinsDropped = 3;
				}
				else if (aiCards[4] == 10)
				{
				    aiCard5_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 6;
				    ai5Health = 2;
				    ai5CoinsDropped = 5;
				}
				else if (aiCards[4] == 11)
				{
				    aiCard5_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 7;
				    ai5Health = 5;
				    ai5CoinsDropped = 8;
				}
				else if (aiCards[4] == 12)
				{
				    aiCard5_1 = new ImageIcon("resources/images/homicide hamster.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 1;
				    ai5Health = 1;
				    ai5CoinsDropped = 1;
				}
				else if (aiCards[4] == 13)
				{
				    aiCard5_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 1;
				    ai5Health = 3;
				    ai5CoinsDropped = 2;
				}
				else if (aiCards[4] == 14)
				{
				    aiCard5_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 2;
				    ai5Health = 4;
				    ai5CoinsDropped = 3;
				}
				else if (aiCards[4] == 15)
				{
				    aiCard5_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 3;
				    ai5Health = 4;
				    ai5CoinsDropped = 4;
				}
				else if (aiCards[4] == 16)
				{
				    aiCard5_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 5;
				    ai5Health = 2;
				    ai5CoinsDropped = 5;
				}
				else if (aiCards[4] == 17)
				{
				    aiCard5_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 6;
				    ai5Health = 6;
				    ai5CoinsDropped = 8;
				}
				else if (aiCards[4] == 18)
				{
				    aiCard5_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 5;
				    ai5Health = 3;
				    ai5CoinsDropped = 4;
				}
				else if (aiCards[4] == 19)
				{
				    aiCard5_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 2;
				    ai5Health = 5;
				    ai5CoinsDropped = 3;
				}
				
				
				if (aiCards[5] == 0)
				{
				    aiCard6_1 = new ImageIcon("resources/images/razer rabbit.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 2;
				    ai6Health = 1;
				    ai6CoinsDropped = 1;
				}
				else if (aiCards[5] == 1)
				{
				    aiCard6_1 = new ImageIcon("resources/images/squirrel.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 1;
				    ai6Health = 3;
				    ai6CoinsDropped = 1;
				}
				else if (aiCards[5] == 2)
				{
				    aiCard6_1 = new ImageIcon("resources/images/toxicturtle.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 1;
				    ai6Health = 5;
				    ai6CoinsDropped = 2;
				}
				else if (aiCards[5] == 3)
				{
				    aiCard6_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 3;
				    ai6Health = 3;
				    ai6CoinsDropped = 3;
				}
				else if (aiCards[5] == 4)
				{
				    aiCard6_1 = new ImageIcon("resources/images/raging raccoon.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 4;
				    ai6Health = 3;
				    ai6CoinsDropped = 4;
				}
				else if (aiCards[5] == 5)
				{
				    aiCard6_1 = new ImageIcon("resources/images/killer koala.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 1;
				    ai6Health = 3;
				    ai6CoinsDropped = 2;
				}
				else if (aiCards[5] == 6)
				{
				    aiCard6_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 1;
				    ai6Health = 1;
				    ai6CoinsDropped = 1;
				}
				else if (aiCards[5] == 7)
				{
				    aiCard6_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 2;
				    ai6Health = 3;
				    ai6CoinsDropped = 2;
				}
				else if (aiCards[5] == 8)
				{
				    aiCard6_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 2;
				    ai6Health = 3;
				    ai6CoinsDropped = 3;
				}
				else if (aiCards[5] == 9)
				{
				    aiCard6_1 = new ImageIcon("resources/images/venemous vulture.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 3;
				    ai6Health = 3;
				    ai6CoinsDropped = 3;
				}
				else if (aiCards[5] == 10)
				{
				    aiCard6_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 6;
				    ai6Health = 2;
				    ai6CoinsDropped = 5;
				}
				else if (aiCards[5] == 11)
				{
				    aiCard6_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 7;
				    ai6Health = 5;
				    ai6CoinsDropped = 8;
				}
				else if (aiCards[5] == 12)
				{
				    aiCard6_1 = new ImageIcon("resources/images/homicide hamster.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 1;
				    ai6Health = 1;
				    ai6CoinsDropped = 1;
				}
				else if (aiCards[5] == 13)
				{
				    aiCard6_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 1;
				    ai6Health = 3;
				    ai6CoinsDropped = 2;
				}
				else if (aiCards[5] == 14)
				{
				    aiCard6_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 2;
				    ai6Health = 4;
				    ai6CoinsDropped = 3;
				}
				else if (aiCards[5] == 15)
				{
				    aiCard6_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 3;
				    ai6Health = 4;
				    ai6CoinsDropped = 4;
				}
				else if (aiCards[5] == 16)
				{
				    aiCard6_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 5;
				    ai6Health = 2;
				    ai6CoinsDropped = 5;
				}
				else if (aiCards[5] == 17)
				{
				    aiCard6_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 6;
				    ai6Health = 6;
				    ai6CoinsDropped = 8;
				}
				else if (aiCards[5] == 18)
				{
				    aiCard6_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 5;
				    ai6Health = 3;
				    ai6CoinsDropped = 4;
				}
				else if (aiCards[5] == 19)
				{
				    aiCard6_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 2;
				    ai6Health = 5;
				    ai6CoinsDropped = 3;
				}
				
				
				if (aiCards[6] == 0)
				{
				    aiCard7_1 = new ImageIcon("resources/images/razer rabbit.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 2;
				    ai7Health = 1;
				    ai7CoinsDropped = 1;
				}
				else if (aiCards[6] == 1)
				{
				    aiCard7_1 = new ImageIcon("resources/images/squirrel.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 1;
				    ai7Health = 3;
				    ai7CoinsDropped = 1;
				}
				else if (aiCards[6] == 2)
				{
				    aiCard7_1 = new ImageIcon("resources/images/toxicturtle.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 1;
				    ai7Health = 5;
				    ai7CoinsDropped = 2;
				}
				else if (aiCards[6] == 3)
				{
				    aiCard7_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 3;
				    ai7Health = 3;
				    ai7CoinsDropped = 3;
				}
				else if (aiCards[6] == 4)
				{
				    aiCard7_1 = new ImageIcon("resources/images/raging raccoon.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 4;
				    ai7Health = 3;
				    ai7CoinsDropped = 4;
				}
				else if (aiCards[6] == 5)
				{
				    aiCard7_1 = new ImageIcon("resources/images/killer koala.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 1;
				    ai7Health = 3;
				    ai7CoinsDropped = 2;
				}
				else if (aiCards[6] == 6)
				{
				    aiCard7_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 1;
				    ai7Health = 1;
				    ai7CoinsDropped = 1;
				}
				else if (aiCards[6] == 7)
				{
				    aiCard7_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 2;
				    ai7Health = 3;
				    ai7CoinsDropped = 2;
				}
				else if (aiCards[6] == 8)
				{
				    aiCard7_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 2;
				    ai7Health = 3;
				    ai7CoinsDropped = 3;
				}
				else if (aiCards[6] == 9)
				{
				    aiCard7_1 = new ImageIcon("resources/images/venemous vulture.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 3;
				    ai7Health = 3;
				    ai7CoinsDropped = 3;
				}
				else if (aiCards[6] == 10)
				{
				    aiCard7_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 6;
				    ai7Health = 2;
				    ai7CoinsDropped = 5;
				}
				else if (aiCards[6] == 11)
				{
				    aiCard7_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 7;
				    ai7Health = 5;
				    ai7CoinsDropped = 8;
				}
				else if (aiCards[6] == 12)
				{
				    aiCard7_1 = new ImageIcon("resources/images/homicide hamster.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 1;
				    ai7Health = 1;
				    ai7CoinsDropped = 1;
				}
				else if (aiCards[6] == 13)
				{
				    aiCard7_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 1;
				    ai7Health = 3;
				    ai7CoinsDropped = 2;
				}
				else if (aiCards[6] == 14)
				{
				    aiCard7_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 2;
				    ai7Health = 4;
				    ai7CoinsDropped = 3;
				}
				else if (aiCards[6] == 15)
				{
				    aiCard7_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 3;
				    ai7Health = 4;
				    ai7CoinsDropped = 4;
				}
				else if (aiCards[6] == 16)
				{
				    aiCard7_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 5;
				    ai7Health = 2;
				    ai7CoinsDropped = 5;
				}
				else if (aiCards[6] == 17)
				{
				    aiCard7_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 6;
				    ai7Health = 6;
				    ai7CoinsDropped = 8;
				}
				else if (aiCards[6] == 18)
				{
				    aiCard7_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 5;
				    ai7Health = 3;
				    ai7CoinsDropped = 4;
				}
				else if (aiCards[6] == 19)
				{
				    aiCard7_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 2;
				    ai7Health = 5;
				    ai7CoinsDropped = 3;
				}
				
				
				if (aiCards[7] == 0)
				{
				    aiCard8_1 = new ImageIcon("resources/images/razer rabbit.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 2;
				    ai8Health = 1;
				    ai8CoinsDropped = 1;
				}
				else if (aiCards[7] == 1)
				{
				    aiCard8_1 = new ImageIcon("resources/images/squirrel.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 1;
				    ai8Health = 3;
				    ai8CoinsDropped = 1;
				}
				else if (aiCards[7] == 2)
				{
				    aiCard8_1 = new ImageIcon("resources/images/toxicturtle.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 1;
				    ai8Health = 5;
				    ai8CoinsDropped = 2;
				}
				else if (aiCards[7] == 3)
				{
				    aiCard8_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 3;
				    ai8Health = 3;
				    ai8CoinsDropped = 3;
				}
				else if (aiCards[7] == 4)
				{
				    aiCard8_1 = new ImageIcon("resources/images/raging raccoon.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 4;
				    ai8Health = 3;
				    ai8CoinsDropped = 4;
				}
				else if (aiCards[7] == 5)
				{
				    aiCard8_1 = new ImageIcon("resources/images/killer koala.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 1;
				    ai8Health = 3;
				    ai8CoinsDropped = 2;
				}
				else if (aiCards[7] == 6)
				{
				    aiCard8_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 1;
				    ai8Health = 1;
				    ai8CoinsDropped = 1;
				}
				else if (aiCards[7] == 7)
				{
				    aiCard8_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 2;
				    ai8Health = 3;
				    ai8CoinsDropped = 2;
				}
				else if (aiCards[7] == 8)
				{
				    aiCard8_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 2;
				    ai8Health = 3;
				    ai8CoinsDropped = 3;
				}
				else if (aiCards[7] == 9)
				{
				    aiCard8_1 = new ImageIcon("resources/images/venemous vulture.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 3;
				    ai8Health = 3;
				    ai8CoinsDropped = 3;
				}
				else if (aiCards[7] == 10)
				{
				    aiCard8_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 6;
				    ai8Health = 2;
				    ai8CoinsDropped = 5;
				}
				else if (aiCards[7] == 11)
				{
				    aiCard8_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 7;
				    ai8Health = 5;
				    ai8CoinsDropped = 8;
				}
				else if (aiCards[7] == 12)
				{
				    aiCard8_1 = new ImageIcon("resources/images/homicide hamster.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 1;
				    ai8Health = 1;
				    ai8CoinsDropped = 1;
				}
				else if (aiCards[7] == 13)
				{
				    aiCard8_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 1;
				    ai8Health = 3;
				    ai8CoinsDropped = 2;
				}
				else if (aiCards[7] == 14)
				{
				    aiCard8_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 2;
				    ai8Health = 4;
				    ai8CoinsDropped = 3;
				}
				else if (aiCards[7] == 15)
				{
				    aiCard8_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 3;
				    ai8Health = 4;
				    ai8CoinsDropped = 4;
				}
				else if (aiCards[7] == 16)
				{
				    aiCard8_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 5;
				    ai8Health = 2;
				    ai8CoinsDropped = 5;
				}
				else if (aiCards[7] == 17)
				{
				    aiCard8_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 6;
				    ai8Health = 6;
				    ai8CoinsDropped = 8;
				}
				else if (aiCards[7] == 18)
				{
				    aiCard8_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 5;
				    ai8Health = 3;
				    ai8CoinsDropped = 4;
				}
				else if (aiCards[7] == 19)
				{
				    aiCard8_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 2;
				    ai8Health = 5;
				    ai8CoinsDropped = 3;
				}
				
			}
		});
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 1400, 800);
		frame.setVisible(true);
	}
}

	
