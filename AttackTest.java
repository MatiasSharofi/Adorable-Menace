import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class AttackTest {
	
	static userCard[] userCardArray = new userCard[8];
	static aiCard[] aiCardArray = new aiCard[8];
	static JButton card1;
	static JButton card2;
	static JButton select1;
	static JButton select1AI;
	static int health1;
	static int health2;
	static int damage1;
	static int damage2;
	static boolean card1Clicked = false;
	
	public static void main(String[] args) {

        userCard userCard = new userCard(5,3);
        userCardArray[0] = userCard;
        
        aiCard aiCard = new aiCard(5,2);
        aiCardArray[0] = aiCard;
		
		JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080);
        
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        
        ImageIcon icon = new ImageIcon("resources/images/capybara of carnage.jpg");
        Image icon2 = icon.getImage();
        Image icon3 = icon2.getScaledInstance(125, 200, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(icon3);
        
        // Set the image as the icon for the button
        card1 = new JButton(resizedIcon);
        card1.setLocation(730,88);
        card1.setSize(126,201);
        panel.add(card1);
        
        ImageIcon iconAI = new ImageIcon("resources/images/baleful bald eagle.jpg");
        Image icon2AI = iconAI.getImage();
        Image icon3AI = icon2AI.getScaledInstance(125, 200, Image.SCALE_SMOOTH);
        ImageIcon resizedIconAI = new ImageIcon(icon3AI);
        
        card2 = new JButton(resizedIconAI);
        card2.setLocation(730,517);
        card2.setSize(126,201);
        panel.add(card2);
        
        select1 = new JButton();
        select1.setText("Select");
        select1.setBounds(730,728,126,30);
        panel.add(select1);
        
        select1AI = new JButton();
        select1AI.setText("Select");
        select1AI.setBounds(730,294,126,30);
        panel.add(select1AI);
        
        panel.setLayout(null);
        
        frame.setVisible(true);
        
        select1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				card1Clicked = true;
			}
		});
        
        select1AI.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				if(card1Clicked)
				{
					damage1 = userCard.getAttack();
					health2 = aiCard.getHealth();
					
					health2 = health2 - damage1;
					
					aiCardArray[0].setHealth(health2 - damage1);
					
					if(health2 <= 0)
					{
						System.out.println("He died.");
					}
					else System.out.println("He lost " + damage1 + " health.");
				}
			}
		});
	}
}
