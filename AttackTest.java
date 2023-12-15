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
	static JTextArea actionHistory;
	static JLabel actionHistoryTitle;
	static JScrollPane sp;
	
	static int health1;
	static int health2;
	static int damage1;
	static int damage2;
	static int turnNum = 0;
	
	static boolean card1Clicked = false;
	static boolean aiAttacked = false;
	static boolean userAttacked = false;
	
	public static void main(String[] args) {

        userCard userCard = new userCard(5,3, "Baleful Bald Eagle");
        userCardArray[0] = userCard;
        
        aiCard aiCard = new aiCard(5,2, "Capybara of Carnage");
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
        
        actionHistoryTitle = new JLabel();
        actionHistoryTitle.setText("Action History");
        actionHistoryTitle.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 17));
        actionHistoryTitle.setHorizontalAlignment(SwingConstants.CENTER);
        actionHistoryTitle.setBounds(1328, 101, 137, 45);
        panel.add(actionHistoryTitle);
        
        actionHistory = new JTextArea(5,20);
        actionHistory.setEditable(false);
        actionHistory.setFont(new Font("Arial", Font.PLAIN, 13));
        actionHistory.setBounds(369,302,228,207);
        panel.add(actionHistory);
        
        sp = new JScrollPane(actionHistory);
        sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        sp.setBounds(1266,154,264,113);
        panel.add(sp, BorderLayout.CENTER);
        
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
					turnNum++;
					card1Clicked = false;
					damage1 = userCard.getAttack();
					health2 = aiCard.getHealth();
					
					health2 = health2 - damage1;
					
					aiCardArray[0].setHealth(health2);
					
					if(health2 <= 0)
					{
						System.out.println("He died.");
						actionHistory.append("Turn " + turnNum + ": " + aiCardArray[0].getName() + " was killed by " + userCardArray[0].getName());
						actionHistory.append("\n");
					}
					else 
					{
						System.out.println("He lost " + damage1 + " health.");
						actionHistory.append("Turn " + turnNum + ": " + userCardArray[0].getName() + " did " + userCardArray[0].getAttack() + " damage to " + aiCardArray[0].getName());
						actionHistory.append("\n");
					}
				}
			}
		});
	}
}
