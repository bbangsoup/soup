package nameanalyzer;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private JTextField nameField;
    private JTextArea resultArea;


    public MainFrame() {
        setFrameProperties();
        initComponents();
        layoutComponents();
        registerListeners();

        setVisible(true);
    }

    private void setFrameProperties() {
        setTitle("이름 풀이 프로그램");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        nameField = new JTextField(20);
        JButton analyzeButton1 = new JButton("풀이하기");
        JButton analyzeButton2 = new JButton("해석하기");
        resultArea = new JTextArea(5, 30);
        resultArea.setEditable(false);
    }

    private void layoutComponents() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JLabel("이름을 입력하세요 (3글자):"));
        panel.add(nameField);
//        panel.add(analyzeButton1);
//        panel.add(analyzeButton2);

        panel.add(new JScrollPane(resultArea));

        add(panel);
    }

    private void registerListeners() {
       // analyzeButton.addActionListener(e -> analyzeName());
    }

    private void analyzeName() {
        String name = nameField.getText().trim();
        if (name.length() != 3) {
            resultArea.setText("3글자의 한글 이름을 입력해주세요.");
            return;
        }

        StringBuilder result = new StringBuilder();
        for (char ch : name.toCharArray()) {
            int stroke = NameAnalyzer.getTotalStroke(ch);
            result.append(ch).append(" : ").append(stroke).append("획\n");
        }

        resultArea.setText(result.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainFrame::new);
    }
}
