package nameanalyzer;

import javax.swing.*;

// 사용자 UI : 이름 받고 결과 보여주기
public class MainFrame extends JFrame {

    private JTextField nameField;
    private JTextArea resultArea;

    public MainFrame() {
        setTitle("이름 풀이 프로그램");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel label = new JLabel("이름을 입력하세요 (3글자):");
        nameField = new JTextField(20);
        JButton analyzeButton = new JButton("풀이하기");
        resultArea = new JTextArea(5, 30);
        resultArea.setEditable(false);

        panel.add(label);
        panel.add(nameField);
        panel.add(analyzeButton);
        panel.add(new JScrollPane(resultArea));

        analyzeButton.addActionListener(e -> analyzeName());

        add(panel);
        setVisible(true);
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
