package PartB.animatePartB;

import javax.swing.JFrame;

import PartA.animatePartA.Application.OS;

public class Application extends JFrame {
    private final int FRAME_WIDTH = 640;
    private final int FRAME_HEIGHT = 480;

    public Application(String title) {
        int border_width = 0;
        int bar_height = 0;
        OS os = checkOS();
        switch (os) {
            case WIN:
                border_width = 7;
                bar_height = 30;
                break;
            case MAC:
                border_width = 0;
                bar_height = 28;
                break;
            case LINUX:
                break;
            case OTHER:
                break;
        }

        Board board = new Board();
        this.add(board);
        int application_width = (int) board.getPreferredSize().getWidth() + 2 * border_width;
        int application_height = (int) board.getPreferredSize().getHeight() + bar_height + border_width;
        this.setTitle(title);
        this.setSize(application_width, application_height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    public static enum OS {
        WIN, MAC, LINUX, OTHER
    }

    public static OS checkOS() {
        OS val;
        String name = System.getProperty("os.name").toLowerCase();
        if (name.indexOf("win") >= 0) {
            val = OS.WIN;
        } else if (name.indexOf("mac") >= 0) {
            val = OS.MAC;
        } else if (name.indexOf("nux") >= 0) {
            val = OS.LINUX;
        } else {
            val = OS.OTHER;
        }
        return val;
    }
}
