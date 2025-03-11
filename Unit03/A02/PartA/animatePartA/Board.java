package PartA.animatePartA;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Board extends JPanel {
    private static final int B_WIDTH = 350;
    private static final int B_HEIGHT = 350;
    private static final int SIDE_LEN = 150;
    private BufferedImage img;

    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        try {
            File imgFile = new File("media/Snoopy.jpg");
            img = ImageIO.read(imgFile);
            setPreferredSize(new Dimension(img.getWidth(), img.getHeight()));
        } catch (Exception e) {
            System.err.println("unable to open image file!");
            System.err.println(e.getMessage());
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        if (img != null) {
            double scale = 0.5;
            int x_t = this.getWidth() - (int) (img.getWidth() * scale);
            int y_t = this.getHeight() - (int) (img.getHeight() * scale);
            AffineTransform affineTransform = new AffineTransform();
            affineTransform.translate(x_t, y_t);
            affineTransform.scale(scale, scale);
            g2d.drawImage(img, affineTransform, null);
        } else {
            g2d.setColor(Color.BLUE);
            g2d.drawString("Unable to load image!", 25, 25);
        }
    }
}