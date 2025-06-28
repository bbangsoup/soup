package HY_Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class NameAnalyzerApp {
    private static final Map<Character, Integer> strokeMap = new HashMap<>();

    public static void main(String[] args) {
        // 1. 획수 데이터 로딩
        loadStrokeData("src/NameAnalzerApp/strokes.txt");

        // 2. GUI 설정
        JFrame frame = new JFrame("이름 풀이 프로그램");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel label = new JLabel("이름을 입력하세요:");
        JTextField nameField = new JTextField(20);
        JButton analyzeButton = new JButton("풀이하기");
        JTextArea resultArea = new JTextArea(5, 30);
        resultArea.setEditable(false);



        analyzeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText().trim();
                if (name.isEmpty()) {
                    resultArea.setText("이름을 입력해주세요.");
                    return;
                }

                StringBuilder result = new StringBuilder();
                for (char ch : name.toCharArray()) {
                    int stroke = strokeMap.getOrDefault(ch, -1);
                    if (stroke == -1) {
                        result.append(ch).append(" : 알 수 없는 글자\n");
                    } else {
                        result.append(ch).append(" : ").append(stroke).append("획\n");
                    }
                }
                resultArea.setText(result.toString());
            }
        });

        panel.add(label);
        panel.add(nameField);
        panel.add(analyzeButton);
        panel.add(new JScrollPane(resultArea));

        frame.getContentPane().add(panel);
        frame.setVisible(true);


    }
    // main 끝 ==========================================================================================

    private static void loadStrokeData(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath)))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                String[] parts = line.split("=");
                if (parts.length != 2) continue;

                int stroke = Integer.parseInt(parts[0].trim());
                String[] chars = parts[1].split(",");
                for (String s : chars) {
                    if (!s.isEmpty()) {
                        strokeMap.put(s.charAt(0), stroke);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("획수 파일 읽기 실패: " + e.getMessage());
        }
    }
}
