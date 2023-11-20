import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuScreen_Harshaan {

    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("exexe");

        // Create a JButton
        JButton help = new JButton("help & information!");

        // Add an ActionListener to the button
        help.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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

        // Set the layout manager for the JFrame to FlowLayout
        frame.setLayout(new FlowLayout());
        frame.add(help);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
