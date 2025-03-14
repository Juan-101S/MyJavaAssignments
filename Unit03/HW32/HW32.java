import java.awt.EventQueue;

import animate.*;

public class HW32 {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Application app = new Application("Test");
            app.setVisible(true);
        });
    }
}