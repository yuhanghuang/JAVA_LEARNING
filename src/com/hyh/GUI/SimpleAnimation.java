package com.hyh.GUI;

import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {
    private int x =70;
    private int y =70;

    public static void main(String[] args) {
        SimpleAnimation simpleAnimation = new SimpleAnimation();
        simpleAnimation.go();
    }
    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel1 myDrawPanel = new MyDrawPanel1();
        frame.getContentPane().add(myDrawPanel);
        frame.setSize(300,300);
        frame.setVisible(true);

        for (int i = 0; i < 100; i++) {
            x++;
            y++;
            myDrawPanel.repaint(); //重新绘制面板
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class MyDrawPanel1 extends JPanel{
        @Override
        protected void paintComponent(Graphics g) {
            g.setColor(Color.white);
            g.fillRect(0,0,this.getWidth(),this.getHeight());
            g.setColor(Color.red);
            g.fillOval(x,y,40,40);
        }
    }
}
