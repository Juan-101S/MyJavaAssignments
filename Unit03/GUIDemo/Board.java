import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Board extends JPanel {
    private final int B_WIDTH = 400;
    private final int B_HEIGHT = 250;

    private final double INIT_BALANCE = 1000.00;
    private final double INIT_APR = 5.0;

    JButton button;
    JLabel labelInterest;
    JTextField textRate;
    JTextArea textArea;
    JScrollPane scrollPane;

    double balance;

    // constructor.
    public Board() {
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JPanel inputPanel = new JPanel();
        labelInterest = new JLabel("Interest Rate (%):");
        inputPanel.add(labelInterest);
        textRate = new JTextField(10);
        textRate.setText(String.valueOf(INIT_APR));
        inputPanel.add(textRate);
        button = new JButton("Add Interest");
        button.addActionListener(new ClickMeListener());
        inputPanel.add(button);
        add(inputPanel);

        textArea = new JTextArea(10, 30);
        textArea.setEditable(false);
        scrollPane = new JScrollPane(textArea);
        add(scrollPane);
        balance = INIT_BALANCE;
        appendBalanceText();
    }

    private void appendBalanceText() {
        String text = String.format("Balance ($): %.2f\n", balance);
        textArea.append(text);
    }

    // this inner class is used to listen for mouse clicks.
    class ClickMeListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Clicked!");
            try {
                double rate = Double.parseDouble(textRate.getText());
                rate = rate / 100.0;
                balance += (rate * balance);
                appendBalanceText();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(Board.this, "Please enter a valid number for the interest rate.",
                        "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}