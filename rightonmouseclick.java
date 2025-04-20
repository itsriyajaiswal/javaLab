import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExpandRing {
    private static int ringSize = 50; // Initial size

    public static void main(String[] args) {
        JFrame frame = new JFrame("Expand Ring");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawOval((getWidth() - ringSize) / 2, (getHeight() - ringSize) / 2, ringSize, ringSize);
            }
        };

        panel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                ringSize += 20; // Expand the ring
                panel.repaint();
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
