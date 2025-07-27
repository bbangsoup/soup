package nameanalyzer;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private JTextField nameField;       // 사용자 입력 창
    private JButton analyzeButton1;
    private JButton analyzeButton2;
    private JTextArea resultArea;       // 결과표시 입/출력 가능

    private JTextArea cho_resultArea;
    private JTextArea jung_resultArea;
    private JTextArea jong_resultArea;

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
        setSize(400, 200);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        nameField = new JTextField(10);

        analyzeButton1 = new JButton("풀이하기");
        analyzeButton2 = new JButton("해석하기");

        resultArea = new JTextArea(5, 20);

        cho_resultArea = new JTextArea(2,2);
        jung_resultArea = new JTextArea(2,2);
        jong_resultArea = new JTextArea(2,2);

        resultArea.setEditable(false);


    }

    /*
     << layoutComponents() 매서드 해석 >>
     panel 이라는 큰 도화지 위해 panel.add()로 하나씩 쌓아 간다
     마지막에 add(panel); 의미는 JFrame (여기서는 MainFrame이 상속받았다) 이라는 창 위에 올려놓기.
    */
    private void layoutComponents() {
        JPanel panel = new JPanel();        // panel 이라는 큰 도화지 생성
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JLabel("이름을 입력하세요 (3글자):"));  // JLabel 나타냄

        nameField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 28));
        panel.add(nameField);                       // nameField 나타냄

        JPanel buttonPanel = new JPanel();      // buttonPanel 이라는 도화지 생성
            buttonPanel.setLayout((new FlowLayout(FlowLayout.LEFT)));
            buttonPanel.add(analyzeButton1);
            buttonPanel.add(analyzeButton2);
        panel.add(buttonPanel);                     // buttonPanel 나타냄

        panel.add(new JScrollPane(resultArea));     // resultArea 나타냄

        JPanel resultPanel = new JPanel();      // resultPanel 이라는 도화지 생성
            resultPanel.setLayout((new FlowLayout(FlowLayout.LEFT)));
            resultPanel.setBackground(new Color(101, 101, 101));
            resultPanel.add(cho_resultArea);
            resultPanel.add(jung_resultArea);
            resultPanel.add(jong_resultArea);
        panel.add(new JScrollPane(resultPanel));    // resultPanel 나타냄

        add(panel);


    }

    private void registerListeners() {
        analyzeButton1.addActionListener(e -> analyzeName());
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

        char[] nameArray = name.toCharArray();
        cho_resultArea.setText(String.valueOf(nameArray[0]));
        jung_resultArea.setText(String.valueOf(nameArray[1]));
        jong_resultArea.setText(String.valueOf(nameArray[2]));

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainFrame::new);
    }
}
