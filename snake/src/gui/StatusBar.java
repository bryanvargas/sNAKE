package gui;

import javax.swing.*;

/**
 * User: guest
 * Date: 15-jun-2005
 * Time: 18:47:39
 */
public class StatusBar extends JMenuBar{
    JMenuItem apples,bonus;
    public StatusBar(){
        apples = new JMenuItem("Manzanitas:");
        bonus= new JMenuItem("Bonus:");
        add(apples);
        add(bonus);
    }

    public void setApples(int cant){
        apples.setText("Manzanitas: "+cant);
    }

    public void setBonus(int cant){
        bonus.setText("Bonus: "+cant);
    }

}
