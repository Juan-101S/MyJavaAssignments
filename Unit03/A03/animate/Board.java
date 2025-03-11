package animate;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;

import javax.swing.JPanel;

import sound.SoundClip;

public class Board extends JPanel {
    private final int B_WIDTH = 720;
    private final int B_HEIGHT = 720;
    private int x = 0;
    private int y = 0;
    private int dx;
    private int dy;
    private final int DIAMETER = 20;
    private BufferedImage img;
    private double angle = 0;

    private Timer timer;
    private final int INITIAL_DELAY = 100;
    private final int PERIOD_INTERVAL = 25;
    private int xSpeed = 2;
    private int ySpeed = 2;

    private SoundClip sitarClip;
    private SoundClip owClip;
    private boolean loop;

    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        x = B_WIDTH / 2;
        y = B_HEIGHT / 2;
        Random rand = new Random();
        xSpeed = rand.nextInt(5) + 1;
        ySpeed = rand.nextInt(5) + 1;
        sitarClip = new SoundClip("media/sitar.wav");
        sitarClip.setLoop(true);
        sitarClip.open();
        sitarClip.play();
        owClip = new SoundClip("media/ow.wav");
        owClip.open();

        try {
            File imgFile = new File("media/Andy.png");
            img = ImageIO.read(imgFile);
        } catch (Exception e) {
            System.err.println("unable to open image file!");
            System.err.println(e.getMessage());
        }
        timer = new Timer();
        timer.scheduleAtFixedRate(new UpdateAnimation(),
                INITIAL_DELAY, PERIOD_INTERVAL);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        AffineTransform affineTransform = new AffineTransform();
        affineTransform.translate(x - DIAMETER / 2, y - DIAMETER / 2);
        affineTransform.rotate(Math.toRadians(angle), img.getWidth() / 2, img.getHeight() / 2);
        g2d.drawImage(img, affineTransform, null);
    }

    private class UpdateAnimation extends TimerTask {
        public void run() {
            x += xSpeed;
            if (x > B_WIDTH || x < 0) {
                xSpeed = -xSpeed;
                owClip.play();
            }
            y += ySpeed;
            if (y > B_WIDTH || y < 0) {
                ySpeed = -ySpeed;
                owClip.play();
            }
            angle += 5;
            angle = angle % 360;
            repaint();
        }
    }
}