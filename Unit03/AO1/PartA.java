import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

public class PartA {
    public static void main(String[] args) {
        JFrame frame = new JFrame("AffineTransform Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new Board());
        frame.setVisible(true);
    }
}

class Board extends JPanel {
    private static final int BOARD_WIDTH = 350;
    private static final int BOARD_HEIGHT = 350;
    private static final int RECT_WIDTH = 150;
    private static final int RECT_HEIGHT = 150;

    public Board() {
        setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));
        setBackground(Color.CYAN);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        AffineTransform transform = new AffineTransform();
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        transform.translate(centerX - RECT_WIDTH / 2, centerY - RECT_HEIGHT / 2);
        transform.rotate(Math.toRadians(22.5), RECT_WIDTH / 2, RECT_HEIGHT / 2);
        g2d.setTransform(transform);
        g2d.setColor(Color.MAGENTA);
        g2d.fill(new Rectangle2D.Double(0, 0, RECT_WIDTH, RECT_HEIGHT));
    }
}