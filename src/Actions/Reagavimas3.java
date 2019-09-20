package Actions;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Darbas.SkaicBud3;

        
public class Reagavimas3 {
          public Reagavimas3(JButton Reagavimas31) {
        Reagavimas31 actionLstener = new Reagavimas31();
        Reagavimas31.addActionListener(actionLstener);
    }
    private JLabel label;
    
    private class Reagavimas31 implements ActionListener {


        public void actionPerformed(ActionEvent ae) {
            Toolkit.getDefaultToolkit().beep();
         z.setVisible(true);
        }
         private JFrame  z = new SkaicBud3();
    }
}
