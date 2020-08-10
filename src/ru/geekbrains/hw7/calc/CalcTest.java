package ru.geekbrains.hw7.calc;

import javax.swing.*;
import java.awt.*;

public class CalcTest extends JFrame {
    public CalcTest() {

        setBounds(400, 300, 500, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("CalcTest");
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());

        Font font = new Font("Arial", Font.ITALIC, 14);
        Font fontTextField = new Font("Arial", Font.BOLD, 20);

        JPanel panel = new JPanel(new GridLayout(4,4));
        add(panel, BorderLayout.CENTER);


        JButton buttonSum = new JButton("+");
        buttonSum.setFont(font);
        panel.add(buttonSum);


        JButton buttonDecrease = new JButton("-");
        buttonDecrease.setFont(font);
        panel.add(buttonDecrease);

        JButton buttonMultiplication = new JButton("*");
        buttonMultiplication.setFont(font);
        panel.add(buttonMultiplication);

        JButton buttonDivision = new JButton("/");
        buttonDivision.setFont(font);
        panel.add(buttonDivision);

        JButton buttonResult = new JButton("=");
        buttonResult.setFont(font);
        panel.add(buttonResult);

        JButton buttonReset = new JButton("Reset");
        buttonReset.setFont(font);
        panel.add(buttonReset);


        JButton button9 = new JButton(String.valueOf(9));
        button9.setFont(font);
        panel.add(button9);

        JButton button8 = new JButton("8");
        button8.setFont(font);
        panel.add(button8);

        JButton button7 = new JButton("7");
        button7.setFont(font);
        panel.add(button7);

        JButton button6 = new JButton("6");
        button6.setFont(font);
        panel.add(button6);

        JButton button5 = new JButton("5");
        button5.setFont(font);
        panel.add(button5);

        JButton button4 = new JButton("4");
        button4.setFont(font);
        panel.add(button4);

        JButton button3 = new JButton("3");
        button3.setFont(font);
        panel.add(button3);

        JButton button2 = new JButton("2");
        button2.setFont(font);
        panel.add(button2);

        JButton button1 = new JButton("1");
        button1.setFont(font);
        panel.add(button1);

        JButton button0 = new JButton("0");
        button0.setFont(font);
        panel.add(button0);

        JTextArea inputWindow = new JTextArea();
        inputWindow.setFont(fontTextField);
        inputWindow.setSize(500, 200);
        add(inputWindow, BorderLayout.NORTH);

        buttonSum.addActionListener(e -> {
            inputWindow.append("");
        });

        button0.addActionListener(e -> {
            inputWindow.append("0");
        });

        button1.addActionListener(e -> {
            inputWindow.append("1");
        });

        button2.addActionListener(e -> {
            inputWindow.append("2");
        });

        button3.addActionListener(e -> {
            inputWindow.append("3");
        });

        button4.addActionListener(e -> {
            inputWindow.append("4");
        });

        button5.addActionListener(e -> {
            inputWindow.append("5");
        });

        button6.addActionListener(e -> {
            inputWindow.append("6");
        });

        button7.addActionListener(e -> {
            inputWindow.append("7");
        });

        button8.addActionListener(e -> {
            inputWindow.append("8");
        });

        button9.addActionListener(e -> {
            inputWindow.append("9");
        });

        buttonSum.addActionListener(e -> {
            inputWindow.append("+");
        });

        buttonDecrease.addActionListener(e -> {
            inputWindow.append("-");
        });

        buttonMultiplication.addActionListener(e -> {
            inputWindow.append("*");
        });

        buttonDivision.addActionListener(e -> {
            inputWindow.append("/");
        });

        buttonReset.addActionListener(e -> {
            inputWindow.append("");
        });




    }

}
