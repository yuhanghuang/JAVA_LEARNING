package com.hyh.Serialization;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.*;

public class QuizCardBuilder {
    private JTextArea question;
    private JTextArea answer;
    private ArrayList<QuizCard> cardlist;
    private JFrame frame;

    public static void main(String[] args) {
        QuizCardBuilder builder = new QuizCardBuilder();
        builder.go();
    }

    /**
     * 显示GUI 包括事件监听者的设计和注册
     */
    public void go() {
        frame = new JFrame("Quiz Card Builder");
        JPanel mainPanel = new JPanel();
        Font bigFont = new Font("sanserif",Font.BOLD,24);
        question = new JTextArea(6,20);
        question.setLineWrap(true);
        question.setWrapStyleWord(true);
        question.setFont(bigFont);

        JScrollPane qScroller = new JScrollPane(question);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        answer = new JTextArea(6,20);
        answer.setLineWrap(true);
        answer.setWrapStyleWord(true);
        answer.setFont(bigFont);

        JScrollPane scrollPane = new JScrollPane(answer);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        JButton nextButton = new JButton("next Card");
        cardlist = new ArrayList<QuizCard>();
        JLabel qLabel = new JLabel("Question");
        JLabel aLabel = new JLabel("Answer:");

        mainPanel.add(qLabel);
        mainPanel.add(qScroller);
        mainPanel.add(aLabel);
        mainPanel.add(scrollPane);
        mainPanel.add(nextButton);
        nextButton.addActionListener(new NextCardListener());
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        newMenuItem.addActionListener(new NewMenuListener());

        saveMenuItem.addActionListener(new SaveMenuListener());
        fileMenu.add(newMenuItem);
        fileMenu.add(saveMenuItem);
        menuBar.add(fileMenu);
//        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(BorderLayout.CENTER,mainPanel);
        frame.setSize(500,600);
        frame.setVisible(true);
    }
//    内部类

    /**
     * 内部类，按下Next Card时就会被触发，代表用户完成卡片并继续下一张新的卡片
     */
    public class NextCardListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            QuizCard card = new QuizCard(question.getText(),answer.getText());
            cardlist.add(card);
            clearCard();
        }
    }

    /**
     * 内部类 会被餐单上的Save触发，代表用户想要存储目前这一组卡片。
     */
    public class SaveMenuListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            QuizCard card = new QuizCard(question.getText(),answer.getText());
            cardlist.add(card);
//            调出存盘对话框(dialog)等待用户决定，这都是靠JFileChooser完成的
            JFileChooser fileSave = new JFileChooser();
            fileSave.showSaveDialog(frame);
            saveFile(fileSave.getSelectedFile());
        }
    }

    /**
     * 内部类 会被菜单上的NEW所触发，表示会打开新的一组卡片
     */
    public class NewMenuListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            cardlist.clear();
            clearCard();
        }
    }
    private void clearCard() {
        question.setText("");
        answer.setText("");
        question.requestFocus();
    }
//    实际编写文件的方法由SaveMenuListener的事件处理程序调用。
    private void saveFile(File file) {
        try {
//            将Buffer writger连接到FileWriter
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (QuizCard card:cardlist) {
                writer.write(card.getQuestion()+"/");
                writer.write(card.getAnswer()+"\n");
            }
            writer.close();
        }catch (IOException ex) {
            System.out.println("could't write the cardList out");
            ex.printStackTrace();
        }
    }
}
