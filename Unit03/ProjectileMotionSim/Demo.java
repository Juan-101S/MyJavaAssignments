import animate.*;
import java.awt.EventQueue;

public class Demo {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Application myApp = new Application("Cannon");
            myApp.setVisible(true);
        });
    }
}