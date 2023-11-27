import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class thirtysecond {
    private static final int TIMER_DURATION = 30;
    private int secondsRemaining;
    private Timer timer;
    private JLabel timerLabel;

    public thirtysecond() {
        JFrame frame = new JFrame("Timer Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(null);

        timerLabel = new JLabel("Time remaining: " + TIMER_DURATION + " seconds");
        timerLabel.setBounds(10, 10, 200, 30);
        frame.add(timerLabel);

        JButton resetButton = new JButton("Reset Timer");
        resetButton.setBounds(10, 50, 120, 30);
        frame.add(resetButton);

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetTimer();
            }
        });

        secondsRemaining = TIMER_DURATION;
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTimer();
            }
        });

        timer.start();

        frame.setVisible(true);
    }

    private void resetTimer() {
        secondsRemaining = TIMER_DURATION;
        updateTimerLabel();
    }

    private void updateTimer() {
        secondsRemaining--;
        if (secondsRemaining <= 0) {
            resetTimer();
        } else {
            updateTimerLabel();
        }
    }

    private void updateTimerLabel() {
        timerLabel.setText("Time remaining: " + secondsRemaining + " seconds");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new thirtysecond();
            }
        });
    }
}
