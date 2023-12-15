import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import java.awt.Color;

public class MainMenuScreen {

    public static void showMainMenuScreen() 
    {
   
        JFrame frame = new JFrame();
		frame.getContentPane().setBackground(new Color(80, 1, 86));
		frame.setBounds(100, 100, 1400, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close the frame when 'X' is pressed
		frame.getContentPane().setLayout(null);
		
		JLabel titleLabel = new JLabel("Adorable Menace: Feral Friends");
		titleLabel.setForeground(new Color(0, 0, 0));
		titleLabel.setBackground(new Color(240, 240, 240));
		titleLabel.setFont(new Font("Wide Latin", Font.BOLD | Font.ITALIC, 20));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setBounds(374, 24, 637, 32);
		frame.getContentPane().add(titleLabel);
		
		JLabel titleLabel2 = new JLabel("A Strategy Card Game");
		titleLabel2.setForeground(new Color(0, 0, 0));
		titleLabel2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		titleLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel2.setBounds(595, 56, 196, 23);
		frame.getContentPane().add(titleLabel2);
		
		JButton startButton = new JButton("NEW GAME");
		startButton.setBackground(new Color(240, 240, 240));
		startButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		startButton.setBounds(604, 128, 177, 77);
		frame.getContentPane().add(startButton);
		
		JButton helpButton = new JButton("HELP");
		helpButton.setBackground(new Color(240, 240, 240));
		helpButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		helpButton.setBounds(604, 225, 177, 77);
		frame.getContentPane().add(helpButton);
		
		JButton statsButton = new JButton("STATS");
		statsButton.setBackground(new Color(240, 240, 240));
		statsButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		statsButton.setBounds(604, 323, 177, 77);
		frame.getContentPane().add(statsButton);
		
		JButton quitButton = new JButton("QUIT");
		quitButton.setBackground(new Color(240, 240, 240));
		quitButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		quitButton.setBounds(604, 424, 177, 77);
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
                		+ "<br> The AI will make a decision after about 2-5 seconds. After this, another pop-up will be displayed telling you that it's now your turn!"
                		+ "<br> The timer will continue to run if you ever go to the shop screen during your turn."
                		+ "<br> If you are truly ready to play Feral Friends, click the 'OK' button below this message!"
                		+ "</html>";
                JOptionPane.showMessageDialog(frame, message, "Help And Information", JOptionPane.INFORMATION_MESSAGE);
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
                		+ "<br> The player will be matched up with the smartest AI, ensuring each game is competitive and has a relatively lengthy duration."
                		+ "<br> The theme of this card game is adorable animals turned dangerous, as they will have strange and unassuming attacks that can deal damage to the opponent."
                		+ "<br> Creature cards will show an image along with the creature’s attributes and various attacks, how much health they have, the amount of damage they deal, and the coins that will be dropped if they are killed."
                		+ "<br> Ability cards are bonus cards which will have to be purchased in the Shop portion of the game."
                		+ "<br> Prior to each turn, the user or AI will have the ability to go to the Shop and purchase ability cards with the coins they have."
                		+ "<br> These ability cards provide either the user or AI with invaluable attacks and defenses that can greatly impact the trajectory of the game."
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
