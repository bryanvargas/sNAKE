package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: guest
 * Date: 06-jun-2005
 * Time: 17:22:58
 * To change this template use File | Settings | File Templates.
 */
public class SnStart extends JDialog {
    ImageIcon snakeIcon;
    JPanel panel;
    JProgressBar progressBar;

    public SnStart() {
        initGui();
        getContentPane().add(panel);
        setUndecorated(true);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        new Thread() {
            public void run() {
                try {
                    int i = 1;
                    while(i < 100){//la carga mas mentirosa
                        progressBar.setValue(i);
                        Thread.sleep(20);
                        i++;
                    }
                    new SnakeMenu();
                    dispose();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();


    }

    private void initGui() {
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        progressBar = new JProgressBar();
        progressBar.setBackground(Color.WHITE);
        progressBar.setForeground(Color.BLACK);
        progressBar.setStringPainted(true);
        snakeIcon = new ImageIcon(getClass().getResource("images/loader.jpg"));
        JLabel a = new JLabel(snakeIcon);
        panel.add(a, BorderLayout.CENTER);
        panel.add(progressBar, BorderLayout.PAGE_END);
    }
}

