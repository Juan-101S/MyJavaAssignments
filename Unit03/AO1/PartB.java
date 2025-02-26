import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class PartB extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(Color.CYAN);
        Graphics2D g2d = (Graphics2D) g;

        int rectWidth = 150, rectHeight = 150;
        int panelWidth = getWidth(), panelHeight = getHeight();
        int centerX = panelWidth / 2, centerY = panelHeight / 2;

        AffineTransform transform = new AffineTransform();
        transform.translate(centerX - rectWidth / 2, centerY - rectHeight / 2);
        transform.rotate(Math.toRadians(22.5), rectWidth / 2, rectHeight / 2);

        g2d.setTransform(transform);
        g2d.setColor(Color.MAGENTA);
        g2d.fillRect(0, 0, rectWidth, rectHeight);

        g2d.setTransform(new AffineTransform());
        g2d.setColor(Color.BLUE);
        g2d.drawString("Hello, world!", 10, 20);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("my app");
        PartB panel = new PartB();
        frame.add(panel);
        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}