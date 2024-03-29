package gui;


import javax.swing.*;
import java.awt.*;


/**
 * Created by IntelliJ IDEA.
 * User: guest
 * Date: 14-jun-2005
 * Time: 20:14:33
 * To change this template use File | Settings | File Templates.
 */
public class SnakeApp{
    public SnakeApp(int nivel,int lab){
        JFrame frame = new JFrame("Snake v.0.2");
        StatusBar stbar = new StatusBar();
        SnakePanel snakep = new SnakePanel(stbar,frame,nivel,lab);
        SMenuBar menuBar = new SMenuBar(snakep);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(stbar,BorderLayout.PAGE_END);
        frame.getContentPane().add(snakep,BorderLayout.CENTER);
        frame.getContentPane().add(menuBar,BorderLayout.PAGE_START);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
