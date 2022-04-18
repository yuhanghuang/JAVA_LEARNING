package com.hyh.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGuiC implements ActionListener {
    JFrame frame;

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
    }

    public static void main(String[] args) {
        SimpleGuiC simpleGuiC = new SimpleGuiC();
        simpleGuiC.go();
    }
    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jButton = new JButton("change colors");
        jButton.addActionListener(this::actionPerformed);

        MyDrawPanel myDrawPanel = new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.SOUTH,jButton);
        frame.getContentPane().add(BorderLayout.CENTER,myDrawPanel);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
