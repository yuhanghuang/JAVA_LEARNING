package com.hyh.Serialization;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.io.*;

public class QuizCardPlayer {
    private JTextArea display;
    private JTextArea answer;
    private ArrayList<QuizCard> cardList;
    private int currentCardAIndex;
    private QuizCard currentCard;
    private JFrame frame;
    private JButton nextButton;
    private boolean isShowAnswer;

    public static void main(String[] args) {
        QuizCardPlayer reader = new QuizCardPlayer();
        reader.go();
    }

    public void go() {
        frame = new JFrame("Quiz Card Player");
        JPanel mainPanel = new JPanel();
        Font bigFont = new Font("sanserif",Font.BOLD,24);

        display = new JTextArea(10,20);
        display.setFont(bigFont);

        display.setLineWrap(true);
        display.setEditable(false);

        JScrollPane qScroller = new JScrollPane(display);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        nextButton = new JButton("Show question");
        mainPanel.add(qScroller);
        mainPanel.add(nextButton);
        nextButton.addActionListener(new NextCardListener());

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem loadMenuItem = new JMenuItem("Load card set");
        loadMenuItem.addActionListener(new OpenMenuListener());
        fileMenu.add(loadMenuItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(BorderLayout.CENTER,mainPanel);
        frame.setSize(640,500);
        frame.setVisible(true);

    }
    public class NextCardListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (isShowAnswer) {
                display.setText(currentCard.getAnswer());
                nextButton.setText("Next Card");
                isShowAnswer = false;
            }else {
                if (currentCardAIndex < cardList.size()){
                    showNextCard();
                } else {
                    display.setText("That was last card");
                    nextButton.setEnabled(false);
                }
            }
        }
    }

    public class OpenMenuListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileOpen = new JFileChooser();
            fileOpen.showOpenDialog(frame);
            loadFile(fileOpen.getSelectedFile());
        }
    }

    private void loadFile(File file) {
        cardList = new ArrayList<QuizCard>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine())!=null){
                makeCard(line);
            }
        }catch (Exception ex) {
            System.out.println("could't read the card file");
            ex.printStackTrace();
        }
    }

    private void makeCard(String LineToParse) {
        String[] result = LineToParse.split("/");
        QuizCard card = new QuizCard(result[0],result[1]);
        cardList.add(card);
        System.out.println("made a card");
    }

    private void showNextCard() {
        currentCard = cardList.get(currentCardAIndex);
        currentCardAIndex++;
        display.setText(currentCard.getQuestion());
        nextButton.setText("Show answer");
        isShowAnswer = true;
    }
}
