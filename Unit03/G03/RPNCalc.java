import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.*;
import java.awt.event.*;

public class RPNCalc {
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 200;

    private JFrame frame;
    private JPanel panel;
    private JTextField txtDisplay;
    private JPanel pnlButtons;
    private GridBagConstraints constraints;
    private Stack stack;
    private boolean clearFlag;

    private void addDisplay(JPanel panel) {
        txtDisplay = new JTextField("0");
        txtDisplay.setHorizontalAlignment(SwingConstants.LEFT);
        txtDisplay.setEditable(false);
        panel.add(txtDisplay, BorderLayout.NORTH);
    }

    private void addButtons(JPanel panel) {
        pnlButtons = new JPanel(new GridBagLayout());
        constraints = new GridBagConstraints();

        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;

        addDigitButton(0, 0, "7");
        addDigitButton(1, 0, "8");
        addDigitButton(2, 0, "9");
        addActionButton(3, 0, "/");
        addDigitButton(0, 1, "4");
        addDigitButton(1, 1, "5");
        addDigitButton(2, 1, "6");
        addActionButton(3, 1, "*");
        addDigitButton(0, 2, "1");
        addDigitButton(1, 2, "2");
        addDigitButton(2, 2, "3");
        addActionButton(3, 2, "-");
        addDigitButton(0, 3, "+/-");
        addDigitButton(1, 3, "0");
        addDigitButton(2, 3, ".");
        addActionButton(3, 3, "+");
        addActionButton(0, 4, "C");
        addActionButton(1, 4, "CE");
        constraints.gridwidth = 2;
        addActionButton(2, 4, "ENTER");
        constraints.gridwidth = 1;

        panel.add(pnlButtons, BorderLayout.CENTER);
    }

    private void addDigitButton(int gridx, int gridy, String label) {
        JButton btn = addButton(gridx, gridy, label);
        btn.addActionListener(new DigitButtonListener(label));
    }

    private void addActionButton(int gridx, int gridy, String label) {
        JButton btn = addButton(gridx, gridy, label);
        btn.addActionListener(new ActionButtonListener(label));
    }

    private JButton addButton(int gridx, int gridy, String label) {
        JButton btn = new JButton(label);
        constraints.gridx = gridx;
        constraints.gridy = gridy;
        pnlButtons.add(btn, constraints);
        return btn;
    }

    private class DigitButtonListener implements ActionListener {
        private String label;

        public DigitButtonListener(String label) {
            this.label = label;
        }

        public void actionPerformed(ActionEvent e) {
            String currentText = txtDisplay.getText();

            if (label.equals("+/-")) {
                if (!currentText.startsWith("-")) {
                    txtDisplay.setText("-" + currentText);
                } else {
                    txtDisplay.setText(currentText.substring(1));
                }
                clearFlag = false;
            } else if (label.equals(".")) {
                if (!currentText.contains(".")) {
                    txtDisplay.setText(currentText + ".");
                }
            } else {
                if (clearFlag || currentText.equals("0")) {
                    txtDisplay.setText(label);
                    clearFlag = false;
                } else {
                    txtDisplay.setText(currentText + label);
                }
            }
        }
    }

    private class ActionButtonListener implements ActionListener {
        private String label;

        public ActionButtonListener(String label) {
            this.label = label;
        }

        public void actionPerformed(ActionEvent e) {
            try {
                switch (label) {
                    case "C":
                        txtDisplay.setText("0");
                        stack.clear();
                        break;
                    case "CE":
                        txtDisplay.setText("0");
                        break;
                    case "ENTER":
                        double value = Double.parseDouble(txtDisplay.getText());
                        stack.push(value);
                        clearFlag = true;
                        break;
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                        if (stack.isEmpty())
                            return;
                        double d1 = stack.pop();
                        double d2 = Double.parseDouble(txtDisplay.getText());
                        double result = 0;
                        switch (label) {
                            case "+":
                                result = d1 + d2;
                                break;
                            case "-":
                                result = d1 - d2;
                                break;
                            case "*":
                                result = d1 * d2;
                                break;
                            case "/":
                                if (d2 == 0) {
                                    txtDisplay.setText("DIV/0 ERR");
                                    return;
                                }
                                result = d1 / d2;
                                break;
                        }
                        stack.push(result);
                        txtDisplay.setText(Double.toString(result));
                        clearFlag = true;
                        break;
                }
            } catch (Exception ex) {
                txtDisplay.setText("ERROR");
                System.err.println("Error: " + ex.getMessage());
            }
        }
    }

    public RPNCalc() {
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        stack = new Stack();
        clearFlag = false;

        panel = new JPanel(new BorderLayout());
        addDisplay(panel);
        addButtons(panel);
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new RPNCalc());
    }
}