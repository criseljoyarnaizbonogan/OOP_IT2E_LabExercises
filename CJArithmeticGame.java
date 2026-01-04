import javax.swing.*;
import java.awt.*;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.util.Random;

public class CJArithmeticGame extends JFrame {
    // Original components
    private JTextField num1Field, num2Field, resultField;
    private JLabel operatorLabel, currentLevelLabel;
    private JRadioButton addBtn, subBtn, mulBtn, divBtn, modBtn;
    private JRadioButton level1Btn, level2Btn, level3Btn;
    private JButton submitBtn;
    private JLabel correctLabel, incorrectLabel;

    // For storing the original UI panels
    private JPanel titlePanel;
    private JPanel currentLevelPanel;
    private JPanel equationPanel;
    private JPanel bottomPanel;

    private int correctCount = 0;
    private int incorrectCount = 0;
    private int currentAnswer = 0;
    private Random rand = new Random();

    public CJArithmeticGame() {
        setTitle("CJ's Arithmetic Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        Color pastelBg = new Color(230, 230, 250);
        getContentPane().setBackground(pastelBg);

        setSize(800, 500);
        setLocationRelativeTo(null);

        // === TOP PANEL: Title ===
        titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        titlePanel.setOpaque(false);
        JLabel titleLabel = new JLabel("CJ's Arithmetic Game");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titlePanel.add(titleLabel);

        // === CREATIVELY STYLED CURRENT LEVEL DISPLAY ===
        currentLevelLabel = new JLabel("Current Level: Level 1 (1–100)", SwingConstants.CENTER);
        currentLevelLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        currentLevelLabel.setForeground(new Color(90, 90, 140)); // Default: Level 1 color
        currentLevelLabel.setOpaque(false);
        currentLevelLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        currentLevelPanel = new JPanel(new BorderLayout());
        currentLevelPanel.setOpaque(false);
        currentLevelPanel.add(currentLevelLabel, BorderLayout.CENTER);

        // === CENTER PANEL: Equation ===
        equationPanel = new JPanel(new GridBagLayout());
        equationPanel.setOpaque(false);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 15, 15);

        num1Field = new JTextField(5);
        num1Field.setEditable(false);
        num1Field.setHorizontalAlignment(JTextField.CENTER);
        num1Field.setFont(new Font("Arial", Font.BOLD, 20));
        num1Field.setOpaque(false);
        num1Field.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(160, 160, 200), 2),
            BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));

        operatorLabel = new JLabel("+", SwingConstants.CENTER);
        operatorLabel.setFont(new Font("Arial", Font.BOLD, 28));
        operatorLabel.setPreferredSize(new Dimension(50, 60));
        operatorLabel.setOpaque(false);

        num2Field = new JTextField(5);
        num2Field.setEditable(false);
        num2Field.setHorizontalAlignment(JTextField.CENTER);
        num2Field.setFont(new Font("Arial", Font.BOLD, 20));
        num2Field.setOpaque(false);
        num2Field.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(160, 160, 200), 2),
            BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));

        JLabel equalsLabel = new JLabel("=", SwingConstants.CENTER);
        equalsLabel.setFont(new Font("Arial", Font.BOLD, 28));
        equalsLabel.setOpaque(false);

        resultField = new JTextField(5);
        resultField.setHorizontalAlignment(JTextField.CENTER);
        resultField.setFont(new Font("Arial", Font.BOLD, 20));
        resultField.setOpaque(false);
        resultField.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(160, 160, 200), 2),
            BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));

        submitBtn = new JButton("submit na");
        submitBtn.setFont(new Font("Arial", Font.BOLD, 16));
        submitBtn.setPreferredSize(new Dimension(120, 40));
        submitBtn.setFocusPainted(false);

        gbc.gridx = 0; gbc.gridy = 0; equationPanel.add(num1Field, gbc);
        gbc.gridx = 1; equationPanel.add(operatorLabel, gbc);
        gbc.gridx = 2; equationPanel.add(num2Field, gbc);
        gbc.gridx = 3; equationPanel.add(equalsLabel, gbc);
        gbc.gridx = 4; equationPanel.add(resultField, gbc);
        gbc.gridx = 5; equationPanel.add(submitBtn, gbc);

        // === BOTTOM PANEL ===
        bottomPanel = new JPanel(new GridLayout(1, 3, 20, 0));
        bottomPanel.setOpaque(false);
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 20, 20));

        // === OPERATIONS PANEL with colored outline & highlighted title ===
        JPanel operationsPanel = new JPanel(new GridLayout(5, 1));
        operationsPanel.setOpaque(false);
        TitledBorder opBorder = BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(new Color(100, 180, 255), 2),
            "Operations"
        );
        opBorder.setTitleFont(new Font("Arial", Font.BOLD, 14));
        opBorder.setTitleColor(new Color(60, 130, 200));
        operationsPanel.setBorder(opBorder);

        addBtn = new JRadioButton("Addition");
        subBtn = new JRadioButton("Subtraction");
        mulBtn = new JRadioButton("Multiplication");
        divBtn = new JRadioButton("Division");
        modBtn = new JRadioButton("Modulo");

        for (JRadioButton btn : new JRadioButton[]{addBtn, subBtn, mulBtn, divBtn, modBtn}) {
            btn.setOpaque(false);
        }

        ButtonGroup opGroup = new ButtonGroup();
        for (JRadioButton btn : new JRadioButton[]{addBtn, subBtn, mulBtn, divBtn, modBtn}) {
            opGroup.add(btn);
            operationsPanel.add(btn);
        }

        // === LEVEL PANEL with colored outline & highlighted title ===
        JPanel levelPanel = new JPanel(new GridLayout(3, 1));
        levelPanel.setOpaque(false);
        TitledBorder levelBorder = BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(new Color(255, 180, 100), 2),
            "Level"
        );
        levelBorder.setTitleFont(new Font("Arial", Font.BOLD, 14));
        levelBorder.setTitleColor(new Color(200, 120, 50));
        levelPanel.setBorder(levelBorder);

        level1Btn = new JRadioButton("Level 1 (1-100)");
        level2Btn = new JRadioButton("Level 2 (101-500)");
        level3Btn = new JRadioButton("Level 3 (501-1000)");

        for (JRadioButton btn : new JRadioButton[]{level1Btn, level2Btn, level3Btn}) {
            btn.setOpaque(false);
        }

        ButtonGroup levelGroup = new ButtonGroup();
        for (JRadioButton btn : new JRadioButton[]{level1Btn, level2Btn, level3Btn}) {
            levelGroup.add(btn);
            levelPanel.add(btn);
        }

        // === SCORE PANEL with colored outline & highlighted title ===
        JPanel scorePanel = new JPanel(new GridLayout(3, 1));
        scorePanel.setOpaque(false);
        TitledBorder scoreBorder = BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(new Color(180, 220, 130), 2),
            "Score"
        );
        scoreBorder.setTitleFont(new Font("Arial", Font.BOLD, 14));
        scoreBorder.setTitleColor(new Color(100, 160, 80));
        scorePanel.setBorder(scoreBorder);

        JPanel scoreDisplay = new JPanel(new GridLayout(1, 2, 10, 0));
        scoreDisplay.setOpaque(false);
        correctLabel = new JLabel("Correct: 0", SwingConstants.CENTER);
        incorrectLabel = new JLabel("Incorrect: 0", SwingConstants.CENTER);
        correctLabel.setOpaque(false);
        incorrectLabel.setOpaque(false);
        scoreDisplay.add(correctLabel);
        scoreDisplay.add(incorrectLabel);
        scorePanel.add(scoreDisplay);

        bottomPanel.add(operationsPanel);
        bottomPanel.add(levelPanel);
        bottomPanel.add(scorePanel);

        // Add all panels to frame
        add(titlePanel, BorderLayout.NORTH);
        add(currentLevelPanel, BorderLayout.PAGE_START);
        add(equationPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        addBtn.setSelected(true);
        level1Btn.setSelected(true);
        updateLevelDisplay();
        generateProblem();

        submitBtn.addActionListener(e -> handleSubmission());

        ActionListener opChangeListener = e -> generateProblem();
        ActionListener levelChangeListener = e -> {
            generateProblem();
            updateLevelDisplay();
        };

        addBtn.addActionListener(opChangeListener);
        subBtn.addActionListener(opChangeListener);
        mulBtn.addActionListener(opChangeListener);
        divBtn.addActionListener(opChangeListener);
        modBtn.addActionListener(opChangeListener);

        level1Btn.addActionListener(levelChangeListener);
        level2Btn.addActionListener(levelChangeListener);
        level3Btn.addActionListener(levelChangeListener);
    }

    private void updateLevelDisplay() {
        String text;
        Color color;
        if (level1Btn.isSelected()) {
            text = "Current Level: Level 1 (1–100)";
            color = new Color(90, 90, 140); // Lavender-blue
        } else if (level2Btn.isSelected()) {
            text = "Current Level: Level 2 (101–500)";
            color = new Color(100, 130, 80); // Soft forest green
        } else if (level3Btn.isSelected()) {
            text = "Current Level: Level 3 (501–1000)";
            color = new Color(160, 90, 90); // Warm coral
        } else {
            text = "Current Level: Level 1 (1–100)";
            color = new Color(90, 90, 140);
        }
        currentLevelLabel.setText(text);
        currentLevelLabel.setForeground(color);
    }

    private void generateProblem() {
        int min = 1, max = 100;
        if (level2Btn.isSelected()) {
            min = 101;
            max = 500;
        } else if (level3Btn.isSelected()) {
            min = 501;
            max = 1000;
        }

        int num1, num2;

        if (addBtn.isSelected()) {
            num1 = rand.nextInt(max - min + 1) + min;
            num2 = rand.nextInt(max - min + 1) + min;
            currentAnswer = num1 + num2;
            operatorLabel.setText("+");
        } else if (subBtn.isSelected()) {
            num1 = rand.nextInt(max - min + 1) + min;
            num2 = rand.nextInt(max - min + 1) + min;
            if (num1 < num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            currentAnswer = num1 - num2;
            operatorLabel.setText("-");
        } else if (mulBtn.isSelected()) {
            num1 = rand.nextInt(max - min + 1) + min;
            num2 = rand.nextInt(max - min + 1) + min;
            currentAnswer = num1 * num2;
            operatorLabel.setText("×");
        } else if (divBtn.isSelected()) {
            int divisorMax = Math.min(50, max);
            num2 = rand.nextInt(divisorMax) + 1;
            int maxQuotient = max / num2;
            if (maxQuotient < 1) maxQuotient = 1;
            int quotient = rand.nextInt(maxQuotient) + 1;
            num1 = num2 * quotient;
            if (num1 < min) {
                int minQuotient = (min + num2 - 1) / num2;
                if (minQuotient <= maxQuotient) {
                    quotient = minQuotient;
                    num1 = num2 * quotient;
                }
            }
            currentAnswer = quotient;
            operatorLabel.setText("÷");
        } else if (modBtn.isSelected()) {
            int num2Upper = Math.min(100, max / 2);
            if (num2Upper < 2) num2Upper = 2;
            num2 = rand.nextInt(num2Upper - 1) + 2;
            int effectiveMin = Math.max(min, num2);
            if (effectiveMin > max) {
                num2 = 2;
                effectiveMin = Math.max(min, 2);
            }
            num1 = rand.nextInt(max - effectiveMin + 1) + effectiveMin;
            currentAnswer = num1 % num2;
            operatorLabel.setText("%");
        } else {
            num1 = num2 = 1;
            currentAnswer = 2;
            operatorLabel.setText("+");
        }

        num1Field.setText(String.valueOf(num1));
        num2Field.setText(String.valueOf(num2));
        resultField.setText("");
        resultField.requestFocus();
    }

    private void handleSubmission() {
        try {
            int userAnswer = Integer.parseInt(resultField.getText().trim());
            if (userAnswer == currentAnswer) {
                correctCount++;
                showTumpakScreen();
            } else {
                incorrectCount++;
                showOopsScreen();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                "Please enter a valid integer.",
                "Invalid Input", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void showTumpakScreen() {
        getContentPane().removeAll();
        getContentPane().setBackground(new Color(230, 230, 250));

        JLabel label = new JLabel("TUMPAK KA!", SwingConstants.CENTER);
        label.setFont(new Font("Comic Sans MS", Font.BOLD, 72));
        label.setForeground(new Color(70, 130, 180));
        add(label, BorderLayout.CENTER);
        revalidate();
        repaint();

        Timer timer = new Timer(1500, e -> restoreGameScreen());
        timer.setRepeats(false);
        timer.start();
    }

    private void showOopsScreen() {
        getContentPane().removeAll();
        getContentPane().setBackground(new Color(255, 230, 230));

        JLabel label = new JLabel("OPS! E TAMA MO NAMAN", SwingConstants.CENTER);
        label.setFont(new Font("Comic Sans MS", Font.BOLD, 56));
        label.setForeground(new Color(180, 60, 60));
        add(label, BorderLayout.CENTER);
        revalidate();
        repaint();

        Timer timer = new Timer(2000, e -> restoreGameScreenWithAnswer());
        timer.setRepeats(false);
        timer.start();
    }

    private void restoreGameScreen() {
        restoreGameUI();
        generateProblem();
        updateScore();
    }

    private void restoreGameScreenWithAnswer() {
        restoreGameUI();
        resultField.setText(String.valueOf(currentAnswer));
        resultField.selectAll();
        resultField.requestFocus();
        updateScore();
        Timer next = new Timer(1000, e -> generateProblem());
        next.setRepeats(false);
        next.start();
    }

    private void restoreGameUI() {
        getContentPane().removeAll();
        getContentPane().setBackground(new Color(230, 230, 250));
        add(titlePanel, BorderLayout.NORTH);
        add(currentLevelPanel, BorderLayout.PAGE_START);
        add(equationPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
        revalidate();
        repaint();
    }

    private void updateScore() {
        correctLabel.setText("Correct: " + correctCount);
        incorrectLabel.setText("Incorrect: " + incorrectCount);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CJArithmeticGame().setVisible(true);
        });
    }
}