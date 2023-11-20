import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PNGTEST {
	
	static JButton button;
	static JButton button2;
	static JButton infoClose;
	static JLabel infoTitle;
	
    public static void main(String[] args) {
            // Create a JFrame
            JFrame frame = new JFrame("JButton with Image Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1920, 1080);
            
            JPanel panel = new JPanel();
            frame.getContentPane().add(panel);
            
            // Load the image from a JPG file
           
            
            ImageIcon infoIcon = new ImageIcon("resources/images/capybara of carnage.jpg");
            Image backIcon2 = infoIcon.getImage();
            Image backIcon3 = backIcon2.getScaledInstance(300, 420, Image.SCALE_SMOOTH);
            ImageIcon resizedIcon2 = new ImageIcon(backIcon3);
           
            ImageIcon icon = new ImageIcon("resources/images/capybara of carnage.jpg");
            Image icon2 = icon.getImage();
            Image icon3 = icon2.getScaledInstance(125, 200, Image.SCALE_SMOOTH);
            ImageIcon resizedIcon = new ImageIcon(icon3);
            
            // Set the image as the icon for the button
            button = new JButton(resizedIcon);
            button.setLocation(472,216);
            button.setSize(126,201);
            panel.setLayout(null);
            
            button2 = new JButton(resizedIcon2);
            button2.setLocation(0,60);
            button2.setSize(303,400);
            panel.add(button2);
            button2.setVisible(false);
            
            infoClose = new JButton();
            infoClose.setFont(new Font("Tahoma", Font.PLAIN, 11));
            infoClose.setText("X");
            infoClose.setBounds(300,0,42,50);
            panel.add(infoClose);
            infoClose.setVisible(false);
            
            infoTitle = new JLabel();
            infoTitle.setBackground(new Color(211, 211, 211));
            infoTitle.setOpaque(true);
            infoTitle.setForeground(new Color(169, 169, 169));
            infoTitle.setFont(new Font("Wide Latin", Font.BOLD, 35));
            infoTitle.setHorizontalAlignment(SwingConstants.CENTER);
            infoTitle.setText("Card Info");
            infoTitle.setBounds(0,0,303,62);
            panel.add(infoTitle);

            // Add the button to the frame
            panel.add(button);
            
            JTextArea textArea = new JTextArea();
            textArea.setBackground(new Color(128, 255, 0));
            textArea.setBounds(0, 340, 174, 80);
            panel.add(textArea);
            
            JLabel lblCardInfo = new JLabel();
            lblCardInfo.setVerticalAlignment(SwingConstants.TOP);
            lblCardInfo.setText("<html>Health: 5<br>Attack: 4</html>");
            lblCardInfo.setOpaque(true);
            lblCardInfo.setForeground(new Color(169, 169, 169));
            lblCardInfo.setFont(new Font("Wide Latin", Font.PLAIN, 25));
            lblCardInfo.setBackground(new Color(211, 211, 211));
            lblCardInfo.setBounds(0, 460, 303, 222);
            panel.add(lblCardInfo);
            
            JButton btnNewButton = new JButton("Shop");
            btnNewButton.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            	}
            });
            btnNewButton.setBackground(new Color(211, 211, 211));
            btnNewButton.setForeground(new Color(169, 169, 169));
            btnNewButton.setFont(new Font("Wide Latin", Font.BOLD, 35));
            btnNewButton.setBounds(0, 701, 303, 62);
            panel.add(btnNewButton);
            
            JButton btnForfiet = new JButton("Forfiet");
            btnForfiet.setBackground(new Color(211, 211, 211));
            btnForfiet.setForeground(new Color(169, 169, 169));
            btnForfiet.setFont(new Font("Wide Latin", Font.BOLD, 35));
            btnForfiet.setBounds(0, 773, 303, 62);
            panel.add(btnForfiet);
            textArea.setVisible(false);

            frame.setVisible(true);
            
            button.addActionListener(new ActionListener()//actionListener for closeButton
    		{
    			public void actionPerformed(ActionEvent e)
    			{
    				button2.setVisible(true);
    				textArea.append("Health: 2");
    				textArea.append("\n");
    				textArea.append("Attack: 3");
    				textArea.setVisible(true);
    				infoClose.setVisible(true);
    			}
    		});
            infoClose.addActionListener(new ActionListener()//actionListener for closeButton
    		{
    			public void actionPerformed(ActionEvent e)
    			{
    				button.setVisible(true);
    				button2.setVisible(false);
    				textArea.setVisible(false);
    				infoClose.setVisible(false);
    			}
    		});
    }
}
