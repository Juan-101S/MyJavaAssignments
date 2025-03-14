package animate;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Board extends JPanel implements KeyListener {
        private final int B_WIDTH = 720;
        private final int B_HEIGHT = 720;
        private final int x = B_WIDTH / 2;
        private final int y = B_HEIGHT / 2;
        private final int DIAMETER = 20;
    
        public Board() {
            setBackground(Color.CYAN);
            setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
    
            this.setFocusable(true);
            this.addKeyListener(this);
        }
    
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.MAGENTA);
        g2d.fillOval(x - DIAMETER/2, y - DIAMETER/2, DIAMETER, DIAMETER);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }
}