package animate;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

public class Board extends JPanel implements KeyListener {
    private static final int B_WIDTH = 1392;
    private static final int B_HEIGHT = 783;
    private static final int FLOOR = B_HEIGHT - 25;
    private Cannon cannon;

    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        cannon = new Cannon();
        cannon.setX(60);
        cannon.setY(B_HEIGHT - 60);
        cannon.setAngle(-45);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.MAGENTA);

        g.setColor(Color.BLACK);
        g.drawLine(0, FLOOR, B_WIDTH, FLOOR);
        g.setColor(Color.GREEN);
        g.fillRect(0, FLOOR + 1, B_WIDTH, B_HEIGHT - FLOOR);

        cannon.draw(g2d);
        displayInfo(g2d);
    }

    private void displayInfo(Graphics2D g2d) {
        g2d.setColor(Color.RED);
        g2d.drawString("Press LEFT/RIGHT arrows to adjust the angle", 550, 20);
        g2d.drawString("Press SPACE to fire", 550, 60);
        g2d.drawString("Angle = " + (double) Math.round(Math.abs(cannon.getAngle())) + " deg", 550, 80);
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            System.out.println("SPACE Key was pressed");
            cannon.fire();
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("LEFT Key was pressed");
            cannon.rotateCounterClockwise();
            repaint();
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("RIGHT Key was pressed");
            cannon.rotateClockwise();
            repaint();
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("UP Key was pressed");
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            System.out.println("DOWN Key was pressed");
        }
    }

    public void keyReleased(KeyEvent e) {
    }
}