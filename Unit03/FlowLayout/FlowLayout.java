import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.EventQueue;
import java.awt.GridLayout;

public class FlowLayout {
    JFrame frame;
    JPanel panel;

    public FlowLayout(int width, int height) {
        frame = new JFrame();
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel(new GridLayout(0, 3));
        for (int i = 0; i < 8; i++) {
            String label = String.format("Button %d", i + 1);
            JButton btn = new JButton(label);
            panel.add(btn);
        }
        frame.add(panel);
        panel.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            FlowLayout flow = new FlowLayout(400, 200);
        });
    }
}