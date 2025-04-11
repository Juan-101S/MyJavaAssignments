package animate;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.util.Arrays;

public class Cannon {
    private int x;
    private int y;
    private double angle;
    private SoundClip wheel;
    private SoundClip cannon;
    private BufferedImage cannonimg;
    private int BASE_WIDTH = 60;
    private int BASE_HEIGHT = 80;
    private final int MAX_ANGLE = -90;
    private final int MIN_ANGLE = 0;
    private static int MUZZLE_VELOCITY = 30;
    private static int HYPOT = 100;

    public Cannon() {
        x = 60;
        y = 740;
        angle = Math.toRadians(45);
        wheel = new SoundClip("media/wheel.wav");
        wheel.open();
        cannon = new SoundClip("media/cannon.wav");
        cannon.open();

        try {
            File imageFile = new File("media/sm_cannon.png");
            cannonimg = ImageIO.read(imageFile);
            System.out.println("Cannon image loaded successfully.");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public void rotateClockwise() {
        if (angle < MIN_ANGLE) {
            angle += 1;
            wheel.play();
        }
    }

    public void rotateCounterClockwise() {
        if (angle > MAX_ANGLE) {
            angle -= 1;
            wheel.play();
        }
    }

    public void fire() {
        cannon.play();
    }

    public void fire(Cannonball cannonball) {
        double xo = HYPOT * Math.cos(Math.toRadians(Math.abs(angle)));
        double yo = HYPOT * Math.sin(Math.toRadians(Math.abs(angle)));
        double vx = MUZZLE_VELOCITY * Math.cos(Math.toRadians(Math.abs(angle)));
        double vy = -MUZZLE_VELOCITY * Math.sin(Math.toRadians(Math.abs(angle)));
        cannonball.launch(x + xo, y - yo, vx, vy);
        this.fire();
    }

    public void draw(Graphics2D g2d) {
        double xpivot = 15;
        double ypivot = cannonimg.getHeight() / 2.0;
        AffineTransform af = new AffineTransform();
        af.translate(x - xpivot, y - ypivot);
        af.rotate(Math.toRadians(angle), xpivot, ypivot);
        g2d.drawImage(cannonimg, af, null);
        g2d.setColor(Color.PINK);
        int[] xcoordinates = { x, x - (int) (BASE_WIDTH / 2.0), x + (int) (BASE_WIDTH
                / 2.0) };
        int[] ycoordinates = { y, y + (int) (BASE_HEIGHT / 2.0), y + (int) (BASE_HEIGHT / 2.0) };
        g2d.fillPolygon(xcoordinates, ycoordinates, 3);
        System.out.println(Arrays.toString(xcoordinates));
        System.out.println(Arrays.toString(ycoordinates));
        g2d.setColor(Color.BLACK);
        int[] xxcoordinates = { x, x - (int) (BASE_WIDTH / 2.0), x + (int) (BASE_WIDTH / 2.0) };
        int[] yycoordinates = { y, y + (int) (BASE_HEIGHT / 2.0), y + (int) (BASE_HEIGHT / 2.0) };
        g2d.drawPolygon(xxcoordinates, yycoordinates, 3);
        System.out.println(Arrays.toString(xxcoordinates));
        System.out.println(Arrays.toString(yycoordinates));
        g2d.setColor(Color.BLUE);
        g2d.fillOval((int) (x - 5), (int) (y - 5), 10, 10);
    }
}
