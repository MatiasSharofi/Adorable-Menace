import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PNGTEST {
	
	static JButton button;
	static JButton button2;
	static JButton button3;
	
    public static void main(String[] args) {
            // Create a JFrame
            JFrame frame = new JFrame("JButton with Image Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1000, 1000);
            
            JPanel panel = new JPanel();
            frame.getContentPane().add(panel);
            
            // Load the image from a JPG file
           
            
            ImageIcon backIcon = new ImageIcon("C:\\Users\\jorgi\\Pictures\\Saved Pictures\\capybara of carnage.jpg");
            Image backIcon2 = backIcon.getImage();
            Image backIcon3 = backIcon2.getScaledInstance(175, 250, Image.SCALE_SMOOTH);
            ImageIcon resizedIcon2 = new ImageIcon(backIcon3);
           
            ImageIcon icon = new ImageIcon("C:\\Users\\jorgi\\Pictures\\Saved Pictures\\squirrel.jpg");
            Image icon2 = icon.getImage();
            Image icon3 = icon2.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
            ImageIcon resizedIcon = new ImageIcon(icon3);
            
            // Set the image as the icon for the button
            button = new JButton(resizedIcon);
            button.setLocation(421,331);
            button.setSize(100,159);
            panel.setLayout(null);
            
            button2 = new JButton(resizedIcon2);
            button2.setLocation(26,10);
            button2.setSize(174,253);
            panel.add(button2);
            button2.setVisible(false);
            
            button3 = new JButton();
            button3.setText("X");
            button3.setBounds(210,10,48,56);
            panel.add(button3);
            button3.setVisible(false);

            // Add the button to the frame
            panel.add(button);
            
            JTextArea textArea = new JTextArea();
            textArea.setBackground(new Color(128, 255, 0));
            textArea.setBounds(26, 260, 174, 80);
            panel.add(textArea);
            textArea.setVisible(false);

            frame.setVisible(true);
            
            button.addActionListener(new ActionListener()//actionListener for closeButton
    		{
    			public void actionPerformed(ActionEvent e)
    			{
    				button.setVisible(false);
    				button2.setVisible(true);
    				textArea.append("Health: 2");
    				textArea.append("\n");
    				textArea.append("Attack: 3");
    				textArea.setVisible(true);
    				button3.setVisible(true);
    			}
    		});
            button3.addActionListener(new ActionListener()//actionListener for closeButton
    		{
    			public void actionPerformed(ActionEvent e)
    			{
    				button.setVisible(true);
    				button2.setVisible(false);
    				textArea.setVisible(false);
    				button3.setVisible(false);
    			}
    		});
    }
}
