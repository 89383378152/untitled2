
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class CodeCounter extends JFrame implements ActionListener {
    private JLabel label;
    private JButton button;
    private int count;

    public CodeCounter() {
        super("Счётчик кода");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        label = new JLabel("Количество строк кода: 0");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        add(label, BorderLayout.CENTER);

        button = new JButton("Посчитать строки кода");
        button.addActionListener(this);
        add(button, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Количество строк кода: " + count);
    }

    public static void main(String[] args) {
        new CodeCounter();
    }
}



