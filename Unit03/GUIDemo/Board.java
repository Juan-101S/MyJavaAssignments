import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Board extends JPanel {
    private final int B_WIDTH = 450;
    private final int B_HEIGHT = 100;
    private final int TEXT_WIDTH = 10;

    private final double INIT_BALANCE = 1000.00;
    private final double INIT_APR = 5.0;

    JButton button;
    JLabel labelInterest;
    JTextField textRate;
    JLabel labelBalance;

    double balance;

    // constructor.
    public Board() {
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        labelInterest = new JLabel("Interest Rate (%):");
        this.add(labelInterest);

        textRate = new JTextField(TEXT_WIDTH);
        this.add(textRate);
        String text = Double.toString(INIT_APR);
        textRate.setText(text);

        button = new JButton("Add Interest");
        this.add(button);
        button.addActionListener(new ClickMeListener());

        balance = INIT_BALANCE;
        text = String.format("Balance ($): %.2f", balance);
        labelBalance = new JLabel(text);
        this.add(labelBalance);
    }

    // this inner class is used to listen for mouse clicks.
    class ClickMeListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Clicked!");

            double rate = Double.parseDouble(textRate.getText());
            rate = rate / 100.0;
            balance = balance + (rate * balance);

            String text = String.format("Balance ($): %.2f", balance);
            labelBalance.setText(text);
        }
    }
}