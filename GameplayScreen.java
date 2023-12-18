import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.*;
import java.util.Collections;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.*;
import java.awt.*;

import javax.swing.border.EmptyBorder;

public class GameplayScreen{
	
	static JButton userAbility;
	static JButton selectAbility1;
	static int finalResult1;
	static int finalResult2;
	static int finalResult3;
	static int tier;
	static boolean ba4Used;
	static boolean ba5Used;
	static boolean ba6Used;
	
	static int user1Tier;
	static int user2Tier;
	static int user3Tier;
	static int user4Tier;
	static int user5Tier;
	static int user6Tier;
	static int user7Tier;
	static int user8Tier;
	static int ai1Tier;
	static int ai2Tier;
	static int ai3Tier;
	static int ai4Tier;
	static int ai5Tier;
	static int ai6Tier;
	static int ai7Tier;
	static int ai8Tier;
	
	
	static int totalAiCards = 8;
	static int aiCardsUsed = 0;
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
	
	static ImageIcon abilityCard1_1;
	
	static int check1;
	static int check2;
	static int check3;
	static int health;
	static int attack;
	static String name;
	static int coinsDropped;
	static int health2;
	static int attack2;
	static int coinsDropped2;
	static String name2;
	static int newAiHealth;
	static JTextArea actionHistory;
	static int userCoins;
	static int aiCoins;
	static int numberOfTurns;
	
    static Timer timer; // Timer as a class member
    static int secondsRemaining;
    static JLabel timerLabel; // Assuming you have a JLabel for displaying the timer
    static Timer countdownTimer;
    static Timer aiTimer1;
    
    static JLabel timerLabel2;
    static int delay; 
    static userCard baCardsArray [] = new userCard [3];
    static aiCard baCardsArray2 [] = new aiCard [3];

	static JFrame frame;
	
	static boolean ba1Used;
	static boolean ba2Used;
	static boolean ba3Used;
	static int damage1;
	static int health1;
	
	static int updateTime = 30;
	
	static String cardsDrawn;
	static String cardsDrawnCheck;
	
	static JLabel placeCards;
	static String [] aiBaCards = new String [3];
	
	static JButton endTurn;
	static JButton useAC1;
	static JButton useAC2;
	static JButton useAC3;
	static JButton attackAiAC1;
	
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
	static String user1Name;
	static String user2Name;
	static String user3Name;
	static String user4Name;
	static String user5Name;
	static String user6Name;
	static String user7Name;
	static String user8Name;
	static String ai1Name;
	static String ai2Name;
	static String ai3Name;
	static String ai4Name;
	static String ai5Name;
	static String ai6Name;
	static String ai7Name;
	static String ai8Name;
	
	
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
	static JButton attackAiAC2;
	static JButton attackAiAC3;
	
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
	static int availableAiCards[] = new int [8];
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
	      output.println(secondsRemaining);
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
	
	public static void aiCheck1()
	{
		if (battleArenaCards == 3)
		{
			placeCards.setText("AI is choosing its battle arena cards...");
			placeCards.setVisible(true);
			Timer delay = new Timer();
			delay.schedule(new TimerTask() {
					public void run() {
						ArrayList<Integer> aiCards = new ArrayList<Integer>();
				        for (int count = 0; count < 8; count ++) 
				        {
				        	aiCards.add(count);
				        }
				        Collections.shuffle(aiCards);
				        for (int count = 0; count < 8; count++) 
				        {
				        	availableAiCards[count] = (aiCards.get(count));
				        }
				        
				        if (availableAiCards[aiCardsUsed] == 0)
				        {
				        	Image arenaCard4_1 = aiCard1_1.getImage();
							Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
							ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
							
							aiArenaCard1 = new JButton(arenaCard4_3);
							aiArenaCard1.setBounds(528, 206, 94, 150);
							frame.getContentPane().add(aiArenaCard1);
							aiCard1.setEnabled(false);
							check1 = 0;
							totalAiCards--;
				        }
				        else if (availableAiCards[aiCardsUsed] == 1)
				        {
				        	Image arenaCard4_1 = aiCard2_1.getImage();
							Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
							ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
							
							aiArenaCard1 = new JButton(arenaCard4_3);
							aiArenaCard1.setBounds(528, 206, 94, 150);
							frame.getContentPane().add(aiArenaCard1);
							aiCard2.setEnabled(false);
							check1 = 1;
							totalAiCards--;
				        }
				        else if (availableAiCards[aiCardsUsed] == 2)
				        {
				        	Image arenaCard4_1 = aiCard3_1.getImage();
							Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
							ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
							
							aiArenaCard1 = new JButton(arenaCard4_3);
							aiArenaCard1.setBounds(528, 206, 94, 150);
							frame.getContentPane().add(aiArenaCard1);
							aiCard3.setEnabled(false);
							check1 = 2;
							totalAiCards--;
				        }
				        else if (availableAiCards[aiCardsUsed] == 3)
				        {
				        	Image arenaCard4_1 = aiCard4_1.getImage();
							Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
							ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
							
							aiArenaCard1 = new JButton(arenaCard4_3);
							aiArenaCard1.setBounds(528, 206, 94, 150);
							frame.getContentPane().add(aiArenaCard1);
							aiCard4.setEnabled(false);
							check1 = 3;
							totalAiCards--;
				        }
				        else if (availableAiCards[aiCardsUsed] == 4)
				        {
				        	Image arenaCard4_1 = aiCard5_1.getImage();
							Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
							ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
							
							aiArenaCard1 = new JButton(arenaCard4_3);
							aiArenaCard1.setBounds(528, 206, 94, 150);
							frame.getContentPane().add(aiArenaCard1);
							aiCard5.setEnabled(false);
							check1 = 4;
							totalAiCards--;
				        }
				        else if (availableAiCards[aiCardsUsed] == 5)
				        {
				        	Image arenaCard4_1 = aiCard6_1.getImage();
							Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
							ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
							
							aiArenaCard1 = new JButton(arenaCard4_3);
							aiArenaCard1.setBounds(528, 206, 94, 150);
							frame.getContentPane().add(aiArenaCard1);
							aiCard6.setEnabled(false);
							check1 = 5;
							totalAiCards--;
				        }
				        else if (availableAiCards[aiCardsUsed] == 6)
				        {
				        	Image arenaCard4_1 = aiCard7_1.getImage();
							Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
							ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
							
							aiArenaCard1 = new JButton(arenaCard4_3);
							aiArenaCard1.setBounds(528, 206, 94, 150);
							frame.getContentPane().add(aiArenaCard1);
							aiCard7.setEnabled(false);
							check1 = 6;
							totalAiCards--;
				        }
				        else if (availableAiCards[aiCardsUsed] == 7)
				        {
				        	Image arenaCard4_1 = aiCard8_1.getImage();
							Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
							ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
							
							aiArenaCard1 = new JButton(arenaCard4_3);
							aiArenaCard1.setBounds(528, 206, 94, 150);
							frame.getContentPane().add(aiArenaCard1);
							aiCard8.setEnabled(false);
							check1 = 7;
							totalAiCards--;
				        }
				        aiCardsUsed++;
//						Image arenaCard4_1 = aiCard3_1.getImage();
//						Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
//						ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
//						
//						aiArenaCard1 = new JButton(arenaCard4_3);
//						aiArenaCard1.setBounds(528, 206, 94, 150);
//						frame.getContentPane().add(aiArenaCard1);
//						aiCard3.setEnabled(false);
						
						if (availableAiCards[aiCardsUsed] == 0)
						{
							Image arenaCard5_1 = aiCard1_1.getImage();
							Image arenaCard5_2 = arenaCard5_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
							ImageIcon arenaCard5_3 = new ImageIcon(arenaCard5_2);
							
							aiArenaCard2 = new JButton(arenaCard5_3);
							aiArenaCard2.setBounds(634, 206, 94, 150);
							frame.getContentPane().add(aiArenaCard2);
							aiCard1.setEnabled(false);
							check2 = 0;
							totalAiCards--;
						}
						else if (availableAiCards[aiCardsUsed] == 1)
						{
							Image arenaCard5_1 = aiCard2_1.getImage();
							Image arenaCard5_2 = arenaCard5_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
							ImageIcon arenaCard5_3 = new ImageIcon(arenaCard5_2);
							
							aiArenaCard2 = new JButton(arenaCard5_3);
							aiArenaCard2.setBounds(634, 206, 94, 150);
							frame.getContentPane().add(aiArenaCard2);
							aiCard2.setEnabled(false);
							check2 = 1;
							totalAiCards--;
						}
						else if (availableAiCards[aiCardsUsed] == 2)
						{
							Image arenaCard5_1 = aiCard3_1.getImage();
							Image arenaCard5_2 = arenaCard5_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
							ImageIcon arenaCard5_3 = new ImageIcon(arenaCard5_2);
							
							aiArenaCard2 = new JButton(arenaCard5_3);
							aiArenaCard2.setBounds(634, 206, 94, 150);
							frame.getContentPane().add(aiArenaCard2);
							aiCard3.setEnabled(false);
							check2 = 2;
							totalAiCards--;
						}
						else if (availableAiCards[aiCardsUsed] == 3)
						{
							Image arenaCard5_1 = aiCard4_1.getImage();
							Image arenaCard5_2 = arenaCard5_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
							ImageIcon arenaCard5_3 = new ImageIcon(arenaCard5_2);
							
							aiArenaCard2 = new JButton(arenaCard5_3);
							aiArenaCard2.setBounds(634, 206, 94, 150);
							frame.getContentPane().add(aiArenaCard2);
							aiCard4.setEnabled(false);
							check2 = 3;
							totalAiCards--;
						}
						else if (availableAiCards[aiCardsUsed] == 4)
						{
							Image arenaCard5_1 = aiCard5_1.getImage();
							Image arenaCard5_2 = arenaCard5_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
							ImageIcon arenaCard5_3 = new ImageIcon(arenaCard5_2);
							
							aiArenaCard2 = new JButton(arenaCard5_3);
							aiArenaCard2.setBounds(634, 206, 94, 150);
							frame.getContentPane().add(aiArenaCard2);
							aiCard5.setEnabled(false);
							check2 = 4;
							totalAiCards--;
						}
						else if (availableAiCards[aiCardsUsed] == 5)
						{
							Image arenaCard5_1 = aiCard6_1.getImage();
							Image arenaCard5_2 = arenaCard5_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
							ImageIcon arenaCard5_3 = new ImageIcon(arenaCard5_2);
							
							aiArenaCard2 = new JButton(arenaCard5_3);
							aiArenaCard2.setBounds(634, 206, 94, 150);
							frame.getContentPane().add(aiArenaCard2);
							aiCard6.setEnabled(false);
							check2 = 5;
							totalAiCards--;
						}
						else if (availableAiCards[aiCardsUsed] == 6)
						{
							Image arenaCard5_1 = aiCard7_1.getImage();
							Image arenaCard5_2 = arenaCard5_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
							ImageIcon arenaCard5_3 = new ImageIcon(arenaCard5_2);
							
							aiArenaCard2 = new JButton(arenaCard5_3);
							aiArenaCard2.setBounds(634, 206, 94, 150);
							frame.getContentPane().add(aiArenaCard2);
							aiCard7.setEnabled(false);
							check2 = 6;
							totalAiCards--;
						}
						else if (availableAiCards[aiCardsUsed] == 7)
						{
							Image arenaCard5_1 = aiCard8_1.getImage();
							Image arenaCard5_2 = arenaCard5_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
							ImageIcon arenaCard5_3 = new ImageIcon(arenaCard5_2);
							
							aiArenaCard2 = new JButton(arenaCard5_3);
							aiArenaCard2.setBounds(634, 206, 94, 150);
							frame.getContentPane().add(aiArenaCard2);
							aiCard8.setEnabled(false);
							check2 = 7;
							totalAiCards--;
						}
						aiCardsUsed++;
//				        Image arenaCard5_1 = aiCard6_1.getImage();
//						Image arenaCard5_2 = arenaCard5_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
//						ImageIcon arenaCard5_3 = new ImageIcon(arenaCard5_2);
//						
//						aiArenaCard2 = new JButton(arenaCard5_3);
//						aiArenaCard2.setBounds(634, 206, 94, 150);
//						frame.getContentPane().add(aiArenaCard2);
//						aiCard6.setEnabled(false);
						
						if (availableAiCards[aiCardsUsed] == 0)
						{
							Image arenaCard6_1 = aiCard1_1.getImage();
							Image arenaCard6_2 = arenaCard6_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
							ImageIcon arenaCard6_3 = new ImageIcon(arenaCard6_2);
							
							aiArenaCard3 = new JButton(arenaCard6_3);
							aiArenaCard3.setBounds(740, 206, 94, 150);
							frame.getContentPane().add(aiArenaCard3);
							aiCard1.setEnabled(false);
							check3 = 0;
							totalAiCards--;
						}
						else if (availableAiCards[aiCardsUsed] == 1)
						{
							Image arenaCard6_1 = aiCard2_1.getImage();
							Image arenaCard6_2 = arenaCard6_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
							ImageIcon arenaCard6_3 = new ImageIcon(arenaCard6_2);
							
							aiArenaCard3 = new JButton(arenaCard6_3);
							aiArenaCard3.setBounds(740, 206, 94, 150);
							frame.getContentPane().add(aiArenaCard3);
							aiCard2.setEnabled(false);
							check3 = 1;
							totalAiCards--;
						}
						else if (availableAiCards[aiCardsUsed] == 2)
						{
							Image arenaCard6_1 = aiCard3_1.getImage();
							Image arenaCard6_2 = arenaCard6_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
							ImageIcon arenaCard6_3 = new ImageIcon(arenaCard6_2);
							
							aiArenaCard3 = new JButton(arenaCard6_3);
							aiArenaCard3.setBounds(740, 206, 94, 150);
							frame.getContentPane().add(aiArenaCard3);
							aiCard3.setEnabled(false);
							check3 = 2;
							totalAiCards--;
						}
						else if (availableAiCards[aiCardsUsed] == 3)
						{
							Image arenaCard6_1 = aiCard4_1.getImage();
							Image arenaCard6_2 = arenaCard6_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
							ImageIcon arenaCard6_3 = new ImageIcon(arenaCard6_2);
							
							aiArenaCard3 = new JButton(arenaCard6_3);
							aiArenaCard3.setBounds(740, 206, 94, 150);
							frame.getContentPane().add(aiArenaCard3);
							aiCard4.setEnabled(false);
							check3 = 3;
							totalAiCards--;
						}
						else if (availableAiCards[aiCardsUsed] == 4)
						{
							Image arenaCard6_1 = aiCard5_1.getImage();
							Image arenaCard6_2 = arenaCard6_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
							ImageIcon arenaCard6_3 = new ImageIcon(arenaCard6_2);
							
							aiArenaCard3 = new JButton(arenaCard6_3);
							aiArenaCard3.setBounds(740, 206, 94, 150);
							frame.getContentPane().add(aiArenaCard3);
							aiCard5.setEnabled(false);
							check3 = 4;
							totalAiCards--;
						}
						else if (availableAiCards[aiCardsUsed] == 5)
						{
							Image arenaCard6_1 = aiCard6_1.getImage();
							Image arenaCard6_2 = arenaCard6_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
							ImageIcon arenaCard6_3 = new ImageIcon(arenaCard6_2);
							
							aiArenaCard3 = new JButton(arenaCard6_3);
							aiArenaCard3.setBounds(740, 206, 94, 150);
							frame.getContentPane().add(aiArenaCard3);
							aiCard6.setEnabled(false);
							check3 = 5;
							totalAiCards--;
						}
						else if (availableAiCards[aiCardsUsed] == 6)
						{
							Image arenaCard6_1 = aiCard7_1.getImage();
							Image arenaCard6_2 = arenaCard6_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
							ImageIcon arenaCard6_3 = new ImageIcon(arenaCard6_2);
							
							aiArenaCard3 = new JButton(arenaCard6_3);
							aiArenaCard3.setBounds(740, 206, 94, 150);
							frame.getContentPane().add(aiArenaCard3);
							aiCard7.setEnabled(false);
							check3 = 6;
							totalAiCards--;
						}
						else if (availableAiCards[aiCardsUsed] == 7)
						{
							Image arenaCard6_1 = aiCard8_1.getImage();
							Image arenaCard6_2 = arenaCard6_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
							ImageIcon arenaCard6_3 = new ImageIcon(arenaCard6_2);
							
							aiArenaCard3 = new JButton(arenaCard6_3);
							aiArenaCard3.setBounds(740, 206, 94, 150);
							frame.getContentPane().add(aiArenaCard3);
							aiCard8.setEnabled(false);
							check3 = 7;
							totalAiCards--;
						}
						aiCardsUsed++;
						
//						Image arenaCard6_1 = aiCard7_1.getImage();
//						Image arenaCard6_2 = arenaCard6_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
//						ImageIcon arenaCard6_3 = new ImageIcon(arenaCard6_2);
//						
//						aiArenaCard3 = new JButton(arenaCard6_3);
//						aiArenaCard3.setBounds(740, 206, 94, 150);
//						frame.getContentPane().add(aiArenaCard3);
//						aiCard7.setEnabled(false);
						
						placeCards.setVisible(false);
						setAiValues();
					}
				}, 2000);
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
                }
            }   
        }, 0, 1000);
    }

	        // ... rest of your class code ...

	
//	    // Initialize the timer with 1000ms (1 second) delay and an ActionListener
//	    countdownTimer = new Timer(1000, new ActionListener() {
//	        @Override
//	        public void actionPerformed(ActionEvent e) {
//	            // Update the timer label
//	            timerLabel.setText("Time remaining: " + secondsRemaining + " seconds");
//	
//	            // Check if time has run out
//	            if (secondsRemaining == 0) {
//	                // Perform actions when the timer reaches zero (e.g., end the game)
//	                countdownTimer.stop(); // Stop the timer
//	                // Your game-over logic here
//	
//	            } else {
//	                // Decrement the remaining time
//	                secondsRemaining--;
//	            }
//	        }
//	    });
//	    
//	    countdownTimer.start();
	
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
	
	public static void showUserAbilityCard()
	{
		Image abilityCard1_2 = abilityCard1_1.getImage();
        Image abilityCard1_3 = abilityCard1_2.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
        ImageIcon abilityCard1_4 = new ImageIcon(abilityCard1_3);
        
        userAbility = new JButton(abilityCard1_4);
		userAbility.setBounds(264, 536, 94, 150);
		frame.getContentPane().add(userAbility);
		selectAbility1.setVisible(true);
	}
	
	public static void setAiValues()
	{
		if (check1 == 0)
		{
			health2 = ai1Health;
			attack2 = ai1Attack;
			coinsDropped2 = ai1CoinsDropped;
			name2 = ai1Name;
			baCardsArray2[0] = new aiCard (health2, attack2, coinsDropped2, name2);
		}
		else if (check1 == 1)
		{
			health2 = ai2Health;
			attack2 = ai2Attack;
			coinsDropped2 = ai2CoinsDropped;
			name2 = ai2Name;
			baCardsArray2[0] = new aiCard (health2, attack2, coinsDropped2, name2);
		}
		else if (check1 == 2)
		{
			health2 = ai3Health;
			attack2 = ai3Attack;
			coinsDropped2 = ai3CoinsDropped;
			name2 = ai3Name;
			baCardsArray2[0] = new aiCard (health2, attack2, coinsDropped2, name2);
		}
		else if (check1 == 3)
		{
			health2 = ai4Health;
			attack2 = ai4Attack;
			coinsDropped2 = ai4CoinsDropped;
			name2 = ai4Name;
			baCardsArray2[0] = new aiCard (health2, attack2, coinsDropped2, name2);
		}
		else if (check1 == 4)
		{
			health2 = ai5Health;
			attack2 = ai5Attack;
			coinsDropped2 = ai5CoinsDropped;
			name2 = ai5Name;
			baCardsArray2[0] = new aiCard (health2, attack2, coinsDropped2, name2);
		}
		else if (check1 == 5)
		{
			health2 = ai6Health;
			attack2 = ai6Attack;
			coinsDropped2 = ai6CoinsDropped;
			name2 = ai6Name;
			baCardsArray2[0] = new aiCard (health2, attack2, coinsDropped2, name2);
		}
		else if (check1 == 6)
		{
			health2 = ai7Health;
			attack2 = ai7Attack;
			coinsDropped2 = ai7CoinsDropped;
			name2 = ai7Name;
			baCardsArray2[0] = new aiCard (health2, attack2, coinsDropped2, name2);
		}
		else if (check1 == 7)
		{
			health2 = ai8Health;
			attack2 = ai8Attack;
			coinsDropped2 = ai8CoinsDropped;
			name2 = ai8Name;
			baCardsArray2[0] = new aiCard (health2, attack2, coinsDropped2, name2);
		}
		
		if (check2 == 0)
		{
			health2 = ai1Health;
			attack2 = ai1Attack;
			coinsDropped2 = ai1CoinsDropped;
			name2 = ai1Name;
			baCardsArray2[1] = new aiCard (health2, attack2, coinsDropped2, name2);
		}
		else if (check2 == 1)
		{
			health2 = ai2Health;
			attack2 = ai2Attack;
			coinsDropped2 = ai2CoinsDropped;
			name2 = ai2Name;
			baCardsArray2[1] = new aiCard (health2, attack2, coinsDropped2, name2);
		}
		else if (check2 == 2)
		{
			health2 = ai3Health;
			attack2 = ai3Attack;
			coinsDropped2 = ai3CoinsDropped;
			name2 = ai3Name;
			baCardsArray2[1] = new aiCard (health2, attack2, coinsDropped2, name2);
		}
		else if (check2 == 3)
		{
			health2 = ai4Health;
			attack2 = ai4Attack;
			coinsDropped2 = ai4CoinsDropped;
			name2 = ai4Name;
			baCardsArray2[1] = new aiCard (health2, attack2, coinsDropped2, name2);
		}
		else if (check2 == 4)
		{
			health2 = ai5Health;
			attack2 = ai5Attack;
			coinsDropped2 = ai5CoinsDropped;
			name2 = ai5Name;
			baCardsArray2[1] = new aiCard (health2, attack2, coinsDropped2, name2);
		}
		else if (check2 == 5)
		{
			health2 = ai6Health;
			attack2 = ai6Attack;
			coinsDropped2 = ai6CoinsDropped;
			name2 = ai6Name;
			baCardsArray2[1] = new aiCard (health2, attack2, coinsDropped2, name2);
		}
		else if (check2 == 6)
		{
			health2 = ai7Health;
			attack2 = ai7Attack;
			coinsDropped2 = ai7CoinsDropped;
			name2 = ai7Name;
			baCardsArray2[1] = new aiCard (health2, attack2, coinsDropped2, name2);
		}
		else if (check2 == 7)
		{
			health2 = ai8Health;
			attack2 = ai8Attack;
			coinsDropped2 = ai8CoinsDropped;
			name2 = ai8Name;
			baCardsArray2[1] = new aiCard (health2, attack2, coinsDropped2, name2);
		}
		
		if (check3 == 0)
		{
			health2 = ai1Health;
			attack2 = ai1Attack;
			coinsDropped2 = ai1CoinsDropped;
			name2 = ai1Name;
			baCardsArray2[2] = new aiCard (health2, attack2, coinsDropped2, name2);
		}
		else if (check3 == 1)
		{
			health2 = ai2Health;
			attack2 = ai2Attack;
			coinsDropped2 = ai2CoinsDropped;
			name2 = ai2Name;
			baCardsArray2[2] = new aiCard (health2, attack2, coinsDropped2, name2);
		}
		else if (check3 == 2)
		{
			health2 = ai3Health;
			attack2 = ai3Attack;
			coinsDropped2 = ai3CoinsDropped;
			name2 = ai3Name;
			baCardsArray2[2] = new aiCard (health2, attack2, coinsDropped2, name2);
		}
		else if (check3 == 3)
		{
			health2 = ai4Health;
			attack2 = ai4Attack;
			coinsDropped2 = ai4CoinsDropped;
			name2 = ai4Name;
			baCardsArray2[2] = new aiCard (health2, attack2, coinsDropped2, name2);
		}
		else if (check3 == 4)
		{
			health2 = ai5Health;
			attack2 = ai5Attack;
			coinsDropped2 = ai5CoinsDropped;
			name2 = ai5Name;
			baCardsArray2[2] = new aiCard (health2, attack2, coinsDropped2, name2);
		}
		else if (check3 == 5)
		{
			health2 = ai6Health;
			attack2 = ai6Attack;
			coinsDropped2 = ai6CoinsDropped;
			name2 = ai6Name;
			baCardsArray2[2] = new aiCard (health2, attack2, coinsDropped2, name2);
		}
		else if (check3 == 6)
		{
			health2 = ai7Health;
			attack2 = ai7Attack;
			coinsDropped2 = ai7CoinsDropped;
			name2 = ai7Name;
			baCardsArray2[2] = new aiCard (health2, attack2, coinsDropped2, name2);
		}
		else if (check3 == 7)
		{
			health2 = ai8Health;
			attack2 = ai8Attack;
			coinsDropped2 = ai8CoinsDropped;
			name2 = ai8Name;
			baCardsArray2[2] = new aiCard (health2, attack2, coinsDropped2, name2);
		}
	}
	
	public static void firstAiDecision()
	{
		baCardsArray2[0].getAttack();
		baCardsArray2[1].getAttack();
		baCardsArray2[2].getAttack();
		placeCards.setText("AI is choosing which card it wants to attack with...");
		if ((baCardsArray2[0].getAttack() > baCardsArray2[1].getAttack()) && (baCardsArray2[0].getAttack() > baCardsArray2[2].getAttack()))
		{
			Timer delay3 = new Timer();
			delay3.schedule(new TimerTask() {
					public void run() {
						aiArenaCard1.setEnabled(false);
						ba4Used = true;
					}
			}, 2000);
			System.out.println("AC 1 chosen");
		}
		else if ((baCardsArray2[1].getAttack() > baCardsArray2[0].getAttack()) && (baCardsArray2[1].getAttack() > baCardsArray2[2].getAttack()))
		{
			Timer delay3 = new Timer();
			delay3.schedule(new TimerTask() {
					public void run() {
						aiArenaCard2.setEnabled(false);
						ba5Used = true;
					}
			}, 2000);
			System.out.println("AC 2 chosen");
		}
		else if ((baCardsArray2[2].getAttack() > baCardsArray2[0].getAttack()) && (baCardsArray2[2].getAttack() > baCardsArray2[1].getAttack()))
		{
			Timer delay3 = new Timer();
			delay3.schedule(new TimerTask() {
					public void run() {
						aiArenaCard3.setEnabled(false);
						ba6Used = true;
					}
			}, 2000);
			System.out.println("AC 3 chosen");
		}
		placeCards.setVisible(false);
		secondAiDecision();
	}
	
	public static void secondAiDecision()
	{
		System.out.println("OOOK");
		finalResult1 = baCardsArray[0].getAttack() + baCardsArray[0].getHealth() + baCardsArray[0].getCoinsDropped() + baCardsArray[0].getTier();
		finalResult2 = baCardsArray[1].getAttack() + baCardsArray[1].getHealth() + baCardsArray[1].getCoinsDropped() + baCardsArray[1].getTier();
		finalResult3 = baCardsArray[2].getAttack() + baCardsArray[2].getHealth() + baCardsArray[2].getCoinsDropped() + baCardsArray[2].getTier();
		if (ba4Used)
		{
			if (finalResult1 <= 5 && finalResult2 > 5 && finalResult3 > 5)
			{
				damage1 = baCardsArray2[0].getAttack();
				health1 = baCardsArray[0].getHealth();
				System.out.println(health1);
				health1 -= damage1;
				baCardsArray2[0].setHealth(health1);
				System.out.println(baCardsArray[0].getHealth());
				placeCards.setText("AI is choosing one of your cards to attack...");
				if (health1 <= 0)
				{
					System.out.println("Card died");
					actionHistory.append(baCardsArray[0].getName() + " was killed by " + baCardsArray2[0].getName());
					actionHistory.append("\n");
					Timer delay2 = new Timer();
					delay2.schedule(new TimerTask() {
							public void run() {
								userArenaCard1.setVisible(false);
							}
					}, 2000);	
				}
				else 
				{
					System.out.println("Card lost " + damage1 + " health");
					actionHistory.append(baCardsArray2[0].getName() + " did " + baCardsArray2[0].getAttack() + " damage to " + baCardsArray[0].getName());
					actionHistory.append("\n");
				}
				numberOfTurns++;
			}
			
			else if (finalResult1 > 5 && finalResult2 <= 5 && finalResult3 > 5)
			{
				damage1 = baCardsArray2[0].getAttack();
				health1 = baCardsArray[1].getHealth();
				System.out.println(health1);
				health1 -= damage1;
				baCardsArray2[0].setHealth(health1);
				System.out.println(baCardsArray[1].getHealth());
				placeCards.setText("AI is choosing one of your cards to attack...");
				if (health1 <= 0)
				{
					System.out.println("Card died");
					actionHistory.append(baCardsArray[1].getName() + " was killed by " + baCardsArray2[0].getName());
					actionHistory.append("\n");
					Timer delay2 = new Timer();
					delay2.schedule(new TimerTask() {
							public void run() {
								userArenaCard1.setVisible(false);
							}
					}, 2000);	
				}
				else 
				{
					System.out.println("Card lost " + damage1 + " health");
					actionHistory.append(baCardsArray2[0].getName() + " did " + baCardsArray2[0].getAttack() + " damage to " + baCardsArray[1].getName());
					actionHistory.append("\n");
				}
				numberOfTurns++;
			}
			
			else if (finalResult1 > 5 && finalResult2 > 5 && finalResult3 <= 5)
			{
				damage1 = baCardsArray2[0].getAttack();
				health1 = baCardsArray[2].getHealth();
				System.out.println(health1);
				health1 -= damage1;
				baCardsArray2[0].setHealth(health1);
				System.out.println(baCardsArray[2].getHealth());
				placeCards.setText("AI is choosing one of your cards to attack...");
				if (health1 <= 0)
				{
					System.out.println("Card died");
					actionHistory.append(baCardsArray[2].getName() + " was killed by " + baCardsArray2[0].getName());
					actionHistory.append("\n");
					Timer delay2 = new Timer();
					delay2.schedule(new TimerTask() {
							public void run() {
								userArenaCard1.setVisible(false);
							}
					}, 2000);	
				}
				else 
				{
					System.out.println("Card lost " + damage1 + " health");
					actionHistory.append(baCardsArray2[0].getName() + " did " + baCardsArray2[0].getAttack() + " damage to " + baCardsArray[2].getName());
					actionHistory.append("\n");
				}
				numberOfTurns++;
			}
			
			else if (finalResult1 >= 15 && finalResult2 < 15 && finalResult3 < 15)
			{
				damage1 = baCardsArray2[0].getAttack();
				health1 = baCardsArray[0].getHealth();
				System.out.println(health1);
				health1 -= damage1;
				baCardsArray2[0].setHealth(health1);
				System.out.println(baCardsArray[0].getHealth());
				placeCards.setText("AI is choosing one of your cards to attack...");
				if (health1 <= 0)
				{
					System.out.println("Card died");
					actionHistory.append(baCardsArray[0].getName() + " was killed by " + baCardsArray2[0].getName());
					actionHistory.append("\n");
					Timer delay2 = new Timer();
					delay2.schedule(new TimerTask() {
							public void run() {
								userArenaCard1.setVisible(false);
							}
					}, 2000);	
				}
				else 
				{
					System.out.println("Card lost " + damage1 + " health");
					actionHistory.append(baCardsArray2[0].getName() + " did " + baCardsArray2[0].getAttack() + " damage to " + baCardsArray[0].getName());
					actionHistory.append("\n");
				}
				numberOfTurns++;
			}
			
			else if (finalResult1 < 15 && finalResult2 >= 15 && finalResult3 < 15)
			{
				damage1 = baCardsArray2[0].getAttack();
				health1 = baCardsArray[1].getHealth();
				System.out.println(health1);
				health1 -= damage1;
				baCardsArray2[0].setHealth(health1);
				System.out.println(baCardsArray[1].getHealth());
				placeCards.setText("AI is choosing one of your cards to attack...");
				if (health1 <= 0)
				{
					System.out.println("Card died");
					actionHistory.append(baCardsArray[1].getName() + " was killed by " + baCardsArray2[0].getName());
					actionHistory.append("\n");
					Timer delay2 = new Timer();
					delay2.schedule(new TimerTask() {
							public void run() {
								userArenaCard1.setVisible(false);
							}
					}, 2000);	
				}
				else 
				{
					System.out.println("Card lost " + damage1 + " health");
					actionHistory.append(baCardsArray2[0].getName() + " did " + baCardsArray2[0].getAttack() + " damage to " + baCardsArray[1].getName());
					actionHistory.append("\n");
				}
				numberOfTurns++;
			}
			
			else if (finalResult1 < 15 && finalResult2 < 15 && finalResult3 >= 15)
			{
				damage1 = baCardsArray2[0].getAttack();
				health1 = baCardsArray[2].getHealth();
				System.out.println(health1);
				health1 -= damage1;
				baCardsArray2[0].setHealth(health1);
				System.out.println(baCardsArray[2].getHealth());
				placeCards.setText("AI is choosing one of your cards to attack...");
				if (health1 <= 0)
				{
					System.out.println("Card died");
					actionHistory.append(baCardsArray[2].getName() + " was killed by " + baCardsArray2[0].getName());
					actionHistory.append("\n");
					Timer delay2 = new Timer();
					delay2.schedule(new TimerTask() {
							public void run() {
								userArenaCard1.setVisible(false);
							}
					}, 2000);	
				}
				else 
				{
					System.out.println("Card lost " + damage1 + " health");
					actionHistory.append(baCardsArray2[0].getName() + " did " + baCardsArray2[0].getAttack() + " damage to " + baCardsArray[2].getName());
					actionHistory.append("\n");
				}
				numberOfTurns++;
			}
			
			else if (finalResult1 <= 5 && finalResult2 <= 5 && finalResult3 <= 5)
			{
				int randomSelection = (int)(Math.random() * 2);
				if (randomSelection == 0)
				{
					damage1 = baCardsArray2[0].getAttack();
					health1 = baCardsArray[0].getHealth();
					System.out.println(health1);
					health1 -= damage1;
					baCardsArray2[0].setHealth(health1);
					System.out.println(baCardsArray[0].getHealth());
					placeCards.setText("AI is choosing one of your cards to attack...");
					if (health1 <= 0)
					{
						System.out.println("Card died");
						actionHistory.append(baCardsArray[0].getName() + " was killed by " + baCardsArray2[0].getName());
						actionHistory.append("\n");
						Timer delay2 = new Timer();
						delay2.schedule(new TimerTask() {
								public void run() {
									userArenaCard1.setVisible(false);
								}
						}, 2000);	
					}
					else 
					{
						System.out.println("Card lost " + damage1 + " health");
						actionHistory.append(baCardsArray2[0].getName() + " did " + baCardsArray2[0].getAttack() + " damage to " + baCardsArray[0].getName());
						actionHistory.append("\n");
					}
					numberOfTurns++;
				}
				
				else if (randomSelection == 1)
				{
					damage1 = baCardsArray2[0].getAttack();
					health1 = baCardsArray[1].getHealth();
					System.out.println(health1);
					health1 -= damage1;
					baCardsArray2[0].setHealth(health1);
					System.out.println(baCardsArray[1].getHealth());
					placeCards.setText("AI is choosing one of your cards to attack...");
					if (health1 <= 0)
					{
						System.out.println("Card died");
						actionHistory.append(baCardsArray[1].getName() + " was killed by " + baCardsArray2[0].getName());
						actionHistory.append("\n");
						Timer delay2 = new Timer();
						delay2.schedule(new TimerTask() {
								public void run() {
									userArenaCard2.setVisible(false);
								}
						}, 2000);	
					}
					else 
					{
						System.out.println("Card lost " + damage1 + " health");
						actionHistory.append(baCardsArray2[0].getName() + " did " + baCardsArray2[0].getAttack() + " damage to " + baCardsArray[1].getName());
						actionHistory.append("\n");
					}
					numberOfTurns++;
				}
				
				else if (randomSelection == 2)
				{
					damage1 = baCardsArray2[0].getAttack();
					health1 = baCardsArray[2].getHealth();
					System.out.println(health1);
					health1 -= damage1;
					baCardsArray2[0].setHealth(health1);
					System.out.println(baCardsArray[2].getHealth());
					placeCards.setText("AI is choosing one of your cards to attack...");
					if (health1 <= 0)
					{
						System.out.println("Card died");
						actionHistory.append(baCardsArray[2].getName() + " was killed by " + baCardsArray2[0].getName());
						actionHistory.append("\n");
						Timer delay2 = new Timer();
						delay2.schedule(new TimerTask() {
								public void run() {
									userArenaCard3.setVisible(false);
								}
						}, 2000);	
					}
					else 
					{
						System.out.println("Card lost " + damage1 + " health");
						actionHistory.append(baCardsArray2[0].getName() + " did " + baCardsArray2[0].getAttack() + " damage to " + baCardsArray[2].getName());
						actionHistory.append("\n");
					}
					numberOfTurns++;
				}
				
				else if (finalResult1 <= 5 && finalResult2 <= 5 && finalResult3 > 5)
				{
					int randomSelection2 = (int)(Math.random() * 1);
					if (randomSelection2 == 0)
					{
						damage1 = baCardsArray2[0].getAttack();
						health1 = baCardsArray[0].getHealth();
						System.out.println(health1);
						health1 -= damage1;
						baCardsArray2[0].setHealth(health1);
						System.out.println(baCardsArray[0].getHealth());
						placeCards.setText("AI is choosing one of your cards to attack...");
						if (health1 <= 0)
						{
							System.out.println("Card died");
							actionHistory.append(baCardsArray[0].getName() + " was killed by " + baCardsArray2[0].getName());
							actionHistory.append("\n");
							Timer delay2 = new Timer();
							delay2.schedule(new TimerTask() {
									public void run() {
										userArenaCard1.setVisible(false);
									}
							}, 2000);	
						}
						else 
						{
							System.out.println("Card lost " + damage1 + " health");
							actionHistory.append(baCardsArray2[0].getName() + " did " + baCardsArray2[0].getAttack() + " damage to " + baCardsArray[0].getName());
							actionHistory.append("\n");
						}
						numberOfTurns++;
					}
					
					else if (randomSelection2 == 1)
					{
						damage1 = baCardsArray2[0].getAttack();
						health1 = baCardsArray[1].getHealth();
						System.out.println(health1);
						health1 -= damage1;
						baCardsArray2[0].setHealth(health1);
						System.out.println(baCardsArray[1].getHealth());
						placeCards.setText("AI is choosing one of your cards to attack...");
						if (health1 <= 0)
						{
							System.out.println("Card died");
							actionHistory.append(baCardsArray[1].getName() + " was killed by " + baCardsArray2[0].getName());
							actionHistory.append("\n");
							Timer delay2 = new Timer();
							delay2.schedule(new TimerTask() {
									public void run() {
										userArenaCard2.setVisible(false);
									}
							}, 2000);	
						}
						else 
						{
							System.out.println("Card lost " + damage1 + " health");
							actionHistory.append(baCardsArray2[0].getName() + " did " + baCardsArray2[0].getAttack() + " damage to " + baCardsArray[1].getName());
							actionHistory.append("\n");
						}
						numberOfTurns++;
					}
				}
				
				else if (finalResult1 <= 5 && finalResult2 > 5 && finalResult3 <= 5)
				{
					int randomSelection2 = (int)(Math.random() * 1);
					if (randomSelection2 == 0)
					{
						damage1 = baCardsArray2[0].getAttack();
						health1 = baCardsArray[0].getHealth();
						System.out.println(health1);
						health1 -= damage1;
						baCardsArray2[0].setHealth(health1);
						System.out.println(baCardsArray[0].getHealth());
						placeCards.setText("AI is choosing one of your cards to attack...");
						if (health1 <= 0)
						{
							System.out.println("Card died");
							actionHistory.append(baCardsArray[0].getName() + " was killed by " + baCardsArray2[0].getName());
							actionHistory.append("\n");
							Timer delay2 = new Timer();
							delay2.schedule(new TimerTask() {
									public void run() {
										userArenaCard1.setVisible(false);
									}
							}, 2000);	
						}
						else 
						{
							System.out.println("Card lost " + damage1 + " health");
							actionHistory.append(baCardsArray2[0].getName() + " did " + baCardsArray2[0].getAttack() + " damage to " + baCardsArray[0].getName());
							actionHistory.append("\n");
						}
						numberOfTurns++;
					}
					
					else if (randomSelection2 == 1)
					{
						damage1 = baCardsArray2[0].getAttack();
						health1 = baCardsArray[2].getHealth();
						System.out.println(health1);
						health1 -= damage1;
						baCardsArray2[0].setHealth(health1);
						System.out.println(baCardsArray[2].getHealth());
						placeCards.setText("AI is choosing one of your cards to attack...");
						if (health1 <= 0)
						{
							System.out.println("Card died");
							actionHistory.append(baCardsArray[2].getName() + " was killed by " + baCardsArray2[0].getName());
							actionHistory.append("\n");
							Timer delay2 = new Timer();
							delay2.schedule(new TimerTask() {
									public void run() {
										userArenaCard2.setVisible(false);
									}
							}, 2000);	
						}
						else 
						{
							System.out.println("Card lost " + damage1 + " health");
							actionHistory.append(baCardsArray2[0].getName() + " did " + baCardsArray2[0].getAttack() + " damage to " + baCardsArray[2].getName());
							actionHistory.append("\n");
						}
						numberOfTurns++;
					}
				}
				
				else if (finalResult1 > 5 && finalResult2 <= 5 && finalResult3 <= 5)
				{
					int randomSelection2 = (int)(Math.random() * 1);
					if (randomSelection2 == 0)
					{
						damage1 = baCardsArray2[0].getAttack();
						health1 = baCardsArray[1].getHealth();
						System.out.println(health1);
						health1 -= damage1;
						baCardsArray2[0].setHealth(health1);
						System.out.println(baCardsArray[1].getHealth());
						placeCards.setText("AI is choosing one of your cards to attack...");
						if (health1 <= 0)
						{
							System.out.println("Card died");
							actionHistory.append(baCardsArray[1].getName() + " was killed by " + baCardsArray2[0].getName());
							actionHistory.append("\n");
							Timer delay2 = new Timer();
							delay2.schedule(new TimerTask() {
									public void run() {
										userArenaCard1.setVisible(false);
									}
							}, 2000);	
						}
						else 
						{
							System.out.println("Card lost " + damage1 + " health");
							actionHistory.append(baCardsArray2[0].getName() + " did " + baCardsArray2[0].getAttack() + " damage to " + baCardsArray[1].getName());
							actionHistory.append("\n");
						}
						numberOfTurns++;
					}
					
					else if (randomSelection2 == 1)
					{
						damage1 = baCardsArray2[0].getAttack();
						health1 = baCardsArray[2].getHealth();
						System.out.println(health1);
						health1 -= damage1;
						baCardsArray2[0].setHealth(health1);
						System.out.println(baCardsArray[2].getHealth());
						placeCards.setText("AI is choosing one of your cards to attack...");
						if (health1 <= 0)
						{
							System.out.println("Card died");
							actionHistory.append(baCardsArray[2].getName() + " was killed by " + baCardsArray2[0].getName());
							actionHistory.append("\n");
							Timer delay2 = new Timer();
							delay2.schedule(new TimerTask() {
									public void run() {
										userArenaCard2.setVisible(false);
									}
							}, 2000);	
						}
						else 
						{
							System.out.println("Card lost " + damage1 + " health");
							actionHistory.append(baCardsArray2[0].getName() + " did " + baCardsArray2[0].getAttack() + " damage to " + baCardsArray[2].getName());
							actionHistory.append("\n");
						}
						numberOfTurns++;
					}
				}
				
				else if (finalResult1 >= 15 && finalResult2 >= 15 && finalResult3 >= 15)
				{
					int randomSelection3 = (int)(Math.random() * 2);
					if (randomSelection3 == 0)
					{
						damage1 = baCardsArray2[0].getAttack();
						health1 = baCardsArray[0].getHealth();
						System.out.println(health1);
						health1 -= damage1;
						baCardsArray2[0].setHealth(health1);
						System.out.println(baCardsArray[0].getHealth());
						placeCards.setText("AI is choosing one of your cards to attack...");
						if (health1 <= 0)
						{
							System.out.println("Card died");
							actionHistory.append(baCardsArray[0].getName() + " was killed by " + baCardsArray2[0].getName());
							actionHistory.append("\n");
							Timer delay2 = new Timer();
							delay2.schedule(new TimerTask() {
									public void run() {
										userArenaCard1.setVisible(false);
									}
							}, 2000);	
						}
						else 
						{
							System.out.println("Card lost " + damage1 + " health");
							actionHistory.append(baCardsArray2[0].getName() + " did " + baCardsArray2[0].getAttack() + " damage to " + baCardsArray[0].getName());
							actionHistory.append("\n");
						}
						numberOfTurns++;
					}
					
					else if (randomSelection3 == 1)
					{
						damage1 = baCardsArray2[0].getAttack();
						health1 = baCardsArray[1].getHealth();
						System.out.println(health1);
						health1 -= damage1;
						baCardsArray2[0].setHealth(health1);
						System.out.println(baCardsArray[1].getHealth());
						placeCards.setText("AI is choosing one of your cards to attack...");
						if (health1 <= 0)
						{
							System.out.println("Card died");
							actionHistory.append(baCardsArray[1].getName() + " was killed by " + baCardsArray2[0].getName());
							actionHistory.append("\n");
							Timer delay2 = new Timer();
							delay2.schedule(new TimerTask() {
									public void run() {
										userArenaCard2.setVisible(false);
									}
							}, 2000);	
						}
						else 
						{
							System.out.println("Card lost " + damage1 + " health");
							actionHistory.append(baCardsArray2[0].getName() + " did " + baCardsArray2[0].getAttack() + " damage to " + baCardsArray[1].getName());
							actionHistory.append("\n");
						}
						numberOfTurns++;
					}
					
					else if (randomSelection3 == 2)
					{
						damage1 = baCardsArray2[0].getAttack();
						health1 = baCardsArray[2].getHealth();
						System.out.println(health1);
						health1 -= damage1;
						baCardsArray2[0].setHealth(health1);
						System.out.println(baCardsArray[2].getHealth());
						placeCards.setText("AI is choosing one of your cards to attack...");
						if (health1 <= 0)
						{
							System.out.println("Card died");
							actionHistory.append(baCardsArray[2].getName() + " was killed by " + baCardsArray2[0].getName());
							actionHistory.append("\n");
							Timer delay2 = new Timer();
							delay2.schedule(new TimerTask() {
									public void run() {
										userArenaCard3.setVisible(false);
									}
							}, 2000);	
						}
						else 
						{
							System.out.println("Card lost " + damage1 + " health");
							actionHistory.append(baCardsArray2[0].getName() + " did " + baCardsArray2[0].getAttack() + " damage to " + baCardsArray[2].getName());
							actionHistory.append("\n");
						}
						numberOfTurns++;
					}
				}
				
				else if (finalResult1 >= 15 && finalResult2 >= 15 && finalResult3 < 15)
				{
					int randomSelection3 = (int)(Math.random() * 1);
					if (randomSelection3 == 0)
					{
						damage1 = baCardsArray2[0].getAttack();
						health1 = baCardsArray[0].getHealth();
						System.out.println(health1);
						health1 -= damage1;
						baCardsArray2[0].setHealth(health1);
						System.out.println(baCardsArray[0].getHealth());
						placeCards.setText("AI is choosing one of your cards to attack...");
						if (health1 <= 0)
						{
							System.out.println("Card died");
							actionHistory.append(baCardsArray[0].getName() + " was killed by " + baCardsArray2[0].getName());
							actionHistory.append("\n");
							Timer delay2 = new Timer();
							delay2.schedule(new TimerTask() {
									public void run() {
										userArenaCard1.setVisible(false);
									}
							}, 2000);	
						}
						else 
						{
							System.out.println("Card lost " + damage1 + " health");
							actionHistory.append(baCardsArray2[0].getName() + " did " + baCardsArray2[0].getAttack() + " damage to " + baCardsArray[0].getName());
							actionHistory.append("\n");
						}
						numberOfTurns++;
					}
					
					else if (randomSelection3 == 1)
					{
						damage1 = baCardsArray2[0].getAttack();
						health1 = baCardsArray[1].getHealth();
						System.out.println(health1);
						health1 -= damage1;
						baCardsArray2[0].setHealth(health1);
						System.out.println(baCardsArray[1].getHealth());
						placeCards.setText("AI is choosing one of your cards to attack...");
						if (health1 <= 0)
						{
							System.out.println("Card died");
							actionHistory.append(baCardsArray[1].getName() + " was killed by " + baCardsArray2[0].getName());
							actionHistory.append("\n");
							Timer delay2 = new Timer();
							delay2.schedule(new TimerTask() {
									public void run() {
										userArenaCard2.setVisible(false);
									}
							}, 2000);	
						}
						else 
						{
							System.out.println("Card lost " + damage1 + " health");
							actionHistory.append(baCardsArray2[0].getName() + " did " + baCardsArray2[0].getAttack() + " damage to " + baCardsArray[1].getName());
							actionHistory.append("\n");
						}
						numberOfTurns++;
					}
				}
				
				else if (finalResult1 >= 15 && finalResult2 < 15 && finalResult3 >= 15)
				{
					int randomSelection3 = (int)(Math.random() * 1);
					if (randomSelection3 == 0)
					{
						damage1 = baCardsArray2[0].getAttack();
						health1 = baCardsArray[0].getHealth();
						System.out.println(health1);
						health1 -= damage1;
						baCardsArray2[0].setHealth(health1);
						System.out.println(baCardsArray[0].getHealth());
						placeCards.setText("AI is choosing one of your cards to attack...");
						if (health1 <= 0)
						{
							System.out.println("Card died");
							actionHistory.append(baCardsArray[0].getName() + " was killed by " + baCardsArray2[0].getName());
							actionHistory.append("\n");
							Timer delay2 = new Timer();
							delay2.schedule(new TimerTask() {
									public void run() {
										userArenaCard1.setVisible(false);
									}
							}, 2000);	
						}
						else 
						{
							System.out.println("Card lost " + damage1 + " health");
							actionHistory.append(baCardsArray2[0].getName() + " did " + baCardsArray2[0].getAttack() + " damage to " + baCardsArray[0].getName());
							actionHistory.append("\n");
						}
						numberOfTurns++;
					}
					
					else if (randomSelection3 == 1)
					{
						damage1 = baCardsArray2[0].getAttack();
						health1 = baCardsArray[2].getHealth();
						System.out.println(health1);
						health1 -= damage1;
						baCardsArray2[0].setHealth(health1);
						System.out.println(baCardsArray[2].getHealth());
						placeCards.setText("AI is choosing one of your cards to attack...");
						if (health1 <= 0)
						{
							System.out.println("Card died");
							actionHistory.append(baCardsArray[2].getName() + " was killed by " + baCardsArray2[0].getName());
							actionHistory.append("\n");
							Timer delay2 = new Timer();
							delay2.schedule(new TimerTask() {
									public void run() {
										userArenaCard2.setVisible(false);
									}
							}, 2000);	
						}
						else 
						{
							System.out.println("Card lost " + damage1 + " health");
							actionHistory.append(baCardsArray2[0].getName() + " did " + baCardsArray2[0].getAttack() + " damage to " + baCardsArray[2].getName());
							actionHistory.append("\n");
						}
						numberOfTurns++;
					}
				}
				
				else if (finalResult1 < 15 && finalResult2 >= 15 && finalResult3 >= 15)
				{
					int randomSelection3 = (int)(Math.random() * 1);
					if (randomSelection3 == 0)
					{
						damage1 = baCardsArray2[0].getAttack();
						health1 = baCardsArray[1].getHealth();
						System.out.println(health1);
						health1 -= damage1;
						baCardsArray2[0].setHealth(health1);
						System.out.println(baCardsArray[1].getHealth());
						placeCards.setText("AI is choosing one of your cards to attack...");
						if (health1 <= 0)
						{
							System.out.println("Card died");
							actionHistory.append(baCardsArray[1].getName() + " was killed by " + baCardsArray2[0].getName());
							actionHistory.append("\n");
							Timer delay2 = new Timer();
							delay2.schedule(new TimerTask() {
									public void run() {
										userArenaCard1.setVisible(false);
									}
							}, 2000);	
						}
						else 
						{
							System.out.println("Card lost " + damage1 + " health");
							actionHistory.append(baCardsArray2[0].getName() + " did " + baCardsArray2[0].getAttack() + " damage to " + baCardsArray[1].getName());
							actionHistory.append("\n");
						}
						numberOfTurns++;
					}
					
					else if (randomSelection3 == 1)
					{
						damage1 = baCardsArray2[0].getAttack();
						health1 = baCardsArray[2].getHealth();
						System.out.println(health1);
						health1 -= damage1;
						baCardsArray2[0].setHealth(health1);
						System.out.println(baCardsArray[2].getHealth());
						placeCards.setText("AI is choosing one of your cards to attack...");
						if (health1 <= 0)
						{
							System.out.println("Card died");
							actionHistory.append(baCardsArray[2].getName() + " was killed by " + baCardsArray2[0].getName());
							actionHistory.append("\n");
							Timer delay2 = new Timer();
							delay2.schedule(new TimerTask() {
									public void run() {
										userArenaCard2.setVisible(false);
									}
							}, 2000);	
						}
						else 
						{
							System.out.println("Card lost " + damage1 + " health");
							actionHistory.append(baCardsArray2[0].getName() + " did " + baCardsArray2[0].getAttack() + " damage to " + baCardsArray[2].getName());
							actionHistory.append("\n");
						}
						numberOfTurns++;
					}
				}
				
				else if ((finalResult1 > 5 && finalResult1 < 15) && (finalResult2 > 5 && finalResult2 < 15) && (finalResult3 > 5 && finalResult3 < 15))
				{
					if ((10 - finalResult1) <= (10 - finalResult2) && (10 - finalResult1) <= (10 - finalResult3))
					{
						damage1 = baCardsArray2[0].getAttack();
						health1 = baCardsArray[0].getHealth();
						System.out.println(health1);
						health1 -= damage1;
						baCardsArray2[0].setHealth(health1);
						System.out.println(baCardsArray[0].getHealth());
						placeCards.setText("AI is choosing one of your cards to attack...");
						if (health1 <= 0)
						{
							System.out.println("Card died");
							actionHistory.append(baCardsArray[0].getName() + " was killed by " + baCardsArray2[0].getName());
							actionHistory.append("\n");
							Timer delay2 = new Timer();
							delay2.schedule(new TimerTask() {
									public void run() {
										userArenaCard1.setVisible(false);
									}
							}, 2000);	
						}
						else 
						{
							System.out.println("Card lost " + damage1 + " health");
							actionHistory.append(baCardsArray2[0].getName() + " did " + baCardsArray2[0].getAttack() + " damage to " + baCardsArray[0].getName());
							actionHistory.append("\n");
						}
						numberOfTurns++;
					}
					
					else if ((10 - finalResult2) <= (10 - finalResult1) && (10 - finalResult2) <= (10 - finalResult3))
					{
						damage1 = baCardsArray2[0].getAttack();
						health1 = baCardsArray[1].getHealth();
						System.out.println(health1);
						health1 -= damage1;
						baCardsArray2[0].setHealth(health1);
						System.out.println(baCardsArray[1].getHealth());
						placeCards.setText("AI is choosing one of your cards to attack...");
						if (health1 <= 0)
						{
							System.out.println("Card died");
							actionHistory.append(baCardsArray[1].getName() + " was killed by " + baCardsArray2[0].getName());
							actionHistory.append("\n");
							Timer delay2 = new Timer();
							delay2.schedule(new TimerTask() {
									public void run() {
										userArenaCard2.setVisible(false);
									}
							}, 2000);	
						}
						else 
						{
							System.out.println("Card lost " + damage1 + " health");
							actionHistory.append(baCardsArray2[0].getName() + " did " + baCardsArray2[0].getAttack() + " damage to " + baCardsArray[1].getName());
							actionHistory.append("\n");
						}
						numberOfTurns++;
					}
					
					else if ((10 - finalResult3) <= (10 - finalResult1) && (10 - finalResult3) <= (10 - finalResult2))
					{
						damage1 = baCardsArray2[0].getAttack();
						health1 = baCardsArray[2].getHealth();
						System.out.println(health1);
						health1 -= damage1;
						baCardsArray2[0].setHealth(health1);
						System.out.println(baCardsArray[2].getHealth());
						placeCards.setText("AI is choosing one of your cards to attack...");
						if (health1 <= 0)
						{
							System.out.println("Card died");
							actionHistory.append(baCardsArray[2].getName() + " was killed by " + baCardsArray2[0].getName());
							actionHistory.append("\n");
							Timer delay2 = new Timer();
							delay2.schedule(new TimerTask() {
									public void run() {
										userArenaCard3.setVisible(false);
									}
							}, 2000);	
						}
						else 
						{
							System.out.println("Card lost " + damage1 + " health");
							actionHistory.append(baCardsArray2[0].getName() + " did " + baCardsArray2[0].getAttack() + " damage to " + baCardsArray[2].getName());
							actionHistory.append("\n");
						}
						numberOfTurns++;
					}
				}
			}
		}
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void showGameplayScreen()
	{
		
		read();
		read2();
		
		secondsRemaining = updateTime;
		cardsDrawn = cardsDrawnCheck;
		ac1Purchased = ac1PurchasedCheck;
		
		battleArenaCards = 0;
		
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
	    ImageIcon backgroundImage = new ImageIcon("resources/images/blueBackground.jpeg");
		JLabel backgroundLabel = new JLabel(backgroundImage);
		
		frame.setContentPane(backgroundLabel);
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setBounds(100, 100, 1400, 800);
		
		JPanel panel =new JPanel();
		panel.setLayout(null);		
		frame.getContentPane().setLayout(null);
		
		if (ac1Purchased.equals("Yes"))
		{
			abilityCard1_1 = new ImageIcon("resources/images/sock puppetry.jpg");
			showUserAbilityCard();
		}
		else if (ac2Purchased.equals("Yes"))
		{
			abilityCard1_1 = new ImageIcon("resources/images/inverted reflection.jpg");
			showUserAbilityCard();
		}
		else if (ac3Purchased.equals("Yes"))
		{
			abilityCard1_1 = new ImageIcon("resources/images/holographic hideaway.jpg");
			showUserAbilityCard();
		}
		else if (ac4Purchased.equals("Yes"))
		{
			abilityCard1_1 = new ImageIcon("resources/images/malicious mend.jpg");
			showUserAbilityCard();
		}
		else if (ac5Purchased.equals("Yes"))
		{
			abilityCard1_1 = new ImageIcon("resources/images/reprehensive rejuvenation.jpg");
			showUserAbilityCard();
		}
		else if (ac6Purchased.equals("Yes"))
		{
			abilityCard1_1 = new ImageIcon("resources/images/sinister serenity.jpg");
			showUserAbilityCard();
		}
		else if (ac7Purchased.equals("Yes"))
		{
			abilityCard1_1 = new ImageIcon("resources/images/nefarious nibbles.jpg");
			showUserAbilityCard();
		}
		else if (ac8Purchased.equals("Yes"))
		{
			abilityCard1_1 = new ImageIcon("resources/images/sneaky smooch.jpg");
			showUserAbilityCard();
		}
		else if (ac9Purchased.equals("Yes"))
		{
			abilityCard1_1 = new ImageIcon("resources/images/quantum quake.jpg");
			showUserAbilityCard();
		}
		else if (ac10Purchased.equals("Yes"))
		{
			abilityCard1_1 = new ImageIcon("resources/images/subatomic swap.jpg");
			showUserAbilityCard();
		}
        
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
		
		JButton shopButton = new JButton("Shop");
		shopButton.setBounds(18, 611, 149, 45);
		frame.getContentPane().add(shopButton);
		shopButton.setEnabled(false);
		
		shopButton.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				timer.cancel();
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
				timer.cancel();
				frame.setVisible(false);
				MainMenuScreen ms = new MainMenuScreen();
				ms.showMainMenuScreen();
			}
		});
		
		JButton aiAbility = new JButton("AI Ability");
		aiAbility.setBounds(264, 44, 94, 150);
		frame.getContentPane().add(aiAbility);
		
		attackAiAC1 = new JButton("ATTACK");
		attackAiAC1.setBounds(528, 356, 94, 13);
		frame.getContentPane().add(attackAiAC1);
		attackAiAC1.setVisible(false);
		attackAiAC1.setEnabled(false);
		
		attackAiAC1.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				if (ba1Used)
				{
					damage1 = baCardsArray[0].getAttack();
					health1 = baCardsArray2[0].getHealth();
					System.out.println(health1);
					health1 -= damage1;
					baCardsArray2[0].setHealth(health1);
					System.out.println(baCardsArray2[0].getHealth());
					if (health1 <= 0)
					{
						System.out.println("Card died");
						actionHistory.append(baCardsArray2[0].getName() + " was killed by " + baCardsArray[0].getName());
						actionHistory.append("\n");
						aiArenaCard1.setVisible(false);
		                userArenaCard1.setEnabled(true);
		                userArenaCard2.setEnabled(true);
		                userArenaCard3.setEnabled(true);
						attackAiAC1.setVisible(false);
						attackAiAC1.setEnabled(false);
						attackAiAC2.setVisible(false);
						attackAiAC2.setEnabled(false);
						attackAiAC3.setVisible(false);
						attackAiAC3.setEnabled(false);
						Timer delay1 = new Timer();
						delay1.schedule(new TimerTask() {
								public void run() {
									String message = "It's the AI's turn!";
					                JOptionPane.showMessageDialog(frame, message, "Help And Information", JOptionPane.INFORMATION_MESSAGE);
								}
						}, 1000);
						Timer delay2 = new Timer();
						delay2.schedule(new TimerTask() {
								public void run() {
									if (availableAiCards[aiCardsUsed] == 0)
							        {
							        	Image arenaCard4_1 = aiCard1_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard1 = new JButton(arenaCard4_3);
										aiArenaCard1.setBounds(528, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard1);
										aiCard1.setEnabled(false);
										check1 = 0;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 1)
							        {
							        	Image arenaCard4_1 = aiCard2_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard1 = new JButton(arenaCard4_3);
										aiArenaCard1.setBounds(528, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard1);
										aiCard2.setEnabled(false);
										check1 = 1;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 2)
							        {
							        	Image arenaCard4_1 = aiCard3_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard1 = new JButton(arenaCard4_3);
										aiArenaCard1.setBounds(528, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard1);
										aiCard3.setEnabled(false);
										check1 = 2;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 3)
							        {
							        	Image arenaCard4_1 = aiCard4_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard1 = new JButton(arenaCard4_3);
										aiArenaCard1.setBounds(528, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard1);
										aiCard4.setEnabled(false);
										check1 = 3;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 4)
							        {
							        	Image arenaCard4_1 = aiCard5_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard1 = new JButton(arenaCard4_3);
										aiArenaCard1.setBounds(528, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard1);
										aiCard5.setEnabled(false);
										check1 = 4;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 5)
							        {
							        	Image arenaCard4_1 = aiCard6_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard1 = new JButton(arenaCard4_3);
										aiArenaCard1.setBounds(528, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard1);
										aiCard6.setEnabled(false);
										check1 = 5;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 6)
							        {
							        	Image arenaCard4_1 = aiCard7_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard1 = new JButton(arenaCard4_3);
										aiArenaCard1.setBounds(528, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard1);
										aiCard7.setEnabled(false);
										check1 = 6;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 7)
							        {
							        	Image arenaCard4_1 = aiCard8_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard1 = new JButton(arenaCard4_3);
										aiArenaCard1.setBounds(528, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard1);
										aiCard8.setEnabled(false);
										check1 = 7;
										totalAiCards--;
							        }
									aiCardsUsed++;
								}
						}, 2000);
					}
					else 
					{
						System.out.println("Card lost " + damage1 + " health");
						actionHistory.append(baCardsArray[0].getName() + " did " + baCardsArray[0].getAttack() + " damage to " + baCardsArray2[0].getName());
						actionHistory.append("\n");
		                userArenaCard1.setEnabled(true);
		                userArenaCard2.setEnabled(true);
		                userArenaCard3.setEnabled(true);
						attackAiAC1.setVisible(false);
						attackAiAC1.setEnabled(false);
						attackAiAC2.setVisible(false);
						attackAiAC2.setEnabled(false);
						attackAiAC3.setVisible(false);
						attackAiAC3.setEnabled(false);
						Timer delay1 = new Timer();
						delay1.schedule(new TimerTask() {
								public void run() {
									String message = "It's the AI's turn!";
					                JOptionPane.showMessageDialog(frame, message, "Help And Information", JOptionPane.INFORMATION_MESSAGE);
								}
						}, 1000);
					}
					numberOfTurns++;
				}
				else if (ba2Used)
				{
					damage1 = baCardsArray[1].getAttack();
					health1 = baCardsArray2[0].getHealth();
					System.out.println(health1);
					health1 -= damage1;
					baCardsArray2[0].setHealth(health1);
					System.out.println(baCardsArray2[0].getHealth());
					if (health1 <= 0)
					{
						System.out.println("Card died");
						actionHistory.append(baCardsArray2[0].getName() + " was killed by " + baCardsArray[1].getName());
						actionHistory.append("\n");
						aiArenaCard1.setVisible(false);
						String message = "It's the AI's turn!";
		                JOptionPane.showMessageDialog(frame, message, "Help And Information", JOptionPane.INFORMATION_MESSAGE);
						Timer delay2 = new Timer();
						delay2.schedule(new TimerTask() {
								public void run() {
									if (availableAiCards[aiCardsUsed] == 0)
							        {
							        	Image arenaCard4_1 = aiCard1_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard1 = new JButton(arenaCard4_3);
										aiArenaCard1.setBounds(528, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard1);
										aiCard1.setEnabled(false);
										check1 = 0;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 1)
							        {
							        	Image arenaCard4_1 = aiCard2_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard1 = new JButton(arenaCard4_3);
										aiArenaCard1.setBounds(528, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard1);
										aiCard2.setEnabled(false);
										check1 = 1;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 2)
							        {
							        	Image arenaCard4_1 = aiCard3_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard1 = new JButton(arenaCard4_3);
										aiArenaCard1.setBounds(528, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard1);
										aiCard3.setEnabled(false);
										check1 = 2;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 3)
							        {
							        	Image arenaCard4_1 = aiCard4_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard1 = new JButton(arenaCard4_3);
										aiArenaCard1.setBounds(528, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard1);
										aiCard4.setEnabled(false);
										check1 = 3;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 4)
							        {
							        	Image arenaCard4_1 = aiCard5_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard1 = new JButton(arenaCard4_3);
										aiArenaCard1.setBounds(528, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard1);
										aiCard5.setEnabled(false);
										check1 = 4;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 5)
							        {
							        	Image arenaCard4_1 = aiCard6_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard1 = new JButton(arenaCard4_3);
										aiArenaCard1.setBounds(528, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard1);
										aiCard6.setEnabled(false);
										check1 = 5;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 6)
							        {
							        	Image arenaCard4_1 = aiCard7_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard1 = new JButton(arenaCard4_3);
										aiArenaCard1.setBounds(528, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard1);
										aiCard7.setEnabled(false);
										check1 = 6;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 7)
							        {
							        	Image arenaCard4_1 = aiCard8_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard1 = new JButton(arenaCard4_3);
										aiArenaCard1.setBounds(528, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard1);
										aiCard8.setEnabled(false);
										check1 = 7;
										totalAiCards--;
							        }
									aiCardsUsed++;
								}
						}, 2000);
					}
					else 
					{
						System.out.println("Card lost " + damage1 + " health");
						actionHistory.append(baCardsArray[1].getName() + " did " + baCardsArray[1].getAttack() + " damage to " + baCardsArray2[0].getName());
						actionHistory.append("\n");
						String message = "It's the AI's turn!";
		                JOptionPane.showMessageDialog(frame, message, "Help And Information", JOptionPane.INFORMATION_MESSAGE);
					}
					numberOfTurns++;
				}
				else if (ba3Used)
				{
					damage1 = baCardsArray[2].getAttack();
					health1 = baCardsArray2[0].getHealth();
					System.out.println(health1);
					health1 -= damage1;
					baCardsArray2[0].setHealth(health1);
					System.out.println(baCardsArray2[0].getHealth());
					if (health1 <= 0)
					{
						System.out.println("Card died");
						actionHistory.append(baCardsArray2[0].getName() + " was killed by " + baCardsArray[2].getName());
						actionHistory.append("\n");
						aiArenaCard1.setVisible(false);
						String message = "It's the AI's turn!";
		                JOptionPane.showMessageDialog(frame, message, "Help And Information", JOptionPane.INFORMATION_MESSAGE);
						Timer delay2 = new Timer();
						delay2.schedule(new TimerTask() {
								public void run() {
									if (availableAiCards[aiCardsUsed] == 0)
							        {
							        	Image arenaCard4_1 = aiCard1_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard1 = new JButton(arenaCard4_3);
										aiArenaCard1.setBounds(528, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard1);
										aiCard1.setEnabled(false);
										check1 = 0;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 1)
							        {
							        	Image arenaCard4_1 = aiCard2_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard1 = new JButton(arenaCard4_3);
										aiArenaCard1.setBounds(528, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard1);
										aiCard2.setEnabled(false);
										check1 = 1;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 2)
							        {
							        	Image arenaCard4_1 = aiCard3_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard1 = new JButton(arenaCard4_3);
										aiArenaCard1.setBounds(528, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard1);
										aiCard3.setEnabled(false);
										check1 = 2;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 3)
							        {
							        	Image arenaCard4_1 = aiCard4_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard1 = new JButton(arenaCard4_3);
										aiArenaCard1.setBounds(528, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard1);
										aiCard4.setEnabled(false);
										check1 = 3;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 4)
							        {
							        	Image arenaCard4_1 = aiCard5_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard1 = new JButton(arenaCard4_3);
										aiArenaCard1.setBounds(528, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard1);
										aiCard5.setEnabled(false);
										check1 = 4;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 5)
							        {
							        	Image arenaCard4_1 = aiCard6_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard1 = new JButton(arenaCard4_3);
										aiArenaCard1.setBounds(528, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard1);
										aiCard6.setEnabled(false);
										check1 = 5;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 6)
							        {
							        	Image arenaCard4_1 = aiCard7_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard1 = new JButton(arenaCard4_3);
										aiArenaCard1.setBounds(528, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard1);
										aiCard7.setEnabled(false);
										check1 = 6;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 7)
							        {
							        	Image arenaCard4_1 = aiCard8_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard1 = new JButton(arenaCard4_3);
										aiArenaCard1.setBounds(528, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard1);
										aiCard8.setEnabled(false);
										check1 = 7;
										totalAiCards--;
							        }
									aiCardsUsed++;
								}
						}, 2000);
					}
					else 
					{
						System.out.println("Card lost " + damage1 + " health");
						actionHistory.append(baCardsArray[2].getName() + " did " + baCardsArray[2].getAttack() + " damage to " + baCardsArray2[0].getName());
						actionHistory.append("\n");
						String message = "It's the AI's turn!";
		                JOptionPane.showMessageDialog(frame, message, "Help And Information", JOptionPane.INFORMATION_MESSAGE);
					}
					numberOfTurns++;
				}
			}
		});
		
		attackAiAC2 = new JButton("ATTACK");
		attackAiAC2.setBounds(634, 356, 94, 13);
		frame.getContentPane().add(attackAiAC2);
		attackAiAC2.setVisible(false);
		attackAiAC2.setEnabled(false);
		
		attackAiAC2.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				if (ba1Used)
				{
					damage1 = baCardsArray[0].getAttack();
					health1 = baCardsArray2[1].getHealth();
					System.out.println(health1);
					health1 -= damage1;
					baCardsArray2[0].setHealth(health1);
					System.out.println(baCardsArray2[1].getHealth());
					if (health1 <= 0)
					{
						System.out.println("Card died");
						actionHistory.append(baCardsArray2[1].getName() + " was killed by " + baCardsArray[0].getName());
						actionHistory.append("\n");
						aiArenaCard1.setVisible(false);
						String message = "It's the AI's turn!";
		                JOptionPane.showMessageDialog(frame, message, "Help And Information", JOptionPane.INFORMATION_MESSAGE);
						Timer delay2 = new Timer();
						delay2.schedule(new TimerTask() {
								public void run() {
									if (availableAiCards[aiCardsUsed] == 0)
							        {
							        	Image arenaCard4_1 = aiCard1_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard2 = new JButton(arenaCard4_3);
										aiArenaCard2.setBounds(634, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard2);
										aiCard1.setEnabled(false);
										check2 = 0;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 1)
							        {
							        	Image arenaCard4_1 = aiCard2_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard2 = new JButton(arenaCard4_3);
										aiArenaCard2.setBounds(634, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard2);
										aiCard2.setEnabled(false);
										check2 = 1;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 2)
							        {
							        	Image arenaCard4_1 = aiCard3_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard2 = new JButton(arenaCard4_3);
										aiArenaCard2.setBounds(634, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard2);
										aiCard3.setEnabled(false);
										check2 = 2;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 3)
							        {
							        	Image arenaCard4_1 = aiCard4_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard2 = new JButton(arenaCard4_3);
										aiArenaCard2.setBounds(634, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard2);
										aiCard4.setEnabled(false);
										check2 = 3;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 4)
							        {
							        	Image arenaCard4_1 = aiCard5_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard2 = new JButton(arenaCard4_3);
										aiArenaCard2.setBounds(634, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard2);
										aiCard5.setEnabled(false);
										check2 = 4;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 5)
							        {
							        	Image arenaCard4_1 = aiCard6_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard2 = new JButton(arenaCard4_3);
										aiArenaCard2.setBounds(634, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard2);
										aiCard6.setEnabled(false);
										check2 = 5;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 6)
							        {
							        	Image arenaCard4_1 = aiCard7_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard2 = new JButton(arenaCard4_3);
										aiArenaCard2.setBounds(634, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard2);
										aiCard7.setEnabled(false);
										check2 = 6;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 7)
							        {
							        	Image arenaCard4_1 = aiCard8_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard2 = new JButton(arenaCard4_3);
										aiArenaCard2.setBounds(634, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard2);
										aiCard8.setEnabled(false);
										check2 = 7;
										totalAiCards--;
							        }
									aiCardsUsed++;
								}
						}, 2000);
					}
					else 
					{
						System.out.println("Card lost " + damage1 + " health");
						actionHistory.append(baCardsArray[0].getName() + " did " + baCardsArray[0].getAttack() + " damage to " + baCardsArray2[1].getName());
						actionHistory.append("\n");
						String message = "It's the AI's turn!";
		                JOptionPane.showMessageDialog(frame, message, "Help And Information", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				else if (ba2Used)
				{
					damage1 = baCardsArray[1].getAttack();
					health1 = baCardsArray2[1].getHealth();
					System.out.println(health1);
					health1 -= damage1;
					baCardsArray2[0].setHealth(health1);
					System.out.println(baCardsArray2[1].getHealth());
					if (health1 <= 0)
					{
						System.out.println("Card died");
						actionHistory.append(baCardsArray2[1].getName() + " was killed by " + baCardsArray[1].getName());
						actionHistory.append("\n");
						aiArenaCard1.setVisible(false);
						String message = "It's the AI's turn!";
		                JOptionPane.showMessageDialog(frame, message, "Help And Information", JOptionPane.INFORMATION_MESSAGE);
						Timer delay2 = new Timer();
						delay2.schedule(new TimerTask() {
								public void run() {
									if (availableAiCards[aiCardsUsed] == 0)
							        {
							        	Image arenaCard4_1 = aiCard1_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard2 = new JButton(arenaCard4_3);
										aiArenaCard2.setBounds(634, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard2);
										aiCard1.setEnabled(false);
										check2 = 0;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 1)
							        {
							        	Image arenaCard4_1 = aiCard2_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard2 = new JButton(arenaCard4_3);
										aiArenaCard2.setBounds(634, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard2);
										aiCard2.setEnabled(false);
										check2 = 1;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 2)
							        {
							        	Image arenaCard4_1 = aiCard3_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard2 = new JButton(arenaCard4_3);
										aiArenaCard2.setBounds(634, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard2);
										aiCard3.setEnabled(false);
										check2 = 2;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 3)
							        {
							        	Image arenaCard4_1 = aiCard4_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard2 = new JButton(arenaCard4_3);
										aiArenaCard2.setBounds(634, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard2);
										aiCard4.setEnabled(false);
										check2 = 3;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 4)
							        {
							        	Image arenaCard4_1 = aiCard5_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard2 = new JButton(arenaCard4_3);
										aiArenaCard2.setBounds(634, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard2);
										aiCard5.setEnabled(false);
										check2 = 4;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 5)
							        {
							        	Image arenaCard4_1 = aiCard6_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard2 = new JButton(arenaCard4_3);
										aiArenaCard2.setBounds(634, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard2);
										aiCard6.setEnabled(false);
										check2 = 5;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 6)
							        {
							        	Image arenaCard4_1 = aiCard7_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard2 = new JButton(arenaCard4_3);
										aiArenaCard2.setBounds(634, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard2);
										aiCard7.setEnabled(false);
										check2 = 6;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 7)
							        {
							        	Image arenaCard4_1 = aiCard8_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard2 = new JButton(arenaCard4_3);
										aiArenaCard2.setBounds(634, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard2);
										aiCard8.setEnabled(false);
										check2 = 7;
										totalAiCards--;
							        }
									aiCardsUsed++;
								}
						}, 2000);
					}
					else 
					{
						System.out.println("Card lost " + damage1 + " health");
						actionHistory.append(baCardsArray[1].getName() + " did " + baCardsArray[1].getAttack() + " damage to " + baCardsArray2[1].getName());
						actionHistory.append("\n");
						String message = "It's the AI's turn!";
		                JOptionPane.showMessageDialog(frame, message, "Help And Information", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				else if (ba3Used)
				{
					damage1 = baCardsArray[2].getAttack();
					health1 = baCardsArray2[1].getHealth();
					System.out.println(health1);
					health1 -= damage1;
					baCardsArray2[0].setHealth(health1);
					System.out.println(baCardsArray2[1].getHealth());
					if (health1 <= 0)
					{
						System.out.println("Card died");
						actionHistory.append(baCardsArray2[1].getName() + " was killed by " + baCardsArray[2].getName());
						actionHistory.append("\n");
						aiArenaCard1.setVisible(false);
						String message = "It's the AI's turn!";
		                JOptionPane.showMessageDialog(frame, message, "Help And Information", JOptionPane.INFORMATION_MESSAGE);
						Timer delay2 = new Timer();
						delay2.schedule(new TimerTask() {
								public void run() {
									if (availableAiCards[aiCardsUsed] == 0)
							        {
							        	Image arenaCard4_1 = aiCard1_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard2 = new JButton(arenaCard4_3);
										aiArenaCard2.setBounds(634, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard2);
										aiCard1.setEnabled(false);
										check2 = 0;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 1)
							        {
							        	Image arenaCard4_1 = aiCard2_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard2 = new JButton(arenaCard4_3);
										aiArenaCard2.setBounds(634, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard2);
										aiCard2.setEnabled(false);
										check2 = 1;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 2)
							        {
							        	Image arenaCard4_1 = aiCard3_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard2 = new JButton(arenaCard4_3);
										aiArenaCard2.setBounds(634, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard2);
										aiCard3.setEnabled(false);
										check2 = 2;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 3)
							        {
							        	Image arenaCard4_1 = aiCard4_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard2 = new JButton(arenaCard4_3);
										aiArenaCard2.setBounds(634, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard2);
										aiCard4.setEnabled(false);
										check2 = 3;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 4)
							        {
							        	Image arenaCard4_1 = aiCard5_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard2 = new JButton(arenaCard4_3);
										aiArenaCard2.setBounds(634, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard2);
										aiCard5.setEnabled(false);
										check2 = 4;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 5)
							        {
							        	Image arenaCard4_1 = aiCard6_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard2 = new JButton(arenaCard4_3);
										aiArenaCard2.setBounds(634, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard2);
										aiCard6.setEnabled(false);
										check2 = 5;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 6)
							        {
							        	Image arenaCard4_1 = aiCard7_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard2 = new JButton(arenaCard4_3);
										aiArenaCard2.setBounds(634, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard2);
										aiCard7.setEnabled(false);
										check2 = 6;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 7)
							        {
							        	Image arenaCard4_1 = aiCard8_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard2 = new JButton(arenaCard4_3);
										aiArenaCard2.setBounds(634, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard2);
										aiCard8.setEnabled(false);
										check2 = 7;
										totalAiCards--;
							        }
									aiCardsUsed++;
								}
						}, 2000);
					}
					else 
					{
						System.out.println("Card lost " + damage1 + " health");
						actionHistory.append(baCardsArray[2].getName() + " did " + baCardsArray[2].getAttack() + " damage to " + baCardsArray2[1].getName());
						actionHistory.append("\n");
						String message = "It's the AI's turn!";
		                JOptionPane.showMessageDialog(frame, message, "Help And Information", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		});
		
		attackAiAC3 = new JButton("ATTACK");
		attackAiAC3.setBounds(740, 356, 94, 13);
		frame.getContentPane().add(attackAiAC3);
		attackAiAC3.setVisible(false);
		attackAiAC3.setEnabled(false);
		
		attackAiAC3.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				if (ba1Used)
				{
					damage1 = baCardsArray[0].getAttack();
					health1 = baCardsArray2[2].getHealth();
					System.out.println(health1);
					health1 -= damage1;
					baCardsArray2[0].setHealth(health1);
					System.out.println(baCardsArray2[2].getHealth());
					if (health1 <= 0)
					{
						System.out.println("Card died");
						actionHistory.append(baCardsArray2[2].getName() + " was killed by " + baCardsArray[0].getName());
						actionHistory.append("\n");
						aiArenaCard1.setVisible(false);
						String message = "It's the AI's turn!";
		                JOptionPane.showMessageDialog(frame, message, "Help And Information", JOptionPane.INFORMATION_MESSAGE);
						Timer delay2 = new Timer();
						delay2.schedule(new TimerTask() {
								public void run() {
									if (availableAiCards[aiCardsUsed] == 0)
							        {
							        	Image arenaCard4_1 = aiCard1_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard3 = new JButton(arenaCard4_3);
										aiArenaCard3.setBounds(740, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard3);
										aiCard1.setEnabled(false);
										check1 = 0;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 1)
							        {
							        	Image arenaCard4_1 = aiCard2_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard3 = new JButton(arenaCard4_3);
										aiArenaCard3.setBounds(740, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard3);
										aiCard2.setEnabled(false);
										check1 = 1;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 2)
							        {
							        	Image arenaCard4_1 = aiCard3_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard3 = new JButton(arenaCard4_3);
										aiArenaCard3.setBounds(740, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard3);
										aiCard3.setEnabled(false);
										check1 = 2;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 3)
							        {
							        	Image arenaCard4_1 = aiCard4_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard3 = new JButton(arenaCard4_3);
										aiArenaCard3.setBounds(740, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard3);
										aiCard4.setEnabled(false);
										check1 = 3;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 4)
							        {
							        	Image arenaCard4_1 = aiCard5_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard3 = new JButton(arenaCard4_3);
										aiArenaCard3.setBounds(740, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard3);
										aiCard5.setEnabled(false);
										check1 = 4;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 5)
							        {
							        	Image arenaCard4_1 = aiCard6_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard3 = new JButton(arenaCard4_3);
										aiArenaCard3.setBounds(740, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard3);
										aiCard6.setEnabled(false);
										check1 = 5;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 6)
							        {
							        	Image arenaCard4_1 = aiCard7_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard3 = new JButton(arenaCard4_3);
										aiArenaCard3.setBounds(740, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard3);
										aiCard7.setEnabled(false);
										check1 = 6;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 7)
							        {
							        	Image arenaCard4_1 = aiCard8_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard3 = new JButton(arenaCard4_3);
										aiArenaCard3.setBounds(740, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard3);
										aiCard8.setEnabled(false);
										check1 = 7;
										totalAiCards--;
							        }
									aiCardsUsed++;
								}
						}, 2000);
					}
					else 
					{
						System.out.println("Card lost " + damage1 + " health");
						actionHistory.append(baCardsArray[0].getName() + " did " + baCardsArray[0].getAttack() + " damage to " + baCardsArray2[2].getName());
						actionHistory.append("\n");
						String message = "It's the AI's turn!";
		                JOptionPane.showMessageDialog(frame, message, "Help And Information", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				else if (ba2Used)
				{
					damage1 = baCardsArray[1].getAttack();
					health1 = baCardsArray2[2].getHealth();
					System.out.println(health1);
					health1 -= damage1;
					baCardsArray2[0].setHealth(health1);
					System.out.println(baCardsArray2[2].getHealth());
					if (health1 <= 0)
					{
						System.out.println("Card died");
						actionHistory.append(baCardsArray2[2].getName() + " was killed by " + baCardsArray[1].getName());
						actionHistory.append("\n");
						aiArenaCard1.setVisible(false);
						String message = "It's the AI's turn!";
		                JOptionPane.showMessageDialog(frame, message, "Help And Information", JOptionPane.INFORMATION_MESSAGE);
						Timer delay2 = new Timer();
						delay2.schedule(new TimerTask() {
								public void run() {
									if (availableAiCards[aiCardsUsed] == 0)
							        {
							        	Image arenaCard4_1 = aiCard1_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard3 = new JButton(arenaCard4_3);
										aiArenaCard3.setBounds(740, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard3);
										aiCard1.setEnabled(false);
										check1 = 0;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 1)
							        {
							        	Image arenaCard4_1 = aiCard2_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard3 = new JButton(arenaCard4_3);
										aiArenaCard3.setBounds(740, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard3);
										aiCard2.setEnabled(false);
										check1 = 1;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 2)
							        {
							        	Image arenaCard4_1 = aiCard3_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard3 = new JButton(arenaCard4_3);
										aiArenaCard3.setBounds(740, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard3);
										aiCard3.setEnabled(false);
										check1 = 2;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 3)
							        {
							        	Image arenaCard4_1 = aiCard4_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard3 = new JButton(arenaCard4_3);
										aiArenaCard3.setBounds(740, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard3);
										aiCard4.setEnabled(false);
										check1 = 3;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 4)
							        {
							        	Image arenaCard4_1 = aiCard5_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard3 = new JButton(arenaCard4_3);
										aiArenaCard3.setBounds(740, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard3);
										aiCard5.setEnabled(false);
										check1 = 4;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 5)
							        {
							        	Image arenaCard4_1 = aiCard6_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard3 = new JButton(arenaCard4_3);
										aiArenaCard3.setBounds(740, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard3);
										aiCard6.setEnabled(false);
										check1 = 5;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 6)
							        {
							        	Image arenaCard4_1 = aiCard7_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard3 = new JButton(arenaCard4_3);
										aiArenaCard3.setBounds(740, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard3);
										aiCard7.setEnabled(false);
										check1 = 6;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 7)
							        {
							        	Image arenaCard4_1 = aiCard8_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard3 = new JButton(arenaCard4_3);
										aiArenaCard3.setBounds(740, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard3);
										aiCard8.setEnabled(false);
										check1 = 7;
										totalAiCards--;
							        }
									aiCardsUsed++;
								}
						}, 2000);
					}
					else 
					{
						System.out.println("Card lost " + damage1 + " health");
						actionHistory.append(baCardsArray[1].getName() + " did " + baCardsArray[1].getAttack() + " damage to " + baCardsArray2[2].getName());
						actionHistory.append("\n");
						String message = "It's the AI's turn!";
		                JOptionPane.showMessageDialog(frame, message, "Help And Information", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				else if (ba3Used)
				{
					damage1 = baCardsArray[2].getAttack();
					health1 = baCardsArray2[2].getHealth();
					System.out.println(health1);
					health1 -= damage1;
					baCardsArray2[0].setHealth(health1);
					System.out.println(baCardsArray2[2].getHealth());
					if (health1 <= 0)
					{
						System.out.println("Card died");
						actionHistory.append(baCardsArray2[2].getName() + " was killed by " + baCardsArray[2].getName());
						actionHistory.append("\n");
						aiArenaCard1.setVisible(false);
						String message = "It's the AI's turn!";
		                JOptionPane.showMessageDialog(frame, message, "Help And Information", JOptionPane.INFORMATION_MESSAGE);
						Timer delay2 = new Timer();
						delay2.schedule(new TimerTask() {
								public void run() {
									if (availableAiCards[aiCardsUsed] == 0)
							        {
							        	Image arenaCard4_1 = aiCard1_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard3 = new JButton(arenaCard4_3);
										aiArenaCard3.setBounds(740, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard3);
										aiCard1.setEnabled(false);
										check1 = 0;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 1)
							        {
							        	Image arenaCard4_1 = aiCard2_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard3 = new JButton(arenaCard4_3);
										aiArenaCard3.setBounds(740, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard3);
										aiCard2.setEnabled(false);
										check1 = 1;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 2)
							        {
							        	Image arenaCard4_1 = aiCard3_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard3 = new JButton(arenaCard4_3);
										aiArenaCard3.setBounds(740, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard3);
										aiCard3.setEnabled(false);
										check1 = 2;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 3)
							        {
							        	Image arenaCard4_1 = aiCard4_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard3 = new JButton(arenaCard4_3);
										aiArenaCard3.setBounds(740, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard3);
										aiCard4.setEnabled(false);
										check1 = 3;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 4)
							        {
							        	Image arenaCard4_1 = aiCard5_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard3 = new JButton(arenaCard4_3);
										aiArenaCard3.setBounds(740, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard3);
										aiCard5.setEnabled(false);
										check1 = 4;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 5)
							        {
							        	Image arenaCard4_1 = aiCard6_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard3 = new JButton(arenaCard4_3);
										aiArenaCard3.setBounds(740, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard3);
										aiCard6.setEnabled(false);
										check1 = 5;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 6)
							        {
							        	Image arenaCard4_1 = aiCard7_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard3 = new JButton(arenaCard4_3);
										aiArenaCard3.setBounds(740, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard3);
										aiCard7.setEnabled(false);
										check1 = 6;
										totalAiCards--;
							        }
									else if (availableAiCards[aiCardsUsed] == 7)
							        {
							        	Image arenaCard4_1 = aiCard8_1.getImage();
										Image arenaCard4_2 = arenaCard4_1.getScaledInstance(94, 150, Image.SCALE_SMOOTH);
										ImageIcon arenaCard4_3 = new ImageIcon(arenaCard4_2);
										
										aiArenaCard3 = new JButton(arenaCard4_3);
										aiArenaCard3.setBounds(740, 206, 94, 150);
										frame.getContentPane().add(aiArenaCard3);
										aiCard8.setEnabled(false);
										check1 = 7;
										totalAiCards--;
							        }
									aiCardsUsed++;
								}
						}, 2000);
					}
					else 
					{
						System.out.println("Card lost " + damage1 + " health");
						actionHistory.append(baCardsArray[2].getName() + " did " + baCardsArray[2].getAttack() + " damage to " + baCardsArray2[2].getName());
						actionHistory.append("\n");
						String message = "It's the AI's turn!";
		                JOptionPane.showMessageDialog(frame, message, "Help And Information", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		});
		
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
		selectCard1.setVisible(false);
		
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
					useAC1.setVisible(true);
					useAC1.setEnabled(false);
					health = user1Health;
					attack = user1Attack;
					coinsDropped = user1CoinsDropped;
					name = user1Name;
					tier = user1Tier;
					baCardsArray[0] = new userCard (health, attack, coinsDropped, name, tier);
				}
				else if (battleArenaCards == 1)
				{
					userArenaCard2 = new JButton(arenaCard_3);
					userArenaCard2.setBounds(634, 368, 94, 150);
					frame.getContentPane().add(userArenaCard2);
					useAC2.setVisible(true);
					useAC2.setEnabled(false);
					health = user1Health;
					attack = user1Attack;
					coinsDropped = user1CoinsDropped;
					name = user1Name;
					tier = user1Tier;
					baCardsArray[1] = new userCard (health, attack, coinsDropped, name, tier);
				}
				else if (battleArenaCards == 2)
				{
					userArenaCard3 = new JButton(arenaCard_3);
					userArenaCard3.setBounds(740, 368, 94, 150);
					frame.getContentPane().add(userArenaCard3);
					endTurn.setEnabled(true);
					placeCards.setVisible(false);
					useAC3.setVisible(true);
					useAC1.setEnabled(true);
					useAC2.setEnabled(true);
					useAC3.setEnabled(true);
					health = user1Health;
					attack = user1Attack;
					coinsDropped = user1CoinsDropped;
					name = user1Name;
					tier = user1Tier;
					baCardsArray[2] = new userCard (health, attack, coinsDropped, name, tier);
				}
				battleArenaCards++;
				aiCheck1();
			}
		});
		
		JButton selectCard2 = new JButton("SELECT");
		selectCard2.setBounds(476, 690, 94, 21);
		frame.getContentPane().add(selectCard2);
		selectCard2.setVisible(false);
		
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
					useAC1.setVisible(true);
					useAC1.setEnabled(false);
					health = user2Health;
					attack = user2Attack;
					coinsDropped = user2CoinsDropped;
					name = user2Name;
					tier = user2Tier;
					baCardsArray[0] = new userCard (health, attack, coinsDropped, name, tier);
				}
				else if (battleArenaCards == 1)
				{
					userArenaCard2 = new JButton(arenaCard_3);
					userArenaCard2.setBounds(634, 368, 94, 150);
					frame.getContentPane().add(userArenaCard2);
					useAC2.setVisible(true);
					useAC2.setEnabled(false);
					health = user2Health;
					attack = user2Attack;
					coinsDropped = user2CoinsDropped;
					name = user2Name;
					tier = user2Tier;
					baCardsArray[1] = new userCard (health, attack, coinsDropped, name, tier);
				}
				else if (battleArenaCards == 2)
				{
					userArenaCard3 = new JButton(arenaCard_3);
					userArenaCard3.setBounds(740, 368, 94, 150);
					frame.getContentPane().add(userArenaCard3);
					endTurn.setEnabled(true);
					placeCards.setVisible(false);
					useAC3.setVisible(true);
					useAC1.setEnabled(true);
					useAC2.setEnabled(true);
					useAC3.setEnabled(true);
					health = user2Health;
					attack = user2Attack;
					coinsDropped = user2CoinsDropped;
					name = user2Name;
					tier = user2Tier;
					baCardsArray[2] = new userCard (health, attack, coinsDropped, name, tier);
				}
				battleArenaCards++;
				aiCheck1();
			}
		});
		
		JButton selectCard3 = new JButton("SELECT");
		selectCard3.setBounds(584, 690, 94, 21);
		frame.getContentPane().add(selectCard3);
		selectCard3.setVisible(false);
		
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
					useAC1.setVisible(true);
					useAC1.setEnabled(false);
					health = user3Health;
					attack = user3Attack;
					coinsDropped = user3CoinsDropped;
					name = user3Name;
					tier = user3Tier;
					baCardsArray[0] = new userCard (health, attack, coinsDropped, name, tier);
				}
				else if (battleArenaCards == 1)
				{
					userArenaCard2 = new JButton(arenaCard_3);
					userArenaCard2.setBounds(634, 368, 94, 150);
					frame.getContentPane().add(userArenaCard2);
					useAC2.setVisible(true);
					useAC2.setEnabled(false);
					health = user3Health;
					attack = user3Attack;
					coinsDropped = user3CoinsDropped;
					name = user3Name;
					tier = user3Tier;
					baCardsArray[1] = new userCard (health, attack, coinsDropped, name, tier);
				}
				else if (battleArenaCards == 2)
				{
					userArenaCard3 = new JButton(arenaCard_3);
					userArenaCard3.setBounds(740, 368, 94, 150);
					frame.getContentPane().add(userArenaCard3);
					endTurn.setEnabled(true);
					placeCards.setVisible(false);
					useAC3.setVisible(true);
					useAC1.setEnabled(true);
					useAC2.setEnabled(true);
					useAC3.setEnabled(true);
					health = user3Health;
					attack = user3Attack;
					coinsDropped = user3CoinsDropped;
					name = user3Name;
					tier = user3Tier;
					baCardsArray[2] = new userCard (health, attack, coinsDropped, name, tier);
				}
				battleArenaCards++;
				aiCheck1();
			}
		});
		
		JButton selectCard4 = new JButton("SELECT");
		selectCard4.setBounds(688, 690, 94, 21);
		frame.getContentPane().add(selectCard4);
		selectCard4.setVisible(false);
		
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
					useAC1.setVisible(true);
					useAC1.setEnabled(false);
					health = user4Health;
					attack = user4Attack;
					coinsDropped = user4CoinsDropped;
					name = user4Name;
					tier = user4Tier;
					baCardsArray[0] = new userCard (health, attack, coinsDropped, name, tier);
				}
				else if (battleArenaCards == 1)
				{
					userArenaCard2 = new JButton(arenaCard_3);
					userArenaCard2.setBounds(634, 368, 94, 150);
					frame.getContentPane().add(userArenaCard2);
					useAC2.setVisible(true);
					useAC2.setEnabled(false);
					health = user4Health;
					attack = user4Attack;
					coinsDropped = user4CoinsDropped;
					name = user4Name;
					tier = user4Tier;
					baCardsArray[1] = new userCard (health, attack, coinsDropped, name, tier);
				}
				else if (battleArenaCards == 2)
				{
					userArenaCard3 = new JButton(arenaCard_3);
					userArenaCard3.setBounds(740, 368, 94, 150);
					frame.getContentPane().add(userArenaCard3);
					endTurn.setEnabled(true);
					placeCards.setVisible(false);
					useAC3.setVisible(true);
					useAC1.setEnabled(true);
					useAC2.setEnabled(true);
					useAC3.setEnabled(true);
					health = user4Health;
					attack = user4Attack;
					coinsDropped = user4CoinsDropped;
					name = user4Name;
					tier = user4Tier;
					baCardsArray[2] = new userCard (health, attack, coinsDropped, name, tier);
				}
				battleArenaCards++;
				aiCheck1();
			}
		});
		
		JButton selectCard5 = new JButton("SELECT");
		selectCard5.setBounds(794, 690, 94, 21);
		frame.getContentPane().add(selectCard5);
		selectCard5.setVisible(false);
		
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
					useAC1.setVisible(true);
					useAC1.setEnabled(false);
					health = user5Health;
					attack = user5Attack;
					coinsDropped = user5CoinsDropped;
					name = user5Name;
					tier = user5Tier;
					baCardsArray[0] = new userCard (health, attack, coinsDropped, name, tier);
				}
				else if (battleArenaCards == 1)
				{
					userArenaCard2 = new JButton(arenaCard_3);
					userArenaCard2.setBounds(634, 368, 94, 150);
					frame.getContentPane().add(userArenaCard2);
					useAC2.setVisible(true);
					useAC2.setEnabled(false);
					health = user5Health;
					attack = user5Attack;
					coinsDropped = user5CoinsDropped;
					name = user5Name;
					tier = user5Tier;
					baCardsArray[1] = new userCard (health, attack, coinsDropped, name, tier);
				}
				else if (battleArenaCards == 2)
				{
					userArenaCard3 = new JButton(arenaCard_3);
					userArenaCard3.setBounds(740, 368, 94, 150);
					frame.getContentPane().add(userArenaCard3);
					endTurn.setEnabled(true);
					placeCards.setVisible(false);
					useAC3.setVisible(true);
					useAC1.setEnabled(true);
					useAC2.setEnabled(true);
					useAC3.setEnabled(true);
					health = user5Health;
					attack = user5Attack;
					coinsDropped = user5CoinsDropped;
					name = user5Name;
					tier = user5Tier;
					baCardsArray[2] = new userCard (health, attack, coinsDropped, name, tier);
				}
				battleArenaCards++;
				aiCheck1();
			}
		});
		
		JButton selectCard6 = new JButton("SELECT");
		selectCard6.setBounds(900, 690, 94, 21);
		frame.getContentPane().add(selectCard6);
		selectCard6.setVisible(false);
		
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
					useAC1.setVisible(true);
					useAC1.setEnabled(false);
					health = user6Health;
					attack = user6Attack;
					coinsDropped = user6CoinsDropped;
					name = user6Name;
					tier = user6Tier;
					baCardsArray[0] = new userCard (health, attack, coinsDropped, name, tier);
				}
				else if (battleArenaCards == 1)
				{
					userArenaCard2 = new JButton(arenaCard_3);
					userArenaCard2.setBounds(634, 368, 94, 150);
					frame.getContentPane().add(userArenaCard2);
					useAC2.setVisible(true);
					useAC2.setEnabled(false);
					health = user6Health;
					attack = user6Attack;
					coinsDropped = user6CoinsDropped;
					name = user6Name;
					tier = user6Tier;
					baCardsArray[1] = new userCard (health, attack, coinsDropped, name, tier);
				}
				else if (battleArenaCards == 2)
				{
					userArenaCard3 = new JButton(arenaCard_3);
					userArenaCard3.setBounds(740, 368, 94, 150);
					frame.getContentPane().add(userArenaCard3);
					endTurn.setEnabled(true);
					placeCards.setVisible(false);
					useAC3.setVisible(true);
					useAC1.setEnabled(true);
					useAC2.setEnabled(true);
					useAC3.setEnabled(true);
					health = user6Health;
					attack = user6Attack;
					coinsDropped = user6CoinsDropped;
					name = user6Name;
					tier = user6Tier;
					baCardsArray[2] = new userCard (health, attack, coinsDropped, name, tier);
				}
				battleArenaCards++;
				aiCheck1();
			}
		});
		
		JButton selectCard7 = new JButton("SELECT");
		selectCard7.setBounds(1006, 690, 94, 21);
		frame.getContentPane().add(selectCard7);
		selectCard7.setVisible(false);
		
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
					useAC1.setVisible(true);
					useAC1.setEnabled(false);
					health = user7Health;
					attack = user7Attack;
					coinsDropped = user7CoinsDropped;
					name = user7Name;
					tier = user7Tier;
					baCardsArray[0] = new userCard (health, attack, coinsDropped, name, tier);
				}
				else if (battleArenaCards == 1)
				{
					userArenaCard2 = new JButton(arenaCard_3);
					userArenaCard2.setBounds(634, 368, 94, 150);
					frame.getContentPane().add(userArenaCard2);
					useAC2.setVisible(true);
					useAC2.setEnabled(false);
					health = user7Health;
					attack = user7Attack;
					coinsDropped = user7CoinsDropped;
					name = user7Name;
					tier = user7Tier;
					baCardsArray[1] = new userCard (health, attack, coinsDropped, name, tier);
				}
				else if (battleArenaCards == 2)
				{
					userArenaCard3 = new JButton(arenaCard_3);
					userArenaCard3.setBounds(740, 368, 94, 150);
					frame.getContentPane().add(userArenaCard3);
					endTurn.setEnabled(true);
					placeCards.setVisible(false);
					useAC3.setVisible(true);
					useAC1.setEnabled(true);
					useAC2.setEnabled(true);
					useAC3.setEnabled(true);
					health = user7Health;
					attack = user7Attack;
					coinsDropped = user7CoinsDropped;
					name = user7Name;
					tier = user7Tier;
					baCardsArray[2] = new userCard (health, attack, coinsDropped, name, tier);
				}
				battleArenaCards++;
				aiCheck1();
			}
		});
		
		JButton selectCard8 = new JButton("SELECT");
		selectCard8.setBounds(1112, 690, 94, 21);
		frame.getContentPane().add(selectCard8);
		selectCard8.setVisible(false);
		
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
					useAC1.setVisible(true);
					useAC1.setEnabled(false);
					health = user8Health;
					attack = user8Attack;
					coinsDropped = user8CoinsDropped;
					name = user8Name;
					tier = user8Tier;
					baCardsArray[0] = new userCard (health, attack, coinsDropped, name, tier);
				}
				else if (battleArenaCards == 1)
				{
					userArenaCard2 = new JButton(arenaCard_3);
					userArenaCard2.setBounds(634, 368, 94, 150);
					frame.getContentPane().add(userArenaCard2);
					useAC2.setVisible(true);
					useAC2.setEnabled(false);
					health = user8Health;
					attack = user8Attack;
					coinsDropped = user8CoinsDropped;
					name = user8Name;
					tier = user8Tier;
					baCardsArray[1] = new userCard (health, attack, coinsDropped, name, tier);
				}
				else if (battleArenaCards == 2)
				{
					userArenaCard3 = new JButton(arenaCard_3);
					userArenaCard3.setBounds(740, 368, 94, 150);
					frame.getContentPane().add(userArenaCard3);
					endTurn.setEnabled(true);
					placeCards.setVisible(false);
					useAC3.setVisible(true);
					useAC1.setEnabled(true);
					useAC2.setEnabled(true);
					useAC3.setEnabled(true);
					health = user8Health;
					attack = user8Attack;
					coinsDropped = user8CoinsDropped;
					name = user8Name;
					tier = user8Tier;
					baCardsArray[2] = new userCard (health, attack, coinsDropped, name, tier);
				}
				battleArenaCards++;
				aiCheck1();
			}
		});
		
		JLabel actionHistoryTitle = new JLabel();
        actionHistoryTitle.setText("Action History");
        actionHistoryTitle.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 17));
        actionHistoryTitle.setHorizontalAlignment(SwingConstants.CENTER);
        actionHistoryTitle.setBounds(1351, 99, 137, 45);
        frame.getContentPane().add(actionHistoryTitle);
        
        actionHistory = new JTextArea();
        actionHistory.setFont(new Font("Arial", Font.PLAIN, 9));
        actionHistory.setColumns(2);
        actionHistory.setEditable(false);
        actionHistory.setBounds(1296,154,244,259);
        frame.getContentPane().add(actionHistory);
		
		closeInfo = new JButton("CLOSE INFO");
		closeInfo.setBounds(76, 561, 118, 21);
		frame.getContentPane().add(closeInfo);
		closeInfo.setVisible(false);
		
		cardInfo2 = new JTextArea();
		cardInfo2.setEditable(false);
		cardInfo2.setFont(new Font("Monospaced", Font.BOLD, 16));
		cardInfo2.setBounds(6, 441, 250, 108);
		frame.getContentPane().add(cardInfo2);
		cardInfo2.setVisible(false);
		
		placeCards = new JLabel("Place 3 cards into the battle arena!");
		placeCards.setHorizontalAlignment(SwingConstants.CENTER);
		placeCards.setBounds(932, 496, 232, 13);
		frame.getContentPane().add(placeCards);
		placeCards.setVisible(false);
		
		endTurn = new JButton("END TURN");
		endTurn.setBounds(1003, 213, 107, 21);
		frame.getContentPane().add(endTurn);
		endTurn.setVisible(false);
		endTurn.setEnabled(false);
		
		endTurn.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				firstAiDecision();
			}
		});
		
		useAC1 = new JButton("USE");
		useAC1.setBounds(528, 518, 94, 13);
		frame.getContentPane().add(useAC1);
		useAC1.setVisible(false);
		useAC1.setEnabled(false);
		
		useAC1.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				ba1Used = true;
				String message = "Choose an AI card to attack!";
                JOptionPane.showMessageDialog(frame, message, "Help And Information", JOptionPane.INFORMATION_MESSAGE);
                userCard1.setEnabled(false);
                userCard2.setEnabled(false);
                userCard3.setEnabled(false);
                userCard4.setEnabled(false);
                userCard5.setEnabled(false);
                userCard6.setEnabled(false);
                userCard7.setEnabled(false);
                userCard8.setEnabled(false);
                userArenaCard1.setEnabled(false);
                userArenaCard2.setEnabled(false);
                userArenaCard3.setEnabled(false);
                aiCard1.setEnabled(false);
				aiCard2.setEnabled(false);
				aiCard3.setEnabled(false);
				aiCard4.setEnabled(false);
				aiCard5.setEnabled(false);
				aiCard6.setEnabled(false);
				aiCard7.setEnabled(false);
				aiCard8.setEnabled(false);
				attackAiAC1.setVisible(true);
				attackAiAC1.setEnabled(true);
				attackAiAC2.setVisible(true);
				attackAiAC2.setEnabled(true);
				attackAiAC3.setVisible(true);
				attackAiAC3.setEnabled(true);
			}
		});
		
		useAC2 = new JButton("USE");
		useAC2.setBounds(634, 518, 94, 13);
		frame.getContentPane().add(useAC2);
		useAC2.setVisible(false);
		useAC2.setEnabled(false);
		
		useAC2.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				ba2Used = true;
				String message = "Choose an AI card to attack!";
                JOptionPane.showMessageDialog(frame, message, "Help And Information", JOptionPane.INFORMATION_MESSAGE);
                userCard1.setEnabled(false);
                userCard2.setEnabled(false);
                userCard3.setEnabled(false);
                userCard4.setEnabled(false);
                userCard5.setEnabled(false);
                userCard6.setEnabled(false);
                userCard7.setEnabled(false);
                userCard8.setEnabled(false);
                userArenaCard1.setEnabled(false);
                userArenaCard2.setEnabled(false);
                userArenaCard3.setEnabled(false);
                aiCard1.setEnabled(false);
				aiCard2.setEnabled(false);
				aiCard3.setEnabled(false);
				aiCard4.setEnabled(false);
				aiCard5.setEnabled(false);
				aiCard6.setEnabled(false);
				aiCard7.setEnabled(false);
				aiCard8.setEnabled(false);
				attackAiAC1.setVisible(true);
				attackAiAC1.setEnabled(true);
				attackAiAC2.setVisible(true);
				attackAiAC2.setEnabled(true);
				attackAiAC3.setVisible(true);
				attackAiAC3.setEnabled(true);
			}
		});
		
		useAC3 = new JButton("USE");
		useAC3.setBounds(740, 518, 94, 13);
		frame.getContentPane().add(useAC3);
		useAC3.setVisible(false);
		useAC3.setEnabled(false);
		
		selectAbility1 = new JButton("SELECT");
		selectAbility1.setBounds(264, 690, 94, 21);
		frame.getContentPane().add(selectAbility1);
		selectAbility1.setVisible(false);
		
		useAC3.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				ba3Used = true;
				String message = "Choose an AI card to attack!";
                JOptionPane.showMessageDialog(frame, message, "Help And Information", JOptionPane.INFORMATION_MESSAGE);
                userCard1.setEnabled(false);
                userCard2.setEnabled(false);
                userCard3.setEnabled(false);
                userCard4.setEnabled(false);
                userCard5.setEnabled(false);
                userCard6.setEnabled(false);
                userCard7.setEnabled(false);
                userCard8.setEnabled(false);
                userArenaCard1.setEnabled(false);
                userArenaCard2.setEnabled(false);
                userArenaCard3.setEnabled(false);
                aiCard1.setEnabled(false);
				aiCard2.setEnabled(false);
				aiCard3.setEnabled(false);
				aiCard4.setEnabled(false);
				aiCard5.setEnabled(false);
				aiCard6.setEnabled(false);
				aiCard7.setEnabled(false);
				aiCard8.setEnabled(false);
				attackAiAC1.setVisible(true);
				attackAiAC1.setEnabled(true);
				attackAiAC2.setVisible(true);
				attackAiAC2.setEnabled(true);
				attackAiAC3.setVisible(true);
				attackAiAC3.setEnabled(true);
			}
		});
		
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
		
		userDraw.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				selectCard1.setVisible(true);
				selectCard2.setVisible(true);
				selectCard3.setVisible(true);
				selectCard4.setVisible(true);
				selectCard5.setVisible(true);
				selectCard6.setVisible(true);
				selectCard7.setVisible(true);
				selectCard8.setVisible(true);
				endTurn.setVisible(true);
				userDraw.setEnabled(false);
				placeCards.setVisible(true);
				shopButton.setEnabled(true);
				String message = "It's your turn!";
                JOptionPane.showMessageDialog(frame, message, "Help And Information", JOptionPane.INFORMATION_MESSAGE);
			    
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
			        user1Name = "Razor Rabbit";
			        user1Tier = 1;
				}
				else if (userCards[0] == 1)
				{
					userCard1_1 = new ImageIcon("resources/images/squirrel.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 1;
			        user1Health = 3;
			        user1CoinsDropped = 1;
			        user1Name = "Spike The Squirrel";
			        user1Tier = 2;
				}
				else if (userCards[0] == 2)
				{
					userCard1_1 = new ImageIcon("resources/images/toxicturtle.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 1;
			        user1Health = 5;
			        user1CoinsDropped = 2;
			        user1Name = "Toxic Turtle";
			        user1Tier = 3;
				}
				else if (userCards[0] == 3)
				{
					userCard1_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 3;
			        user1Health = 3;
			        user1CoinsDropped = 3;
			        user1Name = "Fangtail Fox";
			        user1Tier = 4;
				}
				else if (userCards[0] == 4)
				{
					userCard1_1 = new ImageIcon("resources/images/raging raccoon.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 4;
			        user1Health = 3;
			        user1CoinsDropped = 4;
			        user1Name = "Raging Raccoon";
			        user1Tier = 5;
				}
				else if (userCards[0] == 5)
				{
					userCard1_1 = new ImageIcon("resources/images/killer koala.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 1;
			        user1Health = 3;
			        user1CoinsDropped = 2;
			        user1Name = "Killer Koala";
			        user1Tier = 2;
				}
				else if (userCards[0] == 6)
				{
					userCard1_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 1;
			        user1Health = 1;
			        user1CoinsDropped = 1;
			        user1Name = "Chainsaw Chinchilla";
			        user1Tier = 1;
				}
				else if (userCards[0] == 7)
				{
					userCard1_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 2;
			        user1Health = 3;
			        user1CoinsDropped = 2;
			        user1Name = "Slaughter Seahorse";
			        user1Tier = 2;
				}
				else if (userCards[0] == 8)
				{
					userCard1_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 2;
			        user1Health = 3;
			        user1CoinsDropped = 3;
			        user1Name = "Mauler Meerkat";
			        user1Tier = 3;
				}
				else if (userCards[0] == 9)
				{
					userCard1_1 = new ImageIcon("resources/images/venemous vulture.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 3;
			        user1Health = 3;
			        user1CoinsDropped = 3;
			        user1Name = "Venomous Vulture";
			        user1Tier = 4;
				}
				else if (userCards[0] == 10)
				{
					userCard1_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 6;
			        user1Health = 2;
			        user1CoinsDropped = 5;
			        user1Name = "Bloodthirsty Badger";
			        user1Tier = 5;
				}
				else if (userCards[0] == 11)
				{
					userCard1_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 7;
			        user1Health = 5;
			        user1CoinsDropped = 8;
			        user1Name = "Capybara of Carnage";
			        user1Tier = 6;
				}
				else if (userCards[0] == 12)
				{
					userCard1_1 = new ImageIcon("resources/images/homicide hamster.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 1;
			        user1Health = 1;
			        user1CoinsDropped = 1;
			        user1Name = "Homicide Hamster";
			        user1Tier = 1;
				}
				else if (userCards[0] == 13)
				{
					userCard1_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 1;
			        user1Health = 3;
			        user1CoinsDropped = 2;
			        user1Tier = 2;
			        user1Name = "Deathbeak Duckling";
				}
				else if (userCards[0] == 14)
				{
					userCard1_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 2;
			        user1Health = 4;
			        user1CoinsDropped = 3;
			        user1Name = "Razorback Rottweiler";
			        user1Tier = 3;
				}
				else if (userCards[0] == 15)
				{
					userCard1_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 3;
			        user1Health = 4;
			        user1CoinsDropped = 4;
			        user1Name = "Grievous Gorilla";
			        user1Tier = 4;
				}
				else if (userCards[0] == 16)
				{
					userCard1_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 5;
			        user1Health = 2;
			        user1CoinsDropped = 5;
			        user1Name = "Pernicuous Porcupine";
			        user1Tier = 5;
				}
				else if (userCards[0] == 17)
				{
					userCard1_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 6;
			        user1Health = 6;
			        user1CoinsDropped = 8;
			        user1Name = "Malevolent Mongoose";
			        user1Tier = 6;
				}
				else if (userCards[0] == 18)
				{
					userCard1_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 5;
			        user1Health = 3;
			        user1CoinsDropped = 4;
			        user1Name = "Baleful Bald Eagle";
			        user1Tier = 4;
				}
				else if (userCards[0] == 19)
				{
					userCard1_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
			        showCard1();
			        card1 = "Yes";
			        user1Attack = 2;
			        user1Health = 5;
			        user1CoinsDropped = 3;
			        user1Name = "Murderous Mecha-Monkey";
			        user1Tier = 3;
				}
				
				
				if (userCards[1] == 0)
				{
					userCard2_1 = new ImageIcon("resources/images/razer rabbit.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 2;
			        user2Health = 1;
			        user2CoinsDropped = 1;
			        user2Name = "Razor Rabbit";
			        user2Tier = 1;
				}
				else if (userCards[1] == 1)
				{
					userCard2_1 = new ImageIcon("resources/images/squirrel.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 1;
			        user2Health = 3;
			        user2CoinsDropped = 1;
			        user2Name = "Spike The Squirrel";
			        user2Tier = 2;
				}
				else if (userCards[1] == 2)
				{
					userCard2_1 = new ImageIcon("resources/images/toxicturtle.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 1;
			        user2Health = 5;
			        user2CoinsDropped = 2;
			        user2Name = "Toxic Turtle";
			        user2Tier = 3;
				}
				else if (userCards[1] == 3)
				{
					userCard2_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 3;
			        user2Health = 3;
			        user2CoinsDropped = 3;
			        user2Name = "Fangtail Fox";
			        user2Tier = 4;
				}
				else if (userCards[1] == 4)
				{
					userCard2_1 = new ImageIcon("resources/images/raging raccoon.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 4;
			        user2Health = 3;
			        user2CoinsDropped = 4;
			        user2Name = "Raging Raccoon";
			        user2Tier = 5;
				}
				else if (userCards[1] == 5)
				{
					userCard2_1 = new ImageIcon("resources/images/killer koala.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 1;
			        user2Health = 3;
			        user2CoinsDropped = 2;
			        user2Name = "Killer Koala";
			        user2Tier = 2;
				}
				else if (userCards[1] == 6)
				{
					userCard2_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 1;
			        user2Health = 1;
			        user2CoinsDropped = 1;
			        user2Name = "Chainsaw Chinchilla";
			        user2Tier = 1;
				}
				else if (userCards[1] == 7)
				{
					userCard2_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 2;
			        user2Health = 3;
			        user2CoinsDropped = 2;
			        user2Name = "Slaughter Seahorse";
			        user2Tier = 2;
				}
				else if (userCards[1] == 8)
				{
					userCard2_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 2;
			        user2Health = 3;
			        user2CoinsDropped = 3;
			        user2Name = "Mauler Meerkat";
			        user2Tier = 3;
				}
				else if (userCards[1] == 9)
				{
					userCard2_1 = new ImageIcon("resources/images/venemous vulture.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 3;
			        user2Health = 3;
			        user2CoinsDropped = 3;
			        user2Name = "Venomous Vulture";
			        user2Tier = 4;
				}
				else if (userCards[1] == 10)
				{
					userCard2_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 6;
			        user2Health = 2;
			        user2CoinsDropped = 5;
			        user2Name = "Bloodthirsty Badger";
			        user2Tier = 5;
				}
				else if (userCards[1] == 11)
				{
					userCard2_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 7;
			        user2Health = 5;
			        user2CoinsDropped = 8;
			        user2Name = "Capybara of Carnage";
			        user2Tier = 6;
				}
				else if (userCards[1] == 12)
				{
					userCard2_1 = new ImageIcon("resources/images/homicide hamster.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 1;
			        user2Health = 1;
			        user2CoinsDropped = 1;
			        user2Name = "Homicide Hamster";
			        user2Tier = 1;
				}
				else if (userCards[1] == 13)
				{
					userCard2_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 1;
			        user2Health = 3;
			        user2CoinsDropped = 2;
			        user2Name = "Deathbeak Duckling";
			        user2Tier = 2;
				}
				else if (userCards[1] == 14)
				{
					userCard2_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 2;
			        user2Health = 4;
			        user2CoinsDropped = 3;
			        user2Name = "Razorback Rottweiler";
			        user2Tier = 3;
				}
				else if (userCards[1] == 15)
				{
					userCard2_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 3;
			        user2Health = 4;
			        user2CoinsDropped = 4;
			        user2Name = "Grievous Gorilla";
			        user2Tier = 4;
				}
				else if (userCards[1] == 16)
				{
					userCard2_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 5;
			        user2Health = 2;
			        user2CoinsDropped = 5;
			        user2Name = "Pernicuous Porcupine";
			        user2Tier = 5;
				}
				else if (userCards[1] == 17)
				{
					userCard2_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 6;
			        user2Health = 6;
			        user2CoinsDropped = 8;
			        user2Name = "Malevolent Mongoose";
			        user2Tier = 6;
				}
				else if (userCards[1] == 18)
				{
					userCard2_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 5;
			        user2Health = 3;
			        user2CoinsDropped = 4;
			        user2Name = "Baleful Bald Eagle";
			        user2Tier = 4;
				}
				else if (userCards[1] == 19)
				{
					userCard2_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
			        showCard2();
			        card2 = "Yes";
			        user2Attack = 2;
			        user2Health = 5;
			        user2CoinsDropped = 3;
			        user2Name = "Murderous Mecha-Monkey";
			        user2Tier = 3;
				}
				
				
				if (userCards[2] == 0)
				{
				    userCard3_1 = new ImageIcon("resources/images/razer rabbit.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 2;
				    user3Health = 1;
				    user3CoinsDropped = 1;
				    user3Name = "Razor Rabbit";
				    user3Tier = 1;
				}
				else if (userCards[2] == 1)
				{
				    userCard3_1 = new ImageIcon("resources/images/squirrel.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 1;
				    user3Health = 3;
				    user3CoinsDropped = 1;
				    user3Name = "Spike the Squirrel";
				    user3Tier = 2;
				}
				else if (userCards[2] == 2)
				{
				    userCard3_1 = new ImageIcon("resources/images/toxicturtle.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 1;
				    user3Health = 5;
				    user3CoinsDropped = 2;
				    user3Name = "Toxic Turtle";
				    user3Tier = 3;
				}
				else if (userCards[2] == 3)
				{
				    userCard3_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 3;
				    user3Health = 3;
				    user3CoinsDropped = 3;
				    user3Name = "Fangtail Fox Card";
				    user3Tier = 4;
				}
				else if (userCards[2] == 4)
				{
				    userCard3_1 = new ImageIcon("resources/images/raging raccoon.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 4;
				    user3Health = 3;
				    user3CoinsDropped = 4;
				    user3Name = "Raging Raccoon";
				    user3Tier = 5;
				}
				else if (userCards[2] == 5)
				{
				    userCard3_1 = new ImageIcon("resources/images/killer koala.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 1;
				    user3Health = 3;
				    user3CoinsDropped = 2;
				    user3Name = "Killer Koala";
				    user3Tier = 2;
				}
				else if (userCards[2] == 6)
				{
				    userCard3_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 1;
				    user3Health = 1;
				    user3CoinsDropped = 1;
				    user3Name = "Chainsaw Chinchilla";
				    user3Tier = 1;
				}
				else if (userCards[2] == 7)
				{
				    userCard3_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 2;
				    user3Health = 3;
				    user3CoinsDropped = 2;
				    user3Name = "Slaughter Seahorse";
				    user3Tier = 2;
				}
				else if (userCards[2] == 8)
				{
				    userCard3_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 2;
				    user3Health = 3;
				    user3CoinsDropped = 3;
				    user3Name = "Mauler Meerkat";
				    user3Tier = 3;
				}
				else if (userCards[2] == 9)
				{
				    userCard3_1 = new ImageIcon("resources/images/venemous vulture.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 3;
				    user3Health = 3;
				    user3CoinsDropped = 3;
				    user3Name = "Venomous Vulture";
				    user3Tier = 4;
				}
				else if (userCards[2] == 10)
				{
				    userCard3_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 6;
				    user3Health = 2;
				    user3CoinsDropped = 5;
				    user3Name = "Bloodthirsty Badger";
				    user3Tier = 5;
				}
				else if (userCards[2] == 11)
				{
				    userCard3_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 7;
				    user3Health = 5;
				    user3CoinsDropped = 8;
				    user3Name = "Capybara of Carnage";
				    user3Tier = 6;
				}
				else if (userCards[2] == 12)
				{
				    userCard3_1 = new ImageIcon("resources/images/homicide hamster.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 1;
				    user3Health = 1;
				    user3CoinsDropped = 1;
				    user3Name = "Homicide Hamster";
				    user3Tier = 1;
				}
				else if (userCards[2] == 13)
				{
				    userCard3_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 1;
				    user3Health = 3;
				    user3CoinsDropped = 2;
				    user3Name = "Deathbeak Duckling";
				    user3Tier = 2;
				}
				else if (userCards[2] == 14)
				{
				    userCard3_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 2;
				    user3Health = 4;
				    user3CoinsDropped = 3;
				    user3Name = "Razorback Rottweiler";
				    user3Tier = 3;
				}
				else if (userCards[2] == 15)
				{
				    userCard3_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 3;
				    user3Health = 4;
				    user3CoinsDropped = 4;
				    user3Name = "Grievous Gorilla";
				    user3Tier = 4;
				}
				else if (userCards[2] == 16)
				{
				    userCard3_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 5;
				    user3Health = 2;
				    user3CoinsDropped = 5;
				    user3Name = "Pernicuous Porcupine";
				    user3Tier = 5;
				}
				else if (userCards[2] == 17)
				{
				    userCard3_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 6;
				    user3Health = 6;
				    user3CoinsDropped = 8;
				    user3Name = "Malevolent Mongoose";
				    user3Tier = 6;
				}
				else if (userCards[2] == 18)
				{
				    userCard3_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 5;
				    user3Health = 3;
				    user3CoinsDropped = 4;
				    user3Name = "Baleful Bald Eagle";
				    user3Tier = 4;
				}
				else if (userCards[2] == 19)
				{
				    userCard3_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
				    showCard3();
				    card3 = "Yes";
				    user3Attack = 2;
				    user3Health = 5;
				    user3CoinsDropped = 3;
				    user3Name = "Murderous Mecha-Monkey";
				    user3Tier = 3;
				}
				
				
				if (userCards[3] == 0)
				{
				    userCard4_1 = new ImageIcon("resources/images/razer rabbit.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 2;
				    user4Health = 1;
				    user4CoinsDropped = 1;
				    user4Name = "Razor Rabbit";
				    user4Tier = 1;
				}
				else if (userCards[3] == 1)
				{
				    userCard4_1 = new ImageIcon("resources/images/squirrel.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 1;
				    user4Health = 3;
				    user4CoinsDropped = 1;
				    user4Name = "Spike the Squirrel";
				    user4Tier = 2;
				}
				else if (userCards[3] == 2)
				{
				    userCard4_1 = new ImageIcon("resources/images/toxicturtle.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 1;
				    user4Health = 5;
				    user4CoinsDropped = 2;
				    user4Name = "Toxic Turtle";
				    user4Tier = 3;
				}
				else if (userCards[3] == 3)
				{
				    userCard4_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 3;
				    user4Health = 3;
				    user4CoinsDropped = 3;
				    user4Name = "Fangtail Fox";
				    user4Tier = 4;
				}
				else if (userCards[3] == 4)
				{
				    userCard4_1 = new ImageIcon("resources/images/raging raccoon.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 4;
				    user4Health = 3;
				    user4CoinsDropped = 4;
				    user4Name = "Raging Raccoon";
				    user4Tier = 5;
				}
				else if (userCards[3] == 5)
				{
				    userCard4_1 = new ImageIcon("resources/images/killer koala.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 1;
				    user4Health = 3;
				    user4CoinsDropped = 2;
				    user4Name = "Killer Koala";
				    user4Tier = 2;
				}
				else if (userCards[3] == 6)
				{
				    userCard4_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 1;
				    user4Health = 1;
				    user4CoinsDropped = 1;
				    user4Name = "Chainsaw Chinchilla";
				    user4Tier = 1;
				}
				else if (userCards[3] == 7)
				{
				    userCard4_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 2;
				    user4Health = 3;
				    user4CoinsDropped = 2;
				    user4Name = "Slaughter Seahorse";
				    user4Tier = 2;
				}
				else if (userCards[3] == 8)
				{
				    userCard4_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 2;
				    user4Health = 3;
				    user4CoinsDropped = 3;
				    user4Name = "Mauler Meerkat";
				    user4Tier = 3;
				}
				else if (userCards[3] == 9)
				{
				    userCard4_1 = new ImageIcon("resources/images/venemous vulture.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 3;
				    user4Health = 3;
				    user4CoinsDropped = 3;
				    user4Name = "Venomous Vulture";
				    user4Tier = 4;
				}
				else if (userCards[3] == 10)
				{
				    userCard4_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 6;
				    user4Health = 2;
				    user4CoinsDropped = 5;
				    user4Name = "Bloodthirsty Badger";
				    user4Tier = 5;
				}
				else if (userCards[3] == 11)
				{
				    userCard4_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 7;
				    user4Health = 5;
				    user4CoinsDropped = 8;
				    user4Name = "Capybara of Carnage";
				    user4Tier = 6;
				}
				else if (userCards[3] == 12)
				{
				    userCard4_1 = new ImageIcon("resources/images/homicide hamster.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 1;
				    user4Health = 1;
				    user4CoinsDropped = 1;
				    user4Name = "Homicide Hamster";
				    user4Tier = 1;
				}
				else if (userCards[3] == 13)
				{
				    userCard4_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 1;
				    user4Health = 3;
				    user4CoinsDropped = 2;
				    user4Name = "Deathbeak Duckling";
				    user4Tier = 2;
				}
				else if (userCards[3] == 14)
				{
				    userCard4_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 2;
				    user4Health = 4;
				    user4CoinsDropped = 3;
				    user4Name = "Razorback Rottweiler";
				    user4Tier = 3;
				}
				else if (userCards[3] == 15)
				{
				    userCard4_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 3;
				    user4Health = 4;
				    user4CoinsDropped = 4;
				    user4Name = "Grievous Gorilla";
				    user4Tier = 4;
				}
				else if (userCards[3] == 16)
				{
				    userCard4_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 5;
				    user4Health = 2;
				    user4CoinsDropped = 5;
				    user4Name = "Pernicuous Porcupine";
				    user4Tier = 5;
				}
				else if (userCards[3] == 17)
				{
				    userCard4_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 6;
				    user4Health = 6;
				    user4CoinsDropped = 8;
				    user4Name = "Malevolent Mongoose";
				    user4Tier = 6;
				}
				else if (userCards[3] == 18)
				{
				    userCard4_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 5;
				    user4Health = 3;
				    user4CoinsDropped = 4;
				    user4Name = "Baleful Bald Eagle";
				    user4Tier = 4;
				}
				else if (userCards[3] == 19)
				{
				    userCard4_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
				    showCard4();
				    card4 = "Yes";
				    user4Attack = 2;
				    user4Health = 5;
				    user4CoinsDropped = 3;
				    user4Name = "Murderous Mecha-Monkey";
				    user4Tier = 3;
				}

				
				
				if (userCards[4] == 0)
				{
				    userCard5_1 = new ImageIcon("resources/images/razer rabbit.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 2;
			        user5Health = 1;
			        user5CoinsDropped = 1;
			        user5Name = "Razor Rabbit";
			        user5Tier = 1;
				}
				else if (userCards[4] == 1)
				{
				    userCard5_1 = new ImageIcon("resources/images/squirrel.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 1;
			        user5Health = 3;
			        user5CoinsDropped = 1;
			        user5Name = "Spike the Squirrel";
			        user5Tier = 2;
				}
				else if (userCards[4] == 2)
				{
				    userCard5_1 = new ImageIcon("resources/images/toxicturtle.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 1;
			        user5Health = 5;
			        user5CoinsDropped = 2;
			        user5Name = "Toxic Turtle";
			        user5Tier = 3;
				}
				else if (userCards[4] == 3)
				{
				    userCard5_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 3;
			        user5Health = 3;
			        user5CoinsDropped = 3;
			        user5Name = "Fangtail Fox";
			        user5Tier = 4;
				}
				else if (userCards[4] == 4)
				{
				    userCard5_1 = new ImageIcon("resources/images/raging raccoon.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 4;
			        user5Health = 3;
			        user5CoinsDropped = 4;
			        user5Name = "Raging Raccoon";
			        user5Tier = 5;
				}
				else if (userCards[4] == 5)
				{
				    userCard5_1 = new ImageIcon("resources/images/killer koala.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 1;
			        user5Health = 3;
			        user5CoinsDropped = 2;
			        user5Name = "Killer Koala";
			        user5Tier = 2;
				}
				else if (userCards[4] == 6)
				{
				    userCard5_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 1;
			        user5Health = 1;
			        user5CoinsDropped = 1;
			        user5Name = "Chainsaw Chinchilla";
			        user5Tier = 1;
				}
				else if (userCards[4] == 7)
				{
				    userCard5_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 2;
			        user5Health = 3;
			        user5CoinsDropped = 2;
			        user5Name = "Slaughter Seahorse";
			        user5Tier = 2;
				}
				else if (userCards[4] == 8)
				{
				    userCard5_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 2;
			        user5Health = 3;
			        user5CoinsDropped = 3;
			        user5Name = "Mauler Meerkat";
			        user5Tier = 3;
				}
				else if (userCards[4] == 9)
				{
				    userCard5_1 = new ImageIcon("resources/images/venemous vulture.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 3;
			        user5Health = 3;
			        user5CoinsDropped = 3;
			        user5Name = "Venomous Vulture";
			        user5Tier = 4;
				}
				else if (userCards[4] == 10)
				{
				    userCard5_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 6;
			        user5Health = 2;
			        user5CoinsDropped = 5;
			        user5Name = "Bloodthirsty Badger";
			        user5Tier = 5;
				}
				else if (userCards[4] == 11)
				{
				    userCard5_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 7;
			        user5Health = 5;
			        user5CoinsDropped = 8;
			        user5Name = "Capybara of Carnage";
			        user5Tier = 6;
				}
				else if (userCards[4] == 12)
				{
				    userCard5_1 = new ImageIcon("resources/images/homicide hamster.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 1;
			        user5Health = 1;
			        user5CoinsDropped = 1;
			        user5Name = "Homicide Hamster";
			        user5Tier = 1;
				}
				else if (userCards[4] == 13)
				{
				    userCard5_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 1;
			        user5Health = 3;
			        user5CoinsDropped = 2;
			        user5Name = "Deathbeak Duckling";
			        user5Tier = 2;
				}
				else if (userCards[4] == 14)
				{
				    userCard5_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 2;
			        user5Health = 4;
			        user5CoinsDropped = 3;
			        user5Name = "Razorback Rottweiler";
			        user5Tier = 3;
				}
				else if (userCards[4] == 15)
				{
				    userCard5_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 3;
			        user5Health = 4;
			        user5CoinsDropped = 4;
			        user5Name = "Grievous Gorilla";
			        user5Tier = 4;
				}
				else if (userCards[4] == 16)
				{
				    userCard5_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 5;
			        user5Health = 2;
			        user5CoinsDropped = 5;
			        user5Name = "Pernicuous Porcupine";
			        user5Tier = 5;
				}
				else if (userCards[4] == 17)
				{
				    userCard5_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 6;
			        user5Health = 6;
			        user5CoinsDropped = 8;
			        user5Name = "Malevolent Mongoose";
			        user5Tier = 6;
				}
				else if (userCards[4] == 18)
				{
				    userCard5_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 5;
			        user5Health = 3;
			        user5CoinsDropped = 4;
			        user5Name = "Baleful Bald Eagle";
			        user5Tier = 4;
				}
				else if (userCards[4] == 19)
				{
				    userCard5_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
				    showCard5();
				    card5 = "Yes";
				    user5Attack = 2;
			        user5Health = 5;
			        user5CoinsDropped = 3;
			        user5Name = "Murderous Mecha-Monkey";
			        user5Tier = 3;
				}
				
				
				if (userCards[5] == 0)
				{
				    userCard6_1 = new ImageIcon("resources/images/razer rabbit.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 2;
			        user6Health = 1;
			        user6CoinsDropped = 1;
			        user6Name = "Razor Rabbit";
			        user6Tier = 1;
				}
				else if (userCards[5] == 1)
				{
				    userCard6_1 = new ImageIcon("resources/images/squirrel.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 1;
			        user6Health = 3;
			        user6CoinsDropped = 1;
			        user6Name = "Spike The Squirrel";
			        user6Tier = 2;
				}
				else if (userCards[5] == 2)
				{
				    userCard6_1 = new ImageIcon("resources/images/toxicturtle.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 1;
			        user6Health = 5;
			        user6CoinsDropped = 2;
			        user6Name = "Toxic Turtle";
			        user6Tier = 3;
				}
				else if (userCards[5] == 3)
				{
				    userCard6_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 3;
			        user6Health = 3;
			        user6CoinsDropped = 3;
			        user6Name = "Fangtail Fox";
			        user6Tier = 4;
				}
				else if (userCards[5] == 4)
				{
				    userCard6_1 = new ImageIcon("resources/images/raging raccoon.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 4;
			        user6Health = 3;
			        user6CoinsDropped = 4;
			        user6Name = "Raging Raccoon";
			        user6Tier = 5;
				}
				else if (userCards[5] == 5)
				{
				    userCard6_1 = new ImageIcon("resources/images/killer koala.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 1;
			        user6Health = 3;
			        user6CoinsDropped = 2;
			        user6Name = "Killer Koala";
			        user6Tier = 2;
				}
				else if (userCards[5] == 6)
				{
				    userCard6_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 1;
			        user6Health = 1;
			        user6CoinsDropped = 1;
			        user6Name = "Chainsaw Chinchilla";
			        user6Tier = 1;
				}
				else if (userCards[5] == 7)
				{
				    userCard6_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 2;
			        user6Health = 3;
			        user6CoinsDropped = 2;
			        user6Name = "Slaughter Seahorse";
			        user6Tier = 2;
				}
				else if (userCards[5] == 8)
				{
				    userCard6_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 2;
			        user6Health = 3;
			        user6CoinsDropped = 3;
			        user6Name = "Mauler Meerkat";
			        user6Tier = 3;
				}
				else if (userCards[5] == 9)
				{
				    userCard6_1 = new ImageIcon("resources/images/venemous vulture.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 3;
			        user6Health = 3;
			        user6CoinsDropped = 3;
			        user6Name = "Venomous Vulture";
			        user6Tier = 4;
				}
				else if (userCards[5] == 10)
				{
				    userCard6_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 6;
			        user6Health = 2;
			        user6CoinsDropped = 5;
			        user6Name = "Bloodthirsty Badger";
			        user6Tier = 5;
				}
				else if (userCards[5] == 11)
				{
				    userCard6_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 7;
			        user6Health = 5;
			        user6CoinsDropped = 8;
			        user6Name = "Capybara of Carnage";
			        user6Tier = 6;
				}
				else if (userCards[5] == 12)
				{
				    userCard6_1 = new ImageIcon("resources/images/homicide hamster.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 1;
			        user6Health = 1;
			        user6CoinsDropped = 1;
			        user6Name = "Homicide Hamster";
			        user6Tier = 1;
				}
				else if (userCards[5] == 13)
				{
				    userCard6_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 1;
			        user6Health = 3;
			        user6CoinsDropped = 2;
			        user6Name = "Deathbeak Duckling";
			        user6Tier = 2;
				}
				else if (userCards[5] == 14)
				{
				    userCard6_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 2;
			        user6Health = 4;
			        user6CoinsDropped = 3;
			        user6Name = "Razorback Rottweiler";
			        user6Tier = 3;
				}
				else if (userCards[5] == 15)
				{
				    userCard6_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 3;
			        user6Health = 4;
			        user6CoinsDropped = 4;
			        user6Name = "Grievous Gorilla";
			        user6Tier = 4;
				}
				else if (userCards[5] == 16)
				{
				    userCard6_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 5;
			        user6Health = 2;
			        user6CoinsDropped = 5;
			        user6Name = "Pernicuous Porcupine";
			        user6Tier = 5;
				}
				else if (userCards[5] == 17)
				{
				    userCard6_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 6;
			        user6Health = 6;
			        user6CoinsDropped = 8;
			        user6Name = "Malevolent Mongoose";
			        user6Tier = 6;
				}
				else if (userCards[5] == 18)
				{
				    userCard6_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 5;
			        user6Health = 3;
			        user6CoinsDropped = 4;
			        user6Name = "Baleful Bald Eagle";
			        user6Tier = 4;
				}
				else if (userCards[5] == 19)
				{
				    userCard6_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
				    showCard6();
				    card6 = "Yes";
				    user6Attack = 2;
			        user6Health = 5;
			        user6CoinsDropped = 3;
			        user6Name = "Murderous Mecha-Monkey";
			        user6Tier = 3;
				}

				
				if (userCards[6] == 0)
				{
				    userCard7_1 = new ImageIcon("resources/images/razer rabbit.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 2;
			        user7Health = 1;
			        user7CoinsDropped = 1;
			        user7Name = "Razor Rabbit";
			        user7Tier = 1;
				}
				else if (userCards[6] == 1)
				{
				    userCard7_1 = new ImageIcon("resources/images/squirrel.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 1;
			        user7Health = 3;
			        user7CoinsDropped = 1;
			        user7Name = "Spike The Squirrel";
			        user7Tier = 2;
				}
				else if (userCards[6] == 2)
				{
				    userCard7_1 = new ImageIcon("resources/images/toxicturtle.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 1;
			        user7Health = 5;
			        user7CoinsDropped = 2;
			        user7Name = "Toxic Turtle";
			        user7Tier = 3;
				}
				else if (userCards[6] == 3)
				{
				    userCard7_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 3;
			        user7Health = 3;
			        user7CoinsDropped = 3;
			        user7Name = "Fangtail Fox";
			        user7Tier = 4;
				}
				else if (userCards[6] == 4)
				{
				    userCard7_1 = new ImageIcon("resources/images/raging raccoon.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 4;
			        user7Health = 3;
			        user7CoinsDropped = 4;
			        user7Name = "Raging Raccoon";
			        user7Tier = 5;
				}
				else if (userCards[6] == 5)
				{
				    userCard7_1 = new ImageIcon("resources/images/killer koala.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 1;
			        user7Health = 3;
			        user7CoinsDropped = 2;
			        user7Name = "Killer Koala";
			        user7Tier = 2;
				}
				else if (userCards[6] == 6)
				{
				    userCard7_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 1;
			        user7Health = 1;
			        user7CoinsDropped = 1;
			        user7Name = "Chainsaw Chinchilla";
			        user7Tier = 1;
				}
				else if (userCards[6] == 7)
				{
				    userCard7_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 2;
			        user7Health = 3;
			        user7CoinsDropped = 2;
			        user7Name = "Slaughter Seahorse";
			        user7Tier = 2;
				}
				else if (userCards[6] == 8)
				{
				    userCard7_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 2;
			        user7Health = 3;
			        user7CoinsDropped = 3;
			        user7Name = "Mauler Meerkat";
			        user7Tier = 3;
				}
				else if (userCards[6] == 9)
				{
				    userCard7_1 = new ImageIcon("resources/images/venemous vulture.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 3;
			        user7Health = 3;
			        user7CoinsDropped = 3;
			        user7Name = "Venomous Vulture";
			        user7Tier = 4;
				}
				else if (userCards[6] == 10)
				{
				    userCard7_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 6;
			        user7Health = 2;
			        user7CoinsDropped = 5;
			        user7Name = "Bloodthirsty Badger";
			        user7Tier = 5;
				}
				else if (userCards[6] == 11)
				{
				    userCard7_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 7;
			        user7Health = 5;
			        user7CoinsDropped = 8;
			        user7Name = "Capybara of Carnage";
			        user7Tier = 6;
				}
				else if (userCards[6] == 12)
				{
				    userCard7_1 = new ImageIcon("resources/images/homicide hamster.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 1;
			        user7Health = 1;
			        user7CoinsDropped = 1;
			        user7Name = "Homicide Hamster";
			        user7Tier = 1;
				}
				else if (userCards[6] == 13)
				{
				    userCard7_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 1;
			        user7Health = 3;
			        user7CoinsDropped = 2;
			        user7Name = "Deathbeak Duckling";
			        user7Tier = 2;
				}
				else if (userCards[6] == 14)
				{
				    userCard7_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 2;
			        user7Health = 4;
			        user7CoinsDropped = 3;
			        user7Name = "Razorback Rottweiler";
			        user7Tier = 3;
				}
				else if (userCards[6] == 15)
				{
				    userCard7_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 3;
			        user7Health = 4;
			        user7CoinsDropped = 4;
			        user7Name = "Grievous Gorilla";
			        user7Tier = 4;
				}
				else if (userCards[6] == 16)
				{
				    userCard7_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 5;
			        user7Health = 2;
			        user7CoinsDropped = 5;
			        user7Name = "Pernicuous Porcupine";
			        user7Tier = 5;
				}
				else if (userCards[6] == 17)
				{
				    userCard7_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 6;
			        user7Health = 6;
			        user7CoinsDropped = 8;
			        user7Name = "Malevolent Mongoose";
			        user7Tier = 6;
				}
				else if (userCards[6] == 18)
				{
				    userCard7_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 5;
			        user7Health = 3;
			        user7CoinsDropped = 4;
			        user7Name = "Baleful Bald Eagle";
			        user7Tier = 4;
				}
				else if (userCards[6] == 19)
				{
				    userCard7_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
				    showCard7();
				    card7 = "Yes";
				    user7Attack = 2;
			        user7Health = 5;
			        user7CoinsDropped = 3;
			        user7Name = "Murderous Mecha-Monkey";
			        user7Tier = 3;
				}
				
				
				if (userCards[7] == 0)
				{
				    userCard8_1 = new ImageIcon("resources/images/razer rabbit.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 2;
			        user8Health = 1;
			        user8CoinsDropped = 1;
			        user8Name = "Razor Rabbit";
			        user8Tier = 1;
				}
				else if (userCards[7] == 1)
				{
				    userCard8_1 = new ImageIcon("resources/images/squirrel.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 1;
			        user8Health = 3;
			        user8CoinsDropped = 1;
			        user8Name = "Spike The Squirrel";
			        user8Tier = 2;
				}
				else if (userCards[7] == 2)
				{
				    userCard8_1 = new ImageIcon("resources/images/toxicturtle.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 1;
			        user8Health = 5;
			        user8CoinsDropped = 2;
			        user8Name = "Toxic Turtle";
			        user8Tier = 3;
				}
				else if (userCards[7] == 3)
				{
				    userCard8_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 3;
			        user8Health = 3;
			        user8CoinsDropped = 3;
			        user8Name = "Fangtail Fox";
			        user8Tier = 4;
				}
				else if (userCards[7] == 4)
				{
				    userCard8_1 = new ImageIcon("resources/images/raging raccoon.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 4;
			        user8Health = 3;
			        user8CoinsDropped = 4;
			        user8Name = "Raging Raccoon";
			        user8Tier = 5;
				}
				else if (userCards[7] == 5)
				{
				    userCard8_1 = new ImageIcon("resources/images/killer koala.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 1;
			        user8Health = 3;
			        user8CoinsDropped = 2;
			        user8Name = "Killer Koala";
			        user8Tier = 2;
				}
				else if (userCards[7] == 6)
				{
				    userCard8_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 1;
			        user8Health = 1;
			        user8CoinsDropped = 1;
			        user8Name = "Chainsaw Chinchilla";
			        user8Tier = 1;
				}
				else if (userCards[7] == 7)
				{
				    userCard8_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 2;
			        user8Health = 3;
			        user8CoinsDropped = 2;
			        user8Name = "Slaughter Seahorse";
			        user8Tier = 2;
				}
				else if (userCards[7] == 8)
				{
				    userCard8_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 2;
			        user8Health = 3;
			        user8CoinsDropped = 3;
			        user8Name = "Mauler Meerkat";
			        user8Tier = 3;
				}
				else if (userCards[7] == 9)
				{
				    userCard8_1 = new ImageIcon("resources/images/venemous vulture.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 3;
			        user8Health = 3;
			        user8CoinsDropped = 3;
			        user8Name = "Venomous Vulture";
			        user8Tier = 4;
				}
				else if (userCards[7] == 10)
				{
				    userCard8_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 6;
			        user8Health = 2;
			        user8CoinsDropped = 5;
			        user8Name = "Bloodthirsty Badger";
			        user8Tier = 5;
				}
				else if (userCards[7] == 11)
				{
				    userCard8_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 7;
			        user8Health = 5;
			        user8CoinsDropped = 8;
			        user8Name = "Capybara of Carnage";
			        user8Tier = 6;
				}
				else if (userCards[7] == 12)
				{
				    userCard8_1 = new ImageIcon("resources/images/homicide hamster.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 1;
			        user8Health = 1;
			        user8CoinsDropped = 1;
			        user8Name = "Homicide Hamster";
			        user8Tier = 1;
				}
				else if (userCards[7] == 13)
				{
				    userCard8_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 1;
			        user8Health = 3;
			        user8CoinsDropped = 2;
			        user8Name = "Deathbeak Duckling";
			        user8Tier = 2;
				}
				else if (userCards[7] == 14)
				{
				    userCard8_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 2;
			        user8Health = 4;
			        user8CoinsDropped = 3;
			        user8Name = "Razorback Rottweiler";
			        user8Tier = 3;
				}
				else if (userCards[7] == 15)
				{
				    userCard8_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 3;
			        user8Health = 4;
			        user8CoinsDropped = 4;
			        user8Name = "Grievous Gorilla";
			        user8Tier = 4;
				}
				else if (userCards[7] == 16)
				{
				    userCard8_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 5;
			        user8Health = 2;
			        user8CoinsDropped = 5;
			        user8Name = "Pernicuous Porcupine";
			        user8Tier = 5;
				}
				else if (userCards[7] == 17)
				{
				    userCard8_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 6;
			        user8Health = 6;
			        user8CoinsDropped = 8;
			        user8Name = "Malevolent Mongoose";
			        user8Tier = 6;
				}
				else if (userCards[7] == 18)
				{
				    userCard8_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 5;
			        user8Health = 3;
			        user8CoinsDropped = 4;
			        user8Name = "Baleful Bald Eagle";
			        user8Tier = 4;
				}
				else if (userCards[7] == 19)
				{
				    userCard8_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
				    showCard8();
				    card8 = "Yes";
				    user8Attack = 2;
			        user8Health = 5;
			        user8CoinsDropped = 3;
			        user8Name = "Murderous Mecha-Monkey";
			        user8Tier = 3;
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
				    ai1Name = "Razor Rabbit";
				    ai1Tier = 1;
				}
				else if (aiCards[0] == 1)
				{
				    aiCard1_1 = new ImageIcon("resources/images/squirrel.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 1;
				    ai1Health = 3;
				    ai1CoinsDropped = 1;
				    ai1Name = "Spike The Squirrel";
				    ai1Tier = 2;
				}
				else if (aiCards[0] == 2)
				{
				    aiCard1_1 = new ImageIcon("resources/images/toxicturtle.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 1;
				    ai1Health = 5;
				    ai1CoinsDropped = 2;
				    ai1Name = "Toxic Turtle";
				    ai1Tier = 3;
				}
				else if (aiCards[0] == 3)
				{
				    aiCard1_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 3;
				    ai1Health = 3;
				    ai1CoinsDropped = 3;
				    ai1Name = "Fangtail Fox";
				    ai1Tier = 4;
				}
				else if (aiCards[0] == 4)
				{
				    aiCard1_1 = new ImageIcon("resources/images/raging raccoon.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 4;
				    ai1Health = 3;
				    ai1CoinsDropped = 4;
				    ai1Name = "Raging Raccoon";
				    ai1Tier = 5;
				}
				else if (aiCards[0] == 5)
				{
				    aiCard1_1 = new ImageIcon("resources/images/killer koala.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 1;
				    ai1Health = 3;
				    ai1CoinsDropped = 2;
				    ai1Name = "Killer Koala";
				    ai1Tier = 2;
				}
				else if (aiCards[0] == 6)
				{
				    aiCard1_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 1;
				    ai1Health = 1;
				    ai1CoinsDropped = 1;
				    ai1Name = "Chainsaw Chinchilla";
				    ai1Tier = 1;
				}
				else if (aiCards[0] == 7)
				{
				    aiCard1_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 2;
				    ai1Health = 3;
				    ai1CoinsDropped = 2;
				    ai1Name = "Slaughter Seahorse";
				    ai1Tier = 2;
				}
				else if (aiCards[0] == 8)
				{
				    aiCard1_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 2;
				    ai1Health = 3;
				    ai1CoinsDropped = 3;
				    ai1Name = "Mauler Meerkat";
				    ai1Tier = 3;
				}
				else if (aiCards[0] == 9)
				{
				    aiCard1_1 = new ImageIcon("resources/images/venemous vulture.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 3;
				    ai1Health = 3;
				    ai1CoinsDropped = 3;
				    ai1Name = "Venomous Vulture";
				    ai1Tier = 4;
				}
				else if (aiCards[0] == 10)
				{
				    aiCard1_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 6;
				    ai1Health = 2;
				    ai1CoinsDropped = 5;
				    ai1Name = "Bloodthirsty Badger";
				    ai1Tier = 5;
				}
				else if (aiCards[0] == 11)
				{
				    aiCard1_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 7;
				    ai1Health = 5;
				    ai1CoinsDropped = 8;
				    ai1Name = "Capybara of Carnage";
				    ai1Tier = 6;
				}
				else if (aiCards[0] == 12)
				{
				    aiCard1_1 = new ImageIcon("resources/images/homicide hamster.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 1;
				    ai1Health = 1;
				    ai1CoinsDropped = 1;
				    ai1Name = "Homicide Hamster";
				    ai1Tier = 1;
				}
				else if (aiCards[0] == 13)
				{
				    aiCard1_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 1;
				    ai1Health = 3;
				    ai1CoinsDropped = 2;
				    ai1Name = "Deathbeak Duckling";
				    ai1Tier = 2;
				}
				else if (aiCards[0] == 14)
				{
				    aiCard1_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 2;
				    ai1Health = 4;
				    ai1CoinsDropped = 3;
				    ai1Name = "Razorback Rottweiler";
				    ai1Tier = 3;
				}
				else if (aiCards[0] == 15)
				{
				    aiCard1_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 3;
				    ai1Health = 4;
				    ai1CoinsDropped = 4;
				    ai1Name = "Grievous Gorilla";
				    ai1Tier = 4;
				}
				else if (aiCards[0] == 16)
				{
				    aiCard1_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 5;
				    ai1Health = 2;
				    ai1CoinsDropped = 5;
				    ai1Name = "Pernicuous Porcupine";
				    ai1Tier = 5;
				}
				else if (aiCards[0] == 17)
				{
				    aiCard1_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 6;
				    ai1Health = 6;
				    ai1CoinsDropped = 8;
				    ai1Name = "Malevolent Mongoose";
				    ai1Tier = 6;
				}
				else if (aiCards[0] == 18)
				{
				    aiCard1_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 5;
				    ai1Health = 3;
				    ai1CoinsDropped = 4;
				    ai1Name = "Baleful Bald Eagle";
				    ai1Tier = 4;
				}
				else if (aiCards[0] == 19)
				{
				    aiCard1_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
				    showAiCard1();
				    card9 = "Yes";
				    ai1Attack = 2;
				    ai1Health = 5;
				    ai1CoinsDropped = 3;
				    ai1Name = "Murderous Mecha-Monkey";
				    ai1Tier = 3;
				}

				
				if (aiCards[1] == 0)
				{
				    aiCard2_1 = new ImageIcon("resources/images/razer rabbit.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 2;
				    ai2Health = 1;
				    ai2CoinsDropped = 1;
				    ai2Name = "Razor Rabbit";
				    ai2Tier = 1;
				}
				else if (aiCards[1] == 1)
				{
				    aiCard2_1 = new ImageIcon("resources/images/squirrel.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 1;
				    ai2Health = 3;
				    ai2CoinsDropped = 1;
				    ai2Name = "Spike The Squirrel";
				    ai2Tier = 2;
				}
				else if (aiCards[1] == 2)
				{
				    aiCard2_1 = new ImageIcon("resources/images/toxicturtle.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 1;
				    ai2Health = 5;
				    ai2CoinsDropped = 2;
				    ai2Name = "Toxic Turtle";
				    ai2Tier = 3;
				}
				else if (aiCards[1] == 3)
				{
				    aiCard2_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 3;
				    ai2Health = 3;
				    ai2CoinsDropped = 3;
				    ai2Name = "Fangtail Fox";
				    ai2Tier = 4;
				}
				else if (aiCards[1] == 4)
				{
				    aiCard2_1 = new ImageIcon("resources/images/raging raccoon.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 4;
				    ai2Health = 3;
				    ai2CoinsDropped = 4;
				    ai2Name = "Raging Raccoon";
				    ai2Tier = 5;
				}
				else if (aiCards[1] == 5)
				{
				    aiCard2_1 = new ImageIcon("resources/images/killer koala.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 1;
				    ai2Health = 3;
				    ai2CoinsDropped = 2;
				    ai2Name = "Killer Koala";
				    ai2Tier = 2;
				}
				else if (aiCards[1] == 6)
				{
				    aiCard2_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 1;
				    ai2Health = 1;
				    ai2CoinsDropped = 1;
				    ai2Name = "Chainsaw Chinchilla";
				    ai2Tier = 1;
				}
				else if (aiCards[1] == 7)
				{
				    aiCard2_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 2;
				    ai2Health = 3;
				    ai2CoinsDropped = 2;
				    ai2Name = "Slaughter Seahorse";
				    ai2Tier = 2;
				}
				else if (aiCards[1] == 8)
				{
				    aiCard2_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 2;
				    ai2Health = 3;
				    ai2CoinsDropped = 3;
				    ai2Name = "Mauler Meerkat";
				    ai2Tier = 3;
				}
				else if (aiCards[1] == 9)
				{
				    aiCard2_1 = new ImageIcon("resources/images/venemous vulture.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 3;
				    ai2Health = 3;
				    ai2CoinsDropped = 3;
				    ai2Name = "Venomous Vulture";
				    ai2Tier = 4;
				}
				else if (aiCards[1] == 10)
				{
				    aiCard2_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 6;
				    ai2Health = 2;
				    ai2CoinsDropped = 5;
				    ai2Name = "Bloodthirsty Badger";
				    ai2Tier = 5;
				}
				else if (aiCards[1] == 11)
				{
				    aiCard2_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 7;
				    ai2Health = 5;
				    ai2CoinsDropped = 8;
				    ai2Name = "Capybara of Carnage";
				    ai2Tier = 6;
				}
				else if (aiCards[1] == 12)
				{
				    aiCard2_1 = new ImageIcon("resources/images/homicide hamster.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 1;
				    ai2Health = 1;
				    ai2CoinsDropped = 1;
				    ai2Name = "Homicide Hamster";
				    ai2Tier = 1;
				}
				else if (aiCards[1] == 13)
				{
				    aiCard2_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 1;
				    ai2Health = 3;
				    ai2CoinsDropped = 2;
				    ai2Name = "Deathbeak Duckling";
				    ai2Tier = 2;
				}
				else if (aiCards[1] == 14)
				{
				    aiCard2_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 2;
				    ai2Health = 4;
				    ai2CoinsDropped = 3;
				    ai2Name = "Razorback Rottweiler";
				    ai2Tier = 3;
				}
				else if (aiCards[1] == 15)
				{
				    aiCard2_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 3;
				    ai2Health = 4;
				    ai2CoinsDropped = 4;
				    ai2Name = "Grievous Gorilla";
				    ai2Tier = 4;
				}
				else if (aiCards[1] == 16)
				{
				    aiCard2_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 5;
				    ai2Health = 2;
				    ai2CoinsDropped = 5;
				    ai2Name = "Pernicuous Porcupine";
				    ai2Tier = 5;
				}
				else if (aiCards[1] == 17)
				{
				    aiCard2_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 6;
				    ai2Health = 6;
				    ai2CoinsDropped = 8;
				    ai2Name = "Malevolent Mongoose";
				    ai2Tier = 6;
				}
				else if (aiCards[1] == 18)
				{
				    aiCard2_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 5;
				    ai2Health = 3;
				    ai2CoinsDropped = 4;
				    ai2Name = "Baleful Bald Eagle";
				    ai2Tier = 4;
				}
				else if (aiCards[1] == 19)
				{
				    aiCard2_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
				    showAiCard2();
				    card10 = "Yes";
				    ai2Attack = 2;
				    ai2Health = 5;
				    ai2CoinsDropped = 3;
				    ai2Name = "Murderous Mecha-Monkey";
				    ai2Tier = 3;
				}

				
				if (aiCards[2] == 0)
				{
				    aiCard3_1 = new ImageIcon("resources/images/razer rabbit.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 2;
				    ai3Health = 1;
				    ai3CoinsDropped = 1;
				    ai3Name = "Razor Rabbit";
				    ai3Tier = 1;
				}
				else if (aiCards[2] == 1)
				{
				    aiCard3_1 = new ImageIcon("resources/images/squirrel.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 1;
				    ai3Health = 3;
				    ai3CoinsDropped = 1;
				    ai3Name = "Spike The Squirrel";
				    ai3Tier = 2;
				}
				else if (aiCards[2] == 2)
				{
				    aiCard3_1 = new ImageIcon("resources/images/toxicturtle.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 1;
				    ai3Health = 5;
				    ai3CoinsDropped = 2;
				    ai3Name = "Toxic Turtle";
				    ai3Tier = 3;
				}
				else if (aiCards[2] == 3)
				{
				    aiCard3_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 3;
				    ai3Health = 3;
				    ai3CoinsDropped = 3;
				    ai3Name = "Fangtail Fox";
				    ai3Tier = 4;
				}
				else if (aiCards[2] == 4)
				{
				    aiCard3_1 = new ImageIcon("resources/images/raging raccoon.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 4;
				    ai3Health = 3;
				    ai3CoinsDropped = 4;
				    ai3Name = "Raging Raccoon";
				    ai3Tier = 5;
				}
				else if (aiCards[2] == 5)
				{
				    aiCard3_1 = new ImageIcon("resources/images/killer koala.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 1;
				    ai3Health = 3;
				    ai3CoinsDropped = 2;
				    ai3Name = "Killer Koala";
				    ai3Tier = 2;
				}
				else if (aiCards[2] == 6)
				{
				    aiCard3_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 1;
				    ai3Health = 1;
				    ai3CoinsDropped = 1;
				    ai3Name = "Chainsaw Chinchilla";
				    ai3Tier = 1;
				}
				else if (aiCards[2] == 7)
				{
				    aiCard3_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 2;
				    ai3Health = 3;
				    ai3CoinsDropped = 2;
				    ai3Name = "Slaughter Seahorse";
				    ai3Tier = 2;
				}
				else if (aiCards[2] == 8)
				{
				    aiCard3_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 2;
				    ai3Health = 3;
				    ai3CoinsDropped = 3;
				    ai3Name = "Mauler Meerkat";
				    ai3Tier = 3;
				}
				else if (aiCards[2] == 9)
				{
				    aiCard3_1 = new ImageIcon("resources/images/venemous vulture.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 3;
				    ai3Health = 3;
				    ai3CoinsDropped = 3;
				    ai3Name = "Venomous Vulture";
				    ai3Tier = 4;
				}
				else if (aiCards[2] == 10)
				{
				    aiCard3_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 6;
				    ai3Health = 2;
				    ai3CoinsDropped = 5;
				    ai3Name = "Bloodthirsty Badger";
				    ai3Tier = 5;
				}
				else if (aiCards[2] == 11)
				{
				    aiCard3_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 7;
				    ai3Health = 5;
				    ai3CoinsDropped = 8;
				    ai3Name = "Capybara of Carnage";
				    ai3Tier = 6;
				}
				else if (aiCards[2] == 12)
				{
				    aiCard3_1 = new ImageIcon("resources/images/homicide hamster.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 1;
				    ai3Health = 1;
				    ai3CoinsDropped = 1;
				    ai3Name = "Homicide Hamster";
				    ai3Tier = 1;
				}
				else if (aiCards[2] == 13)
				{
				    aiCard3_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 1;
				    ai3Health = 3;
				    ai3CoinsDropped = 2;
				    ai3Name = "Deathbeak Duckling";
				    ai3Tier = 2;
				}
				else if (aiCards[2] == 14)
				{
				    aiCard3_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 2;
				    ai3Health = 4;
				    ai3CoinsDropped = 3;
				    ai3Name = "Razorback Rottweiler";
				    ai3Tier = 3;
				}
				else if (aiCards[2] == 15)
				{
				    aiCard3_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 3;
				    ai3Health = 4;
				    ai3CoinsDropped = 4;
				    ai3Name = "Grievous Gorilla";
				    ai3Tier = 4;
				}
				else if (aiCards[2] == 16)
				{
				    aiCard3_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 5;
				    ai3Health = 2;
				    ai3CoinsDropped = 5;
				    ai3Name = "Pernicuous Porcupine";
				    ai3Tier = 5;
				}
				else if (aiCards[2] == 17)
				{
				    aiCard3_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 6;
				    ai3Health = 6;
				    ai3CoinsDropped = 8;
				    ai3Name = "Malevolent Mongoose";
				    ai3Tier = 6;
				}
				else if (aiCards[2] == 18)
				{
				    aiCard3_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 5;
				    ai3Health = 3;
				    ai3CoinsDropped = 4;
				    ai3Name = "Baleful Bald Eagle";
				    ai3Tier = 4;
				}
				else if (aiCards[2] == 19)
				{
				    aiCard3_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
				    showAiCard3();
				    card11 = "Yes";
				    ai3Attack = 2;
				    ai3Health = 5;
				    ai3CoinsDropped = 3;
				    ai3Name = "Murderous Mecha-Monkey";
				    ai3Tier = 3;
				}

				
				
				if (aiCards[3] == 0)
				{
				    aiCard4_1 = new ImageIcon("resources/images/razer rabbit.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 2;
				    ai4Health = 1;
				    ai4CoinsDropped = 1;
				    ai4Name = "Razor Rabbit";
				    ai4Tier = 1;
				}
				else if (aiCards[3] == 1)
				{
				    aiCard4_1 = new ImageIcon("resources/images/squirrel.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 1;
				    ai4Health = 3;
				    ai4CoinsDropped = 1;
				    ai4Name = "Spike The Squirrel";
				    ai4Tier = 2;
				}
				else if (aiCards[3] == 2)
				{
				    aiCard4_1 = new ImageIcon("resources/images/toxicturtle.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 1;
				    ai4Health = 5;
				    ai4CoinsDropped = 2;
				    ai4Name = "Toxic Turtle";
				    ai4Tier = 3;
				}
				else if (aiCards[3] == 3)
				{
				    aiCard4_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 3;
				    ai4Health = 3;
				    ai4CoinsDropped = 3;
				    ai4Name = "Fangtail Fox";
				    ai4Tier = 4;
				}
				else if (aiCards[3] == 4)
				{
				    aiCard4_1 = new ImageIcon("resources/images/raging raccoon.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 4;
				    ai4Health = 3;
				    ai4CoinsDropped = 4;
				    ai4Name = "Raging Raccoon";
				    ai4Tier = 5;
				}
				else if (aiCards[3] == 5)
				{
				    aiCard4_1 = new ImageIcon("resources/images/killer koala.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 1;
				    ai4Health = 3;
				    ai4CoinsDropped = 2;
				    ai4Name = "Killer Koala";
				    ai4Tier = 2;
				}
				else if (aiCards[3] == 6)
				{
				    aiCard4_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 1;
				    ai4Health = 1;
				    ai4CoinsDropped = 1;
				    ai4Name = "Chainsaw Chinchilla";
				    ai4Tier = 1;
				}
				else if (aiCards[3] == 7)
				{
				    aiCard4_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 2;
				    ai4Health = 3;
				    ai4CoinsDropped = 2;
				    ai4Name = "Slaughter Seahorse";
				    ai4Tier = 2;
				}
				else if (aiCards[3] == 8)
				{
				    aiCard4_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 2;
				    ai4Health = 3;
				    ai4CoinsDropped = 3;
				    ai4Name = "Mauler Meerkat";
				    ai4Tier = 3;
				}
				else if (aiCards[3] == 9)
				{
				    aiCard4_1 = new ImageIcon("resources/images/venemous vulture.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 3;
				    ai4Health = 3;
				    ai4CoinsDropped = 3;
				    ai4Name = "Venomous Vulture";
				    ai4Tier = 4;
				}
				else if (aiCards[3] == 10)
				{
				    aiCard4_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 6;
				    ai4Health = 2;
				    ai4CoinsDropped = 5;
				    ai4Name = "Bloodthirsty Badger";
				    ai4Tier = 5;
				}
				else if (aiCards[3] == 11)
				{
				    aiCard4_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 7;
				    ai4Health = 5;
				    ai4CoinsDropped = 8;
				    ai4Name = "Capybara of Carnage";
				    ai4Tier = 6;
				}
				else if (aiCards[3] == 12)
				{
				    aiCard4_1 = new ImageIcon("resources/images/homicide hamster.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 1;
				    ai4Health = 1;
				    ai4CoinsDropped = 1;
				    ai4Name = "Homicide Hamster";
				    ai4Tier = 1;
				}
				else if (aiCards[3] == 13)
				{
				    aiCard4_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 1;
				    ai4Health = 3;
				    ai4CoinsDropped = 2;
				    ai4Name = "Deathbeak Duckling";
				    ai4Tier = 2;
				}
				else if (aiCards[3] == 14)
				{
				    aiCard4_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 2;
				    ai4Health = 4;
				    ai4CoinsDropped = 3;
				    ai4Name = "Razorback Rottweiler";
				    ai4Tier = 3;
				}
				else if (aiCards[3] == 15)
				{
				    aiCard4_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 3;
				    ai4Health = 4;
				    ai4CoinsDropped = 4;
				    ai4Name = "Grievous Gorilla";
				    ai4Tier = 4;
				}
				else if (aiCards[3] == 16)
				{
				    aiCard4_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 5;
				    ai4Health = 2;
				    ai4CoinsDropped = 5;
				    ai4Name = "Pernicuous Porcupine";
				    ai4Tier = 5;
				}
				else if (aiCards[3] == 17)
				{
				    aiCard4_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 6;
				    ai4Health = 6;
				    ai4CoinsDropped = 8;
				    ai4Name = "Malevolent Mongoose";
				    ai4Tier = 6;
				}
				else if (aiCards[3] == 18)
				{
				    aiCard4_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 5;
				    ai4Health = 3;
				    ai4CoinsDropped = 4;
				    ai4Name = "Baleful Bald Eagle";
				    ai4Tier = 4;
				}
				else if (aiCards[3] == 19)
				{
				    aiCard4_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
				    showAiCard4();
				    card12 = "Yes";
				    ai4Attack = 2;
				    ai4Health = 5;
				    ai4CoinsDropped = 3;
				    ai4Name = "Murderous Mecha-Monkey";
				    ai4Tier = 3;
				}
				
				
				if (aiCards[4] == 0)
				{
				    aiCard5_1 = new ImageIcon("resources/images/razer rabbit.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 2;
				    ai5Health = 1;
				    ai5CoinsDropped = 1;
				    ai5Name = "Razor Rabbit";
				    ai5Tier = 1;
				}
				else if (aiCards[4] == 1)
				{
				    aiCard5_1 = new ImageIcon("resources/images/squirrel.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 1;
				    ai5Health = 3;
				    ai5CoinsDropped = 1;
				    ai5Name = "Spike The Squirrel";
				    ai5Tier = 2;
				}
				else if (aiCards[4] == 2)
				{
				    aiCard5_1 = new ImageIcon("resources/images/toxicturtle.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 1;
				    ai5Health = 5;
				    ai5CoinsDropped = 2;
				    ai5Name = "Toxic Turtle";
				    ai5Tier = 3;
				}
				else if (aiCards[4] == 3)
				{
				    aiCard5_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 3;
				    ai5Health = 3;
				    ai5CoinsDropped = 3;
				    ai5Name = "Fangtail Fox";
				    ai5Tier = 4;
				}
				else if (aiCards[4] == 4)
				{
				    aiCard5_1 = new ImageIcon("resources/images/raging raccoon.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 4;
				    ai5Health = 3;
				    ai5CoinsDropped = 4;
				    ai5Name = "Raging Raccoon";
				    ai5Tier = 5;
				}
				else if (aiCards[4] == 5)
				{
				    aiCard5_1 = new ImageIcon("resources/images/killer koala.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 1;
				    ai5Health = 3;
				    ai5CoinsDropped = 2;
				    ai5Name = "Killer Koala";
				    ai5Tier = 2;
				}
				else if (aiCards[4] == 6)
				{
				    aiCard5_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 1;
				    ai5Health = 1;
				    ai5CoinsDropped = 1;
				    ai5Name = "Chainsaw Chinchilla";
				    ai5Tier = 1;
				}
				else if (aiCards[4] == 7)
				{
				    aiCard5_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 2;
				    ai5Health = 3;
				    ai5CoinsDropped = 2;
				    ai5Name = "Slaughter Seahorse";
				    ai5Tier = 2;
				}
				else if (aiCards[4] == 8)
				{
				    aiCard5_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 2;
				    ai5Health = 3;
				    ai5CoinsDropped = 3;
				    ai5Name = "Mauler Meerkat";
				    ai5Tier = 3;
				}
				else if (aiCards[4] == 9)
				{
				    aiCard5_1 = new ImageIcon("resources/images/venemous vulture.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 3;
				    ai5Health = 3;
				    ai5CoinsDropped = 3;
				    ai5Name = "Venomous Vulture";
				    ai5Tier = 4;
				}
				else if (aiCards[4] == 10)
				{
				    aiCard5_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 6;
				    ai5Health = 2;
				    ai5CoinsDropped = 5;
				    ai5Name = "Bloodthirsty Badger";
				    ai5Tier = 5;
				}
				else if (aiCards[4] == 11)
				{
				    aiCard5_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 7;
				    ai5Health = 5;
				    ai5CoinsDropped = 8;
				    ai5Name = "Capybara of Carnage";
				    ai5Tier = 6;
				}
				else if (aiCards[4] == 12)
				{
				    aiCard5_1 = new ImageIcon("resources/images/homicide hamster.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 1;
				    ai5Health = 1;
				    ai5CoinsDropped = 1;
				    ai5Name = "Homicide Hamster";
				    ai5Tier = 1;
				}
				else if (aiCards[4] == 13)
				{
				    aiCard5_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 1;
				    ai5Health = 3;
				    ai5CoinsDropped = 2;
				    ai5Name = "Deathbeak Duckling";
				    ai5Tier = 2;
				}
				else if (aiCards[4] == 14)
				{
				    aiCard5_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 2;
				    ai5Health = 4;
				    ai5CoinsDropped = 3;
				    ai5Name = "Razorback Rottweiler";
				    ai5Tier = 3;
				}
				else if (aiCards[4] == 15)
				{
				    aiCard5_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 3;
				    ai5Health = 4;
				    ai5CoinsDropped = 4;
				    ai5Name = "Grievous Gorilla";
				    ai5Tier = 4;
				}
				else if (aiCards[4] == 16)
				{
				    aiCard5_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 5;
				    ai5Health = 2;
				    ai5CoinsDropped = 5;
				    ai5Name = "Pernicuous Porcupine";
				    ai5Tier = 5;
				}
				else if (aiCards[4] == 17)
				{
				    aiCard5_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 6;
				    ai5Health = 6;
				    ai5CoinsDropped = 8;
				    ai5Name = "Malevolent Mongoose";
				    ai5Tier = 6;
				}
				else if (aiCards[4] == 18)
				{
				    aiCard5_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 5;
				    ai5Health = 3;
				    ai5CoinsDropped = 4;
				    ai5Name = "Baleful Bald Eagle";
				    ai5Tier = 4;
				}
				else if (aiCards[4] == 19)
				{
				    aiCard5_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
				    showAiCard5();
				    card13 = "Yes";
				    ai5Attack = 2;
				    ai5Health = 5;
				    ai5CoinsDropped = 3;
				    ai5Name = "Murderous Mecha-Monkey";
				    ai5Tier = 3;
				}
				
				
				if (aiCards[5] == 0)
				{
				    aiCard6_1 = new ImageIcon("resources/images/razer rabbit.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 2;
				    ai6Health = 1;
				    ai6CoinsDropped = 1;
				    ai6Name = "Razor Rabbit";
				    ai6Tier = 1;
				}
				else if (aiCards[5] == 1)
				{
				    aiCard6_1 = new ImageIcon("resources/images/squirrel.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 1;
				    ai6Health = 3;
				    ai6CoinsDropped = 1;
				    ai6Name = "Spike The Squirrel";
				    ai6Tier = 2;
				}
				else if (aiCards[5] == 2)
				{
				    aiCard6_1 = new ImageIcon("resources/images/toxicturtle.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 1;
				    ai6Health = 5;
				    ai6CoinsDropped = 2;
				    ai6Name = "Toxic Turtle";
				    ai6Tier = 3;
				}
				else if (aiCards[5] == 3)
				{
				    aiCard6_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 3;
				    ai6Health = 3;
				    ai6CoinsDropped = 3;
				    ai6Name = "Fangtail Fox";
				    ai6Tier = 4;
				}
				else if (aiCards[5] == 4)
				{
				    aiCard6_1 = new ImageIcon("resources/images/raging raccoon.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 4;
				    ai6Health = 3;
				    ai6CoinsDropped = 4;
				    ai6Name = "Raging Raccoon";
				    ai6Tier = 5;
				}
				else if (aiCards[5] == 5)
				{
				    aiCard6_1 = new ImageIcon("resources/images/killer koala.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 1;
				    ai6Health = 3;
				    ai6CoinsDropped = 2;
				    ai6Name = "Killer Koala";
				    ai6Tier = 2;
				}
				else if (aiCards[5] == 6)
				{
				    aiCard6_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 1;
				    ai6Health = 1;
				    ai6CoinsDropped = 1;
				    ai6Name = "Chainsaw Chinchilla";
				    ai6Tier = 1;
				}
				else if (aiCards[5] == 7)
				{
				    aiCard6_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 2;
				    ai6Health = 3;
				    ai6CoinsDropped = 2;
				    ai6Name = "Slaughter Seahorse";
				    ai6Tier = 2;
				}
				else if (aiCards[5] == 8)
				{
				    aiCard6_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 2;
				    ai6Health = 3;
				    ai6CoinsDropped = 3;
				    ai6Name = "Mauler Meerkat";
				    ai6Tier = 3;
				}
				else if (aiCards[5] == 9)
				{
				    aiCard6_1 = new ImageIcon("resources/images/venemous vulture.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 3;
				    ai6Health = 3;
				    ai6CoinsDropped = 3;
				    ai6Name = "Venomous Vulture";
				    ai6Tier = 4;
				}
				else if (aiCards[5] == 10)
				{
				    aiCard6_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 6;
				    ai6Health = 2;
				    ai6CoinsDropped = 5;
				    ai6Name = "Bloodthirsty Badger";
				    ai6Tier = 5;
				}
				else if (aiCards[5] == 11)
				{
				    aiCard6_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 7;
				    ai6Health = 5;
				    ai6CoinsDropped = 8;
				    ai6Name = "Capybara of Carnage";
				    ai6Tier = 6;
				}
				else if (aiCards[5] == 12)
				{
				    aiCard6_1 = new ImageIcon("resources/images/homicide hamster.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 1;
				    ai6Health = 1;
				    ai6CoinsDropped = 1;
				    ai6Name = "Homicide Hamster";
				    ai6Tier = 1;
				}
				else if (aiCards[5] == 13)
				{
				    aiCard6_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 1;
				    ai6Health = 3;
				    ai6CoinsDropped = 2;
				    ai6Name = "Deathbeak Duckling";
				    ai6Tier = 2;
				}
				else if (aiCards[5] == 14)
				{
				    aiCard6_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 2;
				    ai6Health = 4;
				    ai6CoinsDropped = 3;
				    ai6Name = "Razorback Rottweiler";
				    ai6Tier = 3;
				}
				else if (aiCards[5] == 15)
				{
				    aiCard6_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 3;
				    ai6Health = 4;
				    ai6CoinsDropped = 4;
				    ai6Name = "Grievous Gorilla";
				    ai6Tier = 4;
				}
				else if (aiCards[5] == 16)
				{
				    aiCard6_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 5;
				    ai6Health = 2;
				    ai6CoinsDropped = 5;
				    ai6Name = "Pernicuous Porcupine";
				    ai6Tier = 5;
				}
				else if (aiCards[5] == 17)
				{
				    aiCard6_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 6;
				    ai6Health = 6;
				    ai6CoinsDropped = 8;
				    ai6Name = "Malevolent Mongoose";
				    ai6Tier = 6;
				}
				else if (aiCards[5] == 18)
				{
				    aiCard6_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 5;
				    ai6Health = 3;
				    ai6CoinsDropped = 4;
				    ai6Name = "Baleful Bald Eagle";
				    ai6Tier = 4;
				}
				else if (aiCards[5] == 19)
				{
				    aiCard6_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
				    showAiCard6();
				    card14 = "Yes";
				    ai6Attack = 2;
				    ai6Health = 5;
				    ai6CoinsDropped = 3;
				    ai6Name = "Murderous Mecha-Monkey";
				    ai6Tier = 3;
				}
				
				
				if (aiCards[6] == 0)
				{
				    aiCard7_1 = new ImageIcon("resources/images/razer rabbit.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 2;
				    ai7Health = 1;
				    ai7CoinsDropped = 1;
				    ai7Name = "Razor Rabbit";
				    ai7Tier = 1;
				}
				else if (aiCards[6] == 1)
				{
				    aiCard7_1 = new ImageIcon("resources/images/squirrel.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 1;
				    ai7Health = 3;
				    ai7CoinsDropped = 1;
				    ai7Name = "Spike The Squirrel";
				    ai7Tier = 2;
				}
				else if (aiCards[6] == 2)
				{
				    aiCard7_1 = new ImageIcon("resources/images/toxicturtle.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 1;
				    ai7Health = 5;
				    ai7CoinsDropped = 2;
				    ai7Name = "Toxic Turtle";
				    ai7Tier = 3;
				}
				else if (aiCards[6] == 3)
				{
				    aiCard7_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 3;
				    ai7Health = 3;
				    ai7CoinsDropped = 3;
				    ai7Name = "Fangtail Fox";
				    ai7Tier = 4;
				}
				else if (aiCards[6] == 4)
				{
				    aiCard7_1 = new ImageIcon("resources/images/raging raccoon.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 4;
				    ai7Health = 3;
				    ai7CoinsDropped = 4;
				    ai7Name = "Raging Raccoon";
				    ai7Tier = 5;
				}
				else if (aiCards[6] == 5)
				{
				    aiCard7_1 = new ImageIcon("resources/images/killer koala.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 1;
				    ai7Health = 3;
				    ai7CoinsDropped = 2;
				    ai7Name = "Killer Koala";
				    ai7Tier = 2;
				}
				else if (aiCards[6] == 6)
				{
				    aiCard7_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 1;
				    ai7Health = 1;
				    ai7CoinsDropped = 1;
				    ai7Name = "Chainsaw Chinchilla";
				    ai7Tier = 1;
				}
				else if (aiCards[6] == 7)
				{
				    aiCard7_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 2;
				    ai7Health = 3;
				    ai7CoinsDropped = 2;
				    ai7Name = "Slaughter Seahorse";
				    ai7Tier = 2;
				}
				else if (aiCards[6] == 8)
				{
				    aiCard7_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 2;
				    ai7Health = 3;
				    ai7CoinsDropped = 3;
				    ai7Name = "Mauler Meerkat";
				    ai7Tier = 3;
				}
				else if (aiCards[6] == 9)
				{
				    aiCard7_1 = new ImageIcon("resources/images/venemous vulture.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 3;
				    ai7Health = 3;
				    ai7CoinsDropped = 3;
				    ai7Name = "Venomous Vulture";
				    ai7Tier = 4;
				}
				else if (aiCards[6] == 10)
				{
				    aiCard7_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 6;
				    ai7Health = 2;
				    ai7CoinsDropped = 5;
				    ai7Name = "Bloodthirsty Badger";
				    ai7Tier = 5;
				}
				else if (aiCards[6] == 11)
				{
				    aiCard7_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 7;
				    ai7Health = 5;
				    ai7CoinsDropped = 8;
				    ai7Name = "Capybara of Carnage";
				    ai7Tier = 6;
				}
				else if (aiCards[6] == 12)
				{
				    aiCard7_1 = new ImageIcon("resources/images/homicide hamster.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 1;
				    ai7Health = 1;
				    ai7CoinsDropped = 1;
				    ai7Name = "Homicide Hamster";
				    ai7Tier = 1;
				}
				else if (aiCards[6] == 13)
				{
				    aiCard7_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 1;
				    ai7Health = 3;
				    ai7CoinsDropped = 2;
				    ai7Name = "Deathbeak Duckling";
				    ai7Tier = 2;
				}
				else if (aiCards[6] == 14)
				{
				    aiCard7_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 2;
				    ai7Health = 4;
				    ai7CoinsDropped = 3;
				    ai7Name = "Razorback Rottweiler";
				    ai7Tier = 3;
				}
				else if (aiCards[6] == 15)
				{
				    aiCard7_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 3;
				    ai7Health = 4;
				    ai7CoinsDropped = 4;
				    ai7Name = "Grievous Gorilla";
				    ai7Tier = 4;
				}
				else if (aiCards[6] == 16)
				{
				    aiCard7_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 5;
				    ai7Health = 2;
				    ai7CoinsDropped = 5;
				    ai7Name = "Pernicuous Porcupine";
				    ai7Tier = 5;
				}
				else if (aiCards[6] == 17)
				{
				    aiCard7_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 6;
				    ai7Health = 6;
				    ai7CoinsDropped = 8;
				    ai7Name = "Malevolent Mongoose";
				    ai7Tier = 6;
				}
				else if (aiCards[6] == 18)
				{
				    aiCard7_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 5;
				    ai7Health = 3;
				    ai7CoinsDropped = 4;
				    ai7Name = "Baleful Bald Eagle";
				    ai7Tier = 4;
				}
				else if (aiCards[6] == 19)
				{
				    aiCard7_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
				    showAiCard7();
				    card15 = "Yes";
				    ai7Attack = 2;
				    ai7Health = 5;
				    ai7CoinsDropped = 3;
				    ai7Name = "Murderous Mecha-Monkey";
				    ai7Tier = 3;
				}
				
				
				if (aiCards[7] == 0)
				{
				    aiCard8_1 = new ImageIcon("resources/images/razer rabbit.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 2;
				    ai8Health = 1;
				    ai8CoinsDropped = 1;
				    ai8Name = "Razor Rabbit";
				    ai8Tier = 1;
				}
				else if (aiCards[7] == 1)
				{
				    aiCard8_1 = new ImageIcon("resources/images/squirrel.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 1;
				    ai8Health = 3;
				    ai8CoinsDropped = 1;
				    ai8Name = "Spike The Squirrel";
				    ai8Tier = 2;
				}
				else if (aiCards[7] == 2)
				{
				    aiCard8_1 = new ImageIcon("resources/images/toxicturtle.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 1;
				    ai8Health = 5;
				    ai8CoinsDropped = 2;
				    ai8Name = "Toxic Turtle";
				    ai8Tier = 3;
				}
				else if (aiCards[7] == 3)
				{
				    aiCard8_1 = new ImageIcon("resources/images/fangtail fox card.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 3;
				    ai8Health = 3;
				    ai8CoinsDropped = 3;
				    ai8Name = "Fangtail Fox";
				    ai8Tier = 4;
				}
				else if (aiCards[7] == 4)
				{
				    aiCard8_1 = new ImageIcon("resources/images/raging raccoon.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 4;
				    ai8Health = 3;
				    ai8CoinsDropped = 4;
				    ai8Name = "Raging Raccoon";
				    ai8Tier = 5;
				}
				else if (aiCards[7] == 5)
				{
				    aiCard8_1 = new ImageIcon("resources/images/killer koala.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 1;
				    ai8Health = 3;
				    ai8CoinsDropped = 2;
				    ai8Name = "Killer Koala";
				    ai8Tier = 2;
				}
				else if (aiCards[7] == 6)
				{
				    aiCard8_1 = new ImageIcon("resources/images/chainsaw chinchilla.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 1;
				    ai8Health = 1;
				    ai8CoinsDropped = 1;
				    ai8Name = "Chainsaw Chinchilla";
				    ai8Tier = 1;
				}
				else if (aiCards[7] == 7)
				{
				    aiCard8_1 = new ImageIcon("resources/images/slaughter seahorse.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 2;
				    ai8Health = 3;
				    ai8CoinsDropped = 2;
				    ai8Name = "Slaughter Seahorse";
				    ai8Tier = 2;
				}
				else if (aiCards[7] == 8)
				{
				    aiCard8_1 = new ImageIcon("resources/images/mauler meerkat.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 2;
				    ai8Health = 3;
				    ai8CoinsDropped = 3;
				    ai8Name = "Mauler Meerkat";
				    ai8Tier = 3;
				}
				else if (aiCards[7] == 9)
				{
				    aiCard8_1 = new ImageIcon("resources/images/venemous vulture.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 3;
				    ai8Health = 3;
				    ai8CoinsDropped = 3;
				    ai8Name = "Venomous Vulture";
				    ai8Tier = 4;
				}
				else if (aiCards[7] == 10)
				{
				    aiCard8_1 = new ImageIcon("resources/images/bloodthirsty badger.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 6;
				    ai8Health = 2;
				    ai8CoinsDropped = 5;
				    ai8Name = "Bloodthirsty Badger";
				    ai8Tier = 5;
				}
				else if (aiCards[7] == 11)
				{
				    aiCard8_1 = new ImageIcon("resources/images/capybara of carnage.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 7;
				    ai8Health = 5;
				    ai8CoinsDropped = 8;
				    ai8Name = "Capybara of Carnage";
				    ai8Tier = 6;
				}
				else if (aiCards[7] == 12)
				{
				    aiCard8_1 = new ImageIcon("resources/images/homicide hamster.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 1;
				    ai8Health = 1;
				    ai8CoinsDropped = 1;
				    ai8Name = "Homicide Hamster";
				    ai8Tier = 1;
				}
				else if (aiCards[7] == 13)
				{
				    aiCard8_1 = new ImageIcon("resources/images/deathbeak duckling.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 1;
				    ai8Health = 3;
				    ai8CoinsDropped = 2;
				    ai8Name = "Deathbeak Duckling";
				    ai8Tier = 2;
				}
				else if (aiCards[7] == 14)
				{
				    aiCard8_1 = new ImageIcon("resources/images/razerback rottweiler.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 2;
				    ai8Health = 4;
				    ai8CoinsDropped = 3;
				    ai8Name = "Razorback Rottweiler";
				    ai8Tier = 3;
				}
				else if (aiCards[7] == 15)
				{
				    aiCard8_1 = new ImageIcon("resources/images/grevious gorilla.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 3;
				    ai8Health = 4;
				    ai8CoinsDropped = 4;
				    ai8Name = "Grievous Gorilla";
				    ai8Tier = 4;
				}
				else if (aiCards[7] == 16)
				{
				    aiCard8_1 = new ImageIcon("resources/images/pernicious porcupine.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 5;
				    ai8Health = 2;
				    ai8CoinsDropped = 5;
				    ai8Name = "Pernicuous Porcupine";
				    ai8Tier = 5;
				}
				else if (aiCards[7] == 17)
				{
				    aiCard8_1 = new ImageIcon("resources/images/malevolent mongoose.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 6;
				    ai8Health = 6;
				    ai8CoinsDropped = 8;
				    ai8Name = "Malevolent Mongoose";
				    ai8Tier = 6;
				}
				else if (aiCards[7] == 18)
				{
				    aiCard8_1 = new ImageIcon("resources/images/baleful bald eagle.jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 5;
				    ai8Health = 3;
				    ai8CoinsDropped = 4;
				    ai8Name = "Baleful Bald Eagle";
				    ai8Tier = 4;
				}
				else if (aiCards[7] == 19)
				{
				    aiCard8_1 = new ImageIcon("resources/images/Mecha-monkey (1).jpg");
				    showAiCard8();
				    card16 = "Yes";
				    ai8Attack = 2;
				    ai8Health = 5;
				    ai8CoinsDropped = 3;
				    ai8Name = "Murderous Mecha-Monkey";
				    ai8Tier = 3;
				}
				
			}
		});
		
		frame.setVisible(true);
	}
}

	
