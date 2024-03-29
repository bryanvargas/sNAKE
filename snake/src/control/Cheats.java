package control;

import gui.SnakePanel;

import javax.swing.*;

import model.Snake;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * Created by IntelliJ IDEA.
 * User: guest
 * Date: 05-jul-2005
 * Time: 17:50:14
 * To change this template use File | Settings | File Templates.
 */
public class Cheats {
    SnakePanel snakePanel;
    //String[] imagesPaths;

    public Cheats(SnakePanel sp) {
        this.snakePanel = sp;
        //imagesPaths = new String[]{"images/upRed.png", "images/downRed.png", "images/leftRed.png", "images/rightRed.png"};
    }

    public void cheat(String cheat) {
        if (cheat.compareToIgnoreCase("getsmall") == 0) {
            snakePanel.snake = new Snake(snakePanel.x, snakePanel.y, snakePanel.direction);
        } else if (cheat.compareToIgnoreCase("mela") == 0) {
            showCheats();
        } else if (cheat.compareToIgnoreCase("invincible") == 0) {
            snakePanel.invincible = !snakePanel.invincible;
        } else if (cheat.compareToIgnoreCase("gofaster") == 0) {
            if (snakePanel.velocity > 15)
                snakePanel.velocity -= 5;
        } else if (cheat.compareToIgnoreCase("goslower") == 0) {
            snakePanel.velocity += 5;
        } else if (cheat.compareToIgnoreCase("superfast") == 0) {
            snakePanel.velocity = 20;
        } else if (cheat.compareToIgnoreCase("gonormal") == 0) {
            snakePanel.velocity = 100;
        } else if (cheat.compareToIgnoreCase("sofi") == 0) {
            snakePanel.screen.setIcon(new ImageIcon(getClass().getResource("../gui/images/sofi.jpg")));
            snakePanel.screen.setVisible(true);
        } else if (cheat.compareToIgnoreCase("redsnake") == 0) {
            snakePanel.changeSnakeSkin();
        }

    }


    private void showCheats() {
        snakePanel.pause = true;
        JDialog cheats = new JDialog(snakePanel.frame);
        cheats.setTitle("Cheats");
        String trucos =
                "invincible: te hace inmortal/ o mortal si estas inmortal\n" + "gofaster: vas 5 milisegundos mas rápido\n" +
                "goslower: vas 5 milisegundos mas lento\n" + "superfast: vas superrápido\n" +
                "gonormal: velocidad normal\n" + "sofi: fondo de pantalla de sofia zamolo (solo para mayores de 18 años)\n" + "redsnake: vibora roja/ o verde si esta roja";
        JTextArea area = new JTextArea(trucos);
        area.setBackground(Color.BLACK);
        area.setForeground(Color.WHITE);
        area.setEditable(false);

        cheats.getContentPane().add(area);
        cheats.pack();
        cheats.setLocationRelativeTo(null);
        cheats.setVisible(true);
        cheats.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                snakePanel.pause = false;
            }
        });
    }
}
