import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Birthday Surprise!");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel label = new JLabel("---- HIII  LIKITHA SANTOSHHH(LS)!----", JLabel.CENTER);
        label.setFont(new Font("Comic Sans MS", Font.ITALIC, 30));
        label.setForeground(Color.MAGENTA);

        JButton button = new JButton("CLICK TO OPEN!");
        button.setFont(new Font("Arial", Font.ITALIC, 30));
        button.setPreferredSize(new Dimension(250, 100));
        button.addActionListener(e -> JOptionPane.showMessageDialog(panel,
                "---- HAPPY BIRTHDAY,LIKITHA SANTHOSH----",
                "=== LS ===",
                JOptionPane.INFORMATION_MESSAGE));

        panel.add(label, BorderLayout.CENTER);
        panel.add(button, BorderLayout.NORTH);

        frame.add(panel);
        frame.setVisible(true);
    }
}
