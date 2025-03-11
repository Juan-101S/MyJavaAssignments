import animate.Application;
import java.awt.EventQueue;

public class PartB {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Application myApp = new Application("Title");
            myApp.setVisible(true);
        });
    }
}