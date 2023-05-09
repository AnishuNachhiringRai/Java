import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameMenu extends JFrame implements ActionListener {
    private JButton startButton;
    private JButton settingsButton;
    private JButton exitButton;

    public GameMenu() {
        setTitle("Game Menu");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        //mainPanel.setBackground(Color.BLUE);

        JLabel titleLabel = new JLabel("MENU");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 36));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(titleLabel);

        JPanel buttonPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        startButton = new JButton("Start Game");
        //startButton.setForeground(Color.green);
        startButton.setBackground(Color.BLUE);
        startButton.setBounds(100,200,50,50);
        startButton.setFont(new Font("Arial",Font.BOLD,15));
        settingsButton = new JButton("Settings");
        exitButton = new JButton("Exit Game");
        startButton.addActionListener(this);
        settingsButton.addActionListener(this);
        exitButton.addActionListener(this);
        //buttonPanel.setBackground(Color.blue);
        buttonPanel.add(startButton);
        buttonPanel.add(settingsButton);
        buttonPanel.add(exitButton);
        buttonPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(buttonPanel);
        getContentPane().add(mainPanel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            JOptionPane.showMessageDialog(this, "Starting game...");
        } else if (e.getSource() == settingsButton) {
            JOptionPane.showMessageDialog(this, "Opening settings...");
        } else if (e.getSource() == exitButton) {
            int confirmExit = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
            if (confirmExit == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        new GameMenu();
    }
}
