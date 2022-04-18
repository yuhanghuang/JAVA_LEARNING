package com.hyh.GUI;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
        Graphics2D graphics2D = (Graphics2D) g;
        int red = (int) (Math.random()*255);
        int green = (int) (Math.random()*255);
        int blue = (int) (Math.random()*255);
        Color startcolor = new Color(red,green,blue);

        red = (int) (Math.random()*255);
        green = (int) (Math.random()*255);
        blue = (int) (Math.random()*255);
        Color endcolor = new Color(red,green,blue);

        GradientPaint gradientPaint = new GradientPaint(70,70,startcolor,150,150,endcolor);
        graphics2D.setPaint(gradientPaint);
        graphics2D.fillOval(70,70,100,100);
    }
}
