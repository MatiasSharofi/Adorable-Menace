import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import java.awt.Color;

public class MainMenuScreen {

	static int wins = 0;
	static int losses = 0;
	static int readWins = 0;
	static int readLosses = 0;
	
	public static void write3()
	{
		try // Try is necessary for PrintWriter as exceptions can be generated without it
	    {
	      PrintWriter output; // Object to connect to file for write command
	      output = new PrintWriter (new FileWriter("main menu.txt")); // Instantiate the object and create text file "student_data.txt" 
	      output.println(wins);
	      output.println(losses);
	      output.close(); // Close the file
	    }
	    catch (Exception e) // Catch is necessary for try/catch block due to exceptions
	    {
	      System.out.println(e); // Show error if there is one
	    }
	}
	
	public static void read3()
	{
		try // Try is necessary for BufferedReader as exceptions can be generated without it
	    {
	      BufferedReader input = new BufferedReader (new FileReader("main menu.txt")); // Instantiate the object and connect it to text file "student_data.txt"
	      String line = input.readLine(); // read new line and assign it to line
	      if (line != null) 
	      { // If there is data within the text file (even blank strings), code below will run 
	    	 readWins = Integer.parseInt(line);
	    	 readLosses = Integer.parseInt(input.readLine());
	      }
	        input.close(); // Close the file
	    }
	    catch (Exception e) // Catch is necessary for try/catch block due to exceptions
	    {
	      System.out.println(e); // Show error if there is one
	    }
	}
	
    public static void showMainMenuScreen() 
    {
        JFrame frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 0, 128));
		frame.setBounds(0, 0, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close the frame when 'X' is pressed
		frame.getContentPane().setLayout(null);
		
		read3();
		
		wins = readWins;
		losses = readLosses;
		
		JLabel titleLabel = new JLabel("Adorable Menace: Feral Friends");
		titleLabel.setForeground(new Color(0, 0, 0));
		titleLabel.setBackground(new Color(240, 240, 240));
		titleLabel.setFont(new Font("Wide Latin", Font.BOLD | Font.ITALIC, 20));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setBounds(451, 24, 637, 32);
		frame.getContentPane().add(titleLabel);
		
		JLabel titleLabel2 = new JLabel("A Strategy Card Game");
		titleLabel2.setForeground(new Color(0, 0, 0));
		titleLabel2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		titleLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel2.setBounds(672, 56, 196, 23);
		frame.getContentPane().add(titleLabel2);
		
		JButton startButton = new JButton("NEW GAME");
		startButton.setBackground(new Color(240, 240, 240));
		startButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		startButton.setBounds(681, 128, 177, 77);
		frame.getContentPane().add(startButton);
		
		JButton helpButton = new JButton("HELP");
		helpButton.setBackground(new Color(240, 240, 240));
		helpButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		helpButton.setBounds(681, 225, 177, 77);
		frame.getContentPane().add(helpButton);
		
		JButton statsButton = new JButton("STATS");
		statsButton.setBackground(new Color(240, 240, 240));
		statsButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		statsButton.setBounds(681, 323, 177, 77);
		frame.getContentPane().add(statsButton);
		
		statsButton.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				String message = "<html> Wins : " + wins
                		+ "<br> Losses: " + losses
                		+ "</html>";
                JOptionPane.showMessageDialog(frame, message, "Help And Information", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		JButton quitButton = new JButton("QUIT");
		quitButton.setBackground(new Color(240, 240, 240));
		quitButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		quitButton.setBounds(681, 424, 177, 77);
		frame.getContentPane().add(quitButton);
		frame.setVisible(true); // show the frame
		
		startButton.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e) 
			{
				String message = "<html> Before the game begins, please take note of how turns will work!"
                		+ "<br> You will have the first turn, where you must click the 'Draw 8 Cards' button"
                		+ "<br> From there, you will select your battle arena cards and then you will be forced to attack the AI's battle arena cards before the 30-second countdown timer runs out."
                		+ "<br> If this timer ever runs out during one of your turns, you will lose that turn."
                		+ "<br> After this, there will be a pop-up on the screen showing you that it is the AI's turn."
                		+ "<br> The AI will make a decision after about 2 seconds. After this, another pop-up will be displayed telling you that it's now your turn!"
                		+ "<br> The timer will continue to run if you ever go to the shop screen during your turn."
                		+ "<br> If you are truly ready to play Feral Friends, click the 'OK' button below this message!"
                		+ "</html>";
                JOptionPane.showMessageDialog(frame, message, "Help And Information", JOptionPane.INFORMATION_MESSAGE);
                write3();
				frame.setVisible(false);
				GameplayScreen gs = new GameplayScreen();
				gs.showGameplayScreen();
			}
		});
		
		helpButton.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e) 
            {
                // Display a message dialog with multiple lines of text
                String message = "<html> Feral Friends is an action-packed card game that uses logic and strategy-based tactics to determine a winner."
                		+ "<br> You will be matched up with the smartest AI, so play well!"
                		+ "<br> Your deck and your opponent's deck are random each game, so make use with what you are dealt."
                		+ "<br> Creature cards will display an image along with the creature’s attributes and various attacks, how much health they have, the amount of damage they deal, and the coins that will be dropped if they are killed."
                		+ "<br> Simply click on a card's image in order to see these attributes in detail."
                		+ "<br> To place cards into the battle arena to attack your opponent, click the 'SELECT' button underneath the card in your deck. It will automatically be placed inside an open slot in the battle arena."
                		+ "<br> Attacking the opponent is easy! Simply click the 'USE' button underneath a battle arena card and click the 'ATTACK' button underneath one of your opponent's battle arena cards. Their health will go down automatically!"
                		+ "<br> Refer to the 'Action History' text area after your moves and your opponent's moves so you know exactly what was attacked and the damage it did."
                		+ "<br> The game WILL NOT tell you the stats of your cards or your opponent's cards in the battle arena, so you will have to remember the stats of every battle arena card!"
                		+ "<br> Ability cards are bonus cards which are purchased in the Shop portion of the game."
                		+ "<br> Prior to each turn, you will have the ability to go to the Shop and purchase ability cards with the coins you have amassed."
                		+ "<br> These ability cards will provide you with invaluable attacks and defenses that can greatly impact the trajectory of the game."
                		+ "<br> Both you and yur opponent can only hold 1 ability card at a time, meaning you will NOT be able to purchase another ability card before you use your current one."
                		+ "<br> Once ability cards are purchased and used, they cannot be used again. Make sure to save your coins for good ability cards but don't wait too long, otherwise, your opponent will purchase them!"
                		+ "<br> Your opponent will use its ability card right away, because it senses a disadvantage. Don't get flustered! Keep strategizing accordingly."
                		+ "<br> The objective of the game is to defeat all 8 of your opponent's cards before your 8 are depleted. Make sure you strategize well so that you have good cards at the final stages of the game."
                		+ "<br> Without further ado, good luck and enjoy Feral Friends!"
                		+ "</html>";
                JOptionPane.showMessageDialog(frame, message, "Help And Information", JOptionPane.INFORMATION_MESSAGE);
            }
		});
		
		quitButton.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e) 
            {
                System.exit(0);
            }
		});

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        showMainMenuScreen();
    }
}
