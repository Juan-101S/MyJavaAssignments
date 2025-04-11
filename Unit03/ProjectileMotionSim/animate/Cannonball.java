package animate;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Cannonball {
    public enum STATE {
        IDLE, FLYING, EXPLODING
    }

    private STATE state = STATE.IDLE;
    private double x = 0, y = 0;
    private double vx = 0, vy = 0;
    private double ax = 0, ay = 0;
    private double ground = 0;
    private double timescale = 1.0;
    private BufferedImage flameimg;
    private SoundClip boom;

    public Cannonball(double ax, double ay, double ground) {
        this.ax = ax;
        this.ay = ay;
        this.ground = ground;
        try {
            File imageFile = new File("media/flame01.png");
            flameimg = ImageIO.read(imageFile);
            System.out.println("Flame image loaded successfully.");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        boom = new SoundClip("media/boom.wav");
        boom.open();
    }

    private BufferedImage loadImage(String path) {
        return null;
    }

    public void draw(Graphics2D g2d) {
        if (state == STATE.FLYING) {
            g2d.setColor(Color.RED);
            g2d.fillOval((int) x, (int) y, 10, 10);
        } else if (state == STATE.EXPLODING) {
            g2d.drawImage(flameimg, null, (int) x - flameimg.getWidth() / 2, (int) y - flameimg.getHeight() / 2);
        }
    }

    public void updateBall() {
        if (state == STATE.FLYING) {
            vx = vx + ax / timescale;
            x = x + vx / timescale;
            vy = vy + ay / timescale;
            y = y + vy / timescale;

            if (y > ground) {
                state = STATE.EXPLODING;
                boom.play();
            }
        }
    }

    public void launch(double x, double y, double vx, double vy) {
        if (state != STATE.FLYING) {
            this.x = x;
            this.y = y;
            this.vx = vx;
            this.vy = vy;
            this.state = STATE.FLYING;
        }
    }

    public STATE getState() {
        return state;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getVX() {
        return vx;
    }

    public double getVY() {
        return vy;
    }

    public double getAX() {
        return ax;
    }

    public double getAY() {
        return ay;
    }

    public double getTimeScale() {
        return timescale;
    }

    public double getGround() {
        return ground;
    }

    public void setState(STATE newState, STATE state) {
        this.state = state;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setVX(double vx) {
        this.vx = vx;
    }

    public void setVY(double vy) {
        this.vy = vy;
    }

    public void setAX(double ax) {
        this.ax = ax;
    }

    public void setAY(double ay) {
        this.ay = ay;
    }

    public void setTimeScale(double timescale) {
        this.timescale = timescale;
    }

    public void setGround(double ground) {
        this.ground = ground;
    }

    public void changeTimeScale(double delta) {
        timescale = timescale + delta;
        if (timescale > 10) {
            timescale = 10;
        } else if (timescale < 1) {
            timescale = 1;
        }
        System.out.println("Timescale changed to: " + timescale);
    }
}