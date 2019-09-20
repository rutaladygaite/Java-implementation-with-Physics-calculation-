package Actions;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Darbas.SkaicBud1;


public class Reagavimas1 {
    
    public Reagavimas1(JButton Reagavimas111) {
    	Reagavimas111 actionLstener = new Reagavimas111();
        Reagavimas111.addActionListener(actionLstener);

    }
    private JLabel label;
    
    private class Reagavimas111 implements ActionListener {
        public void actionPerformed(ActionEvent ae) {

                     Toolkit.getDefaultToolkit().beep();

                     x.setVisible(true);
        }
       private JFrame  x = new SkaicBud1();
    }
}
