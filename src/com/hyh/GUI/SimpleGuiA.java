package com.hyh.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGuiA implements ActionListener {
    JButton button;


    public static void main(String[] args) {
        SimpleGuiA guiA = new SimpleGuiA();
        guiA.go();
    }
    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setText("I've been clicked!");
            }
        });
//        button.addActionListener(this::actionPerformed);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    //    @Override
//    public void actionPerformed(ActionEvent e) {
//        button.setText("I've been clicked hhhhh!");
//    }
}
